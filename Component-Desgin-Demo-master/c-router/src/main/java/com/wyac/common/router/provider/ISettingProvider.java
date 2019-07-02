package com.wyac.common.router.provider;

import android.app.Activity;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * setting界面的路由接口
 */

public interface ISettingProvider extends IProvider {
    void goToSetting(Activity activity);
}
