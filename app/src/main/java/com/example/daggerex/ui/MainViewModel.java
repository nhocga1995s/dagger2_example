package com.example.daggerex.ui;

import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;

import com.example.daggerex.ui.base.BaseViewModel;
import com.example.daggerex.ui.base.SingleLiveEvent;

import javax.inject.Inject;

public class MainViewModel extends BaseViewModel {

    @Inject
    public MainViewModel() {
    }

    private SingleLiveEvent<Void> mvpClick = new SingleLiveEvent<>();
    private SingleLiveEvent<Void> mvvmClick = new SingleLiveEvent<>();

    public LiveData<Void> getMvpClick() {
        return mvpClick;
    }

    public LiveData<Void> getMvvmClick() {
        return mvvmClick;
    }

    public void onMVPClick() {
        mvpClick.call();
    }

    public void onMVVMClick() {
        mvvmClick.call();
    }

    @Nullable
    @Override
    public String getFieldString() {
        return null;
    }
}
