package com.company;
import java.time.LocalDateTime;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.salleable;

public class Human implements salleable{
    String firstName;
    String lastName;
    Double weight;
    public Animal pet;
    public Car vehicle;
    private final Double salary;
    private LocalDateTime salaryLastAccessDateTime;
    private Double salaryLastAccessValue;

    public Phone phone;
    public Double cash;


    public final static Double DEFAULT_HUMAN_WEIGHT = 70.0;


    public Human() {
        this.weight= DEFAULT_HUMAN_WEIGHT;
        this.salary = 3600.0;
        this.salaryLastAccessDateTime = LocalDateTime.now();
        this.salaryLastAccessValue = this.salary;
    }

    public Double getSalary() {
        System.out.println("Your salary info was last accessed on " + this.salaryLastAccessDateTime + ", it's value was " + salaryLastAccessValue);
        this.salaryLastAccessValue = this.salary;
        this.salaryLastAccessDateTime = LocalDateTime.now();
        return this.salary;
    }

    public void setSalary() {
        if (salary < 0) {
            System.out.println("Salary cannot be a negative value.");
        } else {
            System.out.println("Salary is not a negative value");
            System.out.println("New data was sent to the accountant.");
            System.out.println("The annex to the contract is required to be received from Ms. Hani from HR");
            System.out.println("ZUS and US already know about the payout change and there is no point in hiding your income");
        }
    }

    public Car getVehicle() {
        return vehicle;
    }

    public boolean setVehicle(Car newCar, Double price) {
        if (price == 0.0){
            this.vehicle = newCar;
            return true;
        }
        boolean bought = false;
        if (this.cash > price) {
            this.vehicle = newCar;
            System.out.println("A little cash is gone, but it's yours!");
            this.cash -= price;
            bought = true;
        } else if (this.cash > (price/12)) {
            this.vehicle = newCar;
            System.out.println("On credit, but it is !");
            this.cash -= price/12;
            bought = true;
        } else {
            System.out.println("Forget about the car for now! Ask for a raise or find a new job.");
        }
        return bought;
    }
    public String getName() {
        return " " + firstName + " " + lastName ;
    }

    @Override
    public String toString() {
        return "Human {   " +"\n" +
                "   firstName =  " + firstName + '\n' +
                "   lastName =   " + lastName + '\n' +
                "   pet =        " + pet + "\n" +
                "   vehicle =    " + vehicle + "\n" +
                "   phone =      " + phone + "\n" +
                "   salary =     " + salary + "\n" +
                "   cash =       " + cash + "\n" +
                " }";
    }


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("HUMAN IS NOT FOR SALE!!!");
    }
}

