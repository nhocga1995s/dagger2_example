package com.example.daggerex.domain.repo;

import androidx.annotation.NonNull;

public class LocalRepo implements IRepo {
    @NonNull
    @Override
    public String getString() {
        return "This is " + LocalRepo.class.getSimpleName() + " class.";
    }
}
