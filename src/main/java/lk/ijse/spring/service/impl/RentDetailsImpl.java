package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.RentDetailsDTO;
import lk.ijse.spring.entity.RentDetails;
import lk.ijse.spring.repo.RentDetailsRepo;
import lk.ijse.spring.service.RentDetailsService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RentDetailsImpl implements RentDetailsService {

    @Autowired
    RentDetailsRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addRentDetails(RentDetailsDTO dto) {
        if (!repo.existsById(dto.getRentDetailsId())){
            repo.save(mapper.map(dto, RentDetails.class));
        }else {
            throw new RuntimeException("Rent Details ID is Already Exist..!");
        }
    }

    @Override
    public void updateRentDetails(RentDetailsDTO dto) {
        if (!repo.existsById(dto.getRentDetailsId())){
            repo.save(mapper.map(dto, RentDetails.class));
        }else {
            throw new RuntimeException("This Rent Details ID is Does'nt Exist !");
        }
    }

    @Override
    public RentDetailsDTO searchRentDetails(String rentDetailsId) {
        Optional<RentDetails> rentDetails = repo.findById(rentDetailsId);
        if (rentDetails.isPresent()){
            return mapper.map(rentDetails.get(), RentDetailsDTO.class);
        }else {
            throw new RuntimeException("No Rent Details for "+rentDetailsId);
        }
    }

    @Override
    public void deleteRentDetails(String rentDetailsId) {
        if (repo.existsById(rentDetailsId)){
            repo.deleteById(rentDetailsId);
        }else {
            throw new RuntimeException("This Rent Details ID is Does'nt Exist");
        }
    }

    @Override
    public List<RentDetailsDTO> getAllRentDetails() {
        List<RentDetails> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<RentDetailsDTO>>(){}.getType());
    }
}
