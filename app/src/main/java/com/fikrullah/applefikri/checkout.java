package com.fikrullah.applefikri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.fikrullah.applefikri.R;

public class checkout extends AppCompatActivity {
    // DEKLARASI TOMBOL
    private Button mbackhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        // MEMANGGIL BUTTON
        mbackhome = (Button)findViewById(R.id.backhome);
        // FUNCTION PADA TOMBOL
        mbackhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent home = new Intent(getApplicationContext(), menu.class);
                startActivity(home);
            }
        });

    }
}
