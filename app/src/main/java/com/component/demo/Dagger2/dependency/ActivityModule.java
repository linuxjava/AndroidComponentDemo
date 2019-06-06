package com.component.demo.Dagger2.dependency;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module
public class ActivityModule {

    @Provides
    PersonDependency providePerson(Context context) {
        Timber.d("a PersonDependency created from ActivityModule");
        return new PersonDependency(context);
    }
}
