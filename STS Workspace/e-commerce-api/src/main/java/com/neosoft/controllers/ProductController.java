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

import com.neosoft.models.Product;
import com.neosoft.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService pService;
	
	@PostMapping("/registernewproduct")
	public ResponseEntity<Product> registerNewProductHandler(@RequestBody Product product) {
	Product savedProduct = pService.registerNewProduct(product);
	return new ResponseEntity<Product>(savedProduct,HttpStatus.CREATED);
		
	}
	@GetMapping("/getProductById/{productid}")
	public ResponseEntity<Product> getProductById(@PathVariable("productid")  Integer productId){
	Product savedProduct =	 pService.getProductById(productId);
	return new ResponseEntity<Product>(savedProduct,HttpStatus.OK);
	}
	@PutMapping("/updateProductById/{productid}")
	public ResponseEntity<Product> updateProductById(@PathVariable("productid") Integer productId,@RequestBody Product product) {
		Product updateProduct =	 pService.updateProductById(productId, product);
		return new ResponseEntity<Product>(updateProduct,HttpStatus.OK);
		
	}
	@GetMapping("/getallproducts")
	public ResponseEntity<List<Product>>getAllProducts(){
		List<Product> productList =  pService.getAllProducts();
		
		return new ResponseEntity<List<Product>>(productList,HttpStatus.OK);
		
		
		
	}
	
	@DeleteMapping("/deleteproductbyid/{productid}")
	public ResponseEntity<Product> deleteProductById(Integer productId) {
		
		Product deletedProduct = pService.deleteProductById(productId);
		
		return new ResponseEntity<Product>(deletedProduct,HttpStatus.OK);
		
		
	}
	
	
	
	
}
