package com.example.AireParaguay;

import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UnhSensClass extends AppCompatActivity {
    TextView questionWhatUnhSens;
    TextView questionWhoUnhSens;
    TextView whoConcernedAnswerUnhSens;
    ImageView imageViewUnhSens;
    TextView sensitiveGroupUnhSens;
    TextView sensitiveGroupActionsUnhSens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unhsens_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(255,126,0));

        questionWhatUnhSens = findViewById(R.id.questionWhatUnhSens);
        questionWhoUnhSens = findViewById(R.id.questionWhoUnhSens);
        whoConcernedAnswerUnhSens = findViewById(R.id.whoConernedAnsUnhSens);
        imageViewUnhSens = findViewById(R.id.emojiUnhSens);
        sensitiveGroupUnhSens = findViewById(R.id.sensGroupUnhSens);
        sensitiveGroupActionsUnhSens = findViewById(R.id.unhSensActionOrange);

        questionWhatUnhSens.setText("What should I do?");
        questionWhoUnhSens.setText("Who should be concerned?");
        whoConcernedAnswerUnhSens.setText("Sensitive groups include people with heart or lung disease, older adults, childrne, and adolescents");
        imageViewUnhSens.setImageResource(R.drawable.sneezingemoji);
        sensitiveGroupUnhSens.setText("Sensitive Groups:");
        sensitiveGroupActionsUnhSens.setText("Reduce activities that require prolonged or intense effort. It's okay to be outside, but rest often and do less strenuous activities. Pay attention to the appearance of symptoms such as coughing or shortness of breaths.");

        sensitiveGroupActionsUnhSens.setMovementMethod(new ScrollingMovementMethod());

    }
}
