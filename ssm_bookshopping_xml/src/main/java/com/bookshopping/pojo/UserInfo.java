package com.bookshopping.pojo;

import java.io.Serializable;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/10 0010 16:55
 * @Description:
 */
public class UserInfo implements Serializable {
    private String userNo;
    private String userEmail;
    private String userName;
    private String userPass;
    private int userSex;
    private String userPhone;
    private String userChoose;
    private String userDa;
    private String userBei;
    private int userStatus;
    private String userHeaderImg;

    public UserInfo(String userNo, String userEmail, String userName, String userPass, int userSex, String userPhone, String userChoose, String userDa, String userBei, int userStatus, String userHeaderImg) {
        this.userNo = userNo;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPass = userPass;
        this.userSex = userSex;
        this.userPhone = userPhone;
        this.userChoose = userChoose;
        this.userDa = userDa;
        this.userBei = userBei;
        this.userStatus = userStatus;
        this.userHeaderImg = userHeaderImg;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userNo='" + userNo + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userSex=" + userSex +
                ", userPhone='" + userPhone + '\'' +
                ", userChoose='" + userChoose + '\'' +
                ", userDa='" + userDa + '\'' +
                ", userBei='" + userBei + '\'' +
                ", userStatus=" + userStatus +
                ", userHeaderImg='" + userHeaderImg + '\'' +
                '}';
    }

    public UserInfo() {
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserChoose() {
        return userChoose;
    }

    public void setUserChoose(String userChoose) {
        this.userChoose = userChoose;
    }

    public String getUserDa() {
        return userDa;
    }

    public void setUserDa(String userDa) {
        this.userDa = userDa;
    }

    public String getUserBei() {
        return userBei;
    }

    public void setUserBei(String userBei) {
        this.userBei = userBei;
    }

    public int getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(int userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserHeaderImg() {
        return userHeaderImg;
    }

    public void setUserHeaderImg(String userHeaderImg) {
        this.userHeaderImg = userHeaderImg;
    }

    public UserInfo(String userName, String userPass) {
        this.userName = userName;
        this.userPass = userPass;
    }
}
