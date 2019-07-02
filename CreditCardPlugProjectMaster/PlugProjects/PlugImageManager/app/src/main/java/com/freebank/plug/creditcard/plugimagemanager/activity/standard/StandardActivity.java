package com.freebank.plug.creditcard.plugimagemanager.activity.standard;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;

public class StandardActivity extends BaseActivity {
    @Override
    protected String getActivityTitle() {
        return "这里是standard模式的activity";
    }

    @Override
    protected String getButtonTitle() {
        return "back";
    }

    @Override
    protected void start() {
        finish();
    }
}
