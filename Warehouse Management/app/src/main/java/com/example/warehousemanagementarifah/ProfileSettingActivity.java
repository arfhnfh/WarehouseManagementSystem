package com.example.warehousemanagementarifah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProfileSettingActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText phoneNumberEditText;
    private EditText birthdayEditText;
    private EditText emailEditText;
    private EditText changePasswordEditText;
    private EditText confirmPasswordEditText;
    private Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setting);

        // Initialize UI components
        usernameEditText = findViewById(R.id.usernameEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        birthdayEditText = findViewById(R.id.birthdayEditText);
        emailEditText = findViewById(R.id.emailEditText);
        changePasswordEditText = findViewById(R.id.changePasswordEditText);
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText);
        updateButton = findViewById(R.id.updateButton);

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrieve user input
                String username = usernameEditText.getText().toString();
                String phoneNumber = phoneNumberEditText.getText().toString();
                String birthday = birthdayEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String changePassword = changePasswordEditText.getText().toString();
                String confirmPassword = confirmPasswordEditText.getText().toString();

                // Validate inputs
                if (changePassword.equals(confirmPassword)) {
                    // Save changes to profile (e.g., update database)
                    Toast.makeText(ProfileSettingActivity.this, "Profile updated successfully!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ProfileSettingActivity.this, "Passwords do not match.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}