package com.samuel.jokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    private TextView jokeTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        jokeTv = (TextView) findViewById(R.id.joke_text_view);

        Intent intent = getIntent();
        if (intent.hasExtra(getString(R.string.joke_extra))){
            jokeTv.setText(intent.getExtras().getString(getString(R.string.joke_extra)));
        }
    }
}
