package com.example.daggerex.ui.base;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModel;

public abstract class BaseViewModel extends ViewModel {
    @Nullable
    public abstract String getFieldString();
}
