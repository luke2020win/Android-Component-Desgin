package com.freebank.login.register;

import com.freebank.framework.base.BasePresenter;
import com.freebank.framework.base.BaseView;

public interface RegisterContract {

    interface View extends BaseView {
        void registerSuccess();

        void registerFail(String message);

        void getVerifyCodeSuccess();

        void getVerifyCodeFail(String message);
    }

    interface Presenter extends BasePresenter<RegisterContract.View> {

        void register(final String username, final String password, final String verifyCode);

        void getVerifyCode(final String username);
    }
}
