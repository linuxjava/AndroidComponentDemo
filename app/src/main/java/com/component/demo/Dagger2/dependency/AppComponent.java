package com.component.demo.Dagger2.dependency;

import android.content.Context;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {
    // 向下层提供Context
    Context getContext();
}
