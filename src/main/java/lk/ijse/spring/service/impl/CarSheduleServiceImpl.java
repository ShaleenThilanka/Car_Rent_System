package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.CarSheduleDTO;
import lk.ijse.spring.entity.CarShedule;
import lk.ijse.spring.repo.CarSheduleRepo;
import lk.ijse.spring.service.CarSheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CarSheduleServiceImpl implements CarSheduleService {

    @Autowired
    CarSheduleRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addCarShedule(CarSheduleDTO dto) {
        if (!repo.existsById(dto.getCarSheduleId())){
            repo.save(mapper.map(dto, CarShedule.class));
        }else {
            throw new RuntimeException("Car Shedule Already Have for This Id !");
        }
    }

    @Override
    public void updateCarShedule(CarSheduleDTO dto) {
        if (!repo.existsById(dto.getCarSheduleId())){
            repo.save(mapper.map(dto, CarShedule.class));
        }else{
            throw new RuntimeException("Car Shedule Id Doesn't Exist !");
        }
    }

    @Override
    public void deleteCarShedule(String carSheduleId) {
        if (repo.existsById(carSheduleId)){
            repo.deleteById(carSheduleId);
        }else{
            throw new RuntimeException("No Car Shedule for Delete "+carSheduleId);
        }
    }

    @Override
    public CarSheduleDTO searchCarShedule(String carSheduleId) {
        Optional<CarShedule> carShedule = repo.findById(carSheduleId);
        if (carShedule.isPresent()){
            return mapper.map(carShedule.get(), CarSheduleDTO.class);
        }else {
            throw new RuntimeException("No Car Shedule for "+carSheduleId);
        }
    }

    @Override
    public List<CarSheduleDTO> getAllCarShedules() {
        List<CarShedule> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<CarSheduleDTO>>(){}.getType());
    }
}
