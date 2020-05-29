package com.company.devices;

public class Diesel extends Car {
    public Diesel(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("The car has been refueled with diesel.");
    }
}
