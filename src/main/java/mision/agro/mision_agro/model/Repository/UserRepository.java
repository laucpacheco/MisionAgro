package mision.agro.mision_agro.model.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.User;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmailAndPassword(String email, String password);

    Optional<User> findByEmail(String email);
    
}
