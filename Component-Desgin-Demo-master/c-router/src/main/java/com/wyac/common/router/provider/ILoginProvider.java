package com.wyac.common.router.provider;

import android.app.Activity;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 登陆界面的路由接口
 */

public interface ILoginProvider extends IProvider {
    void goToLogin(Activity activity);
}
