package com.example.daggerex.ui.mvvm.detail;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.daggerex.domain.cache.ICache;
import com.example.daggerex.domain.repo.IRepo;
import com.example.daggerex.ui.base.BaseViewModel;
import com.example.daggerex.utilities.Helper;
import com.example.daggerex.utilities.Util;

import javax.inject.Inject;

public class DetailViewModel extends BaseViewModel {
    private ICache cacheManager;
    private IRepo repoManager;
    private Helper helper;
    private Util util;

    @Inject
    public DetailViewModel(@NonNull @com.example.daggerex.di.anotation.ICache("Manager") ICache cacheManager,
                           @NonNull @com.example.daggerex.di.anotation.IRepo("Manager") IRepo repoManager,
                           @NonNull Helper helper, @NonNull Util util) {
        this.cacheManager = cacheManager;
        this.repoManager = repoManager;
        this.helper = helper;
        this.util = util;
    }

    @Nullable
    @Override
    public String getFieldString() {
        return cacheManager.getString()
                + "\n\n"
                + repoManager.getString()
                + "\n\n"
                + helper.getString()
                + "\n\n"
                + util.getString();
    }
}
