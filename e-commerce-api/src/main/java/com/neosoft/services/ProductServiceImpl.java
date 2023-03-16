package com.neosoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.exceptions.ProductException;
import com.neosoft.exceptions.UserException;
import com.neosoft.models.Product;
import com.neosoft.models.User;
import com.neosoft.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository pRepo;

	@Override
	public Product registerNewProduct(Product product) throws ProductException {
		Product existingProduct = pRepo.findById(product.getProductId()).orElseThrow(
				() -> new ProductException("Product is already exists with this id " + product.getProductId()));

		return pRepo.save(product);

	}

	@Override
	public Product getProductById(Integer productId) throws ProductException {
		Product existingProduct = pRepo.findById(productId)
				.orElseThrow(() -> new ProductException("Product not found with this id: " + productId));
		pRepo.delete(existingProduct);
		return existingProduct;
	}

	@Override
	public Product updateProductById(Integer productId, Product product) throws ProductException {
		Product existingProduct = pRepo.findById(productId)
				.orElseThrow(() -> new ProductException("Product not found with this id: " + productId));

		existingProduct.setPrice(product.getPrice());
		existingProduct.setProductId(productId);
		existingProduct.setProductName(product.getProductName());
		existingProduct.setQty(product.getQty());

		return pRepo.save(existingProduct);

	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		List<Product> list = pRepo.findAll();
		if (list.size() == 0) {
			throw new ProductException("List is empty!");
		}
		return list;

	}

	@Override
	public Product deleteProductById(Integer productId) throws ProductException {
		Product existingProduct = pRepo.findById(productId)
				.orElseThrow(() -> new ProductException("Product is not found with this id " + productId));
		pRepo.delete(existingProduct);
		
		return existingProduct;

	}

}
