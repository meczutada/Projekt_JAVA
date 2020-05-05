package com.company.devices;

public class Car {
    final String manufacturer;
    final String model;
    Integer production;
    Integer capacity;
    String colour;
    public Integer price;

    public Car(String manufacturer, String model, Integer productionYear, Integer tankCapacity, String colour, Integer price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.production = productionYear;
        this.capacity = tankCapacity;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", production=" + production +
                ", capacity=" + capacity +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
