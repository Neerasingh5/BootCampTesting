package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 9: Instanceof Operator
 * Checks whether an object belongs to a particular class.
 */
public class InstanceofOperator {

    public static void main(String[] args) {
        String name = "Java";
        System.out.println("name instanceof String: " + (name instanceof String));

        Object obj = "Automation";
        if (obj instanceof String) {
            System.out.println("It is a String object");
        }
    }
}
