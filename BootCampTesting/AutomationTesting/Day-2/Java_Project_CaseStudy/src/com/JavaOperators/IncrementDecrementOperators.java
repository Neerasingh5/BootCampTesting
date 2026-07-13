package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 5: Increment and Decrement Operators (++, --)
 * Example (Website Visitor Counter)
 */
public class IncrementDecrementOperators {

    public static void main(String[] args) {
        int visitors = 250;
        visitors++;
        System.out.println("Visitor count after increment: " + visitors);

        int count = 10;
        count++;
        System.out.println("Count after increment: " + count);

        count--;
        System.out.println("Count after decrement: " + count);
    }
}
