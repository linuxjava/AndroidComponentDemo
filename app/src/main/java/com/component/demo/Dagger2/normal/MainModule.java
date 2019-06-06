package com.component.demo.Dagger2.normal;

import android.content.Context;

import com.component.demo.Dagger2.params.PersonWithParams;
import com.component.demo.Dagger2.singleton.SingletonPerson;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import timber.log.Timber;

@Module
public class MainModule {
    private Context context;

    public MainModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context providesContext() {
        return this.context;
    }

    @Provides
    Person providesPerson() {
        Timber.d("a person created from MainModule");
        return new Person();
    }

    /**
     * 提供单例
     *
     * @return
     */
    @Singleton
    @Provides
    SingletonPerson providesSingletonPerson() {
        Timber.d("a providesSingletonPerson created from MainModule");
        return new SingletonPerson();
    }

    /**
     * 提供单参数实例
     *
     * @param context
     * @return
     */
    @Provides
    PersonWithParams providesPersonWithParams(Context context) {
        Timber.d("a PersonWithParams created from MainModule");
        return new PersonWithParams(context);
    }
}
