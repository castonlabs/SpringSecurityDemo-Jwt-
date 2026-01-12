package com.zyratechnologies.jwtproject1.repository;

import com.zyratechnologies.jwtproject1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
