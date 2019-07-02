package com.freebank.login.net;

public interface UrlConfig {
    /**********************登陆相关接口****************************************/
    // 获取验证码
    String GET_VERIFY_CODE = "/v1.1/login/sendSmsCaptcha";
    // 用户注册、验证码登陆
    String REGISTER_AND_LOGIN = "/v1.1/login//loginAndRegist";
    // 用户密码登录
    String LOGIN = "/v1.1/login/passwordLogin";
    // 用户登出
    String LOGOUT = "/v1.1/login/logout";
}
