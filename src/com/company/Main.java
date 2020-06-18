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
import java.util.ArrayList;


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

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Czy" + me.getName() + " był/a właścicielem samochodu " + tojka.toString() +" ? \nOdpowiedź: " + tojka.wasOwner(me));
        System.out.println("Czy" + me.getName() + " był/a właścicielem samochodu " + BMW.toString() +" ? \nOdpowiedź: " + tojka.wasOwner(me));
        System.out.println("Czy" + kamil.getName() + " był/a właścicielem samochodu " + tojka.toString() +" ? \nOdpowiedź: " + tojka.wasOwner(me));
        System.out.println("Czy" + me.getName() + " sprzedał/a samochod " + BMW.toString() + " dla"+kamil.getName()+" ? \nOdpowiedź: " + BMW.didSell(me,kamil,BMW));
        System.out.println("Czy" + kamil.getName() + " sprzedał/a samochod " + BMW.toString() + " dla"+me.getName()+" ? \nOdpowiedź: " + BMW.didSell(kamil,me,BMW));
        System.out.println("Samochód: "+tojka.toString()+ " uczestniczył w transakcji sprzedaży  "+tojka.countTransaction() +" razy.");
        System.out.println("Samochód: "+BMW.toString()+ " uczestniczył w transakcji sprzedaży "+BMW.countTransaction() +" razy.");
        tojka.sell(me,anna,21.0);
        System.out.println("Samochód: "+tojka.toString()+ " uczestniczył w transakcji sprzedaży  "+tojka.countTransaction() +" razy.");
        tojka.sell(anna,me,2234.5);
        System.out.println("Samochód: "+tojka.toString()+ " uczestniczył w transakcji sprzedaży  "+tojka.countTransaction() +" razy.");

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();
        Application facebook = new Application("Facebook","latest",0.0);
        Application instagram = new Application("Instagram","latest",0.0);
        Application TeamSpeak = new Application("TeamSpeak","latest",5.2);
        Application NavigationPro = new Application("Navigation Pro","latest",23.0);
        Application Tasker = new Application("Tasker", "latest", 9.9);
        Application TocaLife = new Application("Toca Life", "latest", 12659485982.3);
        Application NavRadio = new Application("Nav Radio+","latest", 15.9);
        System.out.println(anna.getName()+" posiada "+anna.cash+" zł.");
        fon.installNewApp(anna,TocaLife); // nie ma kasy
        fon.installNewApp(anna,NavRadio);
        fon.installNewApp(anna,instagram);
        fon.installNewApp(anna,facebook);
        System.out.println(anna.getName()+" posiada "+anna.cash+" zł.");
        fon.installNewApp(anna,Tasker);
        fon.installNewApp(anna,NavigationPro);
        System.out.println(fon.SortNameApp());
        System.out.println("Czy aplikacja Facebook została zainstalowana?\nOdpowiedź: "+fon.installedApp(facebook));
        System.out.println("Czy aplikacja TeamSpeak została zainstalowana?\nOdpowiedź: "+fon.installedApp(TeamSpeak));
        System.out.println(fon.FreeApp());
        System.out.println(fon.SortPriceApp());

    }
}
