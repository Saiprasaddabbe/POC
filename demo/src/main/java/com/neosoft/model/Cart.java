package com.neosoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cartId;
	
	@OneToOne
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Product> products = new ArrayList<>();

	private Integer total;
	
	public Cart(User user, List<Product> products) {
		super();
		this.user = user;
		this.products = products;
	}
	
	

}
