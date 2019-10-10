package com.company;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {

        Random rnd = new Random();

        int i, j;
        out.println("size of first massive");
        out.print("x = ");
        int x = in.nextInt();
        out.print("y = ");
        int y = in.nextInt();
        int sum = 0;
        int mas = 0;
        int mass[][] = new int [x][y];

        for (i=0;i<y;i++){
            for (j=0;j<x;j++){
                mass[j][i] = in.nextInt();
            }
        }

        out.println();
        out.println("first massive ");

        for (i=0;i<y;i++){
            for (j=0;j<x;j++){
                out.print(mass[j][i] + " \t");
                sum += mass[j][i];
            }
            out.println("\t summ = "+sum);
            mas += sum;
            sum = 0;
        }

        out.println();
        out.println("random  massive [" + mas + "][" + mas + "]");
        out.println();

        int massive[][] = new int [mas][mas];

        for(i=0;i<massive.length;i++)
        {
            for(j=0;j<massive[i].length;j++)
            {
                massive[j][i] = rnd.nextInt(10);
                out.print(massive[j][i] + "\t");
            }
            out.println();
        }

    }
}