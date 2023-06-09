package com.neosoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
