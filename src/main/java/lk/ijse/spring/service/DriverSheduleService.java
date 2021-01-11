package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverSeduleDTO;

import java.util.List;

public interface DriverSheduleService {
    void addDriverShedule(DriverSeduleDTO dto);
    void updateDriverShedule(DriverSeduleDTO dto);
    void deleteDriverShedule(String driverSheduleId);
    DriverSeduleDTO searchDriverShedule(String driverSheduleId);
    List<DriverSeduleDTO> getAllDriverShedules();
}
