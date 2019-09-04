package com.example.daggerex.ui.mvp.home;

import androidx.annotation.Nullable;

import com.example.daggerex.ui.base.BasePresenter;

import javax.inject.Inject;

public class HomePresenter extends BasePresenter<HomeView> {

    @Inject
    public HomePresenter() {
    }

    @Nullable
    @Override
    public String getFieldString() {
        return null;
    }

    public void onDetailClick() {
        if (view != null) {
            view.gotoDetail();
        }
    }
}
