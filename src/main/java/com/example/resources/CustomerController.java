package com.example.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Customer;
import com.example.service.CustomerService;

@RestController
public class CustomerController {
	
    @Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customers")
	public List<Customer> getAllCustomer() {
		return customerService.listAll();
	}

	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customerService.saveOrUpdate(customer);
	}

	@RequestMapping("/customers/dummy")
	public List<Customer> getAllStaticCustomer() {
		return Arrays.asList(new Customer("1","dextor","cuba"), new Customer("2","micheal scofield", "fox river state penitentiary"), new Customer("3","jon snow","the castle of winter fall"));
	}
}
