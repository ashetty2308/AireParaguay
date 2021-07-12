package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class DangerousClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangerous_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(126,0,35));

    }
}
