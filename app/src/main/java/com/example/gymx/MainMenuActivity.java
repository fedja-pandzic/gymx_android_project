package com.example.gymx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;

public class MainMenuActivity extends AppCompatActivity {

    MaterialButton previousRoutinesButton, createRoutinesButton, logOutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        previousRoutinesButton =findViewById(R.id.previous_routines_button);
        createRoutinesButton = findViewById(R.id.create_routine_button);
        logOutButton = findViewById(R.id.log_out_button);

        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}