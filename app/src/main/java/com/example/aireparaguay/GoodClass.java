package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class GoodClass extends AppCompatActivity {

    TextView questionWho;
    TextView questionWhat;
    TextView answerWho;
    TextView answerWhat;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(0,228,0));

        questionWho = findViewById(R.id.questionWhoUnhSens);
        questionWhat = findViewById(R.id.questionWhatUnhSens);
        answerWho = findViewById(R.id.answerWho);
        answerWhat = findViewById(R.id.answerWhat);
        imageView = findViewById(R.id.emojiIV);



        imageView.setImageResource(R.drawable.sunglassemoji);

        questionWhat.setText("What should I do?");
        questionWho.setText("Who should be concerned?");

        answerWho.setText("Nobody!");
        answerWhat.setText("It is a beautiful day for outdoor activties!");


    }
}
