package com.neosoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
