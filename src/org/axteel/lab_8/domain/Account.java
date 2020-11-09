package org.axteel.lab_8.domain;

import org.axteel.lab_8.util.Encoder;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.UUID;

public class Account {
    private final UUID uuid;
    private String pin;

    private BigDecimal balance;
    private Currency currency;

    private Client client;

    public Account(String pin) {
        this.uuid = UUID.randomUUID();
        this.balance = new BigDecimal(0);
        this.currency = Currency.getInstance("KZT");
        this.pin = Encoder.getInstance().encode(pin);
    }

    public UUID getUuid() {
        return uuid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uuid=" + uuid +
                ", pin='" + pin + '\'' +
                ", balance=" + balance +
                ", currency=" + currency +
                '}';
    }

    public static void main(String[] args) {
        Account account = new Account("2314");
        System.out.println(account);
    }
}
