package com.company.devices;

public class LPG extends Car{
    public LPG(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("The car has been refueled with lpg.");
    }
}
