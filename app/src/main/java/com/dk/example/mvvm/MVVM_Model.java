package com.dk.example.mvvm;

import android.util.Log;

import java.util.Random;

/**
 * Function: Model请求数据
 * Author: DongKe
 * Date: 2021/6/18 16:35
 * Copyright © 2006-2021 高顿网校, All Rights Reserved.
 */
public class MVVM_Model {
    //模拟查询账户
    public void getAccountData(String accountName, M_CallBack callBack) {
        Random random = new Random();
        boolean isSuccess = random.nextBoolean();
        Log.d("DK", "请求结果:" + isSuccess);
        if (isSuccess) {
            Account account = new Account();
            account.setName(accountName);
            account.setLevel(random.nextInt(100));
            callBack.success(account);
        } else {
            callBack.onFaild();
        }
    }
}
