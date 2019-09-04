package com.example.daggerex.domain.repo;

import androidx.annotation.NonNull;

public class RemoteRepo implements IRepo {
    private String url;

    public RemoteRepo(@NonNull String url) {
        this.url = url;
    }

    @NonNull
    @Override
    public String getString() {
        return "This is " + RemoteRepo.class.getSimpleName() + " class, url: " + url;
    }
}
