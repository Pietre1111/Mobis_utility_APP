package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activitymodul1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymodul1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button butt1=(Button)findViewById(R.id.button5);
        Button butt2=(Button)findViewById(R.id.button6);
        Button butt3=(Button)findViewById(R.id.button7);
        Button butt4=(Button)findViewById(R.id.button8);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1= new Intent(activitymodul1.this, modul2_1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2= new Intent(activitymodul1.this, modul2_2.class);
                startActivity(int2);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3= new Intent(activitymodul1.this, modul2_3.class);
                startActivity(int3);
            }
        });

        butt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int4= new Intent(activitymodul1.this, modul2_4.class);
                startActivity(int4);
            }
        });
    }
}