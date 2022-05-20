package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fikrullah.applefikri.R;

public class home extends AppCompatActivity {
    // DEKLARASI TOMBOL
    private Button mloging;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // MEMANGGIL BUTTON
        mloging = (Button)findViewById(R.id.loging);
        // FUNCTION PADA TOMBOL
        mloging.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loging = new Intent(getApplicationContext(),login.class);
                startActivity(loging);
            }
        });

    }
}
