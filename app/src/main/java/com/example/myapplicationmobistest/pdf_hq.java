package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pdf_hq extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_hq);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





        Button butt1 = (Button) findViewById(R.id.buttonstdmainpdf1);
        Button butt2 = (Button) findViewById(R.id.buttonstdmainpdf2);
        Button butt3 = (Button) findViewById(R.id.buttonstdmainpdf3);
        Button butt4 = (Button) findViewById(R.id.buttonstdmainpdf4);
        Button butt5 = (Button) findViewById(R.id.buttonstdmainpdf5);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(pdf_hq.this, pdf_1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(pdf_hq.this, pdf_2.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(pdf_hq.this, pda_main.class);
                startActivity(int3);
            }

        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(pdf_hq.this, std_video_hq.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(pdf_hq.this, std_video_hq.class);
                startActivity(int5);
            }

        });
    }

}