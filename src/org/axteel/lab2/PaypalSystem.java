package org.axteel.lab2;

import java.util.*;

public class PaypalSystem {
    private static PaypalSystem paypalSystem;

    private List<Customer> customers;
    private Map<Customer, Set<Account>> customerAccounts;

    private PaypalSystem() {
        customers = new LinkedList<>();
        customerAccounts = new HashMap<>();
    }

    public static PaypalSystem getInstance() {
        if (paypalSystem == null) {
            paypalSystem = new PaypalSystem();
            System.out.println("Paypal System has been initiated");
            return paypalSystem;
        }

        System.out.println("Paypal System has been passed");
        return paypalSystem;
    }

    public String addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("\n" + customer.getFirstName() + " " + customer.getLastName() +
                " has been registered in Paypal System \nUUID: " + customer.getUuid() + "\n");
        return customer.getUuid();
    }

    public Customer getCustomerById(String id) {
        for (Customer c : customers) {
            if (c.getUuid().equals(id)) {
                return c;
            }
        }
        throw new RuntimeException("No such customer");
    }

    public String addAccountToCustomer(Customer customer) {
        Account account = new Account();
        if (!customerAccounts.containsKey(customer)) {
            HashSet<Account> accounts = new HashSet<>();
            accounts.add(account);
            customerAccounts.put(customer, accounts);
        } else {
            customerAccounts.get(customer).add(account);
        }
        return account.getAccountId();
    }

    public void displayCustomerAccounts(Customer customer) {
        System.out.println(customerAccounts.get(customer));
    }

    public void deposit(Customer customer, String accountId, Double amount) {
        Set<Account> accounts = customerAccounts.get(customer);
        for (Account a : accounts) {
            if (a.getAccountId().equals(accountId)) {
                a.deposit(amount);
                customerAccounts.replace(customer, accounts);
                System.out.println(a);
                break;
            }
        }
    }

    public void withdraw(Customer customer, String accountId, Double amount) {
        Set<Account> accounts = customerAccounts.get(customer);
        for (Account a : accounts) {
            if (a.getAccountId().equals(accountId)) {
                a.withdraw(amount);
                customerAccounts.replace(customer, accounts);
                System.out.println(a);
                break;
            }
        }
    }
}
