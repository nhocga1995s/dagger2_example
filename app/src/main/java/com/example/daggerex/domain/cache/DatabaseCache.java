package com.example.daggerex.domain.cache;

import androidx.annotation.NonNull;

public class DatabaseCache implements ICache {
    private String databaseName;
    private int databaseVersion;

    public DatabaseCache(@NonNull String databaseName, int databaseVersion) {
        this.databaseName = databaseName;
        this.databaseVersion = databaseVersion;
    }

    @NonNull
    @Override
    public String getString() {
        return "This is " + DatabaseCache.class.getSimpleName() + " class, dbName: " + databaseName + " , dbVer: " + databaseVersion;
    }
}
