package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the Jazz/Rock/Funk categories
        TextView textViewJazzActivity = findViewById(R.id.jazz);
        TextView textViewRockActivity = findViewById(R.id.rock);
        TextView textViewFunkActivity = findViewById(R.id.funk);

        // Set a click listener on that Jazz View
        textViewJazzActivity.setOnClickListener(v -> {
            Intent jazzIntent = new Intent(MainActivity.this, JazzActivity.class);
            startActivity(jazzIntent);
        });

        // Set a click listener on that Rock View
        textViewRockActivity.setOnClickListener(v -> {
            Intent rockIntent = new Intent(MainActivity.this, RockActivity.class);
            startActivity(rockIntent);
        });

        // Set a click listener on that Funk View
        textViewFunkActivity.setOnClickListener(v -> {
            Intent funkIntent = new Intent(MainActivity.this, FunkActivity.class);
            startActivity(funkIntent);
        });


    }
}


