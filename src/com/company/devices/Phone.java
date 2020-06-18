package com.company.devices;
import com.company.Human;
import com.company.salleable;
import com.company.Application;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Phone extends Device implements salleable {

    private static final String DEFAULT_APP_PROTOCOL = "https";
    private static final String DEFAULT_APP_SERVER = "www.uhave.com";
    private static final int DEFAULT_PORT_NUMBER = 864;
    public Double price;
    public List<Application> applications;
    public Phone(String producer, String model, Integer yearOfProduction)
    {
        super(producer, model, yearOfProduction);
        applications = new ArrayList<>();
    }
    public boolean installedApp(Application application){
        return applications.contains(application);
    }
    public boolean installedApp(String name){
        for (Application application: applications){
            if (application.name.equals(name)){
                return true;
            }
        }return false;
    }
    public List<Application> FreeApp() {
        List<Application> freeApps = new ArrayList<>();
        for (Application application: applications){
            if (application.price == 0.0) freeApps.add(application);
        } return freeApps;
    }
    public Double AllInstalledApp(){
        Double all = 0.0;
        for (Application application: applications){
            all += application.price;
        } return all;
    }
    public List<Application> SortNameApp(){
        List<Application> list = new ArrayList<>(applications);
        list.sort(Comparator.comparing(app -> app.name));
        return list;
    }
    public List<Application> SortPriceApp(){
        List<Application> list = new ArrayList<>(applications);
        list.sort(Comparator.comparing(app -> app.price));
        return list;
    }

    public void installNewApp(Human human, Application application) {
        if (human.cash > application.price) {
            human.cash -= application.price;
            this.applications.add(application);
            System.out.println("Zainstalowano " + application.name);
        }
        else System.out.println(human.getName()+"! Nie masz tyle kasy, żeby kupić tą apkę!");
    }

    public void installApp(String[] names) throws MalformedURLException {
        System.out.println("Instalowanie aplikacji na podstawie tablicy nazw.");
        for (String name: names){
            this.installApp(name);
        }
    }
    public void installApp(String name) throws MalformedURLException {
        System.out.println("Instalowanie aplikacji na podstawie nazwy.");
        this.installApp(name, "latest");
    }

    public void installApp(String name, String version) throws MalformedURLException {
        System.out.println("Instalowanie aplikacji na podstawie nazwy i wersji.");
        URL address = new URL(DEFAULT_APP_PROTOCOL, DEFAULT_APP_SERVER, DEFAULT_PORT_NUMBER, name + "-" + version);
        this.installApp(address);
    }

    public void installApp(URL address) {
        System.out.println("Instalowanie aplikacji na podstawie url.");
        //sprawdzenie płatności
        //połaczenie z serwerem
        //pobranie pliku
        //wypakowanie
        //instalacja
        //dodanie ikony
        //itp
        System.out.println("You have installed the application. " + address.getFile() + ", z serwera " + address.getHost());
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
