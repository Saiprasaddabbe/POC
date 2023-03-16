package com.neosoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main{
	
	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,6,7,7,8);
		Set<Integer> set = new HashSet<>();
		list.stream().filter(e->!set.add(e)).forEach(e->System.out.println(e));
	
	}
	
	
} 