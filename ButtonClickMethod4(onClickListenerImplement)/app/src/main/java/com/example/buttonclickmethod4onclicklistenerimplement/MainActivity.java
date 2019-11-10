package com.example.buttonclickmethod4onclicklistenerimplement;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

        btnDefault.setOnClickListener(this);
        btnRed.setOnClickListener(this);
        btnBlue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                text.setTextColor(Color.GREEN);
                break;
            case R.id.btn2:
                text.setTextColor(Color.RED);
                break;
            case R.id.btn3:
                text.setTextColor(Color.BLUE);
                break;
        }
    }
}
