package com.ordermanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ordermanagement.entity.Customer;
import com.ordermanagement.repository.CustomerRepository;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public Customer saveCustomer(Customer customer) {
        return repository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return repository.findAll();
    }
}