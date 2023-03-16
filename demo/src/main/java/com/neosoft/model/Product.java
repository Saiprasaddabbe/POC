package com.neosoft.model;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer productId;
	private String productName;
	private Integer price;
	private Integer qty;
	
//	@Override
//	public boolean equals(Object obj) {
//
//		Product product = (Product)obj;
//		
//		if(product.getProductId()==this.getProductId()) {
//			return true;
//		}else {
//			return false;
//		}
//	
//	
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(productId);
//	}
	
	
		
}
