package com.example.sudoku;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;



class MyProgram{

    static void write (int[][] mas) {

        PrintStream out = System.out;

        int i;
        int j;

        for (j=0; j<mas.length; j++) {
            for (i = 0; i < mas[j].length; i++) {
                out.print(mas[i][j]);
                out.print(" ");
                if ((i+1) % 3 == 0){out.print(" ");}
            }
            if ((j+1) % 3 == 0){out.println();}
            out.println();
        }
        out.println();
        out.println();
    }


    public static void main(String[] args){

        Random rnd = new Random();

        int i;
        int i1;
        int j;
        int s = 9;
        int r;
        int m;
        //int s = in.nextInt();
        int mas[][] = new int [s][s];
        int mash[] = new int [s];
        int masp[] = new int [s];

        for (j=0; j<mas.length; j++) {
            for (i = 0; i < mas[j].length; i++) {
                mas[i][j] = rnd.nextInt(10);
                //mas[i][j] = i+j;
            }
        }

        masp[0]=0;
        masp[1]=3;
        masp[2]=6;

        masp[3]=1;
        masp[4]=4;
        masp[5]=7;

        masp[6]=2;
        masp[7]=5;
        masp[8]=8;

        for (j=0; j<mas.length; j++) {
            for (i = 0; i < mas[j].length; i++) {

                if (i + masp[j] <= 8){
                    mas[i][j] = i + 1 + masp[j];
                }else{
                    mas[i][j] = i + 1 + masp[j] - 9;
                }
            }
        }
        write(mas);

//////////////////////////////////////////////////////////
        r = rnd.nextInt(3);

        for (i1 = 0; i1 < r*3; i1++) {
            for (j = 0; j < s; j++) {

                m = mas[0][j];
                for (i = 0; i < s - 1; i++) {
                    mas[i][j] = mas[i + 1][j];
                }
                mas[8][j] = m;
            }
        }

        r = rnd.nextInt(3);

        for (i1 = 0; i1 < r*3; i1++) {
            for (j = 0; j < s; j++) {

                m = mas[j][0];
                for (i = 0; i < s - 1; i++) {
                    mas[j][i] = mas[j][i + 1];
                }
                mas[j][8] = m;
            }
        }
//write(mas);
////////////////////////////////////////////////////

        r = rnd.nextInt(2);
        if (r == 1) {
            for (j = 0; j < s; j++) {

                for (i = 0; i < s; i++) {
                    mash[i] = mas[s - 1 - i][j];
                }
                for (i = 0; i < s; i++) {
                    mas[i][j] = mash[i];
                }
            }
//write(mas);
        }
        r = rnd.nextInt(2);
        if (r == 1) {
            for (j = 0; j < s; j++) {

                for (i = 0; i < s; i++) {
                    mash[i] = mas[j][s - 1 - i];
                }
                for (i = 0; i < s; i++) {
                    mas[j][i] = mash[i];
                }
            }
//write(mas);
        }
        write(mas);

    }
}