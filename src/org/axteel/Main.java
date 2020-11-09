package org.axteel;

import org.axteel.lab_5.Car;
import org.axteel.lab_5.LuxurySportCar;
import org.axteel.lab_5.Manufacturer;
import org.axteel.lab_8.domain.Account;
import org.axteel.lab_8.service.DOOMBank;
import org.axteel.lab_8.util.Database;

public class Main {


    public static void main(String[] args) {
	// write your code here
        DOOMBank doomBank = new DOOMBank();
        Database database = Database.getInstance();
        Account account = database.getAccounts().get(0);
        doomBank.withdraw(account.getUuid(), "1234", 12d);
    }
}
