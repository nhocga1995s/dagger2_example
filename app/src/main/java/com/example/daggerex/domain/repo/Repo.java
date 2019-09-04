package com.example.daggerex.domain.repo;

import androidx.annotation.NonNull;

public class Repo implements IRepo {
    private IRepo remoteRepo;
    private IRepo localRepo;

    public Repo(@NonNull IRepo remoteRepo, @NonNull IRepo localRepo) {
        this.remoteRepo = remoteRepo;
        this.localRepo = localRepo;
    }

    @NonNull
    @Override
    public String getString() {
        return remoteRepo.getString() + "\n" + localRepo.getString();
    }
}
