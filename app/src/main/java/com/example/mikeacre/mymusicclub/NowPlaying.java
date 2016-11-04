package com.example.mikeacre.mymusicclub;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by mikeacre on 11/3/2016.
 */

public class NowPlaying extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_now_playing);
        TextView theText = (TextView) findViewById(R.id.nowplayingtext);
       theText.setText(Html.fromHtml(getResources().getString(R.string.nowplayingtext)));

    }
}
