package com.example.myapplicationmobistest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class activityckd1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityckd1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button butt1 = (Button) findViewById(R.id.buttonk1);
        Button butt2 = (Button) findViewById(R.id.buttonk2);

        butt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(activityckd1.this, ckd1.class);
                startActivity(int1);
            }
        });

        butt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int2 = new Intent(activityckd1.this, ckd2.class);
                startActivity(int2);
            }

        });
    }

}