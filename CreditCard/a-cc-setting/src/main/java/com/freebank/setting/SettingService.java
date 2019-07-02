package com.freebank.setting;

import android.app.Activity;
import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.freebank.common.utils.LogUtils;
import com.freebank.router.RouterPath;
import com.freebank.router.provider.ISettingProvider;

/**
 *
 */

@Route(path = RouterPath.ROUTER_PATH_TO_SETTING_SERVICE, name = "设置页面")
public class SettingService implements ISettingProvider {

    private static final String TAG = SettingService.class.getSimpleName();

    @Override
    public void init(Context context) {}


    @Override
    public void goToSetting(Activity activity) {
        LogUtils.d(TAG,"goToSetting");

    }
}
