package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description:  线路
 */
public class Route {
   /**
    * 线路ID
    */
   private String rouNo;
   /**
    * 终点站ID
    */
   private String rouTerminusNo;
   /**
    * 起点站ID
    */
   private String rouOriginNo;
   /**
    * 线路名称
    */
   private String rouName;
   /**
    * 线路编码
    */
   private String rouCoding;
   /**
    * 线路时限
    */
   private java.util.Date rouTime;
   /**
    * 里程
    */
   private double rouMileage;
   /**
    * 是否停开
    */
   private int rouStoppage = 0;
   /**
    * 备注
    */
   private String rouComment;
   /**
    * 运营商
    */
   private String rouCarId;
   /**
    * 线路类型ID
    */
   private String rouRoTNo;
   /**
    * 线路所属单位
    */
   private String rouLineUnitNo;
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

   public Route() {
   }

   public Route(String rouNo, String rouTerminusNo, String rouOriginNo, String rouName, String rouCoding, Date rouTime, double rouMileage, int rouStoppage, String rouComment, String rouCarId, String rouRoTNo, String rouLineUnitNo, String duo1, String duo2, String duo3) {
      this.rouNo = rouNo;
      this.rouTerminusNo = rouTerminusNo;
      this.rouOriginNo = rouOriginNo;
      this.rouName = rouName;
      this.rouCoding = rouCoding;
      this.rouTime = rouTime;
      this.rouMileage = rouMileage;
      this.rouStoppage = rouStoppage;
      this.rouComment = rouComment;
      this.rouCarId = rouCarId;
      this.rouRoTNo = rouRoTNo;
      this.rouLineUnitNo = rouLineUnitNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Route{" +
              "rouNo='" + rouNo + '\'' +
              ", rouTerminusNo='" + rouTerminusNo + '\'' +
              ", rouOriginNo='" + rouOriginNo + '\'' +
              ", rouName='" + rouName + '\'' +
              ", rouCoding='" + rouCoding + '\'' +
              ", rouTime=" + rouTime +
              ", rouMileage=" + rouMileage +
              ", rouStoppage=" + rouStoppage +
              ", rouComment='" + rouComment + '\'' +
              ", rouCarId='" + rouCarId + '\'' +
              ", rouRoTNo='" + rouRoTNo + '\'' +
              ", rouLineUnitNo='" + rouLineUnitNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getRouNo() {
      return rouNo;
   }

   public void setRouNo(String rouNo) {
      this.rouNo = rouNo;
   }

   public String getRouTerminusNo() {
      return rouTerminusNo;
   }

   public void setRouTerminusNo(String rouTerminusNo) {
      this.rouTerminusNo = rouTerminusNo;
   }

   public String getRouOriginNo() {
      return rouOriginNo;
   }

   public void setRouOriginNo(String rouOriginNo) {
      this.rouOriginNo = rouOriginNo;
   }

   public String getRouName() {
      return rouName;
   }

   public void setRouName(String rouName) {
      this.rouName = rouName;
   }

   public String getRouCoding() {
      return rouCoding;
   }

   public void setRouCoding(String rouCoding) {
      this.rouCoding = rouCoding;
   }

   public Date getRouTime() {
      return rouTime;
   }

   public void setRouTime(Date rouTime) {
      this.rouTime = rouTime;
   }

   public double getRouMileage() {
      return rouMileage;
   }

   public void setRouMileage(double rouMileage) {
      this.rouMileage = rouMileage;
   }

   public int getRouStoppage() {
      return rouStoppage;
   }

   public void setRouStoppage(int rouStoppage) {
      this.rouStoppage = rouStoppage;
   }

   public String getRouComment() {
      return rouComment;
   }

   public void setRouComment(String rouComment) {
      this.rouComment = rouComment;
   }

   public String getRouCarId() {
      return rouCarId;
   }

   public void setRouCarId(String rouCarId) {
      this.rouCarId = rouCarId;
   }

   public String getRouRoTNo() {
      return rouRoTNo;
   }

   public void setRouRoTNo(String rouRoTNo) {
      this.rouRoTNo = rouRoTNo;
   }

   public String getRouLineUnitNo() {
      return rouLineUnitNo;
   }

   public void setRouLineUnitNo(String rouLineUnitNo) {
      this.rouLineUnitNo = rouLineUnitNo;
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