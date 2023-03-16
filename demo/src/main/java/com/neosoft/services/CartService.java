package com.neosoft.services;

import java.util.List;

import com.neosoft.dtos.CartDto;
import com.neosoft.dtos.RequestDto;
import com.neosoft.exceptions.CartException;
import com.neosoft.exceptions.ProductException;
import com.neosoft.exceptions.UserException;
import com.neosoft.model.Cart;
import com.neosoft.model.Product;

public interface CartService {
	
//	public Cart addToCart(Integer userId, Integer productId)throws CartException, UserException,ProductException;
	public CartDto addToCart(RequestDto requestDto)throws CartException, UserException,ProductException;

}
