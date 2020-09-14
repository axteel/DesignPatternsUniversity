package org.axteel.lab2;

import java.util.*;

public class BankSystem {
    private static BankSystem bankSystem;

    private List<Customer> customers;
    private Map<Customer, Set<Account>> customerAccounts;
    private Map<Customer, Set<Loan>> customerLoans;

    private BankSystem() {
        customers = new LinkedList<>();
        customerAccounts = new HashMap<>();
        customerLoans = new HashMap<>();
    }

    public static BankSystem getInstance() {
        if (bankSystem == null) {
            bankSystem = new BankSystem();
            System.out.println("Bank System has been initiated");
            return bankSystem;
        }

        System.out.println("Bank System has been passed");
        return bankSystem;
    }

    public String addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("\n" + customer.getFirstName() + " " + customer.getLastName() +
                " has been registered in Bank System \nUUID: " + customer.getUuid() + "\n");
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

    public Account getAccountByCustomerAndAccountId(Customer customer, String id) {
        for (Account a : customerAccounts.get(customer)) {
            if (a.getAccountId().equals(id))
                return a;
        }

        return null;
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

    public void creditCustomer(Customer customer, String accountId, Double amount) {
        if (!customerLoans.containsKey(customer))
            customerLoans.put(customer, new HashSet<>());
        Loan loan = new Loan("Description", amount);
        Set<Loan> loans = customerLoans.get(customer);
        loans.add(loan);
        customerLoans.replace(customer, loans);
        getAccountByCustomerAndAccountId(customer, accountId).deposit(amount);
    }

    public void displayCustomerCredits(Customer customer) {
        System.out.println(customerLoans.get(customer));
    }

    public void displayCustomerAccounts(Customer customer) {
        System.out.println(customerAccounts.get(customer));
    }
}
