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

public class AlbumAdapter extends ArrayAdapter<AlbumList> {

    private static final String LOG_TAG = AlbumAdapter.class.getSimpleName();


    public AlbumAdapter(Activity context, ArrayList<AlbumList> AlbumList)
    {
        super(context, 0, AlbumList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View AlbumlistView = convertView;
        if(AlbumlistView == null) {
            AlbumlistView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_album_list, parent, false);
        }
        AlbumList currentAlbumList = getItem(position);
        TextView nameTextView =  AlbumlistView.findViewById(R.id.AlbumNameTest);
        nameTextView.setText(currentAlbumList.getAlbumName());

        TextView numberTextView = (TextView) AlbumlistView.findViewById(R.id.ArtistNameTest);

        numberTextView.setText(currentAlbumList.getArtistName());


        return AlbumlistView;
    }

}
