package com.company.devices;
import com.company.Human;
import com.company.salleable;

public class Car extends Device implements salleable {
   public Double price;
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
         }

    @Override
    public void turnOn() {
     System.out.println("The engine started !");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.vehicle == null) {
            System.out.println("Seller"+seller.getName()+" don't have a car.");
        } else if (buyer.setVehicle(this, price)) {
            System.out.println(buyer.getName() + " bought a new car. Now " + this + " from" + seller.getName()+".");
            seller.vehicle = null;
            seller.cash += price;
        }else {
            System.out.println(buyer.getName() +" don't have a money");
        }
    }
}
