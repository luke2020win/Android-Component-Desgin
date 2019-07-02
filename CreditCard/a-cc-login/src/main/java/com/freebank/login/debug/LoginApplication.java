package com.freebank.login.debug;

import com.freebank.framework.base.BaseApplication;
import com.freebank.login.BuildConfig;


/**
 *
 */

public class LoginApplication extends BaseApplication {

    @Override
    public void onCreate() {
        setDebug(BuildConfig.IS_DEBUG);
        super.onCreate();
    }
}
