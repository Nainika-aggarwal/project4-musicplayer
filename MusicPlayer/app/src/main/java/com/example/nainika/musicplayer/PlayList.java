package com.example.nainika.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PlayList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        Button clicks2a = (Button) findViewById(R.id.click2a);

        clicks2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayList.this, Songs.class);
                startActivity(i);
            }
        });
        Button clicks2b = (Button) findViewById(R.id.click2b);

        clicks2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayList.this, Artists.class);
                startActivity(i);
            }
        });
        Button clicks2c = (Button) findViewById(R.id.click2c);

        clicks2c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PlayList.this, Album.class);
                startActivity(i);
            }
        });
    }
}
