package com.company;
import java.time.format.DateTimeFormatter;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.creatures.Animal;
import com.company.devices.Diesel;

import java.net.URL;


public class Main {
    public static void main(String[] args) {

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
        Diesel tojka = new Diesel("Toyota", "Aygo", 2006);
        tojka.price = 4900.9;
        me.vehicle = tojka;
        Phone fon = new Phone("Samsung", "S8", 2018);
        fon.price = 2000.00;
        me.phone = fon;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(me.getSalary());
        me.setSalary();
        System.out.println();

        me.cash = 123000.0;
        System.out.println(tojka);
        System.out.println(fon);
        System.out.println(me);
        System.out.println("-----------------------------------------------------------------------------------------");
        tojka.turnOn();
        fon.turnOn();
        System.out.println("-----------------------------------------------------------------------------------------");
        Human anna = new Human();
        anna.firstName = "Anna";
        anna.lastName = "Kowalska";
        anna.cash = 3400.0;
        System.out.println(anna);
        System.out.println();
        tojka.sell(me, anna, 1500.0);
        System.out.println(anna);
        System.out.println(me);
        tojka.sell(me, anna, 273.0);
        tojka.sell(anna, me, 5.0);
        System.out.println(anna);
        tojka.sell(me,anna, 22848.0);
        System.out.println();
        fon.sell(anna,me,1500.0);

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
        tojka.refuel();


    }
}
