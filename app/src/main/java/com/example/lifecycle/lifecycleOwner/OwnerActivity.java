package com.example.lifecycle.lifecycleOwner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;

import android.os.Bundle;

import com.example.lifecycle.R;

public class OwnerActivity extends AppCompatActivity {

    //自定义lifecycleOwner
    private LifecycleRegistry lifecycleRegistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner);

        //Ac和Fm默认实现LifeCycleOwner接口，直接传this
        lifecycleRegistry = new LifecycleRegistry(this);
        lifecycleRegistry.setCurrentState(Lifecycle.State.CREATED);
    }

    @Override
    public void onStart(){
        super.onStart();
        lifecycleRegistry.setCurrentState(Lifecycle.State.STARTED);
    }

    @Override
    public Lifecycle getLifecycle(){
        return lifecycleRegistry;
    }

}