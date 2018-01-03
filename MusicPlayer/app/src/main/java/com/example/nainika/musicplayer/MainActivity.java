package com.example.nainika.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button songss = (Button) findViewById(R.id.Songs);
        Button albums = (Button) findViewById(R.id.Album);
        Button artistss = (Button) findViewById(R.id.Artist);
        Button playlists = (Button) findViewById(R.id.Playlist);
        Button payment = (Button) findViewById(R.id.Payment);
        songss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Songs.class);
                startActivity(i);
            }
        });
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Album.class);
                startActivity(i);
            }
        });
        artistss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Artists.class);
                startActivity(i);
            }
        });
        playlists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PlayList.class);
                startActivity(i);
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Payment.class);
                startActivity(i);
            }
        });


    }
}
