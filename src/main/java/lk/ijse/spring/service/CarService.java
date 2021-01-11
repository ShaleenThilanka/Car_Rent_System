package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;

import java.util.List;

public interface CarService {
    void addCar(CarDTO dto);
    void updateCar(CarDTO dto);
    void deleteCar(String carId);
    CarDTO searchCar(String carId);
    List<CarDTO> getAllCars();
}
