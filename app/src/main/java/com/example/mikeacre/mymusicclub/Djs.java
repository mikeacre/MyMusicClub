package com.example.mikeacre.mymusicclub;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by mikeacre on 11/3/2016.
 */

public class Djs extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_djs);
        TextView theText = (TextView) findViewById(R.id.djstext);
        theText.setText(Html.fromHtml(getResources().getString(R.string.djstext)));

    }
}
