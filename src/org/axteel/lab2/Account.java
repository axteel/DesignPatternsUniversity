package org.axteel.lab2;

import java.util.UUID;

public class Account {
    private String accountId;
    private Double balance;

    public Account() {
        this.accountId = UUID.randomUUID().toString();
        this.balance = 0d;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void deposit(Double amount) {
        this.balance += amount;
        System.out.println("Deposit: success");
    }

    public void withdraw(Double amount) {
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Withdraw: success ");
        }
        else {
            System.out.println("Cannot perform withdraw operation: balance < " + amount);
        }
    }

    @Override
    public String toString() {
        return "Account {" +
                "accountId='" + accountId + '\'' +
                ", balance=" + balance +
                '}';
    }
}
