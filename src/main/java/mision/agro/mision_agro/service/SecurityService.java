package mision.agro.mision_agro.service;

import java.util.List;

import mision.agro.mision_agro.controller.dto.UserRequest;
import mision.agro.mision_agro.controller.dto.UserResponse;

public interface SecurityService {
    UserResponse validateUser(String username, String password);

    List<UserResponse> getAllUsers();

    UserResponse getUserByEmail(String email);

    void createUser(UserRequest user);

    void updateUser(UserRequest user);

    void deleteUser(String email);

    void activateUser(String email);

    void inactivateUser(String email);
}
