package com.example.service;

import java.util.List;
import java.util.UUID;

import com.example.domain.Customer;
public interface CustomerService {

    List<Customer> listAll();

    Customer getById(UUID id);

    Customer saveOrUpdate(Customer customr);

    void delete(UUID id);
    
}