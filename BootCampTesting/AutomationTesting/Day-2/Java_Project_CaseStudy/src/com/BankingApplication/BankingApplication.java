package com.BankingApplication;

import java.util.ArrayList;
import java.util.List;

/*
 * Task 55: Banking Application using Java Program
 * -----------------------------------------------------------
 * Implements Sections 4 and 5:
 *   - anArrayOfAccounts(): creates and fills an array of 3 accounts
 *   - aListOfAccounts(): creates and fills a List of 3 accounts
 *   - Both are printed using an enhanced for-loop calling toString()
 *
 * HOW TO RUN IN ECLIPSE:
 *   Right-click this file -> Run As -> Java Application
 */
public class BankingApplication {

    public static void main(String[] args) {

        System.out.println("===== Array of Accounts =====");
        Account[] accountArray = anArrayOfAccounts();
        for (Account account : accountArray) {
            System.out.println(account.toString());
        }

        System.out.println("\n===== List of Accounts =====");
        List<Account> accountList = aListOfAccounts();
        for (Account account : accountList) {
            System.out.println(account.toString());
        }

        System.out.println("\n===== Withdraw behavior demo =====");
        Account checking = new Account(100, 11111, AccountType.CHECKING);
        checking.withdraw(150);
        System.out.println(checking.toString() + " (overdraft allowed on CHECKING)");

        Account savings = new Account(100, 22222, AccountType.SAVINGS);
        try {
            savings.withdraw(150);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    /* Section 4: creates and fills an array of 3 accounts */
    public static Account[] anArrayOfAccounts() {
        Account[] accounts = new Account[3];
        accounts[0] = new Account(500, 10001, AccountType.CHECKING);
        accounts[1] = new Account(1000, 10002, AccountType.SAVINGS);
        accounts[2] = new Account(250, 10003, AccountType.CHECKING);
        return accounts;
    }

    /* Section 4: creates and fills a List of 3 accounts */
    public static List<Account> aListOfAccounts() {
        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account(750, 20001, AccountType.SAVINGS));
        accounts.add(new Account(300, 20002, AccountType.CHECKING));
        accounts.add(new Account(1200, 20003, AccountType.SAVINGS));
        return accounts;
    }
}
