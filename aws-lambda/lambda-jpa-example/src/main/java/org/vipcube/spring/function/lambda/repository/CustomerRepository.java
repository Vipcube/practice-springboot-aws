package org.vipcube.spring.function.lambda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.vipcube.spring.function.lambda.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
