package com.example.intentsenddatawithputextra;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView txtSonuc;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txtSonuc = findViewById(R.id.txtSnc);
        Intent ıntent = getIntent();
        int sonucGelen = ıntent.getIntExtra("sonuc", 0);


        txtSonuc.setText("İşlem Sonucu = " + sonucGelen);


    }
}
