package com.example.roman.mymusicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

public class Random_song extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);


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



        Random_song randomSongGenerator = new Random_song();

        int items = (int) ((Math.random()*12)+1);


        AlbumAdapter AlbumListAdapter = new AlbumAdapter(this, AlbumListItiem);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ImageView Albumcover =(ImageView) findViewById(R.id.CoverimageView);
        Albumcover.setImageResource(AlbumListItiem.get(items).getAlbumCover());


        TextView Albumname =(TextView) findViewById(R.id.DispalayAlbumName);
        Log.i("*******************",""+ (String) AlbumListItiem.get(items).getAlbumName()) ;
        String getalbumName=  (String) AlbumListItiem.get(items).getAlbumName();
        Albumname.setText(getalbumName);

        TextView ArtistName =(TextView) findViewById(R.id.DispalayArtistName);
         Log.i("*******************",""+ (String) AlbumListItiem.get(items).getArtistName()) ; 
        String getArtistName= (String) AlbumListItiem.get(items).getArtistName();
        ArtistName.setText(getArtistName);


         //ListView list_View =(ListView) findViewById(R.id.RandomSong);
        //list_View.setAdapter(AlbumListAdapter);

       


    }
}
