package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 2: Assignment Operators (=, +=, -=, *=, /=, %=)
 * Example (Banking): Customer deposits 500
 */
public class AssignmentOperators {

    public static void main(String[] args) {
        int accountBalance = 10000;
        accountBalance += 500;
        System.out.println("Account balance after deposit: " + accountBalance);

        int balance = 1000;
        balance += 500;
        System.out.println("Balance after += : " + balance);

        balance -= 200;
        System.out.println("Balance after -= : " + balance);

        balance *= 2;
        System.out.println("Balance after *= : " + balance);

        balance /= 4;
        System.out.println("Balance after /= : " + balance);

        balance %= 300;
        System.out.println("Balance after %= : " + balance);
    }
}
