package com.freebank.plug.creditcard.plugimagemanager.activity.notification;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;

public class NotificationActivity extends BaseActivity {
    @Override
    protected String getActivityTitle() {
        return "这是通知栏跳转过来的Activity";
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
