package com.company;
import java.net.MalformedURLException;
import java.time.format.DateTimeFormatter;
import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.devices.Diesel;
import com.company.devices.*;
import com.company.Human;
import java.net.URL;


public class Main {
    public static void main(String[] args) throws Exception {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        Human me = new Human();
        me.firstName = "Adrianna";
        me.lastName = "Mechut";
        me.pet = new Pet("dog");

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();


        System.out.println();
        Phone fon = new Phone("Samsung", "S8", 2018);
        fon.price = 2000.00;
        me.phone = fon;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(me.getSalary());
        me.setSalary();
        System.out.println();

        me.cash = 123000.0;
        System.out.println(fon);
        System.out.println(me);
        System.out.println("-----------------------------------------------------------------------------------------");
        fon.turnOn();
        System.out.println("-----------------------------------------------------------------------------------------");
        Human anna = new Human();
        anna.firstName = "Anna";
        anna.lastName = "Kowalska";
        anna.cash = 3400.0;
        System.out.println(anna);
        System.out.println();


        Human piotr = new Human();
        piotr.firstName = "Piotr";
        piotr.lastName = "Zet";
        piotr.cash = 1500.9;
        Phone iphone = new Phone("APPLE","iPhone 7",2017);
        piotr.phone = iphone;

        Human kamil = new Human();
        kamil.firstName = "Kamil";
        kamil.lastName = "Wonsz";
        kamil.cash = 168732.53;
        Pet mruczek = new Pet("cat");
        kamil.pet = mruczek;
        System.out.println(piotr);
        System.out.println(kamil);

      //  iphone.sell(piotr,kamil,3989.99);
       // iphone.sell(piotr,kamil,3989.99);
        iphone.sell(piotr,kamil,3989939999999.99);
        System.out.println(piotr);
        mruczek.sell(kamil, piotr, 1200.0);
        System.out.println(kamil);

        anna.sell(kamil,piotr,2983.00);

        System.out.println("-----------------------------------------------------------------------------------------");
        FarmAnimal pig = new FarmAnimal("pig");
        pig.feed();
        pig.feed(4.5);
        pig.beEaten();
        pig.feed();
        mruczek.feed(3.0);

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
        fon.installApp("Facebook");
        fon.installApp("Spotify","2.0");
        String[] apps = {"Facebook","Messenger","Instagram"};
        fon.installApp(apps);
        System.out.println("-----------------------------------------------------------------------------------------");

        Car tojka = new Diesel("Toyota", "Aygo", 2006);
        me.setCar(tojka,150.0,0);
        System.out.println(me);
        Car BMW = new Electric("BMW","x5",2001);
        me.setCar(BMW,50.0,1);
        me.sortGarage();
        System.out.println(me);
        BMW.sell(me, kamil, 5000.0);
        System.out.println(kamil);
        System.out.println(me);
        Car ford = new LPG("Ford", "Fokus", 2020);
        ford.value = 25900.0;
      //  ford.sell(anna,me,1234.9);//Exception in thread "main" java.lang.Exception:  Anna Kowalska nie ma co sprzedawać, garaż jest pusty.
        me.setCar(ford,21000.9,0);
        System.out.println(me);
      //  BMW.sell(kamil,me,1232.9);//Exception in thread "main" java.lang.Exception:  Adrianna Mechut nie ma miejsca w garażu. Zorganizuj najpierw jakieś dodatkowe miejsce parkingowe!
      //  BMW.sell(kamil,anna,2836283283.9);//Exception in thread "main" java.lang.Exception: Jeśli brak Ci siana zadzwoń do bociana! :)


    }
}
