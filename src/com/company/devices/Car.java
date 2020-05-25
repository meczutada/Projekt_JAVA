package com.company.devices;
import com.company.Human;

public class Car extends Device {
   public Double price;
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
         }

    @Override
    public void turnOn() {
     System.out.println("The engine started !");
    }
}
