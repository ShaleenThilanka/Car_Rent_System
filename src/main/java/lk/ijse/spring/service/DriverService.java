package lk.ijse.spring.service;

import lk.ijse.spring.dto.DriverDTO;

import java.util.List;

public interface DriverService {
    void saveDriver(DriverDTO dto);
    void updateDriver(DriverDTO dto);
    void deleteDriver(String driverId);
    DriverDTO searchDriver(String driverId);
    List<DriverDTO> getAllDrivers();
}
