package com.component.demo.AndroidArchitecture.lifecycle;

import android.arch.lifecycle.DefaultLifecycleObserver;

/**
 * 两种实现方式：
 * <p>
 * 实现DefultLifecyceObserver接口，然后重写里面生命周期方法；
 * 直接实现LifecycleObserver接口，然后通过注解的方式来接收生命周期的变化；
 * Lifecycle.java文档中是建议使用第一种方式，因为文档中说明了，随着Java8成为主流，注解的方式会被弃用。DefaultLifecycleObserver是需要另外声明的java8 比如下面
 * GenericLifecycleObserver，FullLifecycleObserver，DefaultLifecycleObserver 这三个接口都是直接或者间接继承的LifecycleObserver
 * <p>
 * // 如果使用的是java 8要显示声明如下的
 * def lifecycle_version = "1.1.1"
 * implementation "android.arch.lifecycle:common-java8:$lifecycle_version"
 */
public interface BaseActivityPresenter extends DefaultLifecycleObserver {

//    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
//    void onLifecycleChanged(LifecycleOwner owner, Lifecycle.Event event);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
//    void onCreate(LifecycleOwner owner);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_START)
//    void onStart(LifecycleOwner owner);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
//    void onResume(LifecycleOwner owner);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
//    void onPause(LifecycleOwner owner);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
//    void onStop(LifecycleOwner owner);
//
//    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
//    void onDestory(LifecycleOwner owner);
}
