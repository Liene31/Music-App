package com.example.musicapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Songs implements Parcelable {

    /**
     * Title of the song
     */
    private String mTitle;

    /**
     * Artist of the song
     */
    private String mArtist;

    /**
     * Create a new Song object.
     *
     * @param title  is the title of the song
     * @param artist is the artist of the song
     */

    public Songs(String title, String artist) {
        mTitle = title;
        mArtist = artist;
    }

    protected Songs(Parcel in) {
        mTitle = in.readString();
        mArtist = in.readString();
    }

    public static final Creator<Songs> CREATOR = new Creator<Songs>() {
        @Override
        public Songs createFromParcel(Parcel in) {
            return new Songs(in);
        }

        @Override
        public Songs[] newArray(int size) {
            return new Songs[size];
        }
    };

    /**
     * Get the title of the song.
     */
    public String getmTitle() {
        return mTitle;
    }

    /**
     * Get the artist of the song.
     */
    public String getmArtist() {
        return mArtist;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mTitle);
        dest.writeString(mArtist);
    }
}
