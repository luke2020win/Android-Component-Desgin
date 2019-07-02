package com.freebank.login.net;

import com.freebank.login.net.req.LoginReq;
import com.freebank.login.net.req.RegisterReq;
import com.freebank.login.net.req.VerifyCodeReq;
import com.freebank.network.http.retrofit.BaseReq;
import com.freebank.network.http.retrofit.BaseResp;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;


public interface HttpApi {
    // 获取证码
    @POST(UrlConfig.GET_VERIFY_CODE)
    Observable<BaseResp<Object>> getVerifyCode(@Body VerifyCodeReq request);

    // 用户注册、验证码登陆
    @POST(UrlConfig.REGISTER_AND_LOGIN)
    Observable<BaseResp<UserInfo>> register(@Body RegisterReq request);

    //登录
    @POST(UrlConfig.LOGIN)
    Observable<BaseResp<UserInfo>> login(@Body LoginReq request);

    //登录
    @POST(UrlConfig.LOGOUT)
    Observable<BaseResp<Object>> logout(@Body BaseReq request);
}
