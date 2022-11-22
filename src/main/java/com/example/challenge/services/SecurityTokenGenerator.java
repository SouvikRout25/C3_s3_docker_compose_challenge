package com.example.challenge.services;

import com.example.challenge.domain.Customer;

import java.util.Map;

public interface SecurityTokenGenerator {

    Map<String, String> generateToken(Customer customer);
}