package com.freebank.login.loading;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.freebank.common.utils.LogUtils;
import com.freebank.framework.base.BaseActivity;
import com.freebank.login.R;
import com.freebank.login.login.LoginActivity;

public class LoadingActivity extends BaseActivity {

    private static final String TAG = "LoadingActivity";

    @Override
    protected int setContentView() {
        return R.layout.activity_loading;
    }

    @Override
    protected void init() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.d(TAG,"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        //延迟登陆
        delayStartLogin();
    }

    private void delayStartLogin() {
         LogUtils.d(TAG,"delayStartLogin");
         new Handler().postDelayed(() -> {
             startActivity(new Intent(LoadingActivity.this ,LoginActivity.class));
             finish();
         }, 2000);
    }
}
