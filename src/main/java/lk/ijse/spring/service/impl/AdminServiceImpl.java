package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.AdminDTO;
import lk.ijse.spring.entity.Admin;
import lk.ijse.spring.repo.AdminRepo;
import lk.ijse.spring.service.AdminService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getAdminId())){
            repo.save(mapper.map(dto, Admin.class));
        }else {
            throw new RuntimeException("Admin ID is Already Exist..!");
        }
    }

    @Override
    public void updateAdmin(AdminDTO dto) {
        if (!repo.existsById(dto.getAdminId())){
            repo.save(mapper.map(dto, Admin.class));
        }else {
            throw new RuntimeException("This Admin ID is Does'nt Exist !");
        }
    }

    @Override
    public void deleteAdmin(String adminId) {
        if (repo.existsById(adminId)){
            repo.deleteById(adminId);
        }else {
            throw new RuntimeException("This Admin ID is Does'nt Exist !");
        }
    }

    @Override
    public AdminDTO searchAdmin(String adminId) {
        Optional<Admin> admin = repo.findById(adminId);
        if (admin.isPresent()){
            return mapper.map(admin.get(), AdminDTO.class);
        }else {
            throw new RuntimeException("No Admin for "+adminId);
        }
    }

    @Override
    public List<AdminDTO> getAllAdmins() {
        List<Admin> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<AdminDTO>>(){}.getType());
    }
}
