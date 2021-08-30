package com.example.lifecycle.applicationLifecycle;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //应用程序添加监听
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
    }
}
