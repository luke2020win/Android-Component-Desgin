package com.freebank.plug.creditcard.plugimagemanager.activity.singletop;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;

public class SingleTopActivity1 extends BaseActivity {
    @Override
    protected String getActivityTitle() {
        return "这里是SingleTop类型的Acitivity";
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
