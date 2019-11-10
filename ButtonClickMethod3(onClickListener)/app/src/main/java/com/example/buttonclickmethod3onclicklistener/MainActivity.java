package com.example.buttonclickmethod3onclicklistener;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    Button btnDefault, btnRed, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.txt);
        btnDefault = findViewById(R.id.btn1);
        btnRed = findViewById(R.id.btn2);
        btnBlue = findViewById(R.id.btn3);

        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.GREEN);
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.RED);
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text.setTextColor(Color.BLUE);
            }
        });
    }
}
