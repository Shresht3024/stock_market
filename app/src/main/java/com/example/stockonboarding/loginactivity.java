package com.example.stockonboarding;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class loginactivity extends AppCompatActivity {

    private EditText passwordEditText;
    private ImageView showHideIcon;
    private boolean passwordVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        passwordEditText = findViewById(R.id.passwordEditText);
        showHideIcon = findViewById(R.id.showHideIcon);

        showHideIcon.setOnClickListener(v -> {
            passwordVisible = !passwordVisible;
            if (passwordVisible) {
                passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            } else {
                passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
            }
            passwordEditText.setSelection(passwordEditText.getText().length());
        });

        Button signIn = findViewById(R.id.signInButton);
        signIn.setOnClickListener(v -> {
            // Handle login logic here
        });
    }
}
