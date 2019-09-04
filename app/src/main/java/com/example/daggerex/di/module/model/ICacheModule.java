package com.example.daggerex.di.module.model;

import com.example.daggerex.di.anotation.DatabaseInfo;
import com.example.daggerex.di.anotation.FileInfo;
import com.example.daggerex.domain.cache.Cache;
import com.example.daggerex.domain.cache.DatabaseCache;
import com.example.daggerex.domain.cache.FileCache;
import com.example.daggerex.domain.cache.ICache;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ICacheModule {
    @Singleton
    @Provides
    @com.example.daggerex.di.anotation.ICache("File")
    ICache provideFileCache(@FileInfo("CachePath") String rootPath) {
        return new FileCache(rootPath);
    }

    @Singleton
    @Provides
    @com.example.daggerex.di.anotation.ICache("Database")
    ICache provideDatabaseCache(@DatabaseInfo String databaseName, @DatabaseInfo int databaseVersion) {
        return new DatabaseCache(databaseName, databaseVersion);
    }

    @Singleton
    @Provides
    @com.example.daggerex.di.anotation.ICache("Manager")
    ICache provideCacheManager(@com.example.daggerex.di.anotation.ICache("File") ICache fileCache,
                               @com.example.daggerex.di.anotation.ICache("Database") ICache databaseCache){
        return new Cache(fileCache,databaseCache);
    }
}
