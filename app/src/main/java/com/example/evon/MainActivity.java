package com.example.evon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button_SignUp;
    Button button_Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout .activity_main);
        setContentView(R.layout.activity_main);

        button_SignUp = findViewById(R.id.button_SignUp);
        button_Login = findViewById(R.id.button_Login);

        button_SignUp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, signup.class);
                startActivity(i);

            }
        });
        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, login.class);
                startActivity(i);

            }
        });

    }
}