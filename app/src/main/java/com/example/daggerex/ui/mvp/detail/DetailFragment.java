package com.example.daggerex.ui.mvp.detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.daggerex.R;
import com.example.daggerex.databinding.FragmentDetailBinding;
import com.example.daggerex.ui.base.BaseFragment;

public class DetailFragment extends BaseFragment implements DetailView {
    private DetailPresenter presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = presenterFactory.create(DetailPresenter.class);
        presenter.bindView(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentDetailBinding binding = DataBindingUtil.inflate(inflater, R.layout.fragment_detail, container, false);
        binding.setPresenter(presenter);
        return binding.getRoot();
    }

    @Override
    public void onDestroy() {
        presenter.unbindView();
        super.onDestroy();
    }
}
