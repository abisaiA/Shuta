package com.example.marigito.shuta;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

public class LecturerHomePageViewActivity extends Activity {
    private CardView courseCardView, publishCourseResultCardView;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.lecturer_homepage);

        initialize();

        courseCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LecturerCourseActivity.class);
                startActivity(intent);
                finish();
            }
        });

        publishCourseResultCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LecturerHomePageViewActivity.this, "Publish Courses result ", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void initialize() {
        courseCardView = findViewById(R.id.coursesCardView);
        publishCourseResultCardView = findViewById(R.id.publishCourseResultCardView);
    }
}
