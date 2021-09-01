package com.elasticsearch.Service;

import java.util.List;
import java.util.Optional;

import com.elasticsearch.model.Customer;
import com.elasticsearch.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository= customerRepository;
    }

    public Customer save(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findById(String id){
        return customerRepository.findById(id).orElse(null);
    }

    public Iterable<Customer> findAll(){
        return customerRepository.findAll();
    }
}
