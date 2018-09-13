package com.example.sheehanmilesk.calculatortry2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String problem = "";
        TextView display = findViewById(R.id.answer);
        Button onebutton = findViewById(R.id.one);
        Button twobutton = findViewById(R.id.two);
        Button threebutton = findViewById(R.id.three);
        Button fourbutton = findViewById(R.id.four);
        Button fivebutton = findViewById(R.id.five);
        Button sixbutton = findViewById(R.id.six);
        Button sevenbutton = findViewById(R.id.seven);
        Button eightbutton = findViewById(R.id.eight);
        Button ninebutton = findViewById(R.id.nine);
        Button openparenbutton = findViewById(R.id.openparen);
        Button closeparenbutton = findViewById(R.id.closeparen);

    }
}
