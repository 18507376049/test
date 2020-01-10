package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 合包
 */
public class OrPackage {
   /**
    * 合包单号
    */
   private java.lang.String orpPackageNo;
   /**
    * 合包人
    */
   private java.lang.String orpPackagePerson;
   /**
    * 封签号（原来是设备号）
    */
   private java.lang.String orpDeviceNumber;
   /**
    * 到达地
    */
   private java.lang.String orpArrivalPoint;
   /**
    * 计算到达地
    */
   private java.lang.String orpCalculArrival;
   /**
    * 送达时限
    */
   private Date orpDeliveryTime;
   /**
    * 总件数
    */
   private int orpTatalJian;
   /**
    * 总重量
    */
   private double orpTatalWeight;
   /**
    * 总体积
    */
   private double orpTatalV;
   /**
    * 状态
    */
   private int orpStatus = 0;

   public OrPackage() {
   }

   public OrPackage(String orpPackageNo, String orpPackagePerson, String orpDeviceNumber, String orpArrivalPoint, String orpCalculArrival, Date orpDeliveryTime, int orpTatalJian, double orpTatalWeight, double orpTatalV, int orpStatus) {
      this.orpPackageNo = orpPackageNo;
      this.orpPackagePerson = orpPackagePerson;
      this.orpDeviceNumber = orpDeviceNumber;
      this.orpArrivalPoint = orpArrivalPoint;
      this.orpCalculArrival = orpCalculArrival;
      this.orpDeliveryTime = orpDeliveryTime;
      this.orpTatalJian = orpTatalJian;
      this.orpTatalWeight = orpTatalWeight;
      this.orpTatalV = orpTatalV;
      this.orpStatus = orpStatus;
   }

   @Override
   public String toString() {
      return "OrPackage{" +
              "orpPackageNo='" + orpPackageNo + '\'' +
              ", orpPackagePerson='" + orpPackagePerson + '\'' +
              ", orpDeviceNumber='" + orpDeviceNumber + '\'' +
              ", orpArrivalPoint='" + orpArrivalPoint + '\'' +
              ", orpCalculArrival='" + orpCalculArrival + '\'' +
              ", orpDeliveryTime=" + orpDeliveryTime +
              ", orpTatalJian=" + orpTatalJian +
              ", orpTatalWeight=" + orpTatalWeight +
              ", orpTatalV=" + orpTatalV +
              ", orpStatus=" + orpStatus +
              '}';
   }

   public String getOrpPackageNo() {
      return orpPackageNo;
   }

   public void setOrpPackageNo(String orpPackageNo) {
      this.orpPackageNo = orpPackageNo;
   }

   public String getOrpPackagePerson() {
      return orpPackagePerson;
   }

   public void setOrpPackagePerson(String orpPackagePerson) {
      this.orpPackagePerson = orpPackagePerson;
   }

   public String getOrpDeviceNumber() {
      return orpDeviceNumber;
   }

   public void setOrpDeviceNumber(String orpDeviceNumber) {
      this.orpDeviceNumber = orpDeviceNumber;
   }

   public String getOrpArrivalPoint() {
      return orpArrivalPoint;
   }

   public void setOrpArrivalPoint(String orpArrivalPoint) {
      this.orpArrivalPoint = orpArrivalPoint;
   }

   public String getOrpCalculArrival() {
      return orpCalculArrival;
   }

   public void setOrpCalculArrival(String orpCalculArrival) {
      this.orpCalculArrival = orpCalculArrival;
   }

   public Date getOrpDeliveryTime() {
      return orpDeliveryTime;
   }

   public void setOrpDeliveryTime(Date orpDeliveryTime) {
      this.orpDeliveryTime = orpDeliveryTime;
   }

   public int getOrpTatalJian() {
      return orpTatalJian;
   }

   public void setOrpTatalJian(int orpTatalJian) {
      this.orpTatalJian = orpTatalJian;
   }

   public double getOrpTatalWeight() {
      return orpTatalWeight;
   }

   public void setOrpTatalWeight(double orpTatalWeight) {
      this.orpTatalWeight = orpTatalWeight;
   }

   public double getOrpTatalV() {
      return orpTatalV;
   }

   public void setOrpTatalV(double orpTatalV) {
      this.orpTatalV = orpTatalV;
   }

   public int getOrpStatus() {
      return orpStatus;
   }

   public void setOrpStatus(int orpStatus) {
      this.orpStatus = orpStatus;
   }
}