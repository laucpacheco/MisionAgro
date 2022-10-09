package mision.agro.mision_agro.model.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import mision.agro.mision_agro.model.Entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

    List<Product> findAllByCategoriaId(Long categoryId);

    List<Product> findAllByCategoriaIdIn(List<Long> categoryIds);

    List<Product> findAllByDescripcionLikeOrderByNombreAsc(String description);
}