package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 线路类型
 */
public class RouteType {
    /**
     * 线路类型ID
     */
    private String roTNo;
    /**
     * 线路类型
     */
    private String roTName;
    /**
     * 备注
     */
    private String roTComment;
    /**
     *
     * */
    private String duo1;
    /**
     *
     * */
    private String duo2;

    public RouteType() {
    }

    public RouteType(String roTNo, String roTName, String roTComment, String duo1, String duo2) {
        this.roTNo = roTNo;
        this.roTName = roTName;
        this.roTComment = roTComment;
        this.duo1 = duo1;
        this.duo2 = duo2;
    }

    @Override
    public String toString() {
        return "RouteType{" +
                "roTNo='" + roTNo + '\'' +
                ", roTName='" + roTName + '\'' +
                ", roTComment='" + roTComment + '\'' +
                ", duo1='" + duo1 + '\'' +
                ", duo2='" + duo2 + '\'' +
                '}';
    }

    public String getRoTNo() {
        return roTNo;
    }

    public void setRoTNo(String roTNo) {
        this.roTNo = roTNo;
    }

    public String getRoTName() {
        return roTName;
    }

    public void setRoTName(String roTName) {
        this.roTName = roTName;
    }

    public String getRoTComment() {
        return roTComment;
    }

    public void setRoTComment(String roTComment) {
        this.roTComment = roTComment;
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
}