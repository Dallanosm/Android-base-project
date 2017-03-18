package com.nosmurf.androidbaseproject.internal.di.module;

import android.content.Context;

import com.nosmurf.androidbaseproject.UIThread;
import com.nosmurf.androidbaseproject.view.AndroidBaseProjectApplication;
import com.nosmurf.data.repository.DataRepository;
import com.nosmurf.domain.executor.PostExecutionThread;
import com.nosmurf.domain.repository.Repository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    private AndroidBaseProjectApplication androidBaseProjectApplication;

    public AppModule(AndroidBaseProjectApplication androidBaseProjectApplication) {
        this.androidBaseProjectApplication = androidBaseProjectApplication;
    }

    @Provides
    @Singleton
    Context provideContext() {
        return this.androidBaseProjectApplication;
    }

    @Provides
    @Singleton
    PostExecutionThread providePostExecutionThread(UIThread uiThread) {
        return uiThread;
    }

    @Provides
    @Singleton
    Repository provideRepository(DataRepository dataRepository) {
        return dataRepository;
    }

}
