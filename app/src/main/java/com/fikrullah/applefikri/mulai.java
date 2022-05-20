package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fikrullah.applefikri.R;

public class mulai extends AppCompatActivity {
    // DEKLARASI TOMBOL
    private Button mcoba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        // MEMANGGIL BUTTON
        mcoba = (Button)findViewById(R.id.coba);
        // FUNCTION PADA TOMBOL
        mcoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getApplicationContext(),home.class);
                startActivity(home);
            }
        });

    }
}
