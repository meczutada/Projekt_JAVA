package com.company.devices;
import com.company.Human;
import com.company.salleable;

public class Phone extends Device implements salleable {
    public Double price;
    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println("Phone turned on !");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == null) {
            System.out.println("Seller" + seller.getName() + " don't have a phone.");
        } else if (buyer.cash >= price) {
                System.out.println((buyer.getName() + " bought a " + this + " from " + seller.getName() +"."));
                buyer.phone = this;
                buyer.cash -= price;
                seller.phone = null;
                seller.cash += price;
            } else {
                System.out.println(buyer.getName() + " doesn't have enough money.");
            }
        }


}
