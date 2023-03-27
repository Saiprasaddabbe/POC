package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Usedtls;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
	@Autowired
	private UserRepository userRepo;
	
	
	@Override
	public Usedtls createUser(Usedtls user) {
		
		return userRepo.save(user);
	}

	

	

	

	
}
