package com.neosoft.services;

import java.util.List;

import com.neosoft.exceptions.ProductException;
import com.neosoft.models.Product;

public interface ProductService {

	public Product registerNewProduct(Product product) throws ProductException;
	public Product getProductById(Integer productId) throws ProductException;
	public Product updateProductById(Integer productId, Product product) throws ProductException;
	public List<Product>getAllProducts() throws ProductException;
	public Product deleteProductById(Integer productId) throws ProductException;
	
	
	
}
