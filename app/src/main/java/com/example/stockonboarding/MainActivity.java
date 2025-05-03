package com.example.stockonboarding;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonGetStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonGetStarted = findViewById(R.id.buttonGetStarted);

        buttonGetStarted.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Navigating to next screen...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, loginactivity.class);
            startActivity(intent);
        });
    }
}
