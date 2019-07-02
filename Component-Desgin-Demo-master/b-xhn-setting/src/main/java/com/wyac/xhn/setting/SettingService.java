package com.wyac.xhn.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wyac.common.router.RouterPath;
import com.wyac.common.router.provider.ISettingProvider;
import com.wyac.xhn.setting.views.SettingActivity;

/**
 *
 */

@Route(path = RouterPath.ROUTER_PATH_TO_SETTING_SERVICE, name = "设置页面")
public class SettingService implements ISettingProvider {
    @Override
    public void init(Context context) {}
    

    @Override
    public void goToSetting(Activity activity) {
        Intent loginIntent = new Intent(activity, SettingActivity.class);
        activity.startActivity(loginIntent);
    }
}
