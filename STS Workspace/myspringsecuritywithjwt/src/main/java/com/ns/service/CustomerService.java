package com.ns.service;

import java.util.List;

import com.ns.exceptions.CustomerException;
import com.ns.model.Customer;

public interface CustomerService {

	
	public Customer registerCustomer(Customer customer) throws CustomerException;
	public Customer getCustomerById(Integer id) throws CustomerException;
	public List<Customer> getAllCustomers();
	
	
}
