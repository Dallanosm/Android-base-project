package com.nosmurf.androidbaseproject.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nosmurf.androidbaseproject.internal.di.component.AppComponent;
import com.nosmurf.androidbaseproject.presenter.Presenter;
import com.nosmurf.androidbaseproject.view.AndroidBaseProjectApplication;

public abstract class RootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        initializeInjector();
        initializeUI();
        initializePresenter();
        registerListeners();
    }

    public abstract int getLayoutId();

    public abstract Presenter getPresenter();

    protected abstract void initializeInjector();

    protected abstract void initializeUI();

    protected abstract void initializePresenter();

    protected abstract void registerListeners();

    protected AppComponent getAppComponent() {
        return ((AndroidBaseProjectApplication) getApplication()).getAppComponent();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().destroy();
    }
}
