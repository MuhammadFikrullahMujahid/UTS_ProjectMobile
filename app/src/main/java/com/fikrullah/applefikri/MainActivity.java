package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.fikrullah.applefikri.R;

public class MainActivity extends AppCompatActivity {
    private int waktu_loading=4000;
    // 4000 = 4 DETIK
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mulai=new Intent(MainActivity.this, mulai.class);
                startActivity(mulai);
                finish();}
        },waktu_loading);
    }
}