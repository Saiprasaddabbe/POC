package com.neosoft.dtos;

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


@AllArgsConstructor
@NoArgsConstructor
@Data
public class CartDto {
	

	private Integer cartId;
	

	private Integer userId;
	
	private String message;
	
	private List<ProductDto> productList = new ArrayList<>();
	
	private Integer total;

	public CartDto(Integer cartId, Integer userId, List<ProductDto> productList, Integer total) {
		super();
		this.cartId = cartId;
		this.userId = userId;
		this.productList = productList;
		this.total = total;
	}

	
	
	

}
