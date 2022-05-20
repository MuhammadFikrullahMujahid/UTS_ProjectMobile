package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fikrullah.applefikri.R;

public class macm1 extends AppCompatActivity {
    // DEKLARASI TOMBOL
    private Button mpurchase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macm1);
        // MEMANGGIL BUTTON
        mpurchase = (Button)findViewById(R.id.purchase);
        // FUNCTION PADA TOMBOL
        mpurchase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent checkout = new Intent(getApplicationContext(),checkout.class);
                startActivity(checkout);
            }
        });

    }
}
