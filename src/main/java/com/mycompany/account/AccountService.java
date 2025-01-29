/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.account;

/**
 *
 * @author mh
 */
public interface AccountService {
    void deposit(int amount);
    void withdraw(int amount);
    void printStatement();
}
