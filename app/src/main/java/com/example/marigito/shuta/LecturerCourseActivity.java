package com.example.marigito.shuta;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class LecturerCourseActivity extends Activity {
    ListView lectureCourses;
    Button addCourseButton;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.lecture_course);

        //call initialize method
        initialize();

        //on click add button listener

        addCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    //this is the method to initialize all app component used in the layout
    public void initialize() {
        lectureCourses = findViewById(R.id.course_list_lecturer);
        addCourseButton = findViewById(R.id.addCourseButton);
    }
}
