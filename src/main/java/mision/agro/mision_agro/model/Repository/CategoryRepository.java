package mision.agro.mision_agro.model.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByNombre(String string);
    
}
