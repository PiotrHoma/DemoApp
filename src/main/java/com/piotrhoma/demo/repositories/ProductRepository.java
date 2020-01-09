package com.piotrhoma.demo.repositories;

import com.piotrhoma.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
