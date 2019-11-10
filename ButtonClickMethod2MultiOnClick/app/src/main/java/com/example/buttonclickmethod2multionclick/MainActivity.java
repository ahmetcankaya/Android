package com.example.buttonclickmethod2multionclick;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.txt);
    }

    public void buttonClick(View view) {
        switch (view.getId()) {
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
