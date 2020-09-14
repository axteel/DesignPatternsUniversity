package org.axteel.lab2;

public class PaypalPayment implements PaymentStrategy {
    private PaypalSystem paypalSystem;

    public PaypalPayment() {
        this.paypalSystem = PaypalSystem.getInstance();
    }

    @Override
    public void purchase(Customer customer, String id, Double amount) {
        paypalSystem.withdraw(customer, id, amount);
    }

    @Override
    public void loan(Customer customer, String id, Double amount) {
        throw new RuntimeException("Paypal cannot give loans");
    }
}
