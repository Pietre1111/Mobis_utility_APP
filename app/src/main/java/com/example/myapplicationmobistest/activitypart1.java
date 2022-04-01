package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activitypart1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitypart1);

        Button butt1=(Button)findViewById(R.id.buttonp1);
        Button butt2=(Button)findViewById(R.id.buttonp2);
        Button butt3=(Button)findViewById(R.id.buttonp3);
        Button butt4=(Button)findViewById(R.id.buttonp4);
        Button butt5=(Button)findViewById(R.id.buttonp5);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(activitypart1.this,part1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(activitypart1.this,part2.class);
                startActivity(int2);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(activitypart1.this,part3.class);
                startActivity(int3);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(activitypart1.this,part4.class);
                startActivity(int4);
            }
        });

        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5= new Intent(activitypart1.this, part5.class);
                startActivity(int5);
            }
        });
    }
}