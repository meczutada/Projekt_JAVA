package com.company;

public class Car {
    final String manufacturer;
    final String model;
    Integer production;
    Integer capacity;
    String colour;

    public Car(String manufacturer, String model, Integer productionYear, Integer tankCapacity, String colour) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.production = productionYear;
        this.capacity = tankCapacity;
        this.colour = colour;
    }
}
