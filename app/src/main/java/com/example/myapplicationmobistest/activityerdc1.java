package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activityerdc1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityerdc1);

        Button butt1 = (Button) findViewById(R.id.buttone1);
        Button butt2 = (Button) findViewById(R.id.buttone2);
        Button butt3 = (Button) findViewById(R.id.buttone3);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(activityerdc1.this, erdc1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(activityerdc1.this, erdc2.class);
                startActivity(int2);
            }
        });

        butt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int3 = new Intent(activityerdc1.this, erdc3.class);
                startActivity(int3);
            }
        });
    }

}