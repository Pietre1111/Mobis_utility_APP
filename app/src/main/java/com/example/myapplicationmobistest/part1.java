package com.example.myapplicationmobistest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class part1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}