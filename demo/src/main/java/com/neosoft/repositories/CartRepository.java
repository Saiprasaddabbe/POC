package com.neosoft.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.model.Cart;
import com.neosoft.model.User;
@Repository
public interface CartRepository extends JpaRepository<Cart,Integer>{

	public Cart findByUser(User user);
	
	
	
}
