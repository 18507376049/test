package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 合包明细
 */
public class OrPackageDesc {
    /**
     * 合包明细号
     */
    private String ordPackageNo;
    /**
     * 工作单单号
     */
    private String ordOdd;
    /**
     * 重量
     */
    private double ordWeight;
    /**
     * 体积
     */
    private double ordV;
    /**
     * 件数
     */
    private int ordNumber;
    /**
     * 品名
     */
    private String ordName;
    /**
     * 状态
     */
    private int ordStatus = 0;
    /**
     * 到达地
     */
    private String ordAddress;
    /**
     * 到达时限
     */
    private Date ordDeliveryTime;
    /**
     * 合包单号
     */
    private String ordOrpPackageNo;
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

    public OrPackageDesc() {
    }

    public OrPackageDesc(String ordPackageNo, String ordOdd, double ordWeight, double ordV, int ordNumber, String ordName, int ordStatus, String ordAddress, Date ordDeliveryTime, String ordOrpPackageNo, String duo1, String duo2, String duo3) {
        this.ordPackageNo = ordPackageNo;
        this.ordOdd = ordOdd;
        this.ordWeight = ordWeight;
        this.ordV = ordV;
        this.ordNumber = ordNumber;
        this.ordName = ordName;
        this.ordStatus = ordStatus;
        this.ordAddress = ordAddress;
        this.ordDeliveryTime = ordDeliveryTime;
        this.ordOrpPackageNo = ordOrpPackageNo;
        this.duo1 = duo1;
        this.duo2 = duo2;
        this.duo3 = duo3;
    }

    @Override
    public String toString() {
        return "OrPackageDesc{" +
                "ordPackageNo='" + ordPackageNo + '\'' +
                ", ordOdd='" + ordOdd + '\'' +
                ", ordWeight=" + ordWeight +
                ", ordV=" + ordV +
                ", ordNumber=" + ordNumber +
                ", ordName='" + ordName + '\'' +
                ", ordStatus=" + ordStatus +
                ", ordAddress='" + ordAddress + '\'' +
                ", ordDeliveryTime=" + ordDeliveryTime +
                ", ordOrpPackageNo='" + ordOrpPackageNo + '\'' +
                ", duo1='" + duo1 + '\'' +
                ", duo2='" + duo2 + '\'' +
                ", duo3='" + duo3 + '\'' +
                '}';
    }

    public String getOrdPackageNo() {
        return ordPackageNo;
    }

    public void setOrdPackageNo(String ordPackageNo) {
        this.ordPackageNo = ordPackageNo;
    }

    public String getOrdOdd() {
        return ordOdd;
    }

    public void setOrdOdd(String ordOdd) {
        this.ordOdd = ordOdd;
    }

    public double getOrdWeight() {
        return ordWeight;
    }

    public void setOrdWeight(double ordWeight) {
        this.ordWeight = ordWeight;
    }

    public double getOrdV() {
        return ordV;
    }

    public void setOrdV(double ordV) {
        this.ordV = ordV;
    }

    public int getOrdNumber() {
        return ordNumber;
    }

    public void setOrdNumber(int ordNumber) {
        this.ordNumber = ordNumber;
    }

    public String getOrdName() {
        return ordName;
    }

    public void setOrdName(String ordName) {
        this.ordName = ordName;
    }

    public int getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(int ordStatus) {
        this.ordStatus = ordStatus;
    }

    public String getOrdAddress() {
        return ordAddress;
    }

    public void setOrdAddress(String ordAddress) {
        this.ordAddress = ordAddress;
    }

    public Date getOrdDeliveryTime() {
        return ordDeliveryTime;
    }

    public void setOrdDeliveryTime(Date ordDeliveryTime) {
        this.ordDeliveryTime = ordDeliveryTime;
    }

    public String getOrdOrpPackageNo() {
        return ordOrpPackageNo;
    }

    public void setOrdOrpPackageNo(String ordOrpPackageNo) {
        this.ordOrpPackageNo = ordOrpPackageNo;
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