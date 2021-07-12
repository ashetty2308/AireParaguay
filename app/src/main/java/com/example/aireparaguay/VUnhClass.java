package com.example.aireparaguay;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VUnhClass extends AppCompatActivity {
    TextView restOfPeopleTitle;
    TextView restOfPeopleAction;
    ImageView emojiVUnhealthy;
    TextView whoConcernedVUnh;
    TextView whoConcernedAnsVUnh;
    TextView sensitivePeopleTitle;
    TextView sensitivePeopleAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.very_unhealthy_class);

        restOfPeopleTitle = findViewById(R.id.ropVeryUnhealthy);
        restOfPeopleAction = findViewById(R.id.ropActionVeryUnhealthy);

        emojiVUnhealthy = findViewById(R.id.emojiVeryUnhealthy);

        whoConcernedVUnh = findViewById(R.id.whoConcernedVery);
        whoConcernedAnsVUnh = findViewById(R.id.whoConcernedAnswerVery);

        sensitivePeopleAnswer = findViewById(R.id.sensPeopleActionVeryUnhealthy);
        sensitivePeopleTitle = findViewById(R.id.sensGroupVeryUnhealthyTitle);


        whoConcernedVUnh.setText("Who should be concerned?");
        whoConcernedAnsVUnh.setText("Everyone");


        sensitivePeopleTitle.setText("Sensitive Groups:");
        sensitivePeopleAnswer.setText("Avoid all physical activities outdoors. More activities indoors or reschedule for when air quality is better.");

        restOfPeopleTitle.setText("For the rest of the people:");
        restOfPeopleAction.setText("Avoid activities that require prolonged or intesne effort. Consider moving activities indoors or rescheduling them to a time when air quality is better.");
        emojiVUnhealthy.setImageResource(R.drawable.maskemoji);




        getWindow().getDecorView().setBackgroundColor(Color.rgb(143,63,151));

    }
}
