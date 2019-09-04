package com.example.daggerex.di.module.ui;

import com.example.daggerex.ui.MainActivity;
import com.example.daggerex.ui.mvp.detail.DetailActivity;
import com.example.daggerex.ui.mvp.home.HomeActivity;
import com.example.daggerex.ui.mvvm.detail.DetailActivity2;
import com.example.daggerex.ui.mvvm.home.HomeActivity2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {
    @ContributesAndroidInjector
    public abstract MainActivity contributeMainActivity();

    @ContributesAndroidInjector
    public abstract HomeActivity contributeHomeActivity();

    @ContributesAndroidInjector
    public abstract HomeActivity2 contributeHomeActivity2();

    @ContributesAndroidInjector(modules = {FragmentModule.class})
    public abstract DetailActivity contributeDetailActivity();

    @ContributesAndroidInjector(modules = {FragmentModule.class})
    public abstract DetailActivity2 contributeDetailActivity2();
}
