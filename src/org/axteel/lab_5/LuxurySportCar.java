package org.axteel.lab_5;

public class LuxurySportCar extends Car {
    private final double speed = 420;

    public LuxurySportCar(Manufacturer manufacturer) {
        super(manufacturer);
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
