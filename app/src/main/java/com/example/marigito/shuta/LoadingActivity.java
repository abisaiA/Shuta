package com.example.marigito.shuta;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LoadingActivity extends AppCompatActivity {

    private String regNo, password;
    private LinearLayout firstLayout, secondLayout;
    private Animation uptodown;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_loading);
        initialize();

        firstLayout.setAnimation(uptodown);


        new MysBack().execute(LoadingActivity.this);

    }

    private void runL(Context context) {
        if (regNo.equals("marigito") && password.equals("123456")) {

            Toast.makeText(context, "successful login", Toast.LENGTH_LONG).show();
            intent = new Intent(LoadingActivity.this, StudentHomePageActivity.class);
            startActivity(intent);
            finish();

        } else {

            Toast.makeText(context, "UNAZINGUA KIJANA", Toast.LENGTH_LONG).show();
            intent = new Intent(getApplicationContext(), LecturerHomePageViewActivity.class);
            startActivity(intent);
            finish();

        }
    }

    public void initialize() {
        Intent data = getIntent();
        regNo = data.getStringExtra("regNo");
        password = data.getStringExtra("password");

        firstLayout = findViewById(R.id.first_layout);
        secondLayout = findViewById(R.id.second_layout);
        uptodown = AnimationUtils.loadAnimation(this, R.anim.uptodown);
    }


    class MysBack extends AsyncTask<Context, Void, Context> {

        @Override
        protected void onPostExecute(Context aVoid) {
            runL(aVoid);
            super.onPostExecute(aVoid);
        }

        @Override
        protected Context doInBackground(Context... voids) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return voids[0];
        }
    }
}
