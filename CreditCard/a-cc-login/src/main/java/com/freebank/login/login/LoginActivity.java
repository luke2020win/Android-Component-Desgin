package com.freebank.login.login;

import android.content.Intent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;

import com.alibaba.android.arouter.launcher.ARouter;
import com.freebank.common.utils.LogUtils;
import com.freebank.common.utils.StringUtils;
import com.freebank.common.utils.ToastUtils;
import com.freebank.common.utils.Validator;
import com.freebank.framework.base.BaseActivity;
import com.freebank.login.R;
import com.freebank.login.R2;
import com.freebank.login.register.RegisterActivity;
import com.freebank.router.RouterPath;
import com.freebank.router.provider.IMainProvider;

import butterknife.BindView;
import butterknife.OnClick;


public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View{
    private static final String TAG = "LoginActivity";

    @Override
    protected int setContentView() {
        return R.layout.activity_login;
    }

    @Override
    protected void init() {
        mPresenter.init(this);
    }

    @BindView(R2.id.actv_usename)
    AutoCompleteTextView mActvUsename;

    @BindView(R2.id.et_password)
    EditText mEtPassword;

    @OnClick(R2.id.btn_login_in)
    public void login() {

        gotoMain();

        LogUtils.d(TAG, "login");
        mActvUsename.setError(null);
        mEtPassword.setError(null);

        boolean cancel = false;
        View focusView = null;

        String username = mActvUsename.getText().toString();
        String password = mEtPassword.getText().toString();

        if (StringUtils.isEmpty(username)) {
            LogUtils.d(TAG, "login username is Empty ");
            mActvUsename.setError(getString(R.string.error_username_required));
            focusView = mActvUsename;
            cancel = true;
        }

        if (StringUtils.isEmpty(password)) {
            LogUtils.d(TAG, "login password is Empty");
            mEtPassword.setError(getString(R.string.error_password_required));
            focusView = mEtPassword;
            cancel = true;
        }
        else if (!StringUtils.isEmpty(password) && !Validator.isPassword(password)) {
            LogUtils.d(TAG, "login password is inValidate,password:"+password);
            mEtPassword.setError(getString(R.string.error_invalid_password));
            focusView = mEtPassword;
            cancel = true;
        }

        LogUtils.d(TAG, "login2");
        if(cancel) {
            LogUtils.d(TAG, "login focusView requestFocus");
            focusView.requestFocus();
        }
        else {
            LogUtils.d(TAG, "login getPermissions");
        }
        LogUtils.d(TAG, "login complete");
    }

    @OnClick(R2.id.btn_register)
    public void register() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @OnClick(R2.id.btn_forget_password)
    public void forgetPassword() {
        gotoMain();
    }


    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.d(TAG,"onStart");
        //TODO:自动登陆
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    public void loginSuccess() {
        gotoMain();
    }

    @Override
    public void loginFail(String message) {
        ToastUtils.showShort(this, message);
    }

    private void gotoMain() {
        IMainProvider mainService = (IMainProvider) ARouter.getInstance().build(RouterPath.ROUTER_PATH_TO_MAIN_SERVICE).navigation();
        if(mainService != null){
            mainService.goToMain(LoginActivity.this);
            finish();
        }
    }
}
