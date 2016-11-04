package com.example.mikeacre.mymusicclub;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        setClicks();
        }

    private void setClicks(){

        //Set OnclickListeners for all buttons in Menu

        //Now Playing
        Button nowPlaying = (Button) findViewById(R.id.btn_nowplaying);
        nowPlaying.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(HomeScreen.this, NowPlaying.class);
                startActivity(nowIntent);
            }
        });

        //Explore
        Button explore = (Button) findViewById(R.id.btn_explore);
        explore.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(HomeScreen.this, Explore.class);
                startActivity(nowIntent);
            }
        });

        //Djs
        Button djs = (Button) findViewById(R.id.btn_djs);
        djs.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(HomeScreen.this, Djs.class);
                startActivity(nowIntent);
            }
        });

        //MySets
        Button mySets = (Button) findViewById(R.id.btn_mysets);
        mySets.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(HomeScreen.this, MySets.class);
                startActivity(nowIntent);
            }
        });

    }
}
