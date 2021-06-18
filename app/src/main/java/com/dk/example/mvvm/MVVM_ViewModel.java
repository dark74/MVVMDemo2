package com.dk.example.mvvm;

import android.app.Application;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.dk.example.mvvm.databinding.ActivityMainBinding;

/**
 * Function: TODO
 * Author: DongKe
 * Date: 2021/6/18 16:37
 * Copyright © 2006-2021 高顿网校, All Rights Reserved.
 */
public class MVVM_ViewModel extends BaseObservable {
    private ActivityMainBinding binding;
    private MVVM_Model mvvm_model;
    String input;
    String result;

    @Bindable
    public String getResult() {
        return this.result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(com.dk.example.mvvm.BR.result);
    }

    public MVVM_ViewModel(Application application, ActivityMainBinding binding) {
        this.binding = binding;
        mvvm_model = new MVVM_Model();
    }

    public void getData() {
        input = binding.etAccount.getText().toString();
        mvvm_model.getAccountData(input, new M_CallBack() {
            @Override
            public void success(Account account) {
                String resultInfo = account.getName() + "|" + account.getLevel();
                setResult(resultInfo);
            }

            @Override
            public void onFaild() {
                setResult("获取信息失败！！！");
            }
        });
    }
}
