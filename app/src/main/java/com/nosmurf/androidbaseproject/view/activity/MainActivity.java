package com.nosmurf.androidbaseproject.view.activity;

import com.nosmurf.androidbaseproject.R;
import com.nosmurf.androidbaseproject.internal.di.component.DaggerMainComponent;
import com.nosmurf.androidbaseproject.internal.di.component.MainComponent;
import com.nosmurf.androidbaseproject.presenter.MainPresenter;
import com.nosmurf.androidbaseproject.presenter.Presenter;

import javax.inject.Inject;

public class MainActivity extends RootActivity implements MainPresenter.View {

    MainComponent mainComponent;

    @Inject
    MainPresenter mainPresenter;

    @Override
    public int getLayoutId() {
        return R.layout.main_activity_layout;
    }

    @Override
    public Presenter getPresenter() {
        return mainPresenter;
    }

    @Override
    protected void initializeInjector() {
        mainComponent = DaggerMainComponent.builder()
                .appComponent(getAppComponent())
                .build();

        mainComponent.inject(this);
    }

    @Override
    protected void initializeUI() {

    }

    @Override
    protected void initializePresenter() {
        mainPresenter.start(this);
    }

    @Override
    protected void registerListeners() {

    }

    @Override
    public void showProgress(String message) {

    }

    @Override
    public void showProgress(int messageId) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }

    @Override
    public void showError(int messageId) {

    }
}
