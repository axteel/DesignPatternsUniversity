package org.axteel.lab_8.service;

import org.axteel.lab_8.domain.AccountStatement;
import org.axteel.lab_8.domain.Operation;
import org.axteel.lab_8.util.Database;
import org.axteel.lab_8.domain.Account;
import org.axteel.lab_8.domain.Client;

import java.math.BigDecimal;
import java.util.UUID;

public class DOOMBank implements BankService {
    private final Database bankDatabase = Database.getInstance();

    public DOOMBank() {
        dataPreload();
    }

    @Override
    public void withdraw(UUID uuid, String pin,  Double amount) {
        Account found = bankDatabase.getAccounts()
                .stream().filter(account -> uuid.equals(account.getUuid())).findAny().orElse(null);
        BigDecimal balance = found.getBalance().subtract(new BigDecimal(amount));
        AccountStatement accountStatement = AccountStatement.AccountStatementBuilder
                .anAccountStatement().amount(balance)
                .operation(Operation.WITHDRAW)
                .account(found)
                .build();
        System.out.println(accountStatement);
    }

    @Override
    public void deposit(UUID uuid, String pin, Double amount) {

    }

    public void displayAccounts() {
        bankDatabase.getAccounts().forEach(System.out::println);
    }

    private void dataPreload() {
        Client client = new Client("Andrey Stalnoy");
        Account account = new Account("1234");

        client.getAccounts().add(account);
        account.setClient(client);

        bankDatabase.getAccounts().add(account);
        bankDatabase.getClients().add(client);
    }
}
