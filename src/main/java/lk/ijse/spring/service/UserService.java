package lk.ijse.spring.service;

import lk.ijse.spring.dto.UserDTO;

import java.util.List;

public interface UserService {
    void addUser(UserDTO dto);
    void updateUser(UserDTO dto);
    void deleteUser(String userId);
    UserDTO searchUser(String userId);
    List<UserDTO> getAllUsers();
}
