package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fikrullah.applefikri.menu;
import com.fikrullah.applefikri.R;

public class login extends AppCompatActivity {
    // DEKLARASI TOMBOL
    private Button msignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // MEMANGGIL BUTTON
        msignin = (Button)findViewById(R.id.signin);
        // FUNCTION PADA TOMBOL
        msignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signin = new Intent(getApplicationContext(), menu.class);
                startActivity(signin);
            }
        });

    }
}
