package com.neosoft.dtos;

import java.util.ArrayList;
import java.util.List;

import com.neosoft.model.Product;
import com.neosoft.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RequestDto {

	private Integer userId;
	private List<ProductDto> productList=new ArrayList<>();
	
	
	
	
	
	
}
