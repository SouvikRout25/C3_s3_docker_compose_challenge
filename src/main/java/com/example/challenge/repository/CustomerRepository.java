package com.example.challenge.repository;

import com.example.challenge.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Customer findByCustomerNameAndCustomerPassword(String customerName, String customerPassword);
}