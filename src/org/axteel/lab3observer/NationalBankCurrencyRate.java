package org.axteel.lab3observer;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NationalBankCurrencyRate implements Observable {
    private static NationalBankCurrencyRate nationalBankCurrencyRate;

    private HashMap<Currency, BigDecimal> currentKztRate;
    private HashSet<Observer> observers;
    private final Logger logger;

    private NationalBankCurrencyRate() {
        this.currentKztRate = new HashMap<>();
        this.observers = new HashSet<>();
        this.logger = SimpleLogger.getLogger(NationalBankCurrencyRate.class);
        updatingRates();
    }

    public static NationalBankCurrencyRate getInstance() {
        if (nationalBankCurrencyRate == null) {
            nationalBankCurrencyRate = new NationalBankCurrencyRate();
            return nationalBankCurrencyRate;
        }
        return nationalBankCurrencyRate;
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observers.add(observer)) {
            logger.log(Level.INFO, "New Observer has been registered.");
        } else {
            logger.log(Level.WARNING, "Reference to current observer already exists.");
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update("New exchange rate");
        }
    }

    private void updatingRates() {
        currentKztRate.put(Currency.EUR, new BigDecimal("420.76"));
        currentKztRate.put(Currency.USD, new BigDecimal("498.6")); // 5.6
        currentKztRate.put(Currency.RUB, new BigDecimal("5.6"));
    }

    public void updateRates(HashMap<Currency, BigDecimal> newRate) {
        this.currentKztRate = newRate;
        logger.log(Level.INFO, "Exchange rate has been updated");
        notifyObserver();
    }

}
