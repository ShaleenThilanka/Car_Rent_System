package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.DriverSeduleDTO;
import lk.ijse.spring.entity.DriverShedule;
import lk.ijse.spring.repo.DriverSheduleRepo;
import lk.ijse.spring.service.DriverSheduleService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DrverSheduleServiceImpl implements DriverSheduleService {

    @Autowired
    DriverSheduleRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addDriverShedule(DriverSeduleDTO dto) {
        if(!repo.existsById(dto.getDriverScheduleId())){
            repo.save(mapper.map(dto, DriverShedule.class));
        }else {
            throw new RuntimeException("Driver Shedule Id Already Exist ! ");
        }
    }

    @Override
    public void updateDriverShedule(DriverSeduleDTO dto) {
        if (!repo.existsById(dto.getDriverScheduleId())){
            repo.save(mapper.map(dto, DriverShedule.class));
        }else{
            throw new RuntimeException("Driver Shedule Id Doesn't Exist !");
        }
    }

    @Override
    public void deleteDriverShedule(String driverSheduleId) {
        if (repo.existsById(driverSheduleId)){
            repo.deleteById(driverSheduleId);
        }else {
            throw new RuntimeException("No Driver Shedule for "+driverSheduleId);
        }
    }

    @Override
    public DriverSeduleDTO searchDriverShedule(String driverSheduleId) {
        Optional<DriverShedule> driverShedule = repo.findById(driverSheduleId);
        if (driverShedule.isPresent()){
            return mapper.map(driverShedule.get(), DriverSeduleDTO.class);
        }else {
            throw new RuntimeException("No Driver Shedule for "+driverSheduleId);
        }
    }

    @Override
    public List<DriverSeduleDTO> getAllDriverShedules() {
        List<DriverShedule> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<DriverSeduleDTO>>(){}.getType());
    }
}
