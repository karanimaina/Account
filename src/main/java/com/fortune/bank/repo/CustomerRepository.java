package com.fortune.bank.bank.repo;

import com.fortune.bank.bank.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer ,Long> {
    Optional<Customer> findCustomerByUsername(String name);

}
