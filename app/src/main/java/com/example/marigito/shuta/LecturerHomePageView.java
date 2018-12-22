package com.example.marigito.shuta;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class LecturerHomePageView extends Activity {
    private CardView courseCardView, publishCourseResultCardView;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.lecturer_homepage);

        initialize();

        courseCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LecturerHomePageView.this, "Courses ", Toast.LENGTH_LONG).show();
            }
        });

        publishCourseResultCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LecturerHomePageView.this, "Publish Courses result ", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initialize() {
        courseCardView = findViewById(R.id.coursesCardView);
        publishCourseResultCardView = findViewById(R.id.publishCourseResultCardView);
    }
}
