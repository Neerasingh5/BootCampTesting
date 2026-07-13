package com.Decision_Making_Control;

/*
 * Task 52: Decision-Making Control Statement (IF Statement)
 * Case Study: Check Voting Eligibility
 */
public class CheckVotingEligibility {

    public static void main(String[] args) {
        checkVotingEligibility(20);
        checkVotingEligibility(15);
    }

    static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("Age " + age + ": Eligible to vote");
        } else {
            System.out.println("Age " + age + ": Not eligible to vote");
        }
    }
}
