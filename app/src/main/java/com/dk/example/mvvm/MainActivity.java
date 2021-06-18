package com.dk.example.mvvm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.dk.example.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private MVVM_ViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //创建binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //创建viewModel
        viewModel = new MVVM_ViewModel(getApplication(), binding);
        //绑定viewModel
        binding.setViewModel(viewModel);
    }
}
