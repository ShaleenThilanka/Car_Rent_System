package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverDTO;
import lk.ijse.spring.entity.Driver;
import lk.ijse.spring.repo.DriverRepo;
import lk.ijse.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverSerViceImpl implements DriverService {

    @Autowired
    DriverRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveDriver(DriverDTO dto) {
        if (!repo.existsById(dto.getDriverId())){
            repo.save(mapper.map(dto, Driver.class));
        }else {
            throw new RuntimeException("Driver Already Exist !");
        }
    }

    @Override
    public void updateDriver(DriverDTO dto) {
        if (!repo.existsById(dto.getDriverId())){
            repo.save(mapper.map(dto, Driver.class));
        }else {
            throw new RuntimeException("Driver Doesn't Exist !");
        }
    }

    @Override
    public void deleteDriver(String driverId) {
        if (repo.existsById(driverId)){
            repo.deleteById(driverId);
        }else {
             throw new RuntimeException("No Driver for "+driverId);
        }
    }

    @Override
    public DriverDTO searchDriver(String driverId) {
        Optional<Driver> driver = repo.findById(driverId);
        if (driver.isPresent()){
            return mapper.map(driver, DriverDTO.class);
        }else {
            throw new RuntimeException("No Driver for "+driverId);
        }
    }

    @Override
    public List<DriverDTO> getAllDrivers() {
        List<Driver> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<DriverDTO>>(){}.getType());
    }
}
