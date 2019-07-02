package com.freebank.login.net;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by z_fugui on 2017/8/16.
 */

public class UserInfo implements Serializable {

    // 非VIP
    public static final int TYPE_NO_VIP = 0;
    // 注册用户
    public static final int TYPE_USER_REGISTER = 0;
    // 基础用户
    public static final int TYPE_USER_BASIC = 1;
    // 认证用户
    public static final int TYPE_USER_IDENTITY = 2;

    // 用户ID
    private String userId;
    // 身份证姓名
    @SerializedName("idCardName")
    private String idCardName;
    //身份证号
    @SerializedName("idCardNumber")
    private String idCardNumber;
    // 用户手机号
    @SerializedName("phone")
    private String phone;
    // 头像地址
    @SerializedName("avatarUrl")
    private String avatarUrl;
    //用户类型 0-注册用户 1-认证用户 2-实名用户'
    @SerializedName("usertype")
    private int userType;
    //会员类型 0-非会员 1-一个月会员 2-二个月会员 以此类推
    @SerializedName("membertype")
    private int memberType;
    // 邀请者用户手机号
    private String inviterUserPhone;
    //省（住址地）
    private int locationProvince;
    //市（住址地）
    private int locationCity;
    //区（住址地）
    private int locationArea;
    //详细住址
    private String address;
    // 绑定的信用数量
    private int creditCardCount;
    // 绑定的储蓄卡数量
    private int debitCardCount;
    // 个人分享连接
    @SerializedName("shareUrl")
    private String personalShareUrl;
    //token
    @SerializedName("token")
    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getDebitCardCount() {
        return debitCardCount;
    }

    public void setDebitCardCount(int debitCardCount) {
        this.debitCardCount = debitCardCount;
    }

    public String getPersonalShareUrl() {
        return personalShareUrl;
    }

    public void setPersonalShareUrl(String personalShareUrl) {
        this.personalShareUrl = personalShareUrl;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdCardName() {
        return idCardName;
    }

    public void setIdCardName(String idCardName) {
        this.idCardName = idCardName;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public int getMemberType() {
        return memberType;
    }

    public void setMemberType(int memberType) {
        this.memberType = memberType;
    }

    public String getInviterUserPhone() {
        return inviterUserPhone;
    }

    public void setInviterUserPhone(String inviterUserPhone) {
        this.inviterUserPhone = inviterUserPhone;
    }

    public int getLocationProvince() {
        return locationProvince;
    }

    public void setLocationProvince(int locationProvince) {
        this.locationProvince = locationProvince;
    }

    public int getLocationCity() {
        return locationCity;
    }

    public void setLocationCity(int locationCity) {
        this.locationCity = locationCity;
    }

    public int getLocationArea() {
        return locationArea;
    }

    public void setLocationArea(int locationArea) {
        this.locationArea = locationArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCardCount() {
        return creditCardCount;
    }

    public void setCreditCardCount(int creditCardCount) {
        this.creditCardCount = creditCardCount;
    }
}
