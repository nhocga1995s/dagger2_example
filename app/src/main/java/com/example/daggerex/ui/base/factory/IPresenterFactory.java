package com.example.daggerex.ui.base.factory;

import com.example.daggerex.ui.base.IPresenter;

public interface IPresenterFactory {
    <T extends IPresenter> T create(Class<T> modelClass);
}
