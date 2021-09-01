package com.elasticsearch.controller;

import java.util.List;

import com.elasticsearch.Service.CustomerService;
import com.elasticsearch.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/rest/api")
@Slf4j
public class CustomerController {
    
    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer save(Customer customer) {
        log.info("save customer"+ customer);
        return customerService.save(customer);
    }

    @GetMapping("/customers")
    public Iterable<Customer> getCustomers(){
        return customerService.findAll();
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable String id){
        return customerService.findById(id);
    }
}
