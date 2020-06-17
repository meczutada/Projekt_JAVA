package com.company.devices;
import com.company.Human;
import com.company.salleable;

import java.util.ArrayList;

public abstract class Car extends Device implements salleable, Comparable<Car> {
 //  public Double price;
    public ArrayList<Human> owners;
    public ArrayList<Human> lastOwner;

    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
        owners = new ArrayList<Human>();
        lastOwner = new ArrayList<Human>();
    }

     public abstract void refuel();

    @Override
    public void turnOn() {
     System.out.println("The engine started !");
    }

    public int compareTo(Car other) {
        if (other == null) {
            return 1;
        }
        return (this.yearOfProduction - other.yearOfProduction);
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        int sellerCarNumber = seller.getCarNumber(this);
        if (sellerCarNumber >= 0 && seller.equals(this.owners.get(this.owners.size() -1))) {
            int buyerSpaceNumber = buyer.getFirstSpace();
            if (buyerSpaceNumber >= 0) {
                if (buyer.setCar(this, price, buyerSpaceNumber)) {
                    this.lastOwner.remove(seller);
                    System.out.println(buyer.getName() + " kupił/a " + this + " od " + seller.getName());
                    seller.setCar(null, 0.0, sellerCarNumber);
                    seller.cash += price;
                } else {
                    throw new Exception("Jeśli brak Ci siana zadzwoń do bociana! :)");
                }

            } else {
                throw new Exception(buyer.getName() + " nie ma miejsca w garażu. Zorganizuj najpierw jakieś dodatkowe miejsce parkingowe!");
            }
        } else {
            throw new Exception(seller.getName() + " nie ma co sprzedawać, garaż jest pusty.");
        }
    }
    public boolean wasOwner(Human human) {
        return owners.contains(human);
    }
    public boolean isOwner (Human human) {
        return lastOwner.contains(human);
    }

    public boolean didSell(Human seller, Human buyer, Car car) {
        if (car.wasOwner(seller))
        {
            if (car.wasOwner(buyer))
            {
                if (car.isOwner(buyer))
                {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

        public int countTransaction () {
        return owners.size();
        }
    }
