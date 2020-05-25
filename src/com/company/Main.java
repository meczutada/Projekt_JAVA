package com.company;
import java.time.format.DateTimeFormatter;
import com.company.devices.Car;
import com.company.devices.Phone;



public class Main {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        Human me = new Human();
        me.firstName = "Adrianna";
        me.lastName = "Mechut";
        me.pet = new Animal("dog");

        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();
        me.pet.feed();
        me.pet.takeForAWalk();
        me.pet.takeForAWalk();


        System.out.println();
        Car tojka = new Car("Toyota", "Aygo", 2006);
        tojka.price = 4900.90;
        Phone fon = new Phone("Samsung","S8",2018);
        fon.price = 2000.00;

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(me);
        System.out.println(me.getSalary());
        me.setSalary();
        me.setVehicle(tojka);
        System.out.println(tojka);
        System.out.println(fon);

        tojka.turnOn();
        fon.turnOn();


    }
}
