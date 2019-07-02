package com.wyac.xhn.login;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.wyac.common.router.RouterPath;
import com.wyac.common.router.provider.ILoginProvider;
import com.wyac.xhn.login.views.LoginActivity;

/**
 *
 */

@Route(path = RouterPath.ROUTER_PATH_TO_LOGIN_SERVICE, name = "登陆页面")
public class LoginService implements ILoginProvider {
    @Override
    public void init(Context context) {}


    @Override
    public void goToLogin(Activity activity) {
        Intent loginIntent = new Intent(activity, LoginActivity.class);
        activity.startActivity(loginIntent);
    }
}
