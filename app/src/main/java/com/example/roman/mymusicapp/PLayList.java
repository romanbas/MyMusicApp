package com.example.roman.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PLayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_list);




        ArrayList<AlbumList> AlbumListItiem = new ArrayList<>();
        AlbumListItiem.add(new AlbumList("DAMN. COLLECTORS EDITION","By:Kendrick Lamar", R.drawable.kendricklamar));
        AlbumListItiem.add(new AlbumList("Melodrama","By:Lorde", R.drawable.lorde));
        AlbumListItiem.add(new AlbumList("Reputation","By:Taylor Swift", R.drawable.taylorswift));
        AlbumListItiem.add(new AlbumList("Not Even Happiness","By:Julie Byrne",R.drawable.juliebyrne));
        AlbumListItiem.add(new AlbumList("Humanz","By:Gorillaz",R.drawable.gorillaz));
        AlbumListItiem.add(new AlbumList("Lotta Sea Lice","By:Courtney Barnett and Kurt Vile",R.drawable.kendricklamar));
        AlbumListItiem.add(new AlbumList("Process","Sampha",R.drawable.sampha));
        AlbumListItiem.add(new AlbumList("Sleep Well Beast","By:National",R.drawable.national));

        AlbumListItiem.add(new AlbumList("No Shape","By:Perfume Genius", R.drawable.perfumegenius));
        AlbumListItiem.add(new AlbumList("A Crow Looked at Me","By:Mount Eerie",R.drawable.mounteerie));
        AlbumListItiem.add(new AlbumList("Take Me Apart","By:Kelela",R.drawable.kelela));
        AlbumListItiem.add(new AlbumList("I See You","By:The xx", R.drawable.the_xx));



        PlayListItems AlbumListAdapter = new PlayListItems(this, AlbumListItiem);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView list_View =(ListView) findViewById(R.id.PlayListView);
        list_View.setAdapter(AlbumListAdapter);


    }
}
