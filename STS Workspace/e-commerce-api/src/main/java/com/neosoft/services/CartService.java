package com.neosoft.services;

import java.util.List;

import com.neosoft.models.Product;
import com.neosoft.models.User;

public interface CartService {
	
	public Product getProductById(Integer productId);
	public Product deleteProductById(Integer productId);
	public List<Product> getAllCartProducts();
	

}
