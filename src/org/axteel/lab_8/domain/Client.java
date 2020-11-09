package org.axteel.lab_8.domain;

import org.axteel.lab_8.domain.Account;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

public class Client {
    private UUID uuid;
    private String name;
    private List<Account> accounts;

    public Client(String name) {
        this.name = name;
        accounts = new LinkedList<>();
    }

    public void saveAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccountByUUID() {
        //accounts.stream().forEach(account -> a.);
        return null;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
