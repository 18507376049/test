package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 分拣出库
 */
public class OutStorage {
   /**
    * 分拣出库单号
    */
   private String ousOdd;
   /**
    * 出库交接单号
    */
   private String ousOutNumber;
   /**
    * 物流方向
    */
   private String ousLogiDirec;
   /**
    * 运输方式
    */
   private String ousModeTranspor;
   /**
    * 承运商
    */
   private String ousCommonCarrier;
   /**
    * 接货人
    */
   private String ousMasterPorter;
   /**
    * 交货人
    */
   private String ousDeliveMan;
   /**
    * 交货时间
    */
   private Date ousDeliveryTime;
   /**
    * 交货单位
    */
   private String ousDeliveryUnit;
   /**
    * 仓库编号
    */
   private String ousPisWareNo;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;



   public OutStorage(String ousOdd, String ousOutNumber, String ousLogiDirec, String ousModeTranspor, String ousCommonCarrier, String ousMasterPorter, String ousDeliveMan, Date ousDeliveryTime, String ousDeliveryUnit, String ousPisWareNo, String duo1, String duo2) {
      this.ousOdd = ousOdd;
      this.ousOutNumber = ousOutNumber;
      this.ousLogiDirec = ousLogiDirec;
      this.ousModeTranspor = ousModeTranspor;
      this.ousCommonCarrier = ousCommonCarrier;
      this.ousMasterPorter = ousMasterPorter;
      this.ousDeliveMan = ousDeliveMan;
      this.ousDeliveryTime = ousDeliveryTime;
      this.ousDeliveryUnit = ousDeliveryUnit;
      this.ousPisWareNo = ousPisWareNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   public OutStorage() {

   }

   @Override
   public String toString() {
      return "OutStorage{" +
              "ousOdd='" + ousOdd + '\'' +
              ", ousOutNumber='" + ousOutNumber + '\'' +
              ", ousLogiDirec='" + ousLogiDirec + '\'' +
              ", ousModeTranspor='" + ousModeTranspor + '\'' +
              ", ousCommonCarrier='" + ousCommonCarrier + '\'' +
              ", ousMasterPorter='" + ousMasterPorter + '\'' +
              ", ousDeliveMan='" + ousDeliveMan + '\'' +
              ", ousDeliveryTime=" + ousDeliveryTime +
              ", ousDeliveryUnit='" + ousDeliveryUnit + '\'' +
              ", ousPisWareNo='" + ousPisWareNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getOusOdd() {
      return ousOdd;
   }

   public void setOusOdd(String ousOdd) {
      this.ousOdd = ousOdd;
   }

   public String getOusOutNumber() {
      return ousOutNumber;
   }

   public void setOusOutNumber(String ousOutNumber) {
      this.ousOutNumber = ousOutNumber;
   }

   public String getOusLogiDirec() {
      return ousLogiDirec;
   }

   public void setOusLogiDirec(String ousLogiDirec) {
      this.ousLogiDirec = ousLogiDirec;
   }

   public String getOusModeTranspor() {
      return ousModeTranspor;
   }

   public void setOusModeTranspor(String ousModeTranspor) {
      this.ousModeTranspor = ousModeTranspor;
   }

   public String getOusCommonCarrier() {
      return ousCommonCarrier;
   }

   public void setOusCommonCarrier(String ousCommonCarrier) {
      this.ousCommonCarrier = ousCommonCarrier;
   }

   public String getOusMasterPorter() {
      return ousMasterPorter;
   }

   public void setOusMasterPorter(String ousMasterPorter) {
      this.ousMasterPorter = ousMasterPorter;
   }

   public String getOusDeliveMan() {
      return ousDeliveMan;
   }

   public void setOusDeliveMan(String ousDeliveMan) {
      this.ousDeliveMan = ousDeliveMan;
   }

   public Date getOusDeliveryTime() {
      return ousDeliveryTime;
   }

   public void setOusDeliveryTime(Date ousDeliveryTime) {
      this.ousDeliveryTime = ousDeliveryTime;
   }

   public String getOusDeliveryUnit() {
      return ousDeliveryUnit;
   }

   public void setOusDeliveryUnit(String ousDeliveryUnit) {
      this.ousDeliveryUnit = ousDeliveryUnit;
   }

   public String getOusPisWareNo() {
      return ousPisWareNo;
   }

   public void setOusPisWareNo(String ousPisWareNo) {
      this.ousPisWareNo = ousPisWareNo;
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