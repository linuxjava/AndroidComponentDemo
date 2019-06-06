package com.component.demo.AndroidArchitecture.lifecycle;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.component.demo.R;

/**
 * AppCompatActivity的基类SupportActivity已经实现了LifecycleOwner
 */
public class LifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        getLifecycle().addObserver(new ActivityPresenter());
    }

}
