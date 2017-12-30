package com.example.roman.mymusicapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayListItems extends ArrayAdapter<AlbumList> {
private static final String LOG_TAG=AlbumAdapter.class.getSimpleName();


public PlayListItems(Activity context, ArrayList<AlbumList> AlbumList)
        {
        super(context,0,AlbumList);
        }
@NonNull
@Override
public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View AlbumlistView=convertView;
        if(AlbumlistView==null){
        AlbumlistView= LayoutInflater.from(getContext()).inflate(
        R.layout.activity_play_list_items,parent,false);
        }


        AlbumList currentAlbumList=getItem(position);

        ImageView AlbumCover = (ImageView) AlbumlistView.findViewById(R.id.AlbumCover);
        AlbumCover.setImageResource(currentAlbumList.getAlbumCover());


       TextView nameTextView=AlbumlistView.findViewById(R.id.Album_name);
        nameTextView.setText(currentAlbumList.getAlbumName());


       TextView numberTextView=(TextView)AlbumlistView.findViewById(R.id.Artist_name);
        numberTextView.setText(currentAlbumList.getArtistName());



        return AlbumlistView;
        }
        }
