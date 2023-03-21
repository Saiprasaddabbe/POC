package com.neosoft.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.dtos.CartDto;
import com.neosoft.dtos.ProductDto;
import com.neosoft.dtos.RequestDto;
import com.neosoft.dtos.UserDto;
import com.neosoft.exceptions.CartException;
import com.neosoft.exceptions.ProductException;
import com.neosoft.exceptions.UserException;
import com.neosoft.model.Cart;
import com.neosoft.model.Product;
import com.neosoft.model.User;
import com.neosoft.repositories.CartRepository;
import com.neosoft.repositories.ProductRepository;
import com.neosoft.repositories.UserRepository;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private ProductRepository pRepo;

	@Autowired
	private CartRepository cRepo;

	@Autowired
	private UserRepository uRepo;

	@Override
	public CartDto addToCart(RequestDto requestDto) throws CartException, UserException, ProductException {
		
	    List<ProductDto> reqProductDtos =  requestDto.getProductList();
	    List<Product> reqProducts = reqProductDtos.stream().map(p->{
	    	Product product = new Product();
	    	product.setProductId(p.getProductId());
	    	product.setProductName(p.getProductName());
	    	product.setPrice(p.getPrice());
	    	product.setQty(p.getQty());
	    	return product;
	    }).toList();
	    User reqUser = uRepo.findById(requestDto.getUserId()).get();
	    
	    Cart cart =  cRepo.findByUser(reqUser);
	    cart.getProducts().addAll(reqProducts);
	    
	    
		
		
		
		
		
		return null;
	}


		
		
		
		
		
	
}

/*
 * Cart cart = new Cart(); cart.setUser(user);
 * 
 * Integer total = cart.getTotal();
 * 
 * if(total==null) { total=0; }
 * 
 * String notFound = ""; Integer count=0; List<ProductDto> productDtoList =
 * requestDto.getrequestProductList(); List<Product>requestProductList =
 * productDtoList.stream().map(p->this.toProduct(p)).collect(Collectors.toList()
 * ); List<Product>repoProducts = new ArrayList<>(); for(Product p :
 * requestProductList) { Optional<Product> opt = pRepo.findById(p.getProductId());
 * if(opt.isPresent()) { Product product = opt.get();
 * cart.getProducts().add(product); repoProducts.add(product); total +=
 * (product.getPrice())*(product.getQty());
 * 
 * // total=cart.getTotal()+total; }else { System.out.println("done");
 * notFound+=p.getProductId()+","; count++; }
 * 
 * }
 * 
 * List<ProductDto> repoProductDto = repoProducts.stream()
 * .map(p->this.toProductDto(p)).collect(Collectors.toList());
 * 
 * 
 * 
 * cart.setTotal(total);
 * 
 * cart = cRepo.save(cart);
 * 
 * CartDto cartDto = this.toCartDTO(cart, repoProductDto);
 * 
 * if(notFound.length()==0) {
 * cartDto.setMessage("All Items added to cart successfully!"); }else {
 * cartDto.setMessage("Product with id : "+notFound+" are not found in database"
 * ); }
 * 
 * if(count==productDtoList.size()) { throw new
 * CartException("Product with Id: "+notFound+" are not found in database"); }
 * 
 * return cartDto;
 * 
 * 
 */

/*
 * @Override public Cart addToCart(Integer userId, Integer productId) throws
 * CartException, ProductException, UserException {
 * 
 * User user = uRepo.findById(userId) .orElseThrow(()->new
 * UserException("User not found with this user id: "+userId));
 * 
 * Product product = pRepo.findById(productId) .orElseThrow(()->new
 * ProductException("Product not found with this id: "+productId));
 * 
 * 
 * Cart cart = cRepo.findByUser(user); if(cart==null) { cart = new Cart(user,
 * new ArrayList<>()); } cart.getProducts().add(product);
 * 
 * cart = cRepo.save(cart);
 * 
 * return cart;
 * 
 * {
 * 
 * }
 */
