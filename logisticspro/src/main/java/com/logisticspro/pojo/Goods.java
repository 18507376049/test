package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 物品
 */
public class Goods {
   /**
    * 物品编码
    */
   private String gooNumber;
   /**
    * 计划价格
    */
   private String gooName;
   /**
    * 物品名称
    */
   private double gooPrice;
   /**
    * 规格
    */
   private String gooStandard;
   /**
    * 计量单位
   */
   private String gooMeasurementUnit;
   /**
    * 状态
    */
   private int gooStatus;
   /**
    * 操作人工号
     */
   private String gooEmploNo;
   /**
    * 操作人姓名
     */
   private String gooEmploName;
   /**
    * 操作时间
     */
   private Date gooTime;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public Goods() {
   }

   public Goods(String gooNumber, String gooName, double gooPrice, String gooStandard, String gooMeasurementUnit, int gooStatus, String gooEmploNo, String gooEmploName, Date gooTime, String duo1, String duo2) {
      this.gooNumber = gooNumber;
      this.gooName = gooName;
      this.gooPrice = gooPrice;
      this.gooStandard = gooStandard;
      this.gooMeasurementUnit = gooMeasurementUnit;
      this.gooStatus = gooStatus;
      this.gooEmploNo = gooEmploNo;
      this.gooEmploName = gooEmploName;
      this.gooTime = gooTime;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "Goods{" +
              "gooNumber='" + gooNumber + '\'' +
              ", gooName='" + gooName + '\'' +
              ", gooPrice=" + gooPrice +
              ", gooStandard='" + gooStandard + '\'' +
              ", gooMeasurementUnit='" + gooMeasurementUnit + '\'' +
              ", gooStatus=" + gooStatus +
              ", gooEmploNo='" + gooEmploNo + '\'' +
              ", gooEmploName='" + gooEmploName + '\'' +
              ", gooTime=" + gooTime +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getGooNumber() {
      return gooNumber;
   }

   public void setGooNumber(String gooNumber) {
      this.gooNumber = gooNumber;
   }

   public String getGooName() {
      return gooName;
   }

   public void setGooName(String gooName) {
      this.gooName = gooName;
   }

   public double getGooPrice() {
      return gooPrice;
   }

   public void setGooPrice(double gooPrice) {
      this.gooPrice = gooPrice;
   }

   public String getGooStandard() {
      return gooStandard;
   }

   public void setGooStandard(String gooStandard) {
      this.gooStandard = gooStandard;
   }

   public String getGooMeasurementUnit() {
      return gooMeasurementUnit;
   }

   public void setGooMeasurementUnit(String gooMeasurementUnit) {
      this.gooMeasurementUnit = gooMeasurementUnit;
   }

   public int getGooStatus() {
      return gooStatus;
   }

   public void setGooStatus(int gooStatus) {
      this.gooStatus = gooStatus;
   }

   public String getGooEmploNo() {
      return gooEmploNo;
   }

   public void setGooEmploNo(String gooEmploNo) {
      this.gooEmploNo = gooEmploNo;
   }

   public String getGooEmploName() {
      return gooEmploName;
   }

   public void setGooEmploName(String gooEmploName) {
      this.gooEmploName = gooEmploName;
   }

   public Date getGooTime() {
      return gooTime;
   }

   public void setGooTime(Date gooTime) {
      this.gooTime = gooTime;
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