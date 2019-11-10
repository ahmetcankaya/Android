package com.example.buttonclickmethod1onclick;

import androidx.appcompat.app.AppCompatActivity;

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
        if (text.getText().toString() == "Hello World!")
            text.setText("Hello Space!");
        else
            text.setText("Hello World!");
    }
}
