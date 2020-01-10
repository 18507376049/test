package com.logisticspro.pojo;
import java.util.*;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 核重操作
 */
public class VerifyWeight {
   /**
    * 核重操作编号
    * */
   private String verNo;
   /**
    * 工作单单号
    * */
   private String verGongOdd;
   /**
    * 原件数
    *  */
   private int verQuantity;
   /**
    * 原重量
    *  */
   private double verWeight;
   /**
    * 到达地
    *  */
   private String verArri;
   /**
    * 已核件数
    *  */
   private int verVerifyQua;
   /**
    * 已核总量
    * */
   private double verVerifyWeight;
   /**
    * 条码
    *  */
   private String verBarCode;
   /**
    * 操作时间
    *  */
   private Date verDate;
   /**
    * 操作人
    *  */
   private String verOperator;
   /**
    * 核重单位
    *  */
   private String vemUnit;
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

   public String getVerGongOdd() {
      return verGongOdd;
   }

   public void setVerGongOdd(String verGongOdd) {
      this.verGongOdd = verGongOdd;
   }

   public int getVerQuantity() {
      return verQuantity;
   }

   public void setVerQuantity(int verQuantity) {
      this.verQuantity = verQuantity;
   }

   public double getVerWeight() {
      return verWeight;
   }

   public void setVerWeight(double verWeight) {
      this.verWeight = verWeight;
   }

   public String getVerArri() {
      return verArri;
   }

   public void setVerArri(String verArri) {
      this.verArri = verArri;
   }

   public int getVerVerifyQua() {
      return verVerifyQua;
   }

   public void setVerVerifyQua(int verVerifyQua) {
      this.verVerifyQua = verVerifyQua;
   }

   public double getVerVerifyWeight() {
      return verVerifyWeight;
   }

   public void setVerVerifyWeight(double verVerifyWeight) {
      this.verVerifyWeight = verVerifyWeight;
   }

   public String getVerBarCode() {
      return verBarCode;
   }

   public void setVerBarCode(String verBarCode) {
      this.verBarCode = verBarCode;
   }

   public Date getVerDate() {
      return verDate;
   }

   public void setVerDate(Date verDate) {
      this.verDate = verDate;
   }

   public String getVerOperator() {
      return verOperator;
   }

   public void setVerOperator(String verOperator) {
      this.verOperator = verOperator;
   }

   public String getVemUnit() {
      return vemUnit;
   }

   public void setVemUnit(String vemUnit) {
      this.vemUnit = vemUnit;
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

   public VerifyWeight(String verNo, String verGongOdd, int verQuantity, double verWeight, String verArri, int verVerifyQua, double verVerifyWeight, String verBarCode, Date verDate, String verOperator, String vemUnit, String duo1, String duo2) {
      this.verNo = verNo;
      this.verGongOdd = verGongOdd;
      this.verQuantity = verQuantity;
      this.verWeight = verWeight;
      this.verArri = verArri;
      this.verVerifyQua = verVerifyQua;
      this.verVerifyWeight = verVerifyWeight;
      this.verBarCode = verBarCode;
      this.verDate = verDate;
      this.verOperator = verOperator;
      this.vemUnit = vemUnit;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   public VerifyWeight() {
   }

   @Override
   public String toString() {
      return "VerifyWeight{" +
              "verNo='" + verNo + '\'' +
              ", verGongOdd='" + verGongOdd + '\'' +
              ", verQuantity=" + verQuantity +
              ", verWeight=" + verWeight +
              ", verArri='" + verArri + '\'' +
              ", verVerifyQua=" + verVerifyQua +
              ", verVerifyWeight=" + verVerifyWeight +
              ", verBarCode='" + verBarCode + '\'' +
              ", verDate=" + verDate +
              ", verOperator='" + verOperator + '\'' +
              ", vemUnit='" + vemUnit + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }
}