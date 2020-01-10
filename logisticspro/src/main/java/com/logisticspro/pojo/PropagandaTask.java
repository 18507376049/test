package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 宣传
 */
public class PropagandaTask {
    /**
     * 宣传编号
     */
    private String prtNo;
    /**
     * 宣传概要
     */
    private String prtPubliOutline;
    /**
     * 发布时间
     */
    private Date prtReleaseDate;
    /**
     * 失效时间
     */
    private Date prtExpiryDate;
    /**
     * 更新时间
     */
    private Date prtUpdateDate;
    /**
     * 更新单位
     */
    private String prtUpdateUnit;
    /**
     * 更新人
     */
    private String prtUpdateEmplNo;
    /**
     * 状态
     */
    private int prtStatus;
    /**
     * 宣传内容
     */
    private String promotionContent;
    /**
     *
     * */
    private String dou1;
    /**
     *
     * */
    private String dou2;

    public PropagandaTask() {
    }

    public PropagandaTask(String prtNo, String prtPubliOutline, Date prtReleaseDate, Date prtExpiryDate, Date prtUpdateDate, String prtUpdateUnit, String prtUpdateEmplNo, int prtStatus, String promotionContent, String dou1, String dou2) {
        this.prtNo = prtNo;
        this.prtPubliOutline = prtPubliOutline;
        this.prtReleaseDate = prtReleaseDate;
        this.prtExpiryDate = prtExpiryDate;
        this.prtUpdateDate = prtUpdateDate;
        this.prtUpdateUnit = prtUpdateUnit;
        this.prtUpdateEmplNo = prtUpdateEmplNo;
        this.prtStatus = prtStatus;
        this.promotionContent = promotionContent;
        this.dou1 = dou1;
        this.dou2 = dou2;
    }

    @Override
    public String toString() {
        return "PropagandaTask{" +
                "prtNo='" + prtNo + '\'' +
                ", prtPubliOutline='" + prtPubliOutline + '\'' +
                ", prtReleaseDate=" + prtReleaseDate +
                ", prtExpiryDate=" + prtExpiryDate +
                ", prtUpdateDate=" + prtUpdateDate +
                ", prtUpdateUnit='" + prtUpdateUnit + '\'' +
                ", prtUpdateEmplNo='" + prtUpdateEmplNo + '\'' +
                ", prtStatus=" + prtStatus +
                ", promotionContent='" + promotionContent + '\'' +
                ", dou1='" + dou1 + '\'' +
                ", dou2='" + dou2 + '\'' +
                '}';
    }

    public String getPrtNo() {
        return prtNo;
    }

    public void setPrtNo(String prtNo) {
        this.prtNo = prtNo;
    }

    public String getPrtPubliOutline() {
        return prtPubliOutline;
    }

    public void setPrtPubliOutline(String prtPubliOutline) {
        this.prtPubliOutline = prtPubliOutline;
    }

    public Date getPrtReleaseDate() {
        return prtReleaseDate;
    }

    public void setPrtReleaseDate(Date prtReleaseDate) {
        this.prtReleaseDate = prtReleaseDate;
    }

    public Date getPrtExpiryDate() {
        return prtExpiryDate;
    }

    public void setPrtExpiryDate(Date prtExpiryDate) {
        this.prtExpiryDate = prtExpiryDate;
    }

    public Date getPrtUpdateDate() {
        return prtUpdateDate;
    }

    public void setPrtUpdateDate(Date prtUpdateDate) {
        this.prtUpdateDate = prtUpdateDate;
    }

    public String getPrtUpdateUnit() {
        return prtUpdateUnit;
    }

    public void setPrtUpdateUnit(String prtUpdateUnit) {
        this.prtUpdateUnit = prtUpdateUnit;
    }

    public String getPrtUpdateEmplNo() {
        return prtUpdateEmplNo;
    }

    public void setPrtUpdateEmplNo(String prtUpdateEmplNo) {
        this.prtUpdateEmplNo = prtUpdateEmplNo;
    }

    public int getPrtStatus() {
        return prtStatus;
    }

    public void setPrtStatus(int prtStatus) {
        this.prtStatus = prtStatus;
    }

    public String getPromotionContent() {
        return promotionContent;
    }

    public void setPromotionContent(String promotionContent) {
        this.promotionContent = promotionContent;
    }

    public String getDou1() {
        return dou1;
    }

    public void setDou1(String dou1) {
        this.dou1 = dou1;
    }

    public String getDou2() {
        return dou2;
    }

    public void setDou2(String dou2) {
        this.dou2 = dou2;
    }
}