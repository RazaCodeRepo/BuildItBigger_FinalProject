package com.example.myandroidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LibraryActivity extends AppCompatActivity {

    TextView jokeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Intent intent = getIntent();
        String jokeExtra = intent.getStringExtra("JOKE");

        jokeTextView = findViewById(R.id.tv_androidlibrary_joke);
        jokeTextView.setText(jokeExtra);
    }
}
