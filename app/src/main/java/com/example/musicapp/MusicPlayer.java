package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MusicPlayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_player);

        Intent intent = getIntent();
        Songs mSongs = intent.getParcelableExtra("Song Item");

        String title = mSongs.getmTitle();
        String artist = mSongs.getmArtist();

        TextView titleTextView = findViewById(R.id.title_music_player);
        titleTextView.setText(title);

        TextView artistTextView = findViewById(R.id.artist_music_player);
        artistTextView.setText(artist);


    }
}