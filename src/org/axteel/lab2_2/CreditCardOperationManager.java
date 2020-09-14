package org.axteel.lab2_2;


public class CreditCardOperationManager implements OperationManager<CreditCard> {
    private final CreditCard creditCard;

    public CreditCardOperationManager(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public CreditCard withdraw(double amount) {
        double limit = creditCard.getLimit();
        double balance = creditCard.getBalance();

        if (balance - amount < limit) {
            throw new RuntimeException("Error: Limit is exceeded.\nYou can withdraw only " + (limit + balance));
        }

        creditCard.setBalance(balance - amount);

        return creditCard;
    }

    @Override
    public CreditCard deposit(double amount) {
        this.creditCard.setBalance(this.creditCard.getBalance() + amount);
        return creditCard;
    }
}
