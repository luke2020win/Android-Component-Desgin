package com.freebank.main.debug;

import com.freebank.framework.base.BaseApplication;
import com.freebank.main.BuildConfig;


/**
 * Created by chenran3 on 2017/12/7.
 */

public class MainApplication extends BaseApplication {

    @Override
    public void onCreate() {
        setDebug(BuildConfig.IS_DEBUG);
        super.onCreate();
    }
}
