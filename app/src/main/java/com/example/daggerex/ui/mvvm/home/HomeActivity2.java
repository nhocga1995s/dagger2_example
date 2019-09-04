package com.example.daggerex.ui.mvvm.home;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.daggerex.R;
import com.example.daggerex.databinding.ActivityHome2Binding;
import com.example.daggerex.ui.base.BaseActivity;
import com.example.daggerex.ui.mvvm.detail.DetailActivity2;

public class HomeActivity2 extends BaseActivity {
    private HomeViewModel viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = viewModelFactory.create(HomeViewModel.class);

        ActivityHome2Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_home_2);
        binding.setLifecycleOwner(this);
        binding.setViewModel(viewModel);

        viewModel.getDetailClick().observe(this, aVoid -> startActivity(new Intent(this, DetailActivity2.class)));
    }
}
