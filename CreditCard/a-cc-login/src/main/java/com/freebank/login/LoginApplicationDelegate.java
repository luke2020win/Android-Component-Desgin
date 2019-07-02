package com.freebank.login;

import android.content.res.Configuration;


import com.freebank.framework.module.interfaces.IApplicationDelegate;
import com.freebank.common.utils.LogUtils;
import com.freebank.processor.annotations.EFModuleAnnotation;

import java.util.Map;

/**
 * login组件全局应用配置
 * 实现组件全局应用配置类，这个类的目的是在组件加载时初始化一些组件自身的资源
 */
@EFModuleAnnotation(moduleName = "a-cc-login", delegateName = "com.freebank.login.LoginApplicationDelegate")
public class LoginApplicationDelegate implements IApplicationDelegate {

    private static final String TAG = LoginApplicationDelegate.class.getSimpleName();


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
        LogUtils.d(TAG, "receiveRemoteNotification msg:" + message);
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
