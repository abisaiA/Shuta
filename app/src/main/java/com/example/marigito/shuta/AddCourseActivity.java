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
    public Connection connection = null;

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
                    StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                    StrictMode.setThreadPolicy(policy);
                    try {
                        connection = new DatabaseConfig().getConnection();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                    String query = "INSERT INTO course(name,lecture_id,description,weight,prerequisite)  VALUES (?,?,?,?,?,?)";
                    try {
                        PreparedStatement preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1, courseName);
                        preparedStatement.setInt(2, 2);
                        preparedStatement.setString(3, courseDescription);
                        preparedStatement.setString(4, courseWeight);
                        preparedStatement.setString(5, courseWeight);
                        preparedStatement.setString(6, coursePrerequisite);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

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
