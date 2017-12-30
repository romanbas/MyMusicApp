package com.example.roman.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AlbumList{

    // Album names
    private String mAlbumName;

    // Song name
    private String mArtistName;

    private int mAlbumCover;
    public AlbumList (String AlbumName, String ArtistName,int AlbumCover)
    {
        mAlbumName = AlbumName;
        mArtistName = ArtistName;
        mAlbumCover = AlbumCover;
    }

    public String getAlbumName() {
        return mAlbumName;
    }


    public String getArtistName() {
        return mArtistName;
    }

    public int getAlbumCover() {
        return mAlbumCover;
    }

}
