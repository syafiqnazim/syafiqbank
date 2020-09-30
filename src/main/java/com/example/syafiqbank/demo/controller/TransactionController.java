package com.example.syafiqbank.demo.controller;

import com.example.syafiqbank.demo.model.Transaction;
import com.example.syafiqbank.demo.repo.TransactionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TransactionController {

    @Autowired
    TransactionRepo repo;

    // REST for each transaction
    @GetMapping("/transaction/{id}")
    public Optional<Transaction> getTransaction(@PathVariable("id") int transactionId) {
        return repo.findById(transactionId);
    }

    @PostMapping("/transaction")
    public Transaction addTransaction(@RequestBody Transaction transaction) {
        repo.save(transaction);
        return transaction;
    }

    // REST for all transactions
    @GetMapping("/transactions/{id}")
    public List<Transaction> getAllTransaction(@PathVariable("id") int id) {
        return repo.findByAccountNumber(id);
    }

}
