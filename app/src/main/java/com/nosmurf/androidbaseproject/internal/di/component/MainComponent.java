package com.nosmurf.androidbaseproject.internal.di.component;

import com.nosmurf.androidbaseproject.internal.di.PerActivity;
import com.nosmurf.androidbaseproject.internal.di.module.MainModule;
import com.nosmurf.androidbaseproject.view.activity.MainActivity;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity mainActivity);
}
