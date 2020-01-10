package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 收派标准
 */
public class Pick {
    /**
     * 收派标准编号
     */
    private String picNo;
    /**
     * 收派标准名称
     */
    private String picName;
    /**
     * 最小重量
     */
    private double picMinWe;
    /**
     * 最大重量
     */
    private double picMaxWe;
    /**
     * 最小长度
     */
    private int picMinLe;
    /**
     * 最大长度
     */
    private int picMaxLe;
    /**
     * 费用
     */
    private double picPrice;
    /**
     * 作废标志
     */
    private int picSign = 0;
    /**
     * 派送人员
     */
    private String picEmployeeNo;
    /**
     * 操作单位
     */
    private String picUnitNo;
    /**
     * 操作时间
     */
    private Date picTime;
    /**
     * 开单人
     */
    private String picKaiEmploNo;
    /**
     *
     * */
    private String duo1;
    /**
     *
     * */
    private String duo2;
    /**
     *
     * */
    private String duo3;

    public Pick() {
    }

    public Pick(String picNo, String picName, double picMinWe, double picMaxWe, int picMinLe, int picMaxLe, double picPrice, int picSign, String picEmployeeNo, String picUnitNo, Date picTime, String picKaiEmploNo, String duo1, String duo2, String duo3) {
        this.picNo = picNo;
        this.picName = picName;
        this.picMinWe = picMinWe;
        this.picMaxWe = picMaxWe;
        this.picMinLe = picMinLe;
        this.picMaxLe = picMaxLe;
        this.picPrice = picPrice;
        this.picSign = picSign;
        this.picEmployeeNo = picEmployeeNo;
        this.picUnitNo = picUnitNo;
        this.picTime = picTime;
        this.picKaiEmploNo = picKaiEmploNo;
        this.duo1 = duo1;
        this.duo2 = duo2;
        this.duo3 = duo3;
    }

    @Override
    public String toString() {
        return "Pick{" +
                "picNo='" + picNo + '\'' +
                ", picName='" + picName + '\'' +
                ", picMinWe=" + picMinWe +
                ", picMaxWe=" + picMaxWe +
                ", picMinLe=" + picMinLe +
                ", picMaxLe=" + picMaxLe +
                ", picPrice=" + picPrice +
                ", picSign=" + picSign +
                ", picEmployeeNo='" + picEmployeeNo + '\'' +
                ", picUnitNo='" + picUnitNo + '\'' +
                ", picTime=" + picTime +
                ", picKaiEmploNo='" + picKaiEmploNo + '\'' +
                ", duo1='" + duo1 + '\'' +
                ", duo2='" + duo2 + '\'' +
                ", duo3='" + duo3 + '\'' +
                '}';
    }

    public String getPicNo() {
        return picNo;
    }

    public void setPicNo(String picNo) {
        this.picNo = picNo;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName;
    }

    public double getPicMinWe() {
        return picMinWe;
    }

    public void setPicMinWe(double picMinWe) {
        this.picMinWe = picMinWe;
    }

    public double getPicMaxWe() {
        return picMaxWe;
    }

    public void setPicMaxWe(double picMaxWe) {
        this.picMaxWe = picMaxWe;
    }

    public int getPicMinLe() {
        return picMinLe;
    }

    public void setPicMinLe(int picMinLe) {
        this.picMinLe = picMinLe;
    }

    public int getPicMaxLe() {
        return picMaxLe;
    }

    public void setPicMaxLe(int picMaxLe) {
        this.picMaxLe = picMaxLe;
    }

    public double getPicPrice() {
        return picPrice;
    }

    public void setPicPrice(double picPrice) {
        this.picPrice = picPrice;
    }

    public int getPicSign() {
        return picSign;
    }

    public void setPicSign(int picSign) {
        this.picSign = picSign;
    }

    public String getPicEmployeeNo() {
        return picEmployeeNo;
    }

    public void setPicEmployeeNo(String picEmployeeNo) {
        this.picEmployeeNo = picEmployeeNo;
    }

    public String getPicUnitNo() {
        return picUnitNo;
    }

    public void setPicUnitNo(String picUnitNo) {
        this.picUnitNo = picUnitNo;
    }

    public Date getPicTime() {
        return picTime;
    }

    public void setPicTime(Date picTime) {
        this.picTime = picTime;
    }

    public String getPicKaiEmploNo() {
        return picKaiEmploNo;
    }

    public void setPicKaiEmploNo(String picKaiEmploNo) {
        this.picKaiEmploNo = picKaiEmploNo;
    }

    public String getDuo1() {
        return duo1;
    }

    public void setDuo1(String duo1) {
        this.duo1 = duo1;
    }

    public String getDuo2() {
        return duo2;
    }

    public void setDuo2(String duo2) {
        this.duo2 = duo2;
    }

    public String getDuo3() {
        return duo3;
    }

    public void setDuo3(String duo3) {
        this.duo3 = duo3;
    }
}