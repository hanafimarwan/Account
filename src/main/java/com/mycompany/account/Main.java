/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.account;

/**
 *
 * @author mh
 */
public class Main {
    public static void main(String[] args){
        Account account=new Account();
        account.deposit(3000);
        account.deposit(3000);
        account.deposit(3000);
        account.deposit(3000);
        account.withdraw(10000);
        account.printStatement();
    }
}
