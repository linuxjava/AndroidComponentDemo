package com.component.demo.Dagger2.dependency;

import android.content.Context;

import timber.log.Timber;

public class PersonDependency {
    public PersonDependency(Context context){
        Timber.d("a PersonDependency created");
    }
}
