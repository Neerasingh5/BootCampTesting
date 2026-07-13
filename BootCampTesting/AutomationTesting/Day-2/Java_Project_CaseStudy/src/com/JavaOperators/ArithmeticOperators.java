package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 1: Arithmetic Operators (+, -, *, /, %)
 * Example (E-commerce): Laptop Price = 50000, Quantity = 2
 */
public class ArithmeticOperators {

    public static void main(String[] args) {
        int laptopPrice = 50000;
        int quantity = 2;

        int total = laptopPrice * quantity;
        System.out.println("Total Price (multiplication): " + total);

        int sum = laptopPrice + quantity;
        System.out.println("Addition: " + sum);

        int difference = laptopPrice - quantity;
        System.out.println("Subtraction: " + difference);

        int division = laptopPrice / quantity;
        System.out.println("Division: " + division);

        int modulus = laptopPrice % quantity;
        System.out.println("Modulus (Remainder): " + modulus);
    }
}
