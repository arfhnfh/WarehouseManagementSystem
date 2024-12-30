package com.example.warehousemanagementarifah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Navigate to Profile Settings
        Button profileSettingsButton = findViewById(R.id.buttonProfileSettings);
        profileSettingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileSettingActivity.class);
                startActivity(intent);
            }
        });

        // Navigate to List Items
        Button listItemsButton = findViewById(R.id.buttonListItems);
        listItemsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListItemsActivity.class);
                startActivity(intent);
            }
        });
    }
}
