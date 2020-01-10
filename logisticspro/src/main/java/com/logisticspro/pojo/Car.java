package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 车辆
 */
public class Car {
   /**
    * 车辆编号
    */
   private String carId;
   /**
    * 车辆类型编号
    */
   private String carCarTypeId;
   /**
    * 车牌号
    */
   private String carNumber;
   /**
    * 所属单位
    */
   private String carSubordUnit;
   /**
    * 更新时间
    */
   private java.util.Date carNewTime;
   /**
    * 跟新单位
     */
   private String carNewUnit;
   /**
    * 使用人
    */
   private String carUser;
   /**
    * 收排标准编号
    */
   private String carStandardNo;
   /**
    * 收派标准
    */
   private String carStandardC;
   /**
    * 收派标准（公斤）
    */
   private String carStandardKg;
   /**
    * 车辆状态
    */
   private int carState;
   /**
    * 承运商编号
    */
   private String carCaeId;
   /**
    * 备注
    */
   private String carRemarks;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public Car() {
   }

   public Car(String carId, String carCarTypeId, String carNumber, String carSubordUnit, Date carNewTime, String carNewUnit, String carUser, String carStandardNo, String carStandardC, String carStandardKg, int carState, String carCaeId, String carRemarks, String duo1, String duo2) {
      this.carId = carId;
      this.carCarTypeId = carCarTypeId;
      this.carNumber = carNumber;
      this.carSubordUnit = carSubordUnit;
      this.carNewTime = carNewTime;
      this.carNewUnit = carNewUnit;
      this.carUser = carUser;
      this.carStandardNo = carStandardNo;
      this.carStandardC = carStandardC;
      this.carStandardKg = carStandardKg;
      this.carState = carState;
      this.carCaeId = carCaeId;
      this.carRemarks = carRemarks;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "Car{" +
              "carId='" + carId + '\'' +
              ", carCarTypeId='" + carCarTypeId + '\'' +
              ", carNumber='" + carNumber + '\'' +
              ", carSubordUnit='" + carSubordUnit + '\'' +
              ", carNewTime=" + carNewTime +
              ", carNewUnit='" + carNewUnit + '\'' +
              ", carUser='" + carUser + '\'' +
              ", carStandardNo='" + carStandardNo + '\'' +
              ", carStandardC='" + carStandardC + '\'' +
              ", carStandardKg='" + carStandardKg + '\'' +
              ", carState=" + carState +
              ", carCaeId='" + carCaeId + '\'' +
              ", carRemarks='" + carRemarks + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getCarId() {
      return carId;
   }

   public void setCarId(String carId) {
      this.carId = carId;
   }

   public String getCarCarTypeId() {
      return carCarTypeId;
   }

   public void setCarCarTypeId(String carCarTypeId) {
      this.carCarTypeId = carCarTypeId;
   }

   public String getCarNumber() {
      return carNumber;
   }

   public void setCarNumber(String carNumber) {
      this.carNumber = carNumber;
   }

   public String getCarSubordUnit() {
      return carSubordUnit;
   }

   public void setCarSubordUnit(String carSubordUnit) {
      this.carSubordUnit = carSubordUnit;
   }

   public Date getCarNewTime() {
      return carNewTime;
   }

   public void setCarNewTime(Date carNewTime) {
      this.carNewTime = carNewTime;
   }

   public String getCarNewUnit() {
      return carNewUnit;
   }

   public void setCarNewUnit(String carNewUnit) {
      this.carNewUnit = carNewUnit;
   }

   public String getCarUser() {
      return carUser;
   }

   public void setCarUser(String carUser) {
      this.carUser = carUser;
   }

   public String getCarStandardNo() {
      return carStandardNo;
   }

   public void setCarStandardNo(String carStandardNo) {
      this.carStandardNo = carStandardNo;
   }

   public String getCarStandardC() {
      return carStandardC;
   }

   public void setCarStandardC(String carStandardC) {
      this.carStandardC = carStandardC;
   }

   public String getCarStandardKg() {
      return carStandardKg;
   }

   public void setCarStandardKg(String carStandardKg) {
      this.carStandardKg = carStandardKg;
   }

   public int getCarState() {
      return carState;
   }

   public void setCarState(int carState) {
      this.carState = carState;
   }

   public String getCarCaeId() {
      return carCaeId;
   }

   public void setCarCaeId(String carCaeId) {
      this.carCaeId = carCaeId;
   }

   public String getCarRemarks() {
      return carRemarks;
   }

   public void setCarRemarks(String carRemarks) {
      this.carRemarks = carRemarks;
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