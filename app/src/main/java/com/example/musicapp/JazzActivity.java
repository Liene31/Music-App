package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;


public class JazzActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create a list of songs
        ArrayList<Songs> songs = new ArrayList<>();
        songs.add(new Songs("Take Five", "Dave Brubeck"));
        songs.add(new Songs("So What", "Miles Davis"));
        songs.add(new Songs("Take The A Train", "Duke Ellington"));
        songs.add(new Songs("Round Midnight", "Thelonious Monk"));
        songs.add(new Songs("My Favorite Things", "John Coltrane"));
        songs.add(new Songs("All Blues", "Miles Davis"));
        songs.add(new Songs("Birdland", "Weather Report"));
        songs.add(new Songs("The Girl From Ipanema", "Stan Getz & Astrud Gilberto"));
        songs.add(new Songs("Sing, Sing, Sing", "Benny Goodman"));
        songs.add(new Songs("A Night in Tunisia", "Dizzy Gillespie"));

        SongsAdapter adapter = new SongsAdapter(this,songs);

        ListView listView = findViewById(R.id.song_list);

        listView.setAdapter(adapter);


        // Opens the MusicPlayer from the list
        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(JazzActivity.this, MusicPlayer.class);
            intent.putExtra("Song Item", songs.get(i));
            startActivity(intent);
        });


    }
}