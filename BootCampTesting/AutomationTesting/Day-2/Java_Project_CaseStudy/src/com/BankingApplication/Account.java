package com.BankingApplication;

/*
 * Task 55: Banking Application using Java Program
 * -----------------------------------------------------------
 * This class evolves through Sections 1, 2, 3, 6, 7, and 8 of the task.
 * The final withdraw() implementation reflects Section 8 (throws an
 * ArithmeticException on overdraw for SAVINGS accounts), which supersedes
 * the simpler "print a message" version from Section 7. Both approaches
 * are shown in comments so you can see how the method evolved.
 */
public class Account {

    /* Section 1: three properties
     * - balance: whole euros only, so an int is enough
     * - accountNumber: a number value, using long in case of large account numbers
     * - accountType: restricted to CHECKING or SAVINGS via the AccountType enum (Section 6)
     */
    private int balance;
    private long accountNumber;
    private AccountType accountType;

    /* Section 2: parameterized constructor */
    public Account(int balance, long accountNumber, AccountType accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    /* Section 2: no-argument constructor with default values */
    public Account() {
        this.balance = 0;
        this.accountNumber = 12345;
        this.accountType = AccountType.CHECKING;
    }

    /* Section 3: getBalance() - no parameters needed, returns the current balance */
    public int getBalance() {
        return balance;
    }

    /* Section 3: deposit() - takes the amount to add, returns void
     * (the balance is updated internally, nothing needs to be returned)
     */
    public void deposit(int amount) {
        balance = balance + amount;
    }

    /* Section 3 / 7 / 8: withdraw() - takes the amount to remove, returns void
     *
     * Section 7 version (kept here as reference, not used):
     *   if (accountType == AccountType.SAVINGS && amount > balance) {
     *       System.out.println("Cannot overdraw a SAVINGS account.");
     *   } else {
     *       balance = balance - amount;
     *   }
     *
     * Section 8 (final version): throws an ArithmeticException instead of
     * just printing a message when a SAVINGS account is overdrawn.
     */
    public void withdraw(int amount) {
        if (accountType == AccountType.SAVINGS && amount > balance) {
            throw new ArithmeticException("Cannot overdraw a SAVINGS account.");
        }
        balance = balance - amount;
    }

    /* Section 3: toString() - no parameters needed, returns a String description */
    @Override
    public String toString() {
        return String.format("The account with number %d is of type '%s' and has a balance of %d",
                accountNumber, accountType.toString().toLowerCase(), balance);
    }
}
