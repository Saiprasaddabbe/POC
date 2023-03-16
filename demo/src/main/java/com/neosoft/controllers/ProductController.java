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

import com.neosoft.exceptions.ProductException;
import com.neosoft.model.Product;
import com.neosoft.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@PostMapping("/register")
	public ResponseEntity<Product> registerProductHandler(@RequestBody Product product) throws ProductException {
	Product savedProduct = pService.registerProduct(product);
	return new ResponseEntity<Product>(savedProduct,HttpStatus.CREATED);
		
	}
		
	
}
