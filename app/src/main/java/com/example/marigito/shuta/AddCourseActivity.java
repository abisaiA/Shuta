package com.example.marigito.shuta;


import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddCourseActivity extends AppCompatActivity {
    private EditText courseCodeEditText, courseNameEditText, coursePrerequisiteEditText, courseDesrcriptionEditText, cousreWeightEditText;
    private Button addCourseButton;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.add_new_course);
        initialize();

        addCourseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String courseCode = courseCodeEditText.getText().toString();
                String courseName = courseNameEditText.getText().toString();
                String coursePrerequisite = coursePrerequisiteEditText.getText().toString();
                String courseDescription = courseDesrcriptionEditText.getText().toString();
                String courseWeight = cousreWeightEditText.getText().toString();

                if (courseCode.isEmpty()) {
                    courseCodeEditText.setError("Please enter Course Code");
                } else if (courseName.isEmpty()) {
                    courseNameEditText.setError("Please enter course name ");
                } else if (coursePrerequisite.isEmpty()) {
                    coursePrerequisiteEditText.setError("Please enter course prerequisite");
                } else if (courseDescription.isEmpty()) {
                    courseDesrcriptionEditText.setError("please enter course description");
                } else if (courseWeight.isEmpty()) {
                    cousreWeightEditText.setError("Please enter course unit/credit");
                } else {


                }

            }
        });
    }

    private void initialize() {
        courseCodeEditText = findViewById(R.id.cousreCodeEditText);
        courseNameEditText = findViewById(R.id.courseNameEditText);
        coursePrerequisiteEditText = findViewById(R.id.coursePrerequisiteEditTExt);
        courseDesrcriptionEditText = findViewById(R.id.courseDescriptionEditText);
        cousreWeightEditText = findViewById(R.id.courseWeightEditText);
        addCourseButton = findViewById(R.id.addButton);

    }

}
