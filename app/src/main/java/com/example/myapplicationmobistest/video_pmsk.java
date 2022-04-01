package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class video_pmsk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_pmsk);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button butt1 = (Button) findViewById(R.id.button_video_pmsk1);
        Button butt2 = (Button) findViewById(R.id.button_video_pmsk2);
        Button butt3 = (Button) findViewById(R.id.button_video_pmsk3);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(video_pmsk.this, v_pmsk_zlab1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(video_pmsk.this, std_ut23.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(video_pmsk.this, std_ut_ups.class);
                startActivity(int3);
            }

        });
    }

}