package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.fikrullah.applefikri.R;

public class menu extends AppCompatActivity {
    // DEKLARASI TOMBOL
    private Button mgethere;
    private ImageView mmacm1;
    private ImageView mwatch8;
    private ImageView maboutme;
    private Button mcs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        // MEMANGGIL BUTTON
        mgethere = (Button)findViewById(R.id.gethere);
        mmacm1 = (ImageView)findViewById(R.id.macm1);
        mwatch8 = (ImageView)findViewById(R.id.watch8);
        maboutme = (ImageView)findViewById(R.id.aboutme);
        mcs = (Button)findViewById(R.id.cs);
        // FUNCTION PADA TOMBOL
        mgethere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ip13 = new Intent(getApplicationContext(), iphone13.class);
                startActivity(ip13);
            }
        });
        mmacm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent macm1 = new Intent(getApplicationContext(), macm1.class);
                startActivity(macm1);
            }
        });
        mwatch8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent watch8 = new Intent(getApplicationContext(), watch8.class);
                startActivity(watch8);
            }
        });
        maboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent about = new Intent(getApplicationContext(), about.class);
                startActivity(about);
            }
        });
        mcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cs = new Intent(getApplicationContext(), customer.class);
                startActivity(cs);
            }
        });
    }
}
