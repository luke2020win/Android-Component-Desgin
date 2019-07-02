package com.freebank.login.login;


import com.freebank.framework.base.BasePresenter;
import com.freebank.framework.base.BaseView;

public interface LoginContract {

    interface View extends BaseView {
        void loginSuccess();

        void loginFail(String message);
    }

    interface Presenter extends BasePresenter<View> {
        void login(final String username, final String password);
    }
}
