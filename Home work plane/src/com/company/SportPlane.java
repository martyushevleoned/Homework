package com.company;

class SportPlane extends Plane {

    int quantityPilots;

    public SportPlane(String country, String name, String model, double lenght, int mass, String material, int power, int quantityPilots){

        super(country, name, model, lenght, mass, material, power);
        this.quantityPilots = quantityPilots;
    }

    void getAllInfo(){

        getAllInfoPlane();
        System.out.println(quantityPilots);
    }
}
