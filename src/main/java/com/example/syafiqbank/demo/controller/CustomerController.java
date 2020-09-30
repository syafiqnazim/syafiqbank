package com.example.syafiqbank.demo.controller;

import com.example.syafiqbank.demo.repo.CustomerRepo;
import com.example.syafiqbank.demo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class CustomerController {

    @Autowired
    CustomerRepo repo;

    // REST for each customer
    @GetMapping("/customer/{id}")
    public Optional<Customer> getCustomer(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer) {
        repo.save(customer);
        return customer;
    }

    @PutMapping("/customer")
    public Customer editCustomer(@RequestBody Customer customer) {
        repo.save(customer);
        return customer;
    }

    @DeleteMapping("/customer/{id}")
    public String deleteCustomer(@PathVariable("id") int id) {
        repo.deleteById(id);
        return "Successfully deleted";
    }


    // REST for all customers
    @GetMapping("/customers")
    public Iterable<Customer> getAllCustomers() {
        return repo.findAll();
    }

}
