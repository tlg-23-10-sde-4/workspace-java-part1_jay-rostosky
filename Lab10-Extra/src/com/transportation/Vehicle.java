package com.transportation;

public abstract class Vehicle {
    // INSTANCE VARIABLES
    private String vin;

    // CONSTRUCTORS
    public Vehicle(String vin) {
        this.vin = vin;
    }

    // BUSINESS METHODS
    public abstract void moveTo(String location) throws DestinationUnreachableException;

    // ACCESSOR METHODS
    public String getVin() {
        return vin;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": vin=" + getVin();
    }
}