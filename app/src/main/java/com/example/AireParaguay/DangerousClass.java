package com.example.AireParaguay;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DangerousClass extends AppCompatActivity {

    TextView whoAnswerDangerous;
    TextView whoQuestionDangerous;

    TextView allDangerousTitle;
    TextView whatQuestionDangerous;
    ImageView dangerousEmoji;
    TextView allPeopleAction;
    TextView sensitiveGroupDangerousTitle;
    TextView sensGroupActionDangerous;
    TextView answerAll;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangerous_class);

        getWindow().getDecorView().setBackgroundColor(Color.rgb(126,0,35));

        dangerousEmoji = findViewById(R.id.dangerousEmoji);
        whoAnswerDangerous = findViewById(R.id.whoConcernedDangerousAnswer);
        whatQuestionDangerous = findViewById(R.id.whatQDangerous);
        whoQuestionDangerous = findViewById(R.id.whoQDangerous);
        allDangerousTitle = findViewById(R.id.allDangerous);
        allPeopleAction = findViewById(R.id.allPeopleDangerous);
        sensitiveGroupDangerousTitle = findViewById(R.id.sensGroupsDangTitle);
        sensGroupActionDangerous = findViewById(R.id.sensGroupActionDangerous);
        answerAll = findViewById(R.id.allPeopleDangerous);


        answerAll.setText("Avoid all physical activities outdoor. Move activities indoors or reschedule for when air quality is better.");
        whoAnswerDangerous.setText("Everyone");
        whoQuestionDangerous.setText("Who should be concerned?");
        whatQuestionDangerous.setText("What should I do?");
        allDangerousTitle.setText("All:");
        sensitiveGroupDangerousTitle.setText("Sensitive Groups:");
        sensGroupActionDangerous.setText("Stay indoors and keep your activity level low. Follow the suggestions for keeping particulate levels low in closed environments.");

        answerAll.setMovementMethod(new ScrollingMovementMethod());
        sensGroupActionDangerous.setMovementMethod(new ScrollingMovementMethod());

        dangerousEmoji.setImageResource(R.drawable.dangerousemoji);

    }
}
