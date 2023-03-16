package com.ns.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ns.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	public Optional<Customer> findByCustomerEmail(String customerEmail);
	
}