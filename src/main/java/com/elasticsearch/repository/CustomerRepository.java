package com.elasticsearch.repository;

import com.elasticsearch.model.Customer;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer, String>{

}