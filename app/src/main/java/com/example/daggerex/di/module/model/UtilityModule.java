package com.example.daggerex.di.module.model;

import com.example.daggerex.utilities.Helper;
import com.example.daggerex.utilities.Util;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class UtilityModule {
    @Singleton
    @Provides
    Helper provideHelper() {
        return new Helper();
    }

    @Singleton
    @Provides
    Util provideUtil() {
        return new Util();
    }
}
