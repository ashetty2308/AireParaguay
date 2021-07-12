package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class VUnhClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.very_unhealthy_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(143,63,151));

    }
}
