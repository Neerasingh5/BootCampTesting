package com.JavaOperators;

/*
 * Task 53: Java Operators
 * Section 3: Relational (Comparison) Operators (==, !=, >, <, >=, <=)
 * Example (Voting System): age check
 */
public class RelationalOperators {

    public static void main(String[] args) {
        int age = 17;
        System.out.println("Is eligible to vote (age >= 18): " + (age >= 18));

        int eligibleAge = 20;
        System.out.println("Is eligible to vote (age >= 18): " + (eligibleAge >= 18));

        System.out.println("Equal check: " + (age == eligibleAge));
        System.out.println("Not equal check: " + (age != eligibleAge));
        System.out.println("Greater than: " + (eligibleAge > age));
        System.out.println("Less than: " + (age < eligibleAge));
        System.out.println("Less than or equal: " + (age <= eligibleAge));
    }
}
