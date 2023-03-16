package com.neosoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.exceptions.UserException;
import com.neosoft.model.User;
import com.neosoft.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository uRepo;
	
	
	@Override
	public User registerUser(User user) throws UserException {
		
		return uRepo.save(user);

	}

}
