package com.component.demo.Dagger2.normal;

import com.component.demo.Dagger2.Dagger2Activity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MainModule.class})
public interface MainComponent {
    void inject(Dagger2Activity activity);
}
