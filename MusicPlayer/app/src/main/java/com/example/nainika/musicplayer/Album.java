package com.example.nainika.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        Button clicks4a = (Button) findViewById(R.id.click4a);

        clicks4a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Album.this, Songs.class);
                startActivity(i);
            }
        });
        Button clicks4b = (Button) findViewById(R.id.click4b);

        clicks4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Album.this, Artists.class);
                startActivity(i);
            }
        });
        Button clicks4c = (Button) findViewById(R.id.click4c);

        clicks4c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Album.this, PlayList.class);
                startActivity(i);
            }
        });
    }
}
