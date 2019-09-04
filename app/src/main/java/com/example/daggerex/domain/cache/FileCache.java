package com.example.daggerex.domain.cache;

import androidx.annotation.NonNull;

public class FileCache implements ICache {
    private String rootPath;

    public FileCache(@NonNull String rootPath) {
        this.rootPath = rootPath;
    }

    @NonNull
    @Override
    public String getString() {
        return "This is " + FileCache.class.getSimpleName() + " class, cache path: " + rootPath;
    }
}
