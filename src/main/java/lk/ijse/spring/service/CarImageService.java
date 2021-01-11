package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarImageDTO;

import java.util.List;

public interface CarImageService {
    void addCarImage(CarImageDTO dto);

    void updateCarImage(CarImageDTO dto);

    CarImageDTO searchCar(String imageId);

    void deleteCarImage(String imageId);

    List<CarImageDTO> getAllCarImages();
}
