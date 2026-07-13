package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 6: Unary Operators (+, -, ++, --, !)
 * Example: Checking if an account is locked
 */
public class UnaryOperators {

    public static void main(String[] args) {
        boolean accountLocked = false;
        System.out.println("Account is not locked: " + (!accountLocked));

        boolean active = false;
        System.out.println("Active status (NOT): " + (!active));

        int value = 10;
        System.out.println("Positive unary: " + (+value));
        System.out.println("Negative unary: " + (-value));

        int counter = 5;
        System.out.println("Pre-increment: " + (++counter));
        System.out.println("Pre-decrement: " + (--counter));
    }
}
