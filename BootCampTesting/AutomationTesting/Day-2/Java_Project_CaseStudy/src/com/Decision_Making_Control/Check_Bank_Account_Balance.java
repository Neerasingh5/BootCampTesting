package com.Decision_Making_Control;

/*
 * Task 52: Decision-Making Control Statement (IF Statement)
 * Case Study: Check Bank Account Balance
 */
public class Check_Bank_Account_Balance {

    public static void main(String[] args) {
        checkBankBalance(5000, 3000);
        checkBankBalance(2000, 3000);
    }

    static void checkBankBalance(double balance, double withdrawAmount) {
        if (balance >= withdrawAmount) {
            System.out.println("Balance: " + balance + " | Withdraw: " + withdrawAmount + " -> Transaction approved");
        } else {
            System.out.println("Balance: " + balance + " | Withdraw: " + withdrawAmount + " -> Insufficient funds");
        }
    }
}
