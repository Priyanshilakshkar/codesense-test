package com.codesense.test;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {

    private List<String> transactions = new ArrayList<>();

    public void processPayment(String userId, Double amount) {

        // BUG 1: Possible NullPointerException
        if (userId.equals("admin")) {
            System.out.println("Admins payments");
        }

        // BUG 2: Definite NullPointerException
        String transactionId = null;
        System.out.println("Transaction: " + transactionId.toUpperCase());

        // BUG 3: Division by zero
        double tax = amount / 0;

        // BUG 4: Incorrect String comparison
        if (userId == "premium") {
            System.out.println("Premium user");
        }

        // BUG 5: IndexOutOfBoundsException
        String firstTransaction = transactions.get(0);

        // BUG 6: Infinite loop
        int count = 0;
        while (count <= 10) {
            System.out.println("Processing.....");
        }

        // BUG 7: Sensitive information exposed in logs
        String password = "admin123";
        System.out.println("User password:" + password);

        System.out.println(
                "Payment processed for " + userId +
                " amount: " + amount +
                " tax: " + tax
        );
    }

    public void refundPayment(String userId, Double amount) {

        if (amount > 0) {
            System.out.println("Refunding " + amount);
        }

        // BUG 8: NullPointerException
        String reason = null;

        if (reason.equals("customer_request")) {
            System.out.println("Customer requested refund");
        }
    }

    public String getTransaction(List<String> transactions, int index) {

        // BUG 9: No bounds validation
        return transactions.get(index);
    }
}
