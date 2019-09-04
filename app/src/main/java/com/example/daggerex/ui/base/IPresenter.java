package com.example.daggerex.ui.base;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface IPresenter<V extends IView> {
    void bindView(@NonNull V view);

    void unbindView();

    @Nullable
    V getView();

    @Nullable
    String getFieldString();
}
