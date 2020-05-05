package com.company;
import java.time.LocalDateTime;
import com.company.devices.Car;


public class Human {
    String firstName;
    String lastName;
    Animal pet;
    private Car vehicle;

    private Double salary;
    private LocalDateTime salaryLastAccessDateTime;
    private Double salaryLastAccessValue;

    public Human() {
        this.salary = 2600.0;
        this.salaryLastAccessDateTime = LocalDateTime.now();
        this.salaryLastAccessValue = this.salary;
    }

    public Double getSalary() {
        System.out.println("Your salary info was last accessed on " + this.salaryLastAccessDateTime + ", it's value was " + salaryLastAccessValue);
        this.salaryLastAccessValue = this.salary;
        this.salaryLastAccessDateTime = LocalDateTime.now();
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Salary cannot be a negative value.");
        } else {
            System.out.println("Salary is not a negative value");
            System.out.println("New data was sent to the accountant.");
            System.out.println("The annex to the contract is required to be received from Ms. Hani from HR");
            System.out.println("ZUS and US already know about the payout change and there is no point in hiding your income");
            this.salary = salary;
        }
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car newCar) {
        if (this.salary > newCar.price) {
            this.vehicle = newCar;
            System.out.println("A little cash is gone, but it's yours!");
        } else if (this.salary > (newCar.price/12)) {
            this.vehicle = newCar;
            System.out.println("On credit, but it is !");
        } else {
            System.out.println("Forget about the car for now! Ask for a raise or find a new job.");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", vehicle=" + vehicle +
                ", salary=" + salary +
                ", salaryLastAccessDateTime=" + salaryLastAccessDateTime +
                ", salaryLastAccessValue=" + salaryLastAccessValue +
                '}';
    }
}
