package com.bankingservice.demo.service;

import com.bankingservice.demo.entity.BankAccount;

import java.util.List;

public interface BankService {

    BankAccount save(BankAccount accountDetails);

    List<BankAccount> findAll();


}
