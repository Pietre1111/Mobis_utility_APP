package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class video_kompresory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_kompresory);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button butt1 = (Button) findViewById(R.id.button_video_komp1);
        Button butt2 = (Button) findViewById(R.id.button_video_komp2);
        Button butt3 = (Button) findViewById(R.id.button_video_komp3);
        Button butt4 = (Button) findViewById(R.id.button_video_komp4);
        Button butt5 = (Button) findViewById(R.id.button_video_komp5);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(video_kompresory.this, v_komp_part.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(video_kompresory.this, v_komp_modul.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(video_kompresory.this, v_komp_cpp.class);
                startActivity(int3);
            }

        });
        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4 = new Intent(video_kompresory.this, v_komp_ckd.class);
                startActivity(int4);
            }

        });
        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5 = new Intent(video_kompresory.this, v_komp_erdc.class);
                startActivity(int5);
            }

        });
    }

}