package com.company;

public class WarPlane extends Plane {

    String type;
    String armament;

    public WarPlane(String country, String name, String model, double lenght, int mass, String material, int power, String type, String armament){
        super(country, name, model, lenght, mass, material, power);
        this.type = type;
        this.armament = armament;
    }

    void getAllInfo(){

        getAllInfoPlane();
        System.out.print(type + "; ");
        System.out.println(armament);
    }
}
