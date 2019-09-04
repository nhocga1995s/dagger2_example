package com.example.daggerex.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.daggerex.R;
import com.example.daggerex.databinding.ActivityMainBinding;
import com.example.daggerex.ui.base.BaseActivity;
import com.example.daggerex.ui.mvp.home.HomeActivity;
import com.example.daggerex.ui.mvvm.home.HomeActivity2;

public class MainActivity extends BaseActivity {
    private MainViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        // Must call super first to inject field
        super.onCreate(savedInstanceState);

        //Get view model
        viewModel = viewModelFactory.create(MainViewModel.class);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(viewModel);
        binding.setLifecycleOwner(this);

        viewModel.getMvpClick().observe(this, aVoid -> startActivity(new Intent(this, HomeActivity.class)));

        viewModel.getMvvmClick().observe(this, aVoid -> startActivity(new Intent(this, HomeActivity2.class)));
    }
}
