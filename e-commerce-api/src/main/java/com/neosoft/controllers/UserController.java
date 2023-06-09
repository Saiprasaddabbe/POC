package com.neosoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.exceptions.UserException;
import com.neosoft.models.User;
import com.neosoft.services.UserServices;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserServices uService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException{
		
		User savedUser =  uService.registerUser(user);
		
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
		
	}
	
	@GetMapping("/getuserbyid/{userid}")
	public ResponseEntity<User> getUserByIdHandler(@PathVariable("userid") Integer userId) throws UserException{
		User savedUser = uService.getUserById(userId);
		return new ResponseEntity<User>(savedUser,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteuserbyid/{userid}")
	public ResponseEntity<User> deleteUserByIdHandler(@PathVariable("userid") Integer userId) throws UserException{
		User deletedUser = uService.deleteUserById(userId);
		return new ResponseEntity<User>(deletedUser,HttpStatus.OK);
	}

	@PutMapping("/updateuserbyid/{userid}")
	public ResponseEntity<User> updtadeUserByIdHandler(@PathVariable("userid") Integer userId,@RequestBody User user) throws UserException{
		User updatedUser = uService.updateUserDetailsById(user, userId);
		return new ResponseEntity<User>(updatedUser,HttpStatus.OK);
	}

	@GetMapping("/getallusers")
	public ResponseEntity<List<User>> getAllUsersHandler() throws UserException{
		
	List<User> users =	uService.getAllUsers();
	
	return new  ResponseEntity<List<User>>(users,HttpStatus.OK);
			
	};
	
	
	
}
