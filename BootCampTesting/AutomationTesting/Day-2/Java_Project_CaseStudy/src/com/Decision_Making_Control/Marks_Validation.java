package com.Decision_Making_Control;

/*
 * Task 52: Decision-Making Control Statement (IF Statement)
 * Case Study: Marks Validation
 */
public class Marks_Validation {

    public static void main(String[] args) {
        validateMarks(40);
        validateMarks(20);
    }

    static void validateMarks(int marks) {
        if (marks >= 35) {
            System.out.println("Marks " + marks + ": Student passed");
        } else {
            System.out.println("Marks " + marks + ": Student failed");
        }
    }
}
