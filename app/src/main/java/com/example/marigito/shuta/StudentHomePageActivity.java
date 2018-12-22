package com.example.marigito.shuta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;


public class StudentHomePageActivity extends AppCompatActivity {
    private CardView registerCourseCardView, profileSettingCardView, myPaymentsCardView, courseResultCardView;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {

        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.student_homepage);
        initialize();

        registerCourseCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StudentHomePageActivity.this, "register your courses now", Toast.LENGTH_LONG).show();
            }
        });

        profileSettingCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StudentHomePageActivity.this, "Edit Profile", Toast.LENGTH_LONG).show();

            }
        });

        myPaymentsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StudentHomePageActivity.this, "Check Payment Details", Toast.LENGTH_LONG).show();

            }
        });

        courseResultCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(StudentHomePageActivity.this, "RESULTS ", Toast.LENGTH_LONG).show();

            }
        });
    }

    private void initialize() {
        registerCourseCardView = findViewById(R.id.registerCourseCardView);
        profileSettingCardView = findViewById(R.id.profileSettingCardView);
        myPaymentsCardView = findViewById(R.id.myPaymentsCardView);
        courseResultCardView = findViewById(R.id.courseResultCardView);
    }
}
