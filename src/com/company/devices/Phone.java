package com.company.devices;
import com.company.Human;
import com.company.salleable;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements salleable {
    public static final String defaultURL = "www.uhave.com";
    public static final String defaultProtocol = "https";
    public static final String defaultNameVersion = "v1";

    public Double price;
    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
    }

    public void installApp(String name) {
        System.out.println("You are installing application: " + name); }
    public void installApp(String name, String version) {
        System.out.println("You are installing application: " + name + "\n Version: " + version); }
    public void installApp(List<String> names) {
        for (String app : names) {
            System.out.println("You are installing applications: " + app); }
    }
    public void installApp(URL address) {
        String app = address.getPath();
        String nameVersion = address.getQuery();
        String host = address.getHost();
        String protocol = address.getProtocol();
        System.out.println("You are installing application: " + app + "\n version: " + nameVersion + "\n host: " + host + "\n protocol: " + protocol);
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
