package com.freebank.login.login;


import com.freebank.common.utils.JsonUtils;
import com.freebank.common.utils.LogUtils;
import com.freebank.login.net.RxPresenter;
import com.freebank.login.net.UserInfo;
import com.freebank.login.net.req.LoginReq;
import com.freebank.network.http.retrofit.ApiException;
import com.freebank.network.http.retrofit.HttpSubscriber;
import com.freebank.network.http.retrofit.RxHelper;

public class LoginPresenter extends RxPresenter<LoginContract.View> implements  LoginContract.Presenter {
    private static final String TAG = "LoginPresenter";

    @Override
    public void login(final String username, final String password) {
        LogUtils.d(TAG, "login username:" + username+" password:"+password);

        LoginReq loginReq = new LoginReq();
        loginReq.setUsername(username);
        loginReq.setPassword(password);
        LogUtils.d(TAG, "login loginReq:" + JsonUtils.serialize(loginReq));

        addSubscribe(mHttpApi.login(loginReq)
                .compose(RxHelper.transformWithLoading(mView))
                .compose(RxHelper.handleData()).subscribe(
                        new HttpSubscriber<UserInfo>() {

                            @Override
                            public void onSuccess(UserInfo userInfo) {

                            }

                            @Override
                            public void onError(ApiException e) {
                                mView.showToast(e.getMessage());
                            }
                        }
                ));
    }
}
