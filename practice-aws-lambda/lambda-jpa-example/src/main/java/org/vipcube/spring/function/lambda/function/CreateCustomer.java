package org.vipcube.spring.function.lambda.function;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.vipcube.spring.function.lambda.entity.Customer;
import org.vipcube.spring.function.lambda.repository.CustomerRepository;

import java.util.function.Consumer;

@Slf4j
@Component
public class CreateCustomer implements Consumer<Customer> {
	private final CustomerRepository repository;

	public CreateCustomer( CustomerRepository repository ){
		this.repository = repository;
	}

	@Override
	public void accept( Customer customer ) {
		log.info( "Create customer with {}", customer );
		this.repository.save( customer );
	}
}
