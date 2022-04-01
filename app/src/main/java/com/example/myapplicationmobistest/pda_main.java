package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pda_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pda_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button butt1 = (Button) findViewById(R.id.buttonpda1);
        Button butt2 = (Button) findViewById(R.id.buttonpda2);
        Button butt3 = (Button) findViewById(R.id.buttonpda3);
        Button butt4 = (Button) findViewById(R.id.buttonpda4);
        Button butt5 = (Button) findViewById(R.id.buttonpda5);
        Button butt6 = (Button) findViewById(R.id.buttonpda6);
        Button butt7 = (Button) findViewById(R.id.buttonpda7);
        Button butt8 = (Button) findViewById(R.id.buttonpda8);


        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(pda_main.this, pda1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(pda_main.this, pda2.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(pda_main.this, pda3.class);
                startActivity(int3);
            }

        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(pda_main.this, pda4.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(pda_main.this, pda5.class);
                startActivity(int5);
            }

        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(pda_main.this, pda6.class);
                startActivity(int6);
            }

        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(pda_main.this, pda7.class);
                startActivity(int7);
            }

        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(pda_main.this, pda8.class);
                startActivity(int8);
            }

        });

    }

}