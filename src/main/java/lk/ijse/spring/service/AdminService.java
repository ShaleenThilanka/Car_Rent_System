package lk.ijse.spring.service;

import lk.ijse.spring.dto.AdminDTO;

import java.util.List;

public interface AdminService {
    void saveAdmin(AdminDTO dto);

    void updateAdmin(AdminDTO dto);

    void deleteAdmin(String adminId);

    AdminDTO searchAdmin(String adminId);

    List<AdminDTO> getAllAdmins();
}
