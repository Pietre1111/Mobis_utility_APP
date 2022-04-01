package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pmsk_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pmsk_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button butt1 = (Button) findViewById(R.id.buttonpmsk1);
        Button butt2 = (Button) findViewById(R.id.buttonpmsk2);
        Button butt3 = (Button) findViewById(R.id.buttonpmsk3);
        Button butt4 = (Button) findViewById(R.id.buttonpmsk4);
        Button butt5 = (Button) findViewById(R.id.buttonpmsk5);
        Button butt6 = (Button) findViewById(R.id.buttonpmsk6);
        Button butt7 = (Button) findViewById(R.id.buttonpmsk7);
        Button butt9 = (Button) findViewById(R.id.buttonpmsk9);
        Button butt10 = (Button) findViewById(R.id.buttonpmsk10);
        Button butt12 = (Button) findViewById(R.id.buttonpmsk12);
        Button butt13 = (Button) findViewById(R.id.buttonpmsk13);
        Button butt14 = (Button) findViewById(R.id.buttonpmsk14);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(pmsk_main.this, pmsk1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(pmsk_main.this, pmsk2.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(pmsk_main.this, pmsk3.class);
                startActivity(int3);
            }

        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(pmsk_main.this, pmsk4.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(pmsk_main.this, pmsk5.class);
                startActivity(int5);
            }

        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(pmsk_main.this, pmsk6.class);
                startActivity(int6);
            }

        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(pmsk_main.this, pmsk7.class);
                startActivity(int7);
            }

        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(pmsk_main.this, pmsk9.class);
                startActivity(int9);
            }

        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(pmsk_main.this, pmsk10.class);
                startActivity(int10);
            }

        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12 = new Intent(pmsk_main.this, pmsk12.class);
                startActivity(int12);
            }

        });
        butt13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int13 = new Intent(pmsk_main.this, pmsk13.class);
                startActivity(int13);
            }

        });
        butt14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int14 = new Intent(pmsk_main.this, pmsk14.class);
                startActivity(int14);
            }

        });

    }

}