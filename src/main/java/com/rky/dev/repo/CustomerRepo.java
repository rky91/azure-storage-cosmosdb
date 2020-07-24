package com.rky.dev.repo;

import org.springframework.stereotype.Repository;

import com.microsoft.azure.spring.data.cosmosdb.repository.ReactiveCosmosRepository;
import com.rky.dev.entity.Customer;

import reactor.core.publisher.Flux;


@Repository
public interface CustomerRepo extends ReactiveCosmosRepository<Customer, String>{

	Flux<Customer> findByFirstName(String firstName);
}
