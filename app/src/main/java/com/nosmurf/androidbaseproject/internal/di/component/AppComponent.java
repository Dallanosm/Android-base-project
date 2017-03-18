package com.nosmurf.androidbaseproject.internal.di.component;

import android.content.Context;

import com.nosmurf.androidbaseproject.internal.di.module.AppModule;
import com.nosmurf.androidbaseproject.view.activity.RootActivity;
import com.nosmurf.domain.executor.PostExecutionThread;
import com.nosmurf.domain.repository.Repository;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(RootActivity rootActivity);

    Context context();

    PostExecutionThread postExecutionThread();

    Repository repository();
}
