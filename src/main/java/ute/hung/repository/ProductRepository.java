package ute.hung.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ute.hung.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
