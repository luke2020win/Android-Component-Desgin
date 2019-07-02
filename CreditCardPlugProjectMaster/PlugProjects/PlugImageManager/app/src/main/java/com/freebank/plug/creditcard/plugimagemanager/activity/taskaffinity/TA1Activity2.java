package com.freebank.plug.creditcard.plugimagemanager.activity.taskaffinity;

import android.content.Intent;

import com.freebank.plug.creditcard.plugimagemanager.activity.BaseActivity;


/**
 * des:
 * author: libingyan
 * Date: 18-9-4 20:31
 */
public class TA1Activity2 extends BaseActivity {

    @Override
    protected String getActivityTitle() {
        return "这里是single task模式的TA1Activity2, task affinity: ta1";
    }

    @Override
    protected String getButtonTitle() {
        return "跳转到TA2Activity4";
    }

    @Override
    protected void start() {
        startActivity(new Intent(this, TA2Activity4.class));
    }
}
