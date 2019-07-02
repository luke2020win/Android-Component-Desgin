package com.freebank.plug.creditcard.plugimagemanager.activity.singleinstance;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;

public class SingleInstanceActivity1 extends BaseActivity {
    @Override
    protected String getActivityTitle() {
        return "这里是SingleInstance类型的Acitivity";
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
