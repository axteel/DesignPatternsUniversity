package org.axteel.lab2;

public class PaymentContext {
    private PaymentStrategy strategy;
    private Customer customer;

    public PaymentStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void pay(Double amount, String id) {
        strategy.purchase(customer, id, amount);
    }

    public void loan(Double amount, String id) {
        strategy.loan(customer, id, amount);
    }
}
