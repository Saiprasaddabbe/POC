package com.neosoft.services;

import java.util.List;

import com.neosoft.models.Product;

public interface ProductService {

	public Product registerNewProduct(Product product);
	public Product getProductById(Integer productId);
	public Product updateProductById(Integer productId, Product product);
	public List<Product>getAllProducts();
	public Product deleteProductById(Integer productId);
	
	
	
}
