package com.example.syafiqbank.demo.repo;

import com.example.syafiqbank.demo.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
    List<Transaction> findByAccountNumber(int accountNumber);
}
