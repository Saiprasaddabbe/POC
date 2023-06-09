package com.neosoft.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	public User findByEmail(String email);
	
	
}
