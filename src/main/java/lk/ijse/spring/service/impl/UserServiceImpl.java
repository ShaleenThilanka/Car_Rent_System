package lk.ijse.spring.service.impl;

import lk.ijse.spring.dto.UserDTO;
import lk.ijse.spring.entity.User;
import lk.ijse.spring.repo.UserRepo;
import lk.ijse.spring.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo repo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void addUser(UserDTO dto) {
        if (!repo.existsById(dto.getUserId())){
            repo.save(mapper.map(dto, User.class));
        }else {
            throw new RuntimeException("User ID is Already Exist..!");
        }
    }

    @Override
    public void updateUser(UserDTO dto) {
        if (!repo.existsById(dto.getUserId())){
            repo.save(mapper.map(dto, User.class));
        }else {
            throw new RuntimeException("This User ID is Doesn't Exist..!");
        }
    }

    @Override
    public void deleteUser(String userId) {
        if (repo.existsById(userId)){
            repo.deleteById(userId);
        }else {
            throw new RuntimeException("This User ID is Doesn't Exist..!");
        }
    }

    @Override
    public UserDTO searchUser(String userId) {
        Optional<User> user = repo.findById(userId);
        if (user.isPresent()){
            return mapper.map(user.get(), UserDTO.class);
        }else {
            throw new RuntimeException("This User ID is Doesn't Exist..!");
        }
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> all = repo.findAll();
        return mapper.map(all, new TypeToken<List<UserDTO>>(){}.getType());
    }
}
