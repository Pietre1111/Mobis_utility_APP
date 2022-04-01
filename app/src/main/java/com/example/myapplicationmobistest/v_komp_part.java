package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class v_komp_part extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.v_komp_part);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Button butt1 = (Button) findViewById(R.id.button_video_komp1_part);
        Button butt2 = (Button) findViewById(R.id.button_video_komp2_part);
        Button butt3 = (Button) findViewById(R.id.button_video_komp3_part);
        Button butt4 = (Button) findViewById(R.id.button_video_komp4_part);
        Button butt5 = (Button) findViewById(R.id.button_video_komp5_part);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(v_komp_part.this, video_test.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(v_komp_part.this, std_ut23.class);
                startActivity(int2);
            }

        });
        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(v_komp_part.this, std_ut_ups.class);
                startActivity(int3);
            }

        });
    }

}