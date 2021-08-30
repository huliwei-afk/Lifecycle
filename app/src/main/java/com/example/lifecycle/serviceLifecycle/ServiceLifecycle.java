package com.example.lifecycle.serviceLifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lifecycle.R;

public class ServiceLifecycle extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_two);

    }

    public void startGPS(View view){
        startService(new Intent(this,MyLocationService.class));
    }

    public void stopGPS(View view){
        stopService(new Intent(this, MyLocationService.class));
    }
}