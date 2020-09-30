package com.example.syafiqbank.demo.controller;

import com.example.syafiqbank.demo.repo.AccountRepo;
import com.example.syafiqbank.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {

    @Autowired
    AccountRepo repo;

    // REST for each account
    @GetMapping("/account/{id}")
    public Optional<Account> getAccount(@PathVariable("id") int id) {
        return repo.findById(id);
    }

    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account) {
        repo.save(account);
        return account;
    }

    @PutMapping("/account")
    public Account editAccount(@RequestBody Account account) {
        repo.save(account);
        return (account);
    }

    @DeleteMapping("/account/{id}")
    public String deleteAccount(@PathVariable("id") int id) {
        repo.deleteById(id);
        return "Successfully deleted";
    }

    // REST for all accounts
    @GetMapping("/accounts/{id}")
    public List<Account> getAllAccount(@PathVariable("id") int id) {
        return repo.findByCustomerId(id);
    }
}
