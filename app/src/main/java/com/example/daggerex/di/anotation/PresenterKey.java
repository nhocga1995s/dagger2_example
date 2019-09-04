package com.example.daggerex.di.anotation;

import com.example.daggerex.ui.base.IPresenter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.MapKey;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@MapKey
public @interface PresenterKey {
    Class<? extends IPresenter> value();
}
