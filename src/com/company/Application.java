package com.company;

public class Application {
    public String name;
    public String version;
    public Double price;

    public Application(String name, String version, double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }
    public String toString() {
        return "Aplikacja o nazwie: "+name+", wersji: "+version+" oraz w cenie: "+price+"zł\n";
    }
}

