package com.example.daggerex.di.module.model;

import com.example.daggerex.di.anotation.RepoInfo;
import com.example.daggerex.domain.repo.IRepo;
import com.example.daggerex.domain.repo.LocalRepo;
import com.example.daggerex.domain.repo.RemoteRepo;
import com.example.daggerex.domain.repo.Repo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class IRepoModule {
    @Singleton
    @Provides
    @com.example.daggerex.di.anotation.IRepo("Remote")
    IRepo provideRemoteRepo(@RepoInfo("Url") String url) {
        return new RemoteRepo(url);
    }

    @Singleton
    @Provides
    @com.example.daggerex.di.anotation.IRepo("Local")
    IRepo provideLocalRepo() {
        return new LocalRepo();
    }

    @Singleton
    @Provides
    @com.example.daggerex.di.anotation.IRepo("Manager")
    IRepo provideRepoManager(@com.example.daggerex.di.anotation.IRepo("Remote") IRepo remoteRepo,
                             @com.example.daggerex.di.anotation.IRepo("Local") IRepo localRepo){
        return new Repo(remoteRepo,localRepo);
    }

}
