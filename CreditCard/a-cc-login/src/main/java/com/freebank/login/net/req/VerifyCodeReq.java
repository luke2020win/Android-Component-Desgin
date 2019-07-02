package com.freebank.login.net.req;

import java.io.Serializable;

public class VerifyCodeReq implements Serializable {
    private String phone;

    public VerifyCodeReq() {
    }

    public VerifyCodeReq(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
