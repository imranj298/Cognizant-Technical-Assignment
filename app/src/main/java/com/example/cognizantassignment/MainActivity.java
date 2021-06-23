package com.example.cognizantassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText userText;
    private EditText passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(view -> nextActivity());
        userText = findViewById(R.id.usernameField);
        passwordText = findViewById(R.id.passwordField);

    }


    public void nextActivity() {
        String user = userText.getText().toString();
        String password = passwordText.getText().toString();
        if (user.equals("user1") && password.equals("password")) {
            Intent intent = new Intent(this, ListActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Incorrect details", Toast.LENGTH_SHORT).show();
        }
    }
}