package com.freebank.plug.creditcard.plugimagemanager.activity.taskaffinity;

import android.content.Intent;

import com.freebank.plug.creditcard.plugimagemanager.MainActivity;
import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;


/**
 * des:
 * author: libingyan
 * Date: 18-9-4 20:31
 */
public class TA2Activity3 extends BaseActivity {

    @Override
    protected String getActivityTitle() {
        return "这里是single task模式的TA2Activity3, task affinity: ta2";
    }

    @Override
    protected String getButtonTitle() {
        return "返回首页";
    }

    @Override
    protected void start() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
