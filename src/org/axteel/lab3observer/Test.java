package org.axteel.lab3observer;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 *  Publishers: National Bank currency change (later can be added other publishers (events) that affect currency rate)
 *
 *  Observable currencies: KZT-EUR, KZT-USD, KZT-RUB
 *
 *  Subscribers: Second-tier Banks, Exchange Offices, Logger of currency changes (currency, from, to, time)
 *
 *  Note. Draw a simple class diagram for your application and include it to your submission.
 *
 *  NB all the previous laboratory works are available on GitHub
 *      -> https://github.com/axteel/DesignPatternsUniversity
 * */

public class Test {
    private static final NationalBankCurrencyRate nationalBank = NationalBankCurrencyRate.getInstance();
    public static void main(String[] args)  {
        ConcreteObserver alice = new ConcreteObserver(nationalBank);
        alice.setName("Alice");
        ConcreteObserver halykBank = new ConcreteObserver(nationalBank);
        halykBank.setName("Halyk Bank");
        ConcreteObserver migExchange = new ConcreteObserver(nationalBank);
        migExchange.setName("MIG Exchange");

        nationalBank.registerObserver(alice);
        nationalBank.registerObserver(halykBank);
        nationalBank.registerObserver(migExchange);

        HashMap<Currency, BigDecimal> newRate = new HashMap<>();
        newRate.put(Currency.EUR, new BigDecimal("500"));
        newRate.put(Currency.RUB, new BigDecimal("7"));
        newRate.put(Currency.USD, new BigDecimal("300"));

        nationalBank.updateRates(newRate);
    }
}
