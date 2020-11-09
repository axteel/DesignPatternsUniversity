package org.axteel.lab_5;

public class Sedan extends Car {
    public Sedan(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public double getSpeed() {
        return 240;
    }
}
