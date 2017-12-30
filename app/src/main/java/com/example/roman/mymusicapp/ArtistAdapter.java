package com.example.roman.mymusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Roman on 12/29/17.
 */

public class ArtistAdapter extends ArrayAdapter<ArtistList> {


    private static final String LOG_TAG = AlbumAdapter.class.getSimpleName();


    public ArtistAdapter(Activity context, ArrayList<ArtistList> ArtistList)
    {
        super(context, 0, ArtistList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View ArtistlistView = convertView;
        if(ArtistlistView == null) {
            ArtistlistView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_artist_list, parent, false);
        }

        ArtistList currentArtistList = getItem(position);
        TextView nameTextView =  ArtistlistView.findViewById(R.id.ArtistName);
        nameTextView.setText(currentArtistList.getmArtistName());

        TextView numberTextView = (TextView) ArtistlistView.findViewById(R.id.ArtistBio);

        numberTextView.setText(currentArtistList.getmBio());


        return ArtistlistView;
    }


}
