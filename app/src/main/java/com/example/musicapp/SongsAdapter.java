package com.example.musicapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {

    /**
     * Create a new SongsAdapter object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs   is the list of songs to be displayed.
     */
    public SongsAdapter(Activity context, ArrayList<Songs> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }


        Songs currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView titleTextView = listItemView.findViewById(R.id.song_title_text_view);
        titleTextView.setText(currentSong.getmTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView artistTextView = listItemView.findViewById(R.id.artist_text_view);
        artistTextView.setText(currentSong.getmArtist());

        // Return the whole list item layout (containing 2 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }

}
