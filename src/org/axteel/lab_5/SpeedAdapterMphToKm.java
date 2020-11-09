package org.axteel.lab_5;

public class SpeedAdapterMphToKm implements SpeedAdapter {
    private Car car;

    public SpeedAdapterMphToKm(Car car) {
        this.car = car;
    }

    @Override
    public double getSpeed() {
        return convert(car.getSpeed());
    }

    private double convert(double speed) {
        return speed * 1.60934d;
    }
}
