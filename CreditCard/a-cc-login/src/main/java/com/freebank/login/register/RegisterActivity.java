package com.freebank.login.register;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.alibaba.android.arouter.launcher.ARouter;
import com.freebank.common.utils.LogUtils;
import com.freebank.framework.base.BaseActivity;
import com.freebank.login.R;
import com.freebank.login.R2;
import com.freebank.router.RouterPath;
import com.freebank.router.provider.IMainProvider;
import com.trello.rxlifecycle.LifecycleTransformer;

import butterknife.BindView;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity<RegisterPresenter> implements RegisterContract.View{
    private static final String TAG = "RegisterActivity";

    @Override
    protected int setContentView() {
        return R.layout.activity_register;
    }

    @Override
    protected void init() {
        mPresenter.init(this);

    }

    @BindView(R2.id.actv_usename)
    AutoCompleteTextView mActvUsername;

    @BindView(R2.id.actv_verify_code)
    AutoCompleteTextView mActvVerifyCode;

    @BindView(R2.id.et_password)
    EditText mEtPassword;

    @BindView(R2.id.et_certain_password)
    EditText mEtCertianPassword;

    @OnClick(R2.id.btn_register)
    public void register() {
        LogUtils.d(TAG, "register");
        mActvUsername.setError(null);
        mEtPassword.setError(null);

        boolean cancel = false;
        View focusView = null;

        String username = mActvUsername.getText().toString();
        String password = mEtPassword.getText().toString();
        String verifyCode = mActvVerifyCode.getText().toString();
        String certainPassword = mEtCertianPassword.getText().toString();

        if (TextUtils.isEmpty(username)) {
            LogUtils.d(TAG, "register username is Empty ");
            mActvUsername.setError(getString(R.string.error_username_required));
            focusView = mActvUsername;
            cancel = true;
        }

        if (TextUtils.isEmpty(verifyCode)) {
            LogUtils.d(TAG, "register verifyCode is Empty ");
            mActvVerifyCode.setError(getString(R.string.error_verifycode_required));
            focusView = mActvVerifyCode;
            cancel = true;
        }

        if (TextUtils.isEmpty(password)) {
            LogUtils.d(TAG, "register password is Empty");
            mEtPassword.setError(getString(R.string.error_password_required));
            focusView = mEtPassword;
            cancel = true;
        }

        if (TextUtils.isEmpty(certainPassword)) {
            LogUtils.d(TAG, "register certainPassword is Empty");
            mEtCertianPassword.setError(getString(R.string.error_password_required));
            focusView = mEtCertianPassword;
            cancel = true;
        }
        else if (!certainPassword.equals(password)) {
            LogUtils.d(TAG, "register certainPassword not equal password, certainPassword"+certainPassword);
            mEtCertianPassword.setError(getString(R.string.error_two_password_not_equals));
            focusView = mEtCertianPassword;
            cancel = true;
        }

        if(cancel) {
            LogUtils.d(TAG, "register focusView requestFocus");
            focusView.requestFocus();
        }
        else {
            mPresenter.register(username, password, verifyCode);
        }
        LogUtils.d(TAG, "register complete");
    }

    @OnClick(R2.id.btn_verify_code)
    public void getVerifyCode() {
        LogUtils.d(TAG, "getVerifyCode");
        mActvUsername.setError(null);

        boolean cancel = false;
        View focusView = null;

        String username = mActvUsername.getText().toString();

        if (TextUtils.isEmpty(username)) {
            LogUtils.d(TAG, "getVerifyCode username is Empty ");
            mActvUsername.setError(getString(R.string.error_username_required));
            focusView = mActvUsername;
            cancel = true;
        }

        if(cancel) {
            LogUtils.d(TAG, "getVerifyCode focusView requestFocus");
            focusView.requestFocus();
        }
        else {
            mPresenter.getVerifyCode(username);
        }
        LogUtils.d(TAG, "getVerifyCode complete");
    }

    @OnClick(R2.id.btn_user_agreement)
    public void getUserAgreement() {
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 设置titlebar
        mTitleBar.setContentView(findViewById(R.id.layout_toolbar), true, R.string.str_register);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public void registerSuccess() {
        gotoMain();
    }

    @Override
    public void registerFail(String message) {

    }

    @Override
    public void getVerifyCodeSuccess() {

    }

    @Override
    public void getVerifyCodeFail(String message) {

    }


    private void gotoMain() {
        IMainProvider mainService = (IMainProvider) ARouter.getInstance().build(RouterPath.ROUTER_PATH_TO_MAIN_SERVICE).navigation();
        if(mainService != null){
            mainService.goToMain(RegisterActivity.this);
            finish();
        }
    }

    @Override
    public <T> LifecycleTransformer<T> bindToLifecycle() {
        return null;
    }
}
