package com.company.devices;
import com.company.Human;
import com.company.salleable;

public abstract class Car extends Device implements salleable, Comparable<Car> {
 //  public Double price;
    public Car(String producer, String model, Integer yearOfProduction) {
        super(producer,model,yearOfProduction);
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
        if (sellerCarNumber >= 0) {
            int buyerSpaceNumber = buyer.getFirstSpace();
            if (buyerSpaceNumber >= 0) {
                if (buyer.setCar(this, price, buyerSpaceNumber)) {
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
}
