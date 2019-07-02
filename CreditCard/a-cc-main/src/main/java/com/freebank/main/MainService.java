package com.freebank.main;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.freebank.common.utils.LogUtils;
import com.freebank.main.main.MainActivity;
import com.freebank.router.RouterPath;
import com.freebank.router.provider.IMainProvider;

/**
 *
 */

@Route(path = RouterPath.ROUTER_PATH_TO_MAIN_SERVICE, name = "主页面")
public class MainService implements IMainProvider {

    private static final String TAG = MainService.class.getSimpleName();

    @Override
    public void init(Context context) {}


    @Override
    public void goToMain(Activity activity) {
        LogUtils.d(TAG,"goToMain");
        Intent intent = new Intent(activity, MainActivity.class);
        activity.startActivity(intent);
    }
}
