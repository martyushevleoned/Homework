package com.company;

public class PassengerPlane extends Plane{

    int numberOfEngines;
    int numberOfPassengers;

    public PassengerPlane(String country, String name, String model, double lenght, int mass, String material, int power, int numberOfEngines, int numberOfPassengers){
        super(country, name, model, lenght, mass, material, power);
        this.numberOfEngines = numberOfEngines;
        this.numberOfPassengers = numberOfPassengers;
    }

    void getAllInfo(){

        getAllInfoPlane();
        System.out.print(numberOfEngines + "; ");
        System.out.println(numberOfPassengers);
    }
}
