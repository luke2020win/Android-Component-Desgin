package com.freebank.login.net.req;

import java.io.Serializable;

public class RegisterReq implements Serializable {
    private String username;
    private String password;
    private String verify_code;  //验证码
    private String inviter_code;  //邀请码

    public RegisterReq() {
    }

    public RegisterReq(String username, String password, String verifyCode) {
        this.username = username;
        this.password = password;
        this.verify_code = verifyCode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyCode() {
        return verify_code;
    }

    public void setVerifyCode(String verifyCode) {
        this.verify_code = verifyCode;
    }

    public String getInviter_code() {
        return inviter_code;
    }

    public void setInviter_code(String inviter_code) {
        this.inviter_code = inviter_code;
    }
}
