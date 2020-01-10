package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 分拣入库
 */
public class PutInStorage {
    /**
     * 分拣入库编号
     */
    private String pisNo;
    /**
     * 入库交接单号
     */
    private String pisReceiptNumber;
    /**
     * 接货时间
     */
    private Date pisPickTime;
    /**
     * 接货人
     */
    private String pisMasterPorter;
    /**
     * 接收单位
     */
    private String pisReceiver;
    /**
     * 发货人
     */
    private String pisConsigner;
    /**
     * 发货单位
     */
    private String pisForwUnit;
    /**
     * 仓库编号
     */
    private String pisWareNo;
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

    public PutInStorage() {
    }

    public PutInStorage(String pisNo, String pisReceiptNumber, Date pisPickTime, String pisMasterPorter, String pisReceiver, String pisConsigner, String pisForwUnit, String pisWareNo, String duo1, String duo2, String duo3) {
        this.pisNo = pisNo;
        this.pisReceiptNumber = pisReceiptNumber;
        this.pisPickTime = pisPickTime;
        this.pisMasterPorter = pisMasterPorter;
        this.pisReceiver = pisReceiver;
        this.pisConsigner = pisConsigner;
        this.pisForwUnit = pisForwUnit;
        this.pisWareNo = pisWareNo;
        this.duo1 = duo1;
        this.duo2 = duo2;
        this.duo3 = duo3;
    }

    @Override
    public String toString() {
        return "PutInStorage{" +
                "pisNo='" + pisNo + '\'' +
                ", pisReceiptNumber='" + pisReceiptNumber + '\'' +
                ", pisPickTime=" + pisPickTime +
                ", pisMasterPorter='" + pisMasterPorter + '\'' +
                ", pisReceiver='" + pisReceiver + '\'' +
                ", pisConsigner='" + pisConsigner + '\'' +
                ", pisForwUnit='" + pisForwUnit + '\'' +
                ", pisWareNo='" + pisWareNo + '\'' +
                ", duo1='" + duo1 + '\'' +
                ", duo2='" + duo2 + '\'' +
                ", duo3='" + duo3 + '\'' +
                '}';
    }

    public String getPisNo() {
        return pisNo;
    }

    public void setPisNo(String pisNo) {
        this.pisNo = pisNo;
    }

    public String getPisReceiptNumber() {
        return pisReceiptNumber;
    }

    public void setPisReceiptNumber(String pisReceiptNumber) {
        this.pisReceiptNumber = pisReceiptNumber;
    }

    public Date getPisPickTime() {
        return pisPickTime;
    }

    public void setPisPickTime(Date pisPickTime) {
        this.pisPickTime = pisPickTime;
    }

    public String getPisMasterPorter() {
        return pisMasterPorter;
    }

    public void setPisMasterPorter(String pisMasterPorter) {
        this.pisMasterPorter = pisMasterPorter;
    }

    public String getPisReceiver() {
        return pisReceiver;
    }

    public void setPisReceiver(String pisReceiver) {
        this.pisReceiver = pisReceiver;
    }

    public String getPisConsigner() {
        return pisConsigner;
    }

    public void setPisConsigner(String pisConsigner) {
        this.pisConsigner = pisConsigner;
    }

    public String getPisForwUnit() {
        return pisForwUnit;
    }

    public void setPisForwUnit(String pisForwUnit) {
        this.pisForwUnit = pisForwUnit;
    }

    public String getPisWareNo() {
        return pisWareNo;
    }

    public void setPisWareNo(String pisWareNo) {
        this.pisWareNo = pisWareNo;
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