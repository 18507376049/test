package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 基础档案明细
 */
public class RecDesc {
    /**
     * 基础档案明细编号
     */
    private String redNo;
    /**
     * 基础档案明细名称
     */
    private String redName;
    /**
     * 上级编码
     */
    private String redRecNo;
    /**
     * 助记码
     */
    private String redMnemonic;
    /**
     * 封存标志
     */
    private int redSign = 0;
    /**
     * 备注
     */
    private String redComment;
    /**
     * 操作人员
     */
    private String redEmployeeNo;
    /**
     * 操作单位
     */
    private String redUnitNo;
    /**
     * 操作时间
     */
    private Date redTime;
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

    public RecDesc() {
    }

    public RecDesc(String redNo, String redName, String redRecNo, String redMnemonic, int redSign, String redComment, String redEmployeeNo, String redUnitNo, Date redTime, String duo1, String duo2, String duo3) {
        this.redNo = redNo;
        this.redName = redName;
        this.redRecNo = redRecNo;
        this.redMnemonic = redMnemonic;
        this.redSign = redSign;
        this.redComment = redComment;
        this.redEmployeeNo = redEmployeeNo;
        this.redUnitNo = redUnitNo;
        this.redTime = redTime;
        this.duo1 = duo1;
        this.duo2 = duo2;
        this.duo3 = duo3;
    }

    @Override
    public String toString() {
        return "RecDesc{" +
                "redNo='" + redNo + '\'' +
                ", redName='" + redName + '\'' +
                ", redRecNo='" + redRecNo + '\'' +
                ", redMnemonic='" + redMnemonic + '\'' +
                ", redSign=" + redSign +
                ", redComment='" + redComment + '\'' +
                ", redEmployeeNo='" + redEmployeeNo + '\'' +
                ", redUnitNo='" + redUnitNo + '\'' +
                ", redTime=" + redTime +
                ", duo1='" + duo1 + '\'' +
                ", duo2='" + duo2 + '\'' +
                ", duo3='" + duo3 + '\'' +
                '}';
    }

    public String getRedNo() {
        return redNo;
    }

    public void setRedNo(String redNo) {
        this.redNo = redNo;
    }

    public String getRedName() {
        return redName;
    }

    public void setRedName(String redName) {
        this.redName = redName;
    }

    public String getRedRecNo() {
        return redRecNo;
    }

    public void setRedRecNo(String redRecNo) {
        this.redRecNo = redRecNo;
    }

    public String getRedMnemonic() {
        return redMnemonic;
    }

    public void setRedMnemonic(String redMnemonic) {
        this.redMnemonic = redMnemonic;
    }

    public int getRedSign() {
        return redSign;
    }

    public void setRedSign(int redSign) {
        this.redSign = redSign;
    }

    public String getRedComment() {
        return redComment;
    }

    public void setRedComment(String redComment) {
        this.redComment = redComment;
    }

    public String getRedEmployeeNo() {
        return redEmployeeNo;
    }

    public void setRedEmployeeNo(String redEmployeeNo) {
        this.redEmployeeNo = redEmployeeNo;
    }

    public String getRedUnitNo() {
        return redUnitNo;
    }

    public void setRedUnitNo(String redUnitNo) {
        this.redUnitNo = redUnitNo;
    }

    public Date getRedTime() {
        return redTime;
    }

    public void setRedTime(Date redTime) {
        this.redTime = redTime;
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