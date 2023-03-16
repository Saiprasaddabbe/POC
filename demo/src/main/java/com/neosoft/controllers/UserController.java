package com.neosoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
import com.neosoft.model.User;
import com.neosoft.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService uService;

	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody User user) throws UserException{
		
		User savedUser =  uService.registerUser(user);
		
		return new ResponseEntity<User>(savedUser,HttpStatus.CREATED);
		
	}
	
		
}
