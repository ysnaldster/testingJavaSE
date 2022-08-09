package com.platzi.javatests.payment;

public class PaymentRequest {

    private final double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
