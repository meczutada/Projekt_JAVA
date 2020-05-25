package com.company.devices;
import com.company.Human;

public class Phone extends Device {
    public Double price;
    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone turned on !");
    }
}
