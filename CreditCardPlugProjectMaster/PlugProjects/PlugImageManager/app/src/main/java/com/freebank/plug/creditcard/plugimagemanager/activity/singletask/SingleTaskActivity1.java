package com.freebank.plug.creditcard.plugimagemanager.activity.singletask;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;

public class SingleTaskActivity1 extends BaseActivity {
    @Override
    protected String getActivityTitle() {
        return "这里是SingleTask类型的Acitivity";
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
