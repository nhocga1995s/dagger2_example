package com.example.daggerex.ui.mvvm.home;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import com.example.daggerex.ui.base.BaseViewModel;
import com.example.daggerex.ui.base.SingleLiveEvent;

import javax.inject.Inject;

public class HomeViewModel extends BaseViewModel {

    @Inject
    public HomeViewModel() {
    }

    private SingleLiveEvent<Void> detailClick = new SingleLiveEvent<>();

    public LiveData<Void> getDetailClick() {
        return detailClick;
    }

    public void onDetailClick() {
        detailClick.call();
    }

    @Nullable
    @Override
    public String getFieldString() {
        return null;
    }
}
