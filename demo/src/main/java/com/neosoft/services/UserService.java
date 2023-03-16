package com.neosoft.services;

import java.util.List;

import com.neosoft.exceptions.UserException;
import com.neosoft.model.User;

public interface UserService {

	
	public User registerUser(User user)throws UserException;
	
	
	
	
	
}
