package com.example.daggerex.ui.base.factory;

import com.example.daggerex.ui.base.IPresenter;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
public class PresenterFactory implements IPresenterFactory {
    private final Map<Class<? extends IPresenter>, Provider<IPresenter>> creators;

    @Inject
    public PresenterFactory(Map<Class<? extends IPresenter>, Provider<IPresenter>> creators) {
        this.creators = creators;
    }

    @Override
    public <T extends IPresenter> T create(Class<T> modelClass) {
        Provider<? extends IPresenter> creator = creators.get(modelClass);
        if (creator == null) {
            for (Map.Entry<Class<? extends IPresenter>, Provider<IPresenter>> entry : creators.entrySet()) {
                if (modelClass.isAssignableFrom(entry.getKey())) {
                    creator = entry.getValue();
                    break;
                }
            }
        }
        if (creator == null) {
            throw new IllegalArgumentException("unknown model class " + modelClass);
        }
        try {
            return (T) creator.get();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
