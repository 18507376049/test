package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 物流
 */
public class Logistics {
   /**
    * 物流单号
    */
   private String logNo;
   /**
    * 发站
    */
   private String logStation;
   /**
    * 到站
    */
   private String logArrive;
   /**
    * 调度人员
    */
   private String logScheduling;
   /**
    * 发货司机
    */
   private String logDriver;
   /**
    * 发货员
    */
   private String logShippingNo;
   /**
    * 发货时间
    */
   private Date logTime;
   /**
    * 运送单号
    */
   private String logYunOdd;
   /**
    * 线路ID
    */
   private String logRouNo;
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

   public Logistics() {
   }

   public Logistics(String logNo, String logStation, String logArrive, String logScheduling, String logDriver, String logShippingNo, Date logTime, String logYunOdd, String logRouNo, String duo1, String duo2, String duo3) {
      this.logNo = logNo;
      this.logStation = logStation;
      this.logArrive = logArrive;
      this.logScheduling = logScheduling;
      this.logDriver = logDriver;
      this.logShippingNo = logShippingNo;
      this.logTime = logTime;
      this.logYunOdd = logYunOdd;
      this.logRouNo = logRouNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Logistics{" +
              "logNo='" + logNo + '\'' +
              ", logStation='" + logStation + '\'' +
              ", logArrive='" + logArrive + '\'' +
              ", logScheduling='" + logScheduling + '\'' +
              ", logDriver='" + logDriver + '\'' +
              ", logShippingNo='" + logShippingNo + '\'' +
              ", logTime=" + logTime +
              ", logYunOdd='" + logYunOdd + '\'' +
              ", logRouNo='" + logRouNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getLogNo() {
      return logNo;
   }

   public void setLogNo(String logNo) {
      this.logNo = logNo;
   }

   public String getLogStation() {
      return logStation;
   }

   public void setLogStation(String logStation) {
      this.logStation = logStation;
   }

   public String getLogArrive() {
      return logArrive;
   }

   public void setLogArrive(String logArrive) {
      this.logArrive = logArrive;
   }

   public String getLogScheduling() {
      return logScheduling;
   }

   public void setLogScheduling(String logScheduling) {
      this.logScheduling = logScheduling;
   }

   public String getLogDriver() {
      return logDriver;
   }

   public void setLogDriver(String logDriver) {
      this.logDriver = logDriver;
   }

   public String getLogShippingNo() {
      return logShippingNo;
   }

   public void setLogShippingNo(String logShippingNo) {
      this.logShippingNo = logShippingNo;
   }

   public Date getLogTime() {
      return logTime;
   }

   public void setLogTime(Date logTime) {
      this.logTime = logTime;
   }

   public String getLogYunOdd() {
      return logYunOdd;
   }

   public void setLogYunOdd(String logYunOdd) {
      this.logYunOdd = logYunOdd;
   }

   public String getLogRouNo() {
      return logRouNo;
   }

   public void setLogRouNo(String logRouNo) {
      this.logRouNo = logRouNo;
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