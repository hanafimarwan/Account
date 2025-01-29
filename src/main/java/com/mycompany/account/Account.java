/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.account;

/**
 *
 * @author mh
 */


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account implements AccountService {
    private int balance;
    private final List<String> transactions;

    public Account() {
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    @Override
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            LocalDate date = LocalDate.now();
            transactions.add(String.format("%s || %d || %d", date, amount, balance));
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            LocalDate date = LocalDate.now();
            transactions.add(String.format("%s || -%d || %d", date, amount, balance));
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    @Override
    public void printStatement() {
        System.out.println("Date       || Amount    || Balance");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
