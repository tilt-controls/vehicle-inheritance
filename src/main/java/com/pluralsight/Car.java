package com.pluralsight;

public class Car extends Vehicle {
    private boolean hasTrunk;

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasTrunk) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasTrunk = hasTrunk;
    }
}
