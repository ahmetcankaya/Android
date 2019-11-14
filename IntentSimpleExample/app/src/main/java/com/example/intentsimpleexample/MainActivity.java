package com.example.intentsimpleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnNext;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNext = findViewById(R.id.btnNext);//Nesne İle Button İlişkilendirme


        //Butonumuza tıklama özelliği kazandırıyoruz.
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent sınıfından nesnemizi oluşturuyoruz.
                //context ya da MainActivity.this diyerek bu activity de çalışacağını belirtiyoruz
                //Intent ıntent = new Intent(MainActivity.this, SecondActivity.class);
                Intent ıntent = new Intent(context, SecondActivity.class);
                //Activity başlatıyoruz bizden intent türünde nesne istiyor kendi oluşturduğumuz nesneyi kullanıyoruz.
                startActivity(ıntent);
            }
        });
    }
}
