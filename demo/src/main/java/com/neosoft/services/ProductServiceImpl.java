package com.neosoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.exceptions.ProductException;
import com.neosoft.exceptions.UserException;
import com.neosoft.model.Product;
import com.neosoft.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pRepo;
	
	@Override
	public Product registerProduct(Product product) throws ProductException {
		
		return pRepo.save(product);
	}

}
