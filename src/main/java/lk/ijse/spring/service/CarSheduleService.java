package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarSheduleDTO;

import java.util.List;

public interface CarSheduleService {
    void addCarShedule(CarSheduleDTO dto);
    void updateCarShedule(CarSheduleDTO dto);
    void deleteCarShedule(String carSheduleId);
    CarSheduleDTO searchCarShedule(String carSheduleId);
    List<CarSheduleDTO> getAllCarShedules();
}
