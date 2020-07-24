package com.rky.dev.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rky.dev.entity.Customer;
import com.rky.dev.service.CustomerService;

@RestController
public class BaseController {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass().getName());
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/store")
	public Customer saveCustomer(@RequestBody Customer c) {
		
		log.info("Customer : {}", c);
		Customer storeCustomer = customerService.storeCustomer(c);
		return storeCustomer;
		
	}
	
	@GetMapping("/details/{name}")
	public List<Customer> getCustomers(@PathVariable String name) {
		
		log.info("Get details for : {}", name);
		return customerService.getCutomerDetails(name);
		
	}

}
