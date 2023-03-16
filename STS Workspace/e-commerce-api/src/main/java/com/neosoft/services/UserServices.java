package com.neosoft.services;

import java.util.List;

import com.neosoft.exceptions.UserException;
import com.neosoft.models.User;

public interface UserServices {

	public User registerUser(User user) throws UserException;
	public User getUserById(Integer userId)throws UserException ;
	public User deleteUserById(Integer userId)throws UserException ;
	public User updateUserDetailsById(User user,Integer userId)throws UserException ;
	public List<User> getAllUsers()throws UserException ;
	
	
	
	
	
	
	
}
