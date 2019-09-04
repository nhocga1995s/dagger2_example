package com.example.daggerex.di.component;

import android.app.Application;

import com.example.daggerex.MyApplication;
import com.example.daggerex.di.module.app.AppModule;
import com.example.daggerex.di.module.ui.ActivityModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Singleton
@Component(modules = {AndroidInjectionModule.class, AppModule.class, ActivityModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

    void inject(MyApplication myApplication);
}
