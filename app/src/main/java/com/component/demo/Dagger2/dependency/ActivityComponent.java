package com.component.demo.Dagger2.dependency;

import com.component.demo.Dagger2.DependencyActivity;

import dagger.Component;

@Component(dependencies = {AppComponent.class}, modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(DependencyActivity activity);
}
