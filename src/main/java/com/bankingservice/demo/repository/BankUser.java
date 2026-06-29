package com.bankingservice.demo.repository;

import com.bankingservice.demo.entity.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankUser extends JpaRepository<BankAccount, Integer> {

}
