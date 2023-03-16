package com.neosoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.models.Product;
import com.neosoft.models.User;
import com.neosoft.services.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	private CartService cService;
	
	@GetMapping("/getproductbyid/{productid}")
	public ResponseEntity<Product> getProductByIdHandler(@PathVariable("productid") Integer productId){
		Product product =  cService.getProductById(productId);
		return new ResponseEntity<Product>(product,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/deleteproductbyid/{productid}")
	public ResponseEntity<Product> deleteProductById(@PathVariable("productid") Integer productId){
	  Product deletedProduct =	 cService.deleteProductById(productId);
	  return new ResponseEntity<Product>(deletedProduct, HttpStatus.OK);
	}
	
	@GetMapping("/getllcartproducts")
	public ResponseEntity<List<Product>> getAllCartProducts(){
		List<Product> products =   cService.getAllCartProducts();
		
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
		
	};
	
	
	
	
	
	
}
