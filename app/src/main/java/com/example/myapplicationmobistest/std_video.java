package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class std_video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.std_video);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button butt1 = (Button) findViewById(R.id.buttonvideo1_pc);
        Button butt2 = (Button) findViewById(R.id.buttonvideo2_pc);
        Button butt3 = (Button) findViewById(R.id.buttonvideo3_pc);
        Button butt4 = (Button) findViewById(R.id.buttonvideo4_pc);
        Button butt5 = (Button) findViewById(R.id.buttonvideo5_pc);
        Button butt6 = (Button) findViewById(R.id.buttonvideo6_pc);
        Button butt7 = (Button) findViewById(R.id.buttonvideo7_pc);
        Button butt8 = (Button) findViewById(R.id.buttonvideo8_pc);
        Button butt9 = (Button) findViewById(R.id.buttonvideo9_pc);
        Button butt10 = (Button) findViewById(R.id.buttonvideo10_pc);
        Button butt11 = (Button) findViewById(R.id.buttonvideo11_pc);
        Button butt12 = (Button) findViewById(R.id.buttonvideo12_pc);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(std_video.this, video_test.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(std_video.this, v_pc_iw38.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int3);
            }

        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(std_video.this, v_pc_zpmr011.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(std_video.this, v_pc_pda_gsm_restart.class);
                startActivity(int5);
            }

        });
        butt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int6 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int6);
            }

        });
        butt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int7 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int7);
            }

        });
        butt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int8 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int8);
            }

        });
        butt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int9 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int9);
            }

        });
        butt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int10 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int10);
            }

        });
        butt11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int11 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int11);
            }

        });
        butt12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int12 = new Intent(std_video.this, v_pc_ih01.class);
                startActivity(int12);
            }

        });
    }

}