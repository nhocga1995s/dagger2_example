package com.example.daggerex.di.module.ui;

import com.example.daggerex.ui.mvp.detail.DetailFragment;
import com.example.daggerex.ui.mvvm.detail.DetailFragment2;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentModule {
    @ContributesAndroidInjector
    public abstract DetailFragment contributeDetailFragment();

    @ContributesAndroidInjector
    public abstract DetailFragment2 contributeDetailFragment2();
}
