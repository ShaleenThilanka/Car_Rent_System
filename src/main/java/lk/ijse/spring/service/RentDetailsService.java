package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentDetailsDTO;

import java.util.List;

public interface RentDetailsService {
    void addRentDetails(RentDetailsDTO dto);

    void updateRentDetails(RentDetailsDTO dto);

    RentDetailsDTO searchRentDetails(String rentDetailsId);

    void deleteRentDetails(String rentDetailsId);

    List<RentDetailsDTO> getAllRentDetails();
}
