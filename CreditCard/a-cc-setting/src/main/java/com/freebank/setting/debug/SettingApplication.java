package com.freebank.setting.debug;

import com.freebank.framework.base.BaseApplication;
import com.freebank.setting.BuildConfig;

public class SettingApplication extends BaseApplication {

    @Override
    public void onCreate() {
        setDebug(BuildConfig.IS_DEBUG);
        super.onCreate();
    }
}
