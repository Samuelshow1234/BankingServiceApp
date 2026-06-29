package com.bankingservice.demo.service;

import com.bankingservice.demo.entity.BankAccount;
import com.bankingservice.demo.repository.BankUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankServiceImpl implements BankService{

    BankUser bankUser;

    @Autowired
    public BankServiceImpl(BankUser bankUser) {
        this.bankUser = bankUser;
    }

    @Override
    public BankAccount save(BankAccount accountDetails) {
        return bankUser.save(accountDetails);
    }

    @Override
    public List<BankAccount> findAll() {


        return bankUser.findAll();
    }
}
