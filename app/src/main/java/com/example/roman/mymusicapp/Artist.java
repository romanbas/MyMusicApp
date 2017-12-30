package com.example.roman.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Artist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);


        ArrayList<ArtistList> ArtestListItiem = new ArrayList<ArtistList>();

        ArtestListItiem.add(new ArtistList("Kendrick Lamar", "Kendrick Lamar Duckworth is an American rapper and songwriter. Raised in Compton, California"));
        ArtestListItiem.add(new ArtistList("Lorde", "Ella Marija Lani Yelich-O'Connor, known professionally as Lorde, is a New Zealand singer"));
        ArtestListItiem.add(new ArtistList("Taylor Swift", "Taylor Alison Swift is an American singer-songwriter. One of the leading contemporary recording artists"));
        ArtestListItiem.add(new ArtistList("Julie Byrne", "ulie Byrne is an American singer, songwriter and guitarist from Buffalo, New York."));
        ArtestListItiem.add(new ArtistList("Gorillaz", "Gorillaz are an English virtual band created in 1998 by musician Damon Albarn and artist Jamie Hewlet"));
        ArtestListItiem.add(new ArtistList("Sampha", "Sampha Sisay, who performs under the mononym Sampha, is a British singer"));
        ArtestListItiem.add(new ArtistList("Rihanna", "Robyn Rihanna Fenty is a Barbadian singer, songwriter, and actress. Born in Saint Michae"));
        ArtestListItiem.add(new ArtistList("Perfume Genius", "Perfume Genius is the stage name for Seattle-based solo artist Mike "));
        ArtestListItiem.add(new ArtistList("Mount Eerie", "Mount Eerie is the musical project of Anacortes, Washington-based songwriter and producer Phil Elverum"));
        ArtestListItiem.add(new ArtistList("Kelela", "Kelela Mizanekristos, known mononymously as Kelela, is an American singer"));
        ArtestListItiem.add(new ArtistList("The xx", "The xx are an English indie pop band formed in 2005 in Wandsworth, London "));


        ArtistAdapter ArtistListAdapter = new ArtistAdapter(this, ArtestListItiem);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView list_View = (ListView) findViewById(R.id.ArtistListView);
        list_View.setAdapter(ArtistListAdapter);

    }

    }
