package com.wyac.common.framework.module.interfaces;

import android.content.res.Configuration;

import java.util.Map;

/**
 * 各个组件的Application接口类
 */
public interface IApplicationDelegate {

    void onCreate();

    void enterBackground();

    void enterForeground();

    void receiveRemoteNotification(Map<String, String> var1);

    void onTerminate();

    void onConfigurationChanged(Configuration var1);

    void onLowMemory();

    void onTrimMemory(int var1);
}
