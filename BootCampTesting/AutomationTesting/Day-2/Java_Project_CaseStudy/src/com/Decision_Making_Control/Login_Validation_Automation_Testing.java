package com.Decision_Making_Control;

/*
 * Task 52: Decision-Making Control Statement (IF Statement)
 * Case Study: Login Validation (Automation Testing)
 */
public class Login_Validation_Automation_Testing {

    public static void main(String[] args) {
        validateLogin("admin", "admin123");
        validateLogin("admin", "wrongPass");
    }

    static void validateLogin(String username, String password) {
        String correctUsername = "admin";
        String correctPassword = "admin123";

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful for user: " + username);
        } else {
            System.out.println("Login failed for user: " + username);
        }
    }
}
