package org.axteel.lab_8.util;

import org.axteel.lab_8.domain.Account;
import org.axteel.lab_8.domain.AccountStatement;
import org.axteel.lab_8.domain.Client;

import java.util.LinkedList;
import java.util.List;

public class Database {
    private static Database instance;

    private List<Account> accounts = new LinkedList<>();
    private List<Client> clients = new LinkedList<>();
    private List<AccountStatement> statements = new LinkedList<>();

    private Database() {}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public List<AccountStatement> getStatements() {
        return statements;
    }

    public void setStatements(List<AccountStatement> statements) {
        this.statements = statements;
    }
}
