package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        String message = getIntent().getStringExtra(MainActivity.EXTRA_MESSAGE);

        TextView text = (TextView) findViewById(R.id.activity_display_message);
        text.setText(message);
    }
}