package org.axteel.lab2_2;

public class PaypalMethod implements PaymentMethod {
    private OperationManager operationManager;

    public PaypalMethod() { }

    public PaypalMethod(OperationManager operationManager) {
        this.operationManager = operationManager;
    }

    public void setOperationManager(OperationManager operationManager) {
        this.operationManager = operationManager;
    }

    @Override
    public void pay(double amount) {
       operationManager.withdraw(amount);
    }
}
