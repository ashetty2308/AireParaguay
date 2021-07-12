package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UnhClass extends AppCompatActivity {

    TextView unhealthyWhatQuestion;
    TextView unhealthyWhoQuestion;
    ImageView emojiUnhealthy;
    TextView whoConcernedUnhealthyAnswer;
    TextView SensitivePeopleUnhealthyTitle;
    TextView SensitivePeopleUnhealthyAnswer;
    TextView restOfPeopleUnhealthyTitle;
    TextView getRestOfPeopleUnhealthyAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unhealthy_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(255,0,0));

        unhealthyWhatQuestion = findViewById(R.id.questionWhoUnh);
        unhealthyWhoQuestion = findViewById(R.id.questionWhatUnh);
        emojiUnhealthy = findViewById(R.id.emojiUnhealthy);
        whoConcernedUnhealthyAnswer = findViewById(R.id.whoConcernedUnh);
        SensitivePeopleUnhealthyTitle = findViewById(R.id.sensGroupsTitleUnh);
        SensitivePeopleUnhealthyAnswer = findViewById(R.id.unhActionRed);
        restOfPeopleUnhealthyTitle = findViewById(R.id.restOfPpl);
        getRestOfPeopleUnhealthyAnswer = findViewById(R.id.unhRestAction);


        unhealthyWhatQuestion.setText("What should I do?");
        unhealthyWhoQuestion.setText("Who should  be concerned?");
        whoConcernedUnhealthyAnswer.setText("Everyone.");

        SensitivePeopleUnhealthyTitle.setText("Exceptionally Sensitive People:");
        SensitivePeopleUnhealthyAnswer.setText("Avoid activities that require prolonged or intense effort. Take into account the possibility of carrying out activities indoors or rescheduling them.");
        restOfPeopleUnhealthyTitle.setText("For the rest of the people:");
        getRestOfPeopleUnhealthyAnswer.setText("Reduce activities that require prolonged or intense effort. Rest often indoors during outdoor activities.");

        SensitivePeopleUnhealthyAnswer.setMovementMethod(new ScrollingMovementMethod());
        getRestOfPeopleUnhealthyAnswer.setMovementMethod(new ScrollingMovementMethod());


        emojiUnhealthy.setImageResource(R.drawable.maskemoji);


    }
}
