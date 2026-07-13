package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 4: Logical Operators (&&, ||, !)
 * Example (Internet Banking Login): username && password
 */
public class LogicalOperators {

    public static void main(String[] args) {
        boolean username = true;
        boolean password = true;

        System.out.println("Login successful (username && password): " + (username && password));

        boolean wrongPassword = false;
        System.out.println("Login with wrong password (AND): " + (username && wrongPassword));
        System.out.println("Login with OR check: " + (username || wrongPassword));
        System.out.println("NOT check on password: " + (!wrongPassword));

        int age = 25;
        boolean citizen = true;
        System.out.println("Age check AND citizen check: " + (age >= 18 && citizen));
    }
}
