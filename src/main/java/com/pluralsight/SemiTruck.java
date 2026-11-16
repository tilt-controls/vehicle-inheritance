package com.pluralsight;

public class SemiTruck extends Vehicle {
    private boolean hasTrailer;

    public SemiTruck(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasTrailer) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.hasTrailer = hasTrailer;
    }
}
