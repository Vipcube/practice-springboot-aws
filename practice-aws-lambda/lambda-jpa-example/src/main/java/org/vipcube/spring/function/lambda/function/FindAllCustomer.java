package org.vipcube.spring.function.lambda.function;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.vipcube.spring.function.lambda.entity.Customer;
import org.vipcube.spring.function.lambda.repository.CustomerRepository;

import java.util.List;
import java.util.function.Supplier;

@Slf4j
@Component
public class FindAllCustomer implements Supplier<List<Customer>> {
	private final CustomerRepository repository;

	public FindAllCustomer( CustomerRepository repository ){
		this.repository = repository;
	}

	@Override
	public List<Customer> get() {
		return this.repository.findAll();
	}
}
