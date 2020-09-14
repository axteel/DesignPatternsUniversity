package org.axteel.lab2_2;

public class DebitCard extends Card {
    private double balance;

    public DebitCard (Card card) {
        super(card.getNameOnCard(), card.getCardNumber(), card.getExpiryDate(), card.getCvv());
        this.balance = 0;
    }

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "DebitCard {" +
                "balance=" + balance +
                '}';
    }
}
