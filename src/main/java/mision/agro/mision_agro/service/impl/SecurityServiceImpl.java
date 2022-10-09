package mision.agro.mision_agro.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import mision.agro.mision_agro.controller.dto.UserRequest;
import mision.agro.mision_agro.controller.dto.UserResponse;
import mision.agro.mision_agro.model.Entity.User;
import mision.agro.mision_agro.model.Repository.UserRepository;
import mision.agro.mision_agro.service.SecurityService;

@Service
@AllArgsConstructor
public class SecurityServiceImpl implements SecurityService {

    private final UserRepository userRepository;

    @Override
    public UserResponse validateUser(String email, String password) {
        var userOp = userRepository.findByEmailAndPassword(email, password);
        var user = userOp.get();
        return UserResponse.builder()
                .nombre(user.getNombre())
                .email(user.getEmail())
                .build();
    }   

    @Override
    public UserResponse getUserByEmail(String email) {
        var userOp = userRepository.findById(email);
        if (userOp.isEmpty()) {
            throw new RuntimeException("El usuario no existe");
        }

        var user = userOp.get();
        return UserResponse.builder()
                .nombre(user.getNombre())
                .email(user.getEmail())
                .build();
    }

    @Override
    public List<UserResponse> getAllUsers() {
        return userRepository.findAll().stream()
                .map(u -> UserResponse.builder()
                        .nombre(u.getNombre())
                        .email(u.getEmail())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public void createUser(UserRequest user) {

        var userOp = userRepository.findById(user.getEmail());
        if(userOp.isPresent()){
            throw new RuntimeException("Ya existe un usuario registrado con ese correo electrónico");
        }
        
        var userDb = new User();
        userDb.setNombre(user.getNombre());
        userDb.setEmail(user.getEmail());
        userDb.setPassword(user.getPassword());
        userDb = userRepository.save(userDb);
        
    }

    @Override
    public void updateUser(UserRequest user) {
        var userOp = userRepository.findByEmail(user.getEmail());
        if (userOp.isEmpty()) {
            throw new RuntimeException("El email no existe");
        }

        var userDb = userOp.get();
        userDb.setNombre(user.getNombre());
        userDb.setEmail(user.getEmail());
        userDb.setPassword(user.getPassword());
        userDb = userRepository.save(userDb);
        
    }

    @Override
    public void deleteUser(String email) {
        var userOp = userRepository.findById(email);
        if (userOp.isEmpty()) {
            throw new RuntimeException("El usuario no existe");
        }

        userRepository.delete(userOp.get());
        
    }

    @Override
    public void activateUser(String email) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void inactivateUser(String email) {
        // TODO Auto-generated method stub
        
    }

}
