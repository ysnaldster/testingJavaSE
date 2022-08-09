package com.platzi.javatests.payment;

public class PaymentResponse {

    public enum PaymentStatus{
        OK,ERROR

        }
    private final PaymentStatus status;

    public PaymentResponse(PaymentStatus status) {
        this.status = status;
    }

    public PaymentStatus getStatus() {
        return status;
    }
}
