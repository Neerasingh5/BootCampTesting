package com.New_SavingAccount;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

/*
 * Task 54: Account Tests (Savings & Checking)
 * -----------------------------------------------------------
 * Assumes the following classes already exist in this package:
 *
 *   SavingsAccount()                  -> no-arg constructor, starting balance 0
 *   CheckingAccount(double balance)   -> parameterized constructor
 *   deposit(double amount)
 *   withdraw(double amount)           -> SavingsAccount throws an exception
 *                                        if withdrawal would overdraw the account;
 *                                        CheckingAccount allows overdraft (negative balance)
 *   getBalance()
 *
 * If your actual class/method names or constructors differ, update the
 * references below to match.
 */
public class AccountTest {

    @Test
    void testSavingsAccountDeposit() {
        // Arrange - create an account using the no-argument constructor
        SavingsAccount account = new SavingsAccount();

        // Act - deposit 10
        account.deposit(10);

        // Assert - check that the balance is 10
        assertEquals(10, account.getBalance());
    }

    @Test
    void testCheckingAccountDepositAndWithdraw() {
        // Arrange - create a checking account using the parameterized constructor
        CheckingAccount account = new CheckingAccount(0);

        // Act - deposit 10
        account.deposit(10);

        // Act - withdraw 20
        account.withdraw(20);

        // Assert - check that the resulting balance of the account is -10
        assertEquals(-10, account.getBalance());
    }

    /* EXCEPTIONS */

    @Test
    void testSavingsAccountWithdrawThrowsException() {
        // write a test that creates a new savings account and then immediately
        // tries to withdraw 10 from it. This should throw an exception, but does it?
        SavingsAccount account = new SavingsAccount();

        assertThrows(IllegalStateException.class, () -> {
            account.withdraw(10);
        });
    }

    /* PARAMETERIZED TEST */

    // Write a parameterized test that tests the withdraw function for a savings account
    // For all iterations: create a new savings account and deposit 10.
    // Iteration 1: withdraw 0, check that balance is 10
    // Iteration 2: withdraw 5, check that balance is 5
    // Iteration 3: withdraw 10, check that balance is 0
    @ParameterizedTest
    @CsvSource({
            "0, 10",
            "5, 5",
            "10, 0"
    })
    void testSavingsAccountWithdrawParameterized(double withdrawAmount, double expectedBalance) {
        SavingsAccount account = new SavingsAccount();
        account.deposit(10);

        account.withdraw(withdrawAmount);

        assertEquals(expectedBalance, account.getBalance());
    }
}
