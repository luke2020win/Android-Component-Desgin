package com.freebank.login.net.resp;

import java.io.Serializable;

public class LoginResp implements Serializable {
    //aes加密key
    private String aes_key;
    private String access_token;
    private String access_token_expires;
    private String refresh_token;
    private String refresh_token_expires;

    public String getAes_key() {
        return aes_key;
    }

    public void setAes_key(String aes_key) {
        this.aes_key = aes_key;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAccess_token_expires() {
        return access_token_expires;
    }

    public void setAccess_token_expires(String access_token_expires) {
        this.access_token_expires = access_token_expires;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getRefresh_token_expires() {
        return refresh_token_expires;
    }

    public void setRefresh_token_expires(String refresh_token_expires) {
        this.refresh_token_expires = refresh_token_expires;
    }
}
