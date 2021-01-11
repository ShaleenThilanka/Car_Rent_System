package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarModelDTO;

import java.util.List;

public interface CarModelService {
    void addCarModel(CarModelDTO dto);

    void updateCarModel(CarModelDTO dto);

    void deleteCarModel(String modelId);

    CarModelDTO searchCarModel(String modelId);

    List<CarModelDTO> getAllCarModels();
}
