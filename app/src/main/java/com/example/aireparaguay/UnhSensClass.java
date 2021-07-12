package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class UnhSensClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unhsens_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(255,126,0));

    }
}
