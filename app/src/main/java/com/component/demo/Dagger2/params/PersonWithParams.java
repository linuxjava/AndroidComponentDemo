package com.component.demo.Dagger2.params;


import android.content.Context;

import timber.log.Timber;

public class PersonWithParams {
    public PersonWithParams(Context context){
        Timber.d("a PersonWithParams created");
    }
}
