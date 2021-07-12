package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ModerateClass extends AppCompatActivity {

    TextView questionWhat;
    TextView questionWho;
    ImageView imageView;
    TextView answerWho;
    TextView ExcSens;
    TextView ExcSensAction;
    TextView restOfPeople;
    TextView restOfPeopleAction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.moderate_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(255,255,0));

        questionWhat = findViewById(R.id.questionWhatUnhSens);
        questionWho = findViewById(R.id.questionWhoUnhSens);
        imageView = findViewById(R.id.emojiUnhSens);
        answerWho = findViewById(R.id.whoConernedAnsUnhSens);
        ExcSens = findViewById(R.id.sensGroupUnhSens);
        ExcSensAction = findViewById(R.id.unhSensActionOrange);
        restOfPeople = findViewById(R.id.restOfPpl);
        restOfPeopleAction = findViewById(R.id.restPplAction);


        questionWhat.setText("What should I do?");
        questionWho.setText("Who should  be concerned?");
        answerWho.setText("People who may be exceptionally sensitive to particulate contamination.");

        ExcSens.setText("Exceptionally Sensitive People:");
        ExcSensAction.setText("Consider reducing activities that require prolonged or intense exertion in the open air. Pay attention to the appearance of symptoms such as coughing  or shortness of breath. This indicates that effort should be reduced.");
        restOfPeople.setText("For the rest of the people:");
        restOfPeopleAction.setText("It is a good day for outdoor activities!");

        ExcSensAction.setMovementMethod(new ScrollingMovementMethod());
        restOfPeopleAction.setMovementMethod(new ScrollingMovementMethod());


        imageView.setImageResource(R.drawable.str8face);

    }
}
