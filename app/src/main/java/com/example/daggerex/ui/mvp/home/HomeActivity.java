package com.example.daggerex.ui.mvp.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.daggerex.R;
import com.example.daggerex.databinding.ActivityHomeBinding;
import com.example.daggerex.ui.base.BaseActivity;
import com.example.daggerex.ui.mvp.detail.DetailActivity;

public class HomeActivity extends BaseActivity implements HomeView {
    private HomePresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // Must call super first to inject field
        super.onCreate(savedInstanceState);
        presenter = presenterFactory.create(HomePresenter.class);
        presenter.bindView(this);

        ActivityHomeBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        binding.setPresenter(presenter);
    }


    @Override
    protected void onDestroy() {
        presenter.unbindView();
        super.onDestroy();
    }

    @Override
    public void gotoDetail() {
        startActivity(new Intent(this, DetailActivity.class));
    }
}
