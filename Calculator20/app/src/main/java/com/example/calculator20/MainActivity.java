package com.example.calculator20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.calculator20.R.id.num0;
import static com.example.calculator20.R.id.num1;
import static com.example.calculator20.R.id.num2;
import static com.example.calculator20.R.id.num3;
import static com.example.calculator20.R.id.num4;
import static com.example.calculator20.R.id.num5;
import static com.example.calculator20.R.id.num6;
import static com.example.calculator20.R.id.num7;
import static com.example.calculator20.R.id.num8;
import static com.example.calculator20.R.id.num9;
import static com.example.calculator20.R.id.point;

import static com.example.calculator20.R.id.div;
import static com.example.calculator20.R.id.mult;
import static com.example.calculator20.R.id.sum;
import static com.example.calculator20.R.id.diff;
import static com.example.calculator20.R.id.equal;

import static com.example.calculator20.R.id.ac;
import static com.example.calculator20.R.id.display;

public class MainActivity extends AppCompatActivity {

    String firstNumber = "";
    String secondNumber = "";

    double firstNumberDouble = 0;
    double secondNumberDouble = 0;

    double result;
    int intResult;

    String stringSign = "";

    Boolean firstPointPress = false;
    Boolean secondPointPress = false;

    int stage = 0;

    /*
     * stage 0 enter first number
     * stage 0 enter sign
     * stage 1 enter second number
     * stage 2 equal
     */

    //public static int firstPart(int n, int plus){}

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ((Button) findViewById(display)).setText("");

        findViewById(ac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = "";
                secondNumber = "";

                firstNumberDouble = 0;
                secondNumberDouble = 0;

                result = 0;
                intResult = 0;

                stringSign = " ";

                firstPointPress = false;
                secondPointPress = false;

                stage = 0;

                ((Button) findViewById(display)).setText("");
            }
        });

        findViewById(num0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "0";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "0";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "1";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "1";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "2";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "2";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "3";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "3";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "4";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "4";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "5";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "5";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "6";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "6";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "7";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "7";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "8";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "8";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0){
                    firstNumber += "9";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "9";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstPointPress == false && firstNumber != ""){
                    firstNumber += ".";
                    ((Button) findViewById(display)).setText(firstNumber);
                    firstPointPress = true;
                }

                if (stage == 1 && secondPointPress == false && secondNumber != ""){
                    secondNumber += ".";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                    secondPointPress = true;
                }
            }
        });

        findViewById(sum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstNumber != ""){
                    stringSign = "+";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign);
                    stage++;
                }

                if (stage == 2){

                    stage = 1;

                    secondNumber = "";

                    firstNumberDouble = 0;
                    secondNumberDouble = 0;

                    stringSign = "+";

                    result = 0;
                    intResult = 0;

                    firstPointPress = false;
                    secondPointPress = false;

                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(diff).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstNumber != ""){
                    stringSign = "-";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign);
                    stage++;
                }


                if (stage == 2){

                    stage = 1;

                    secondNumber = "";

                    firstNumberDouble = 0;
                    secondNumberDouble = 0;

                    stringSign = "-";

                    result = 0;
                    intResult = 0;

                    firstPointPress = false;
                    secondPointPress = false;

                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(mult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstNumber != ""){
                    stringSign = "*";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign);
                    stage++;
                }

                if (stage == 2){

                    stage = 1;

                    secondNumber = "";

                    firstNumberDouble = 0;
                    secondNumberDouble = 0;

                    stringSign = "*";

                    result = 0;
                    intResult = 0;

                    firstPointPress = false;
                    secondPointPress = false;

                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstNumber != ""){
                    stringSign = "/";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign);
                    stage++;
                }

                if (stage == 2){

                    stage = 1;

                    secondNumber = "";

                    firstNumberDouble = 0;
                    secondNumberDouble = 0;

                    stringSign = "/";

                    result = 0;
                    intResult = 0;

                    firstPointPress = false;
                    secondPointPress = false;

                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
            }
        });

        findViewById(equal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 1){
                    stage++;

                    firstNumberDouble = Double.parseDouble(firstNumber);
                    secondNumberDouble = Double.parseDouble(secondNumber);

                    switch (stringSign)
                    {
                        case("+"):
                            result = firstNumberDouble + secondNumberDouble;
                            break;
                        case("-"):
                            result = firstNumberDouble - secondNumberDouble;
                            break;
                        case("*"):
                            result = firstNumberDouble * secondNumberDouble;
                            break;
                        case("/"):
                            result = firstNumberDouble / secondNumberDouble;
                            break;
                    }

                    result = result * 1000;
                    int help = (int) Math.round(result);
                    result = (double)help / 1000;

                    if (result % 1 == 0){
                        intResult = (int)result;
                        ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber + "=" + intResult);
                        firstNumber = "" + intResult;
                    }else{
                        ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber + "=" + result);
                        firstNumber = "" + result;
                    }


                }

            }
        });

    }
}