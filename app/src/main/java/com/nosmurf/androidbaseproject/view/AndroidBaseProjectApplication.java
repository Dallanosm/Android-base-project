package com.nosmurf.androidbaseproject.view;

import android.app.Application;

import com.nosmurf.androidbaseproject.internal.di.component.AppComponent;
import com.nosmurf.androidbaseproject.internal.di.component.DaggerAppComponent;
import com.nosmurf.androidbaseproject.internal.di.module.AppModule;


public class AndroidBaseProjectApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        initializeInjector();
    }

    private void initializeInjector() {
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

}
