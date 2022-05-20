package com.fikrullah.applefikri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.fikrullah.applefikri.menu;
import com.fikrullah.applefikri.R;

public class customer extends AppCompatActivity {

    private Button msendmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        msendmsg = (Button)findViewById(R.id.sendmsg);

        msendmsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Message Sent, Check Your Email",Toast.LENGTH_LONG).show();
                Intent iKembali = new Intent(getApplicationContext(), menu.class);
                startActivity(iKembali);
                finish();
            }
        });
    }
}