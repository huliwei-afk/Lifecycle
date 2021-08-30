package com.example.lifecycle.baseLifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lifecycle.R;

public class MainActivity extends AppCompatActivity {

    private MyChronometer chronometer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chronometer = findViewById(R.id.chronometer);
        getLifecycle().addObserver(chronometer);
    }
}