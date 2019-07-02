package com.freebank.creditcard;

import android.content.res.Configuration;

import com.freebank.framework.base.BaseApplication;
import com.freebank.login.BuildConfig;

public class FrameApplication extends BaseApplication  {

    @Override
    public void onCreate() {
        // 初始化app配置参数
        setInitAppConfig();
        super.onCreate();
    }


    /**
     * 配置app出事参数参数
     */
    private void setInitAppConfig() {
        setDebug(BuildConfig.IS_DEBUG);
        //setApp_secred(BuildConfig.APP_SECRET);
        //setAppid(BuildConfig.APPID);
        setBaseUrl(BuildConfig.BASE_URL);
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
    }
}
