package com.example.daggerex.domain.cache;

import androidx.annotation.NonNull;

public class Cache implements ICache {
    private ICache fileCache;
    private ICache databaseCache;

    public Cache(@NonNull ICache fileCache, @NonNull ICache databaseCache) {
        this.fileCache = fileCache;
        this.databaseCache = databaseCache;
    }

    @NonNull
    @Override
    public String getString() {
        return fileCache.getString() + "\n" + databaseCache.getString();
    }
}
