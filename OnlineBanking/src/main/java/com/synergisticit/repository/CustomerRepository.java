package com.synergisticit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.synergisticit.domain.Customer;

@Service
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
