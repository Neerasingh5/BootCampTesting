package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 7: Ternary Operator (condition ? value1 : value2)
 * Example (Movie Ticket)
 */
public class TernaryOperator {

    public static void main(String[] args) {
        int age = 15;
        String ticket = (age >= 18) ? "Adult Ticket" : "Child Ticket";
        System.out.println("Ticket type: " + ticket);

        int eligibilityAge = 20;
        String result = (eligibilityAge >= 18) ? "Eligible" : "Not Eligible";
        System.out.println("Eligibility: " + result);
    }
}
