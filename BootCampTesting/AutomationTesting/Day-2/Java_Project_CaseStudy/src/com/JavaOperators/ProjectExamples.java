package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Project Examples combining multiple operators:
 *   - Banking Application (Relational + if statement)
 *   - E-commerce Discount (Relational + Ternary)
 *   - Login Validation (Logical AND)
 *   - Inventory Management (Decrement)
 */
public class ProjectExamples {

    public static void main(String[] args) {

        System.out.println("===== Banking Application =====");
        double balance = 25000;
        if (balance >= 10000) {
            System.out.println("Eligible for Personal Loan");
        }

        System.out.println("\n===== E-commerce Discount =====");
        double purchaseAmount = 6000;
        double discount = (purchaseAmount >= 5000) ? 500 : 0;
        System.out.println("Discount = " + discount);

        System.out.println("\n===== Login Validation =====");
        boolean username = true;
        boolean password = true;
        if (username && password) {
            System.out.println("Login Successful");
        }

        System.out.println("\n===== Inventory Management =====");
        int stock = 50;
        stock--;
        System.out.println("Stock after sale: " + stock);
    }
}
