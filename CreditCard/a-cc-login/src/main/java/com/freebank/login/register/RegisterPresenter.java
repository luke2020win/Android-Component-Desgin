package com.freebank.login.register;


public class RegisterPresenter implements RegisterContract.Presenter {
    private static final String TAG = "RegisterPresenter";

    protected RegisterContract.View mRegisterView;

    @Override
    public void register(final String username, final String password, final String verifyCode) {

    }

    @Override
    public void getVerifyCode(String username) {

    }


    @Override
    public void init(RegisterContract.View view) {
        mRegisterView= view;
    }

    @Override
    public void onDestroy() {
        mRegisterView = null;
    }
}
