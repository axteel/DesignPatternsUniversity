package org.axteel.lab2_2;

public class CreditCard extends Card {
    private final double limit;
    private double balance = 0;

    public CreditCard(Card card, double limit) {
        super(card.getNameOnCard(), card.getCardNumber(), card.getExpiryDate(), card.getCvv());
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "CreditCard {" +
                "limit=" + limit +
                ", balance=" + balance +
                '}';
    }
}
