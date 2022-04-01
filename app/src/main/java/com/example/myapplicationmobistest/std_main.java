package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class std_main extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.std_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        Button butt1 = (Button) findViewById(R.id.buttonstdmain1);
        Button butt2 = (Button) findViewById(R.id.buttonstdmain2);
        Button butt3 = (Button) findViewById(R.id.buttonstdmain3);
        Button butt4 = (Button) findViewById(R.id.buttonstdmain4);
        Button butt5 = (Button) findViewById(R.id.buttonstdmain5);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(std_main.this, std_j.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(std_main.this, pmsk_main.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(std_main.this, pda_main.class);
                startActivity(int3);
            }

        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(std_main.this, std_video_hq.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(std_main.this, pdf_hq.class);
                startActivity(int5);
            }

        });
    }

}