package com.freebank.plug.creditcard.creditcard.plughost;


import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;

import com.freebank.plug.creditcard.pluginutils.DLog;
import com.qihoo360.replugin.RePlugin;
import com.qihoo360.replugin.RePluginApplication;
import com.qihoo360.replugin.RePluginCallbacks;
import com.qihoo360.replugin.RePluginConfig;

public class PlugHostApplication extends RePluginApplication {

    private static final String TAG = "PlugHostApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        //增加签名验证,暂时注释
        RePlugin.addCertSignature("A9B61A779F3F687A20B26C7A03B4449C");
        //是否启用调试器
        RePlugin.enableDebugger(this, BuildConfig.DEBUG);

        registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }

    @Override
    protected void attachBaseContext(Context base) {
        /**
         * 设置日志打印自定可以tag
         */
        DLog.setTag("PlugHost");
        super.attachBaseContext(base);
        DLog.i(TAG, "attachBaseContext()");
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        DLog.i(TAG, "onLowMemory()");
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        DLog.i(TAG, "onTrimMemory()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        DLog.i(TAG, "onConfigurationChanged()");
    }

    @Override
    protected RePluginConfig createConfig() {
        RePluginConfig rePluginConfig = new RePluginConfig();
        /**release包打开*/
        rePluginConfig.setVerifySign(!BuildConfig.DEBUG);
        /**当插件没有指定类时，是否允许使用宿主的类*/
        rePluginConfig.setUseHostClassIfNotFound(true);
        /** 设置宿主的 BuildID */
        rePluginConfig.setHostBuild("100001");
        /** 设置宿主的 VersionName */
        rePluginConfig.setHostVersionName(BuildConfig.VERSION_NAME);
        /** 是否打印更详细的日志*/
        rePluginConfig.setPrintDetailLog(BuildConfig.DEBUG);
        /** 设置插件化框架的事件回调方法，调用者可自定义插件框架的事件回调行为*/
        rePluginConfig.setEventCallbacks(new PlugEventCallbacks(this));
        // 在Art上，优化第一次loadDex的速度
        rePluginConfig.setOptimizeArtLoadDex(true);

        return rePluginConfig;
    }

    @Override
    protected RePluginCallbacks createCallbacks() {
        return new PlugCallbacks(this);
    }

    private ActivityLifecycleCallbacks activityLifecycleCallbacks = new ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            DLog.i(TAG, "onActivityCreated() activity: " + activity);
        }

        @Override
        public void onActivityStarted(Activity activity) {

        }

        @Override
        public void onActivityResumed(Activity activity) {

        }

        @Override
        public void onActivityPaused(Activity activity) {

        }

        @Override
        public void onActivityStopped(Activity activity) {

        }

        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

        }

        @Override
        public void onActivityDestroyed(Activity activity) {

        }
    };
}
