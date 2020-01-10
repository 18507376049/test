package com.logisticspro.pojo;
import java.util.*;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 核销
 */
public class Verification {
   /**
    * 核销单号
    *  */
   private String verNo;
   /**
    * 核销类型
    *  */
   private String verType;
   /**
    * 所属单位
    *  */
   private String verUnit;
   /**
    *  开单人工号
    * */
   private String verSingleNumber;
   /**
    * 开单人
    *  */
   private String verSingle;
   /**
    * 开单时间
    *  */
   private Date verTime;
   /**
    * 修改人工号
    *  */
   private String verNodificationNumber;
   /**
    * 修改人
    *  */
   private String verNodification;
   /**
    *  修改时间
    * */
   private Date verChangeTime;
   /**
    * 作废人工号
    *  */
   private String verCancellationNumber;
   /**
    * 作废人
    *  */
   private String verCancellation;
   /**
    * 作废时间
    * */
   private Date verCancellationTime;
   /**
    * 状态
    *  */
   private int verState;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public String getVerNo() {
      return verNo;
   }

   public void setVerNo(String verNo) {
      this.verNo = verNo;
   }

   public String getVerType() {
      return verType;
   }

   public void setVerType(String verType) {
      this.verType = verType;
   }

   public String getVerUnit() {
      return verUnit;
   }

   public void setVerUnit(String verUnit) {
      this.verUnit = verUnit;
   }

   public String getVerSingleNumber() {
      return verSingleNumber;
   }

   public void setVerSingleNumber(String verSingleNumber) {
      this.verSingleNumber = verSingleNumber;
   }

   public String getVerSingle() {
      return verSingle;
   }

   public void setVerSingle(String verSingle) {
      this.verSingle = verSingle;
   }

   public Date getVerTime() {
      return verTime;
   }

   public void setVerTime(Date verTime) {
      this.verTime = verTime;
   }

   public String getVerNodificationNumber() {
      return verNodificationNumber;
   }

   public void setVerNodificationNumber(String verNodificationNumber) {
      this.verNodificationNumber = verNodificationNumber;
   }

   public String getVerNodification() {
      return verNodification;
   }

   public void setVerNodification(String verNodification) {
      this.verNodification = verNodification;
   }

   public Date getVerChangeTime() {
      return verChangeTime;
   }

   public void setVerChangeTime(Date verChangeTime) {
      this.verChangeTime = verChangeTime;
   }

   public String getVerCancellationNumber() {
      return verCancellationNumber;
   }

   public void setVerCancellationNumber(String verCancellationNumber) {
      this.verCancellationNumber = verCancellationNumber;
   }

   public String getVerCancellation() {
      return verCancellation;
   }

   public void setVerCancellation(String verCancellation) {
      this.verCancellation = verCancellation;
   }

   public Date getVerCancellationTime() {
      return verCancellationTime;
   }

   public void setVerCancellationTime(Date verCancellationTime) {
      this.verCancellationTime = verCancellationTime;
   }

   public int getVerState() {
      return verState;
   }

   public void setVerState(int verState) {
      this.verState = verState;
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

   public Verification(String verNo, String verType, String verUnit, String verSingleNumber, String verSingle, Date verTime, String verNodificationNumber, String verNodification, Date verChangeTime, String verCancellationNumber, String verCancellation, Date verCancellationTime, int verState, String duo1, String duo2) {
      this.verNo = verNo;
      this.verType = verType;
      this.verUnit = verUnit;
      this.verSingleNumber = verSingleNumber;
      this.verSingle = verSingle;
      this.verTime = verTime;
      this.verNodificationNumber = verNodificationNumber;
      this.verNodification = verNodification;
      this.verChangeTime = verChangeTime;
      this.verCancellationNumber = verCancellationNumber;
      this.verCancellation = verCancellation;
      this.verCancellationTime = verCancellationTime;
      this.verState = verState;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   public Verification() {
   }

   @Override
   public String toString() {
      return "Verification{" +
              "verNo='" + verNo + '\'' +
              ", verType='" + verType + '\'' +
              ", verUnit='" + verUnit + '\'' +
              ", verSingleNumber='" + verSingleNumber + '\'' +
              ", verSingle='" + verSingle + '\'' +
              ", verTime=" + verTime +
              ", verNodificationNumber='" + verNodificationNumber + '\'' +
              ", verNodification='" + verNodification + '\'' +
              ", verChangeTime=" + verChangeTime +
              ", verCancellationNumber='" + verCancellationNumber + '\'' +
              ", verCancellation='" + verCancellation + '\'' +
              ", verCancellationTime=" + verCancellationTime +
              ", verState=" + verState +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }
}