package org.axteel.lab2_2;

public class PaymentContext {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private void pay(double amount) {
        paymentMethod.pay(amount);
    }
}
