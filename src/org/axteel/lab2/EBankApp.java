package org.axteel.lab2;


/**
 *  Title: E-Banking App with Different Operation Strategies
 *      Description: Use the Strategy pattern to implement the various banking operations
 *  (take a loan or make an online purchase) and payment methods to purchase of
 *  goods (by credit card, PayPal or by cash) in an e-banking application.Note.
 *  Concrete strategies not only perform the actual payment but also alter
 *  the behavior of the checkout form, providing appropriate fields to record
 *  payment details. For example, for payments by card there is a payment card
 *  details, for PayPal - account details, etc. First of all, make a simple class
 *  diagram for your application and include it to your submission.
 *
 * */

public class EBankApp {
    private static PaypalSystem paypalSystem = PaypalSystem.getInstance();
    private static Customer customer = new Customer("Andrey", "Stalnoy");

    public static void main(String[] args) {
        BankSystem bankSystem = BankSystem.getInstance();
        bankSystem.addCustomer(customer);
        String id = bankSystem.addAccountToCustomer(customer);
        bankSystem.deposit(customer, id, 400d);
        bankSystem.creditCustomer(customer, id, 600d);
        bankSystem.displayCustomerCredits(customer);
        bankSystem.displayCustomerAccounts(customer);
    }

    static String initCustomerAndBalance() {
        paypalSystem.addCustomer(customer);
        String id = paypalSystem.addAccountToCustomer(customer);
        paypalSystem.deposit(customer, id, 200d);

        return id;
    }
}
