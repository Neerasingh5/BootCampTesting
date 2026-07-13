package com.Decision_Making_Control;

/*
 * Task 52: Decision-Making Control Statement (IF Statement)
 * Case Study: E-commerce Discount
 */
public class EcommerceDiscount {

    public static void main(String[] args) {
        applyDiscount(1500);
        applyDiscount(500);
    }

    static void applyDiscount(double cartValue) {
        if (cartValue > 1000) {
            double discount = cartValue * 0.10;
            System.out.println("Cart value: " + cartValue + " -> 10% discount applied: " + discount);
        } else {
            System.out.println("Cart value: " + cartValue + " -> No discount applied");
        }
    }
}
