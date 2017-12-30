package com.example.roman.mymusicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.roman.mymusicapp.R.layout.activity_main);



        LinearLayout Albums_Layout = (LinearLayout) findViewById(com.example.roman.mymusicapp.R.id.Albums);
        Albums_Layout.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent Albums_Intent = new Intent(MainActivity.this, AlbumActivity.class);
            startActivity(Albums_Intent);
        }
    });



        LinearLayout Artist_Layout = (LinearLayout) findViewById(com.example.roman.mymusicapp.R.id.Artist);
        Artist_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Artist_Intent = new Intent(MainActivity.this, Artist.class);
                startActivity(Artist_Intent);
            }
        });





        LinearLayout random_Layout = (LinearLayout) findViewById(com.example.roman.mymusicapp.R.id.RandomSongLayout);
        random_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Random_Intent = new Intent(MainActivity.this, Random_song.class);
                startActivity(Random_Intent);
            }
        });


        LinearLayout PlayList_Layout = (LinearLayout) findViewById(com.example.roman.mymusicapp.R.id.PlayList);
        PlayList_Layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent PLayList_Intent = new Intent(MainActivity.this, PLayList.class);
                startActivity(PLayList_Intent);
            }
        });



    }

}
