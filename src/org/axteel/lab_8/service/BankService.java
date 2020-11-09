package org.axteel.lab_8.service;

import java.math.BigDecimal;
import java.util.UUID;

public interface BankService {
    void withdraw(UUID uuid, String pin, Double amount);
    void deposit(UUID uuid, String pin, Double amount);
}
