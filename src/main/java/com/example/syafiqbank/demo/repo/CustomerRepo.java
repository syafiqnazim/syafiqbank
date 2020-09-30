package com.example.syafiqbank.demo.repo;

import com.example.syafiqbank.demo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
