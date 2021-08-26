package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Purple Haze", "Jimi Hendrix"));
        songs.add(new Songs("Whole Lotta Love", "Led Zeppelin"));
        songs.add(new Songs("Sympathy for the Devil", "The Rolling Stones"));
        songs.add(new Songs("Under Pressure", "Queen & David Bowie"));
        songs.add(new Songs("Baba O’Riley", "The Who"));
        songs.add(new Songs("Rockin’ in the Free World", "Neil Young"));
        songs.add(new Songs("Comfortably Numb", "Pink Floyd"));
        songs.add(new Songs("The Boys are Back in Town", "Thin Lizzy"));
        songs.add(new Songs("Iron Man", "Black Sabbath"));
        songs.add(new Songs("Roadhouse Blues", "The Doors"));

        SongsAdapter adapter = new SongsAdapter(this,songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);


        // Opens the MusicPlayer from the list
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(RockActivity.this, MusicPlayer.class);
            intent.putExtra("Song Item", songs.get(i));
            startActivity(intent);
        });

    }
}