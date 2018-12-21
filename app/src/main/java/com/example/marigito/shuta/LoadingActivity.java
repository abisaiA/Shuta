package com.example.marigito.shuta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class LoadingActivity extends AppCompatActivity {

    private String regNo, password;
    private LinearLayout firstLayout, secondLayout;
    private Animation uptodown;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_loading);
        initialize();

        firstLayout.setAnimation(uptodown);

    }

    public void initialize() {
        Intent data = getIntent();
        regNo = data.getStringExtra("regNo");
        password = data.getStringExtra("password");

        firstLayout = findViewById(R.id.first_layout);
        secondLayout = findViewById(R.id.second_layout);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
    }
}
