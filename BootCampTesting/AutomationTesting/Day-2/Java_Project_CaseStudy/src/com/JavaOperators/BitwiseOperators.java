package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 8: Bitwise Operators (&, |, ^, ~, <<, >>)
 * Commonly used in: device drivers, embedded systems, encryption,
 * network programming, and performance optimization.
 */
public class BitwiseOperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        System.out.println("Bitwise AND (a & b): " + (a & b));
        System.out.println("Bitwise OR (a | b): " + (a | b));
        System.out.println("Bitwise XOR (a ^ b): " + (a ^ b));
        System.out.println("Bitwise Complement (~a): " + (~a));
        System.out.println("Left Shift (a << 1): " + (a << 1));
        System.out.println("Right Shift (a >> 1): " + (a >> 1));
    }
}
