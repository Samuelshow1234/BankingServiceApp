package com.bankingservice.demo.controller;


import com.bankingservice.demo.entity.BankAccount;
import com.bankingservice.demo.service.BankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.json.JsonMapper;

@RestController
@RequestMapping("/api")
public class BankController {

    private BankService bankService;

    private JsonMapper jsonMapper;


    @Autowired
    public BankController(BankService theBankService, JsonMapper theJsonMapper){
        bankService = theBankService;
        jsonMapper = theJsonMapper;
    }

    @PostMapping("/accounts")
    public BankAccount addBankAccount(@RequestBody BankAccount accountDetails){


        accountDetails.setId(0);

        BankAccount dbBankAccount = bankService.save(accountDetails);

        return dbBankAccount;

    }
}
