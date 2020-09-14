package org.axteel.lab2_2;

public class Test {
    static Card card = initCard();
    static DebitCard debitCard = new DebitCard(card);
    static CreditCard creditCard = new CreditCard(card, -1000);
    static OperationManager<DebitCard> debitCardOperationManager =
            new DebitCardOperationManager(debitCard);
    static OperationManager<CreditCard> creditCardOperationManager =
            new CreditCardOperationManager(creditCard);

    public static void main(String[] args) {
        debitCardOperationManager.deposit(350d);
        creditCardOperationManager.deposit(300d);
        System.out.println(debitCard);
        System.out.println(creditCard);

        PaypalMethod method = new PaypalMethod();
        method.setOperationManager(debitCardOperationManager);

        method.pay(300);

        System.out.println(debitCard);

        method.setOperationManager(creditCardOperationManager);

        method.pay(800);

        System.out.println(creditCard);
    }

    static Card initCard() {
        Card card = new Card();
        card.setNameOnCard("Andrey Stalnoy");
        card.setCardNumber("1234 1234 1234 1234");
        card.setExpiryDate("88/88");
        card.setCvv("345");

        return card;
    }
}
