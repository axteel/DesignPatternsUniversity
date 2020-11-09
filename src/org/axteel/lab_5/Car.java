package org.axteel.lab_5;

public abstract class Car implements Speed {
    protected Manufacturer manufacturer;

    public Car(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
