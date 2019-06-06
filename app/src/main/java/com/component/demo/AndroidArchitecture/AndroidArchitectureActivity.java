package com.component.demo.AndroidArchitecture;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.component.demo.AndroidArchitecture.lifecycle.LifecycleActivity;
import com.component.demo.R;

public class AndroidArchitectureActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_architecture);
    }

    public void onLifecycle(View view) {
        startActivity(new Intent(this, LifecycleActivity.class));
    }
}
