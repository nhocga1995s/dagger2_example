package com.example.daggerex.di.module.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.daggerex.di.anotation.ViewModelKey;
import com.example.daggerex.di.module.model.ICacheModule;
import com.example.daggerex.di.module.model.IRepoModule;
import com.example.daggerex.di.module.model.UtilityModule;
import com.example.daggerex.ui.MainViewModel;
import com.example.daggerex.ui.base.factory.ViewModelFactory;
import com.example.daggerex.ui.mvvm.detail.DetailViewModel;
import com.example.daggerex.ui.mvvm.home.HomeViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(includes = {ICacheModule.class, IRepoModule.class, UtilityModule.class})
public abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel.class)
    abstract ViewModel bindMainViewModel(MainViewModel mainViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel.class)
    abstract ViewModel bindHomeViewModel(HomeViewModel homeViewModel);

    @Binds
    @IntoMap
    @ViewModelKey(DetailViewModel.class)
    abstract ViewModel bindDetailViewModel(DetailViewModel detailViewModel);

    @Binds
    abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelFactory factory);
}
