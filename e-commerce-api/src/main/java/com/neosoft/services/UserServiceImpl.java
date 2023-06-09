package com.neosoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.exceptions.UserException;
import com.neosoft.models.User;
import com.neosoft.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserRepository uRepo;

	@Override
	public User registerUser(User user) throws UserException {

		User existingUser = uRepo.findByEmail(user.getEmail());

		if (existingUser == null) {
			return uRepo.save(user);
		}

		throw new UserException("User already exists with this email");

	}

	@Override
	public User getUserById(Integer userId) throws UserException {

		return uRepo.findById(userId).orElseThrow(()->new UserException("User not found with this id: " + userId));

	}

	@Override
	public User deleteUserById(Integer userId) throws UserException {
		User existingUser = uRepo.findById(userId)
				.orElseThrow(()->new UserException("User not found with this id: " + userId));
		uRepo.delete(existingUser);
		return existingUser;
	}

	@Override
	public User updateUserDetailsById(User user, Integer userId)throws UserException  {
		User existingUser = uRepo.findById(userId)
				.orElseThrow(()->new UserException("User not found with this id: " + userId));
		
		existingUser.setCart(user.getCart());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		existingUser.setUserId(userId);
		
		
		return uRepo.save(existingUser);
		
		
	}

	@Override
	public List<User> getAllUsers() throws UserException {
		List<User> users =  uRepo.findAll();
		if(users.size()==0) {
			throw new UserException("List is empty");
		}
		
		return users;
	}

}
