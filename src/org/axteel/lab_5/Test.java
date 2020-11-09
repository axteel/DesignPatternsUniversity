package org.axteel.lab_5;

/**
 * Implement a simple application to get an information about different types of cars in showroom.
 *
 * Types of cars in a show room: luxury sport cars, sedan, minivan, SUVs, etc.
 *
 * For each type of car we have two types of manufacturer: for US and Europe markets.
 * The only difference is that US cars' speed in miles per hour (mph),
 * for Europe in kilometers per hour (kmh).
 *
 * We have to get a maximum speed for each type of car in kmh.
 * Use an Adapter Pattern for incompatible type of speed interfaces.
 * Also use Bridge pattern to structure Car object with a type of manufacturer.
 *
 * Constant: 1 mph = 1.609344 Km/h
 *
 * */

public class Test {
    private static Manufacturer europe = () -> "Europe";
    private static Manufacturer us = () -> "US";

    public static void main(String[] args) {
        Car ford = new Sedan(us);

        SpeedAdapter speedAdapter = new SpeedAdapterMphToKm(ford);

        System.out.println(ford.getSpeed() + " -> " + speedAdapter.getSpeed());
    }
}
