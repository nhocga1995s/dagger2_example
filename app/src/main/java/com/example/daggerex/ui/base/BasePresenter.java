package com.example.daggerex.ui.base;

import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class BasePresenter<V extends IView> implements IPresenter<V> {
    protected V view;

    @Nullable
    @Override
    public V getView() {
        return view;
    }

    @Override
    @CallSuper
    public void bindView(@NonNull V view) {
        this.view = view;
    }

    @Override
    @CallSuper
    public void unbindView() {
        this.view = null;
    }
}
