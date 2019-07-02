package com.freebank.login.net.req;

import java.io.Serializable;


public class LoginReq implements Serializable {
    private String username;
    private String password;

    public LoginReq() {
    }

    public LoginReq(String phone, String password) {
        this.username = phone;
        this.password = password;
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
}
