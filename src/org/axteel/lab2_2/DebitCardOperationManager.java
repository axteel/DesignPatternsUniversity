package org.axteel.lab2_2;

public class DebitCardOperationManager implements OperationManager<DebitCard> {
    private final DebitCard debitCard;

    public DebitCardOperationManager(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public DebitCard getCard() {
        return debitCard;
    }

    @Override
    public DebitCard withdraw(double amount) {
        if (debitCard.getBalance() - amount < 0) {
            throw new RuntimeException("No sufficient funds");
        }
        debitCard.setBalance(debitCard.getBalance() - amount);

        return debitCard;
    }

    @Override
    public DebitCard deposit(double amount) {
        debitCard.setBalance(debitCard.getBalance() + amount);

        return debitCard;
    }
}
