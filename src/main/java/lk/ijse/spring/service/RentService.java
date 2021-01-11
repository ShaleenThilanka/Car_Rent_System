package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentDTO;

import java.util.List;

public interface RentService {
    void addRent(RentDTO dto);
    void updateRent(RentDTO dto);
    void deleteRent(String rentId);
    RentDTO searchRent(String rentId);
    List<RentDTO> getAllRents();
}
