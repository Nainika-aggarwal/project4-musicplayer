package com.example.nainika.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Artists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        Button clicks3a = (Button) findViewById(R.id.click3a);

        clicks3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Artists.this, Songs.class);
                startActivity(i);
            }
        });
        Button clicks3b = (Button) findViewById(R.id.click3b);

        clicks3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Artists.this, PlayList.class);
                startActivity(i);
            }
        });
        Button clicks3c = (Button) findViewById(R.id.click3c);

        clicks3c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Artists.this, Album.class);
                startActivity(i);
            }
        });
    }
}
