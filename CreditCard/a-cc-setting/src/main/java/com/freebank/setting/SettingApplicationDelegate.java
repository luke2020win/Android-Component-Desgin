package com.freebank.setting;

import android.content.res.Configuration;

import com.freebank.common.utils.LogUtils;
import com.freebank.framework.module.interfaces.IApplicationDelegate;
import com.freebank.processor.annotations.EFModuleAnnotation;

import java.util.Map;

/**
 * Main组件全局应用配置
 * Created by chenran3 on 2017/12/6.
 */
@EFModuleAnnotation(moduleName = "a-cc-setting",delegateName = "com.freebank.setting.SettingApplicationDelegate")
public class SettingApplicationDelegate implements IApplicationDelegate {

    private static final String TAG = SettingApplicationDelegate.class.getSimpleName();

    @Override
    public void onCreate() {
        LogUtils.d(TAG, "onCreate()");
    }

    @Override
    public void enterBackground() {
        LogUtils.d(TAG, "enterBackground()");
    }

    @Override
    public void enterForeground() {
        LogUtils.d(TAG, "enterForeground()");
    }

    @Override
    public void receiveRemoteNotification(Map<String, String> message) {
        LogUtils.d(TAG, "receiveRemoteNotification msg = " + message);
    }

    @Override
    public void onTerminate() {
        LogUtils.d(TAG, "onTerminate()");
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        LogUtils.d(TAG, "onConfigurationChanged()");
    }

    @Override
    public void onLowMemory() {
        LogUtils.d(TAG, "onLowMemory()");
    }

    @Override
    public void onTrimMemory(int var1) {
        LogUtils.d(TAG, "onTrimMemory()");
    }
}
