package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class UnhClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unhealthy_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(255,0,0));

    }
}
