package com.example.syafiqbank.demo.repo;

import com.example.syafiqbank.demo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepo extends JpaRepository<Account, Integer> {

    List<Account> findByCustomerId(int customerId);
}
