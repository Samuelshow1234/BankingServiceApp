package com.bankingservice.demo.entity;


import jakarta.persistence.*;

@Entity
@Table(name="accounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;

    @Column(name="account_name")
    String accountName;

    @Column(name="account_number")
    int accountNumber;

    @Column(name="email")
    String email;

    public BankAccount(){

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BankAccount(String accountName, int accountNumber, String email) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", accountName='" + accountName + '\'' +
                ", accountNumber=" + accountNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
