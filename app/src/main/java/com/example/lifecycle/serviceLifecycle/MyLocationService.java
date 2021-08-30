package com.example.lifecycle.serviceLifecycle;

import android.util.Log;

import androidx.lifecycle.LifecycleService;

public class MyLocationService extends LifecycleService {
    public MyLocationService() {
        Log.d("hu", "MyLocationService");
        MyLocationObserver observer = new MyLocationObserver(this);
        getLifecycle().addObserver(observer);
    }
}
