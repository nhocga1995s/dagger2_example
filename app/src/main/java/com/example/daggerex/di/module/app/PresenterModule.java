package com.example.daggerex.di.module.app;

import com.example.daggerex.di.anotation.PresenterKey;
import com.example.daggerex.di.module.model.ICacheModule;
import com.example.daggerex.di.module.model.IRepoModule;
import com.example.daggerex.di.module.model.UtilityModule;
import com.example.daggerex.ui.base.IPresenter;
import com.example.daggerex.ui.base.factory.IPresenterFactory;
import com.example.daggerex.ui.base.factory.PresenterFactory;
import com.example.daggerex.ui.mvp.detail.DetailPresenter;
import com.example.daggerex.ui.mvp.home.HomePresenter;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(includes = {ICacheModule.class, IRepoModule.class, UtilityModule.class})
public abstract class PresenterModule {
    @Binds
    @IntoMap
    @PresenterKey(HomePresenter.class)
    abstract IPresenter bindHomePresenter(HomePresenter homePresenter);

    @Binds
    @IntoMap
    @PresenterKey(DetailPresenter.class)
    abstract IPresenter bindDetailPresenter(DetailPresenter detailPresenter);

    @Binds
    abstract IPresenterFactory bindPresenterFactory(PresenterFactory factory);
}
