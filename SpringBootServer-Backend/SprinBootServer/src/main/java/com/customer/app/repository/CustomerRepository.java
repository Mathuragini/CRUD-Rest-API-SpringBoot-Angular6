package com.customer.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.customer.app.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	  List<Customer> findByAge(int age);
	}