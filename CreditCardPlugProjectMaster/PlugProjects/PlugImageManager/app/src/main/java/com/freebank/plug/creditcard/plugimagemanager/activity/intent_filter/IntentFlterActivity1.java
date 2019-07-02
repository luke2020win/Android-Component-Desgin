package com.freebank.plug.creditcard.plugimagemanager.activity.intent_filter;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;

public class IntentFlterActivity1 extends BaseActivity {

    @Override
    protected String getActivityTitle() {
        return "这里是通过Intent-Filter跳转过来的";
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
