package com.example.intentsenddatawithputextra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etSayi1, etSayi2;
    Button btnSonuc;
    Context context = this;
    int topla = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSayi1 = findViewById(R.id.etSayi1);
        etSayi2 = findViewById(R.id.etSayi2);
        btnSonuc = findViewById(R.id.btnSonuc);

    }

    public void btnSonuc(View view) {
        Intent ıntent = new Intent(context, SecondActivity.class);
        topla = Integer.parseInt(etSayi1.getText().toString()) + Integer.parseInt(etSayi2.getText().toString());
        ıntent.putExtra("sonuc", topla);
        startActivity(ıntent);
    }
}
