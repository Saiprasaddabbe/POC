package com.neosoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.dtos.CartDto;
import com.neosoft.dtos.RequestDto;
import com.neosoft.exceptions.CartException;
import com.neosoft.exceptions.ProductException;
import com.neosoft.exceptions.UserException;
import com.neosoft.model.Cart;
import com.neosoft.services.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cService;
	
	@PostMapping("/addtocart")
	public ResponseEntity<CartDto> addToCartHandler(@RequestBody RequestDto req) throws CartException, UserException, ProductException{
		
		CartDto cartDto= cService.addToCart(req);
		
		return new ResponseEntity<CartDto>(cartDto,HttpStatus.ACCEPTED);
		
	}
	
	
}
