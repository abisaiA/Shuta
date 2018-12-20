package com.example.marigito.shuta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    EditText regNoEditText ;
    EditText passwordEditText ;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        utilize();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regNo = regNoEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                Intent intent = new Intent(getApplicationContext(), LoadingActivity.class);
                intent.putExtra("regNo" , regNo);
                intent.putExtra("password", password);

                startActivity(intent);

            }
        });
    }

    private void utilize(){
        regNoEditText = findViewById(R.id.regNoeditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.loginButton);
    }
}
