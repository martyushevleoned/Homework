package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.calculator.R.id.num0;
import static com.example.calculator.R.id.num1;
import static com.example.calculator.R.id.num2;
import static com.example.calculator.R.id.num3;
import static com.example.calculator.R.id.num4;
import static com.example.calculator.R.id.num5;
import static com.example.calculator.R.id.num6;
import static com.example.calculator.R.id.num7;
import static com.example.calculator.R.id.num8;
import static com.example.calculator.R.id.num9;

import static com.example.calculator.R.id.div;
import static com.example.calculator.R.id.mult;
import static com.example.calculator.R.id.sum;
import static com.example.calculator.R.id.diff;

import static com.example.calculator.R.id.equal;
import static com.example.calculator.R.id.ac;
import static com.example.calculator.R.id.display;

public class MainActivity extends AppCompatActivity {

    double firstNumber = 0;
    double secondNumber = 0;
    int sign = 0;
    String signResult = " ";
    double result = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Thread run = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {

                        findViewById(ac).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                firstNumber = 0;
                                secondNumber = 0;
                                sign = 0;
                                signResult = " ";
                                result = -1;
                            }
                        });

                        findViewById(num0).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                    } else {
                                        secondNumber *= 10;
                                    }
                                }
                            }
                        });

                        findViewById(num1).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber++;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber++;
                                    }
                                }
                            }
                        });

                        findViewById(num2).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 2;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 2;
                                    }
                                }
                            }
                        });

                        findViewById(num3).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 3;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 3;
                                    }
                                }
                            }
                        });

                        findViewById(num4).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 4;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 4;
                                    }
                                }
                            }
                        });

                        findViewById(num5).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 5;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 5;
                                    }
                                }
                            }
                        });

                        findViewById(num6).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 6;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 6;
                                    }
                                }
                            }
                        });

                        findViewById(num7).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 7;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 7;
                                    }
                                }
                            }
                        });

                        findViewById(num8).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 8;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 8;
                                    }
                                }
                            }
                        });

                        findViewById(num9).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (sign == 0) {
                                        firstNumber *= 10;
                                        firstNumber += 9;
                                    } else {
                                        secondNumber *= 10;
                                        secondNumber += 9;
                                    }
                                }
                            }
                        });

                        findViewById(sum).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    sign = 1;
                                    signResult = "+";
                                }
                            }
                        });

                        findViewById(diff).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    sign = 2;
                                    signResult = "-";
                                }
                            }
                        });

                        findViewById(mult).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    sign = 3;
                                    signResult = "*";
                                }
                            }
                        });

                        findViewById(div).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    sign = 4;
                                    signResult = "/";
                                }
                            }
                        });

                        findViewById(equal).setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                if (result == -1) {
                                    if (secondNumber != 0) {
                                        if (sign == 1) {
                                            result = firstNumber + secondNumber;
                                        }
                                        if (sign == 2) {
                                            result = firstNumber - secondNumber;
                                        }
                                        if (sign == 3) {
                                            result = firstNumber * secondNumber;
                                        }
                                        if (sign == 4) {
                                            result = firstNumber / secondNumber;
                                        }
                                        if (result != -1)((Button) findViewById(display)).setText("" + firstNumber + " " + signResult + " " + secondNumber + " = " + result);
                                    }
                                }
                            }
                        });

                        if (result == -1) {if (sign == 0)((Button) findViewById(display)).setText("" + firstNumber);}
                        if (result == -1) {if (sign != 0)((Button) findViewById(display)).setText("" + firstNumber + " " + signResult + " " + secondNumber);}

                        Thread.sleep(100); //1000 - 1 сек
                    } catch (InterruptedException ex) {
                    }
                }
            }
        });
        run.start();

    }
}

