package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        //Plane plane1 = new Plane("USSR","Mig","33",15, 350, "Aluminium", 3000);
        //plane1.getAllInfoPlane();
        //System.out.println();

        System.out.println();

        SportPlane sportPlane1 = new SportPlane("СССР","Су-26","М",6.83, 680, "Aluminium", 260, 1);
        sportPlane1.getAllInfo();
        SportPlane sportPlane2 = new SportPlane("Россия","Су-29","КС",7.29, 735, "Aluminium", 360, 2);
        sportPlane2.getAllInfo();
        SportPlane sportPlane3 = new SportPlane("Россия","Су-31","М",6.78, 650, "Aluminium", 260, 1);
        sportPlane3.getAllInfo();

        System.out.println();

        PassengerPlane passengerPlane1 = new PassengerPlane("Европа","Аirbus320","neo",37.6, 62800, "Aluminium", 3000, 5, 494);
        passengerPlane1.getAllInfo();
        PassengerPlane passengerPlane2 = new PassengerPlane("США","Boeing 737","800",39.5, 41140, "Aluminium", 2600, 3, 349);
        passengerPlane2.getAllInfo();
        PassengerPlane passengerPlane3 = new PassengerPlane("США","Boeing 777","200",63.7, 139225, "Aluminium", 5600, 6, 705);
        passengerPlane3.getAllInfo();

        System.out.println();

        WarPlane warPlane1 = new WarPlane("СССР","Ми-3","Д",11.57, 4058, "Aluminium", 1300, "тяжёлый истребитель", "6х(7,62-ммпулемёт)");
        warPlane1.getAllInfo();
        WarPlane warPlane2 = new WarPlane("СССР/Россия","Ту-22","М",42.46, 68000, "Aluminium", 3000, "бомбардировщик-ракетоносец", "ракеты Х-22(Буря)");
        warPlane2.getAllInfo();
        WarPlane warPlane3 = new WarPlane("СССР","М-55","М-17",22.67, 14000, "Aluminium", 9000, "разведчик", "отсутствует");
        warPlane3.getAllInfo();

        System.out.println();

        System.out.print("count of objects = " + Plane.countOfObjects);

    }
}
