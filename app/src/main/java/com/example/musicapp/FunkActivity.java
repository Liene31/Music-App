package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FunkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Starting Again", "Sven Atterton"));
        songs.add(new Songs("One Nation Under A Groove", "Funkadelic"));
        songs.add(new Songs("It’s Your Thing", "The Isley Brothers"));
        songs.add(new Songs("Shining Star", "Earth, Wind & Fire"));
        songs.add(new Songs("Uptown Funk", "Mark Ronson, Bruno Mars"));
        songs.add(new Songs("Brick House", "Commodores"));
        songs.add(new Songs("Funky Stuff", "Kool & The Gang"));
        songs.add(new Songs("Superfly", "Curtis Mayfield"));
        songs.add(new Songs("Rock Steady", "Aretha Franklin"));
        songs.add(new Songs("Stomp!", "The Brothers Johnson"));

        SongsAdapter adapter = new SongsAdapter(this,songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);


        // Opens the MusicPlayer from the list
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(FunkActivity.this, MusicPlayer.class);
            intent.putExtra("Song Item", songs.get(i));
            startActivity(intent);
        });
    }
}