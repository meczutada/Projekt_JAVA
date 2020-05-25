package com.company.devices;
import com.company.Human;

public abstract class Device {

    final public String producer;
    final public String model;
    final public Integer yearOfProduction;

    public Device(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return "You have: " +
                "producer= " + producer +
                ", model= " + model +
                ", year of production= " + yearOfProduction;
    }

    public abstract void turnOn();
}
