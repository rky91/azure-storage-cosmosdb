package com.rky.dev.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rky.dev.entity.Customer;
import com.rky.dev.repo.CustomerRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	public Customer storeCustomer(Customer customer) {
		
		log.info("inside storeCustomer : {}", customer);
		Mono<Customer> save = customerRepo.save(customer);
		return save.block();
	}
	
	public List<Customer> getCutomerDetails(String fname) {
		Flux<Customer> customer = customerRepo.findByFirstName(fname);
		
		return customer.collectSortedList().block();
	}

}
