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
    int help;

    /*
     * stage 0 enter first number
     * stage 0 enter sign
     * stage 1 enter second number
     * stage 2 equal
     * stage 3 error
     */

    public String num1(String plus){

        if (stage == 0) {
            firstNumber += plus;
            ((Button) findViewById(display)).setText(firstNumber);
        }

        return firstNumber;
    }

    public String num2(String plus){

        if (stage == 1) {
            secondNumber += plus;
            ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber);
        }

        return secondNumber;
    }

    public void signResult(String sign){

        if (stage == 2){

            stage = 1;

            secondNumber = "";

            firstNumberDouble = 0;
            secondNumberDouble = 0;

            stringSign = sign;

            result = 0;
            intResult = 0;

            firstPointPress = false;
            secondPointPress = false;

            ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber);
        }
    }

    public void sign(String sign){

        if (stage == 0 && firstNumber != "" && firstNumber != "-"){
            stringSign = sign;
            ((Button) findViewById(display)).setText(firstNumber + " " + stringSign);
            stage++;
        }
    }

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

                firstNumber = num1("0");
                secondNumber = num2("0");
                /*
                if (stage == 0){
                    firstNumber += "0";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1){
                    secondNumber += "0";
                    ((Button) findViewById(display)).setText(firstNumber + stringSign + secondNumber);
                }
                */
            }
        });

        findViewById(num1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("1");
                secondNumber = num2("1");
            }
        });

        findViewById(num2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("2");
                secondNumber = num2("2");
            }
        });

        findViewById(num3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("3");
                secondNumber = num2("3");
            }
        });

        findViewById(num4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("4");
                secondNumber = num2("4");
            }
        });

        findViewById(num5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("5");
                secondNumber = num2("5");
            }
        });

        findViewById(num6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("6");
                secondNumber = num2("6");
            }
        });

        findViewById(num7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("7");
                secondNumber = num2("7");
            }
        });

        findViewById(num8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("8");
                secondNumber = num2("8");
            }
        });

        findViewById(num9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                firstNumber = num1("9");
                secondNumber = num2("9");
            }
        });

        findViewById(point).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstPointPress == false && firstNumber != ""){

                    if (firstNumber == "-"){
                        firstNumber = num1("0.");
                    } else {
                        firstNumber = num1(".");
                    }
                    firstPointPress = true;
                }

                if (stage == 1 && secondPointPress == false && secondNumber != ""){

                    if (secondNumber == "-"){
                        secondNumber = num2("0.");
                    } else {
                        secondNumber = num2(".");
                    }
                    secondPointPress = true;
                }
            }
        });

        findViewById(sum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sign("+");
/*
                if (stage == 0 && firstNumber != "" && firstNumber != "-"){
                    stringSign = "+";
                    ((Button) findViewById(display)).setText(firstNumber + " " + stringSign);
                    stage++;
                }
*/
                signResult("+");
/*
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

                    ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber);
                }
*/
            }
        });

        findViewById(diff).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (stage == 0 && firstNumber == ""){
                    firstNumber = "-";
                    ((Button) findViewById(display)).setText(firstNumber);
                }

                if (stage == 1 && secondNumber == ""){
                    secondNumber = "-";
                    ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber);
                }

                sign("-");
                signResult("-");
            }
        });

        findViewById(mult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sign("*");
                signResult("*");
            }
        });

        findViewById(div).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sign("/");
                signResult("/");
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

                    if (secondNumberDouble != 0 || stringSign != "/") {

                        result = result * 10000;
                        help = (int) Math.round(result);
                        result = (double)help / 10000;

                    }

                    if (result % 1 == 0) {
                        intResult = (int) result;
                        ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber + " = " + intResult);
                        firstNumber = "" + intResult;
                    } else {

                        if (secondNumberDouble == 0 && stringSign == "/") {
                            ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber + " = error");
                            stage++;
                            //firstNumber = "";
                        } else {
                            ((Button) findViewById(display)).setText(firstNumber + " " + stringSign + " " + secondNumber + " = " + result);
                            firstNumber = "" + result;
                        }
                    }
                }
            }
        });
    }
}