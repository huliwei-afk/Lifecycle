package com.example.lifecycle.baseLifecycle;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Chronometer;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyChronometer extends Chronometer implements LifecycleObserver {
    private long eplasedTime;

    public MyChronometer(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void startMeter(){
        setBase(SystemClock.elapsedRealtime() - eplasedTime);
        start();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void stopMeter(){
        eplasedTime = SystemClock.elapsedRealtime() - getBase();
        stop();
    }
}
