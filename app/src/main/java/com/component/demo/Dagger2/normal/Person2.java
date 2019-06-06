package com.component.demo.Dagger2.normal;

import javax.inject.Inject;

import timber.log.Timber;

public class Person2 {
    @Inject
    public Person2() {
        Timber.d("a Person2 created");
    }
}
