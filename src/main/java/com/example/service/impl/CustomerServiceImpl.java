package com.example.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;
import com.example.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> listAll() {
		List<Customer> customers = new ArrayList<>();
        customerRepository.findAll().forEach(customers::add); 
        return customers;
	}

	@Override
	public Customer getById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer saveOrUpdate(Customer customer) {
		customerRepository.save(customer);
	    return customer;
	}

	@Override
	public void delete(UUID id) {
		// TODO Auto-generated method stub
	}


}