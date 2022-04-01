package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class rozv_j extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rozv_x);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button butt1=(Button)findViewById(R.id.buttonr1);
        Button butt2=(Button)findViewById(R.id.buttonr2);
        Button butt3=(Button)findViewById(R.id.buttonr3);
        Button butt4=(Button)findViewById(R.id.buttonr4);
        Button butt5=(Button)findViewById(R.id.buttonr5);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(rozv_j.this,activitymodul1.class);
                startActivity(int1);
            }
        });


        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(rozv_j.this,activitypart1.class);
                startActivity(int2);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(rozv_j.this,activitycpp1.class);
                startActivity(int3);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(rozv_j.this,activityckd1.class);
                startActivity(int4);
            }
        });

        butt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int5= new Intent(rozv_j.this,activityerdc1.class);
                startActivity(int5);
            }
        });


    }

}