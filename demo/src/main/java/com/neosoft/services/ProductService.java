package com.neosoft.services;

import java.util.List;

import com.neosoft.exceptions.ProductException;
import com.neosoft.model.Product;

public interface ProductService {

	public Product registerProduct(Product product)throws ProductException;
	
	
}
