package com.example.daggerex.di.module.app;

import com.example.daggerex.di.anotation.DatabaseInfo;
import com.example.daggerex.di.anotation.FileInfo;
import com.example.daggerex.di.anotation.RepoInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(includes = {ViewModelModule.class, PresenterModule.class})
public class AppModule {
    @Singleton
    @Provides
    @RepoInfo("Url")
    String provideBaseRepoUrl() {
        return "http://example.com/api/";
    }

    @Singleton
    @Provides
    @FileInfo("CachePath")
    String provideCachePath() {
        return "/storage/com.example/cache";
    }

    @Singleton
    @Provides
    @DatabaseInfo
    String provideDatabaseName() {
        return "MyDatabase";
    }

    @Singleton
    @Provides
    @DatabaseInfo
    int provideDatabaseVersion() {
        return 1;
    }
}
