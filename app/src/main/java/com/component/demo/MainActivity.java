package com.component.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.component.demo.AndroidArchitecture.AndroidArchitectureActivity;
import com.component.demo.Dagger2.Dagger2Activity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onAndroidArchitecture(View view) {
        startActivity(new Intent(this, AndroidArchitectureActivity.class));
    }

    public void onDagger2(View view) {
        startActivity(new Intent(this, Dagger2Activity.class));
    }
}
