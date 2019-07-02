package com.wuac.xhn.demo;

import android.content.res.Configuration;

import com.alibaba.android.arouter.launcher.ARouter;
import com.wyac.common.framework.base.BaseApplication;
import com.wyac.common.logmanager.EFLog;


public class FrameApplication extends BaseApplication {

    private static final String TAG = FrameApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        init();
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

    private void init(){
        //日志显示开关
        EFLog.enableLog2Console(BuildConfig.DEBUG);

        if (BuildConfig.DEBUG) {
            //开启InstantRun之后，一定要在ARouter.init之前调用openDebug
            ARouter.openDebug();
            ARouter.openLog();
        }
        ARouter.init(BaseApplication.getInstance());
    }
}
