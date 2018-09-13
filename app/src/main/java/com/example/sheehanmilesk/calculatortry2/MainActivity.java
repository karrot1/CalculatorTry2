package com.example.sheehanmilesk.calculatortry2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.sheehanmilesk.calculatortry2.MainActivity.operation.ADD;
import static com.example.sheehanmilesk.calculatortry2.MainActivity.operation.DIVIDE;
import static com.example.sheehanmilesk.calculatortry2.MainActivity.operation.EXPONENT;
import static com.example.sheehanmilesk.calculatortry2.MainActivity.operation.MULTIPLY;
import static com.example.sheehanmilesk.calculatortry2.MainActivity.operation.NONE;
import static com.example.sheehanmilesk.calculatortry2.MainActivity.operation.SUBTRACT;

public class MainActivity extends AppCompatActivity {

    enum operation{
        ADD, SUBTRACT, MULTIPLY, DIVIDE, EXPONENT, SQRT, NONE;
        //for keeping track of what operation is being done
    }

    //the two numbers
    String number1 = "";
    String number2 = "";

    //used for entering numbers
    Boolean isdecimal = false;
    operation op = NONE;

    //the display
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the display
        display = findViewById(R.id.answer);

        //the verious buttons
        Button onebutton = findViewById(R.id.one);
        Button twobutton = findViewById(R.id.two);
        Button threebutton = findViewById(R.id.three);
        Button fourbutton = findViewById(R.id.four);
        Button fivebutton = findViewById(R.id.five);
        Button sixbutton = findViewById(R.id.six);
        Button sevenbutton = findViewById(R.id.seven);
        Button eightbutton = findViewById(R.id.eight);
        Button ninebutton = findViewById(R.id.nine);
        Button addbutton = findViewById(R.id.addbutton);
        Button subbutton = findViewById(R.id.subbutton);
        Button mulbutton = findViewById(R.id.mulbutton);
        Button divbutton = findViewById(R.id.divbutton);
        Button sqrtbutton = findViewById(R.id.sqrt);
        Button expbutton = findViewById(R.id.exponent);
        Button decimalbutton = findViewById(R.id.decimal);
        Button solvebutton = findViewById(R.id.solve);
        Button clearbutton = findViewById(R.id.clear);
        Button zerobutton = findViewById(R.id.zero);

        //onclick listeners for the numbers and the decimal point
        zerobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE && number1.equals("")== false) {
                    number1 = number1 + "0";
                    display.setText(number1);
                } else if(op != NONE && number2.equals("")==false) {
                    number2 = number2 + "0";
                    display.setText(number2);
                }
            }
        });
        onebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "1";
                    display.setText(number1);
                } else {
                    number2 = number2 + "1";
                    display.setText(number2);
                }
            }
        });
        twobutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "2";
                    display.setText(number1);
                } else {
                    number2 = number2 + "2";
                    display.setText(number2);
                }
            }
        });
        threebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "3";
                    display.setText(number1);
                } else {
                    number2 = number2 + "3";
                    display.setText(number2);
                }
            }
        });
        fourbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "4";
                    display.setText(number1);
                } else {
                    number2 = number2 + "4";
                    display.setText(number2);
                }
            }
        });
        fivebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "5";
                    display.setText(number1);
                } else {
                    number2 = number2 + "5";
                    display.setText(number2);
                }
            }
        });
        sixbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "6";
                    display.setText(number1);
                } else {
                    number2 = number2 + "6";
                    display.setText(number2);
                }
            }
        });
        sevenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "7";
                    display.setText(number1);
                } else {
                    number2 = number2 + "7";
                    display.setText(number2);
                }
            }
        });
        eightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "8";
                    display.setText(number1);
                } else {
                    number2 = number2 + "8";
                    display.setText(number2);
                }
            }
        });
        ninebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    number1 = number1 + "9";
                    display.setText(number1);
                } else {
                    number2 = number2 + "9";
                    display.setText(number2);
                }
            }
        });
        decimalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isdecimal == false){
                    if (op == NONE) {
                        number1 = number1 + ".";
                        display.setText(number1);
                        isdecimal = true;
                    } else {
                        number2 = number2 + ".";
                        display.setText(number2);
                        isdecimal = true;
                    }
                }
            }
        });

        //onclicklisteners for the ops
        sqrtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    Double result = Math.sqrt(Double.parseDouble(number1));
                    number1 = "";
                    number2 = "";
                    isdecimal = false;
                    display.setText(String.valueOf(result));
                }
            }
        });
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    op = ADD;
                    isdecimal = false;
                }
            }
        });
        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    op = SUBTRACT;
                    isdecimal = false;
                }
            }
        });
        mulbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    op = MULTIPLY;
                    isdecimal = false;
                }
            }
        });
        divbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    op = DIVIDE;
                    isdecimal = false;
                }
            }
        });
        expbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op == NONE) {
                    op = EXPONENT;
                    isdecimal = false;
                }
            }
        });

        //the solve button
        solvebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (op != NONE && number1.equals("") == false && number2.equals("") == false) {
                    if(op == ADD){
                        Double result = Double.parseDouble(number1) + Double.parseDouble(number2);
                        number1 = "";
                        number2 = "";
                        display.setText(String.valueOf(result));
                        op = NONE;
                        isdecimal = false;
                    }
                    else if(op == SUBTRACT){
                        Double result = Double.parseDouble(number1) - Double.parseDouble(number2);
                        number1 = "";
                        number2 = "";
                        display.setText(String.valueOf(result));
                        op = NONE;
                        isdecimal = false;
                    }
                    else if(op == MULTIPLY){
                        Double result = Double.parseDouble(number1) * Double.parseDouble(number2);
                        number1 = "";
                        number2 = "";
                        display.setText(String.valueOf(result));
                        op = NONE;
                        isdecimal = false;
                    }
                    else if(op == DIVIDE){
                        Double result = Double.parseDouble(number1) / Double.parseDouble(number2);
                        number1 = "";
                        number2 = "";
                        display.setText(String.valueOf(result));
                        op = NONE;
                        isdecimal = false;
                    }
                    else if(op == EXPONENT){
                        Double result = Math.pow(Double.parseDouble(number1), Double.parseDouble(number2));
                        number1 = "";
                        number2 = "";
                        display.setText(String.valueOf(result));
                        op = NONE;
                        isdecimal = false;
                    }
                }
            }
        });
        clearbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1 = "";
                number2 = "";
                display.setText("000");
                op = NONE;
                isdecimal = false;
            }
        });
    }
}
