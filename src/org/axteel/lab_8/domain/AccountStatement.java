package org.axteel.lab_8.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountStatement {
    private UUID uuid;
    private Operation operation;
    private BigDecimal amount;
    private BigDecimal balance;
    private Account account;


    public static final class AccountStatementBuilder {
        private UUID uuid;
        private Operation operation;
        private BigDecimal amount;
        private BigDecimal balance;
        private Account account;

        private AccountStatementBuilder() {
        }

        public static AccountStatementBuilder anAccountStatement() {
            return new AccountStatementBuilder();
        }

        public AccountStatementBuilder uuid(UUID uuid) {
            this.uuid = uuid;
            return this;
        }

        public AccountStatementBuilder operation(Operation operation) {
            this.operation = operation;
            return this;
        }

        public AccountStatementBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public AccountStatementBuilder balance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public AccountStatementBuilder account(Account account) {
            this.account = account;
            return this;
        }

        public AccountStatement build() {
            AccountStatement accountStatement = new AccountStatement();
            accountStatement.balance = this.balance;
            accountStatement.operation = this.operation;
            accountStatement.amount = this.amount;
            accountStatement.uuid = this.uuid;
            accountStatement.account = this.account;
            return accountStatement;
        }
    }
}
