package com.company;

public class Animal implements salleable{
    final String species;
    protected Double weight;

    public Animal(String species) {
        this.species = species;
        //noinspection EnhancedSwitchMigration
        switch (species) {
            case "dog":
                this.weight = 15.0;
                break;
            case "cat":
                this.weight = 3.5;
                break;
            case "myszojeleń":
                this.weight = 2.4;
                break;
            default:
                this.weight = 1.0;
                break;
        }
    }

    private boolean isAlive() {
        return this.weight > 0;
    }

    public void feed() {
        if (isAlive()) {
            this.weight++;
            System.out.println("Sweet! Now I weigh " + this.weight + " kg");
        }
        else System.out.println("You starved him!");
    }

    public void takeForAWalk() {
        if (isAlive()) {
            this.weight--;
            System.out.println("There is nothing like cardio. My weight has dropped to " + this.weight + " kg");
        }
        else System.out.println("Now you're the one who can walk to the cemetery.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price)
    {
        if (seller.pet == null) {
            System.out.println("Seller" + seller.getName() + " don't have a animal.");
        } else if (buyer.cash >= price) {
            System.out.println((buyer.getName() + " bought a " + this + " from " + seller.getName() +"."));
            buyer.pet = this;
            buyer.cash -= price;
            seller.pet = null;
            seller.cash += price;
        } else {
            System.out.println(buyer.getName() + " doesn't have enough money.");
        }
    }
    public String toString() {
        return species ;
    }

}
