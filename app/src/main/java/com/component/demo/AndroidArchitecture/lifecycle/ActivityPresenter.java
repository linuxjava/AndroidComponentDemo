package com.component.demo.AndroidArchitecture.lifecycle;


import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.support.annotation.NonNull;

import timber.log.Timber;

public class ActivityPresenter implements BaseActivityPresenter {

    @Override
    public void onCreate(LifecycleOwner owner) {
        Timber.d("ActivityPresenter.onCreate");
    }

    @Override
    public void onStart(LifecycleOwner owner) {
        Timber.d("ActivityPresenter.onStart");
    }

    @Override
    public void onResume(LifecycleOwner owner) {
        Timber.d("ActivityPresenter.onResume");
    }

    @Override
    public void onPause(LifecycleOwner owner) {
        Timber.d("ActivityPresenter.onPause");
    }

    @Override
    public void onStop(LifecycleOwner owner) {
        Timber.d("ActivityPresenter.onStop");
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        Timber.d("ActivityPresenter.onDestory");
    }
}
