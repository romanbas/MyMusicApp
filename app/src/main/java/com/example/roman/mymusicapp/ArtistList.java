package com.example.roman.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ArtistList{

        private String mArtistName;
        private String mBio;


    public ArtistList (String ArtistName, String Bio)
        {
            mArtistName = ArtistName;
            mBio = Bio;
        }

        public String getmArtistName() {
            return mArtistName;
        }
        public String getmBio() {
            return mBio;
        }



    }
