package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.entity.Rent;
import lk.ijse.spring.repo.RentRepo;
import lk.ijse.spring.service.RentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RentServiceImpl implements RentService {

    @Autowired
    RentRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addRent(RentDTO dto) {
        if (!repo.existsById(dto.getRentId())){
            repo.save(mapper.map(dto, Rent.class));
        }else {
            throw new RuntimeException("Rent ID is Already Exist..!");
        }
    }

    @Override
    public void updateRent(RentDTO dto) {
        if (!repo.existsById(dto.getRentId())){
            repo.save(mapper.map(dto, Rent.class));
        }else {
            throw new RuntimeException("This Rent ID is Does'nt Exist !");
        }
    }

    @Override
    public void deleteRent(String rentId) {
        if (repo.existsById(rentId)){
            repo.deleteById(rentId);
        }else {
            throw new RuntimeException("This Rent ID is Does'nt Exist !");
        }
    }

    @Override
    public RentDTO searchRent(String rentId) {
        Optional<Rent> rent = repo.findById(rentId);
        if (rent.isPresent()){
            return mapper.map(rent.get(), RentDTO.class);
        }else {
            throw new RuntimeException("No Rent ID for "+rentId);
        }
    }

    @Override
    public List<RentDTO> getAllRents() {
        List<Rent> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<RentDTO>>(){}.getType());
    }
}
