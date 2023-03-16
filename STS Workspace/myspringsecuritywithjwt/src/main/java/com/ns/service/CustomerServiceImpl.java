package com.ns.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ns.exceptions.CustomerException;
import com.ns.model.Customer;
import com.ns.repo.CustomerRepo;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepo cRepo;

	@Override
	public Customer registerCustomer(Customer customer) throws CustomerException {
       Customer existingCustomer =  cRepo.findByCustomerEmail(customer.getCustomerEmail()).get();
       if(existingCustomer!=null) {
    	   throw new CustomerException("Customer Exists with this email");
       }
       
       return existingCustomer;
		
		
	}

	@Override
	public Customer getCustomerById(Integer id) throws CustomerException {
		Customer customer = cRepo.findById(id).get();
		if(customer !=null) {
			return customer;
		}
		 throw new CustomerException("Customer is not found with this id "+id);
	}

	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> list = cRepo.findAll();
		
		return list;
	}

}
