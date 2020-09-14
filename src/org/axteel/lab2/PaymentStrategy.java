package org.axteel.lab2;

public interface PaymentStrategy {
    void purchase(Customer customer, String accountId, Double amount);
    void loan(Customer customer, String accountId, Double amount);
}
