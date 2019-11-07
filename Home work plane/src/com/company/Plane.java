package com.company;

 class Plane {

    String country;
    String name;
    String model;
    double lenght;
    int mass;
    String material;
    int power;
    static int countOfObjects = 0;

     public Plane(String country, String name, String model, double lenght, int mass, String material, int power){
        this.country = country;
        this.name = name;
        this.model = model;
        this.lenght = lenght;
        this.mass = mass;
        this.material = material;
        this.power = power;
        this.countOfObjects = countOfObjects;
     }

    void getAllInfoPlane() {
        countOfObjects++;
        System.out.print(country + "; ");
        System.out.print(name + "; ");
        System.out.print(model + "; ");
        System.out.print(lenght + "; ");
        System.out.print(mass + "; ");
        System.out.print(material + "; ");
        System.out.print(power + "; ");
    }

     public int getAge() {
         return countOfObjects;
     }

}
