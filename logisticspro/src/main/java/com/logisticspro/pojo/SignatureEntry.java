package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 签收录入
 */
public class SignatureEntry {
   /**
    * 签收录入单号
    * */
   private String sigNo;
   /**
    * 工作单号
    * */
   private String sigWorkNo;
   /**
    * 返单标志
    * */
   private int sigReturnOrders;
   /**
    * 派送员工号
    * */
   private String sigSendNo;
   /**
    * 派送员姓名
    * */
   private String sigSendName;
   /**
    * 派送单位
    * */
   private String sigSendUnit;
   /**
    * 签收人
    * */
   private String sigSignPeople;
   /**
    * 签收时间
    * */
   private Date sigSignDate;
   /**
    * 签收类型
    * */
   private int sigSignType;
   /**
    * 录入方式
    * */
   private String sigEntry;
   /**
    * 异常备注
    * */
   private String sigAbnormalRemarks;
   /**
    * 标志
    * */
   private int sigInvalidSign;
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

   public String getSigNo() {
      return sigNo;
   }

   public void setSigNo(String sigNo) {
      this.sigNo = sigNo;
   }

   public String getSigWorkNo() {
      return sigWorkNo;
   }

   public void setSigWorkNo(String sigWorkNo) {
      this.sigWorkNo = sigWorkNo;
   }

   public int getSigReturnOrders() {
      return sigReturnOrders;
   }

   public void setSigReturnOrders(int sigReturnOrders) {
      this.sigReturnOrders = sigReturnOrders;
   }

   public String getSigSendNo() {
      return sigSendNo;
   }

   public void setSigSendNo(String sigSendNo) {
      this.sigSendNo = sigSendNo;
   }

   public String getSigSendName() {
      return sigSendName;
   }

   public void setSigSendName(String sigSendName) {
      this.sigSendName = sigSendName;
   }

   public String getSigSendUnit() {
      return sigSendUnit;
   }

   public void setSigSendUnit(String sigSendUnit) {
      this.sigSendUnit = sigSendUnit;
   }

   public String getSigSignPeople() {
      return sigSignPeople;
   }

   public void setSigSignPeople(String sigSignPeople) {
      this.sigSignPeople = sigSignPeople;
   }

   public Date getSigSignDate() {
      return sigSignDate;
   }

   public void setSigSignDate(Date sigSignDate) {
      this.sigSignDate = sigSignDate;
   }

   public int getSigSignType() {
      return sigSignType;
   }

   public void setSigSignType(int sigSignType) {
      this.sigSignType = sigSignType;
   }

   public String getSigEntry() {
      return sigEntry;
   }

   public void setSigEntry(String sigEntry) {
      this.sigEntry = sigEntry;
   }

   public String getSigAbnormalRemarks() {
      return sigAbnormalRemarks;
   }

   public void setSigAbnormalRemarks(String sigAbnormalRemarks) {
      this.sigAbnormalRemarks = sigAbnormalRemarks;
   }

   public int getSigInvalidSign() {
      return sigInvalidSign;
   }

   public void setSigInvalidSign(int sigInvalidSign) {
      this.sigInvalidSign = sigInvalidSign;
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

   public SignatureEntry(String sigNo, String sigWorkNo, int sigReturnOrders, String sigSendNo, String sigSendName, String sigSendUnit, String sigSignPeople, Date sigSignDate, int sigSignType, String sigEntry, String sigAbnormalRemarks, int sigInvalidSign, String duo1, String duo2, String duo3) {
      this.sigNo = sigNo;
      this.sigWorkNo = sigWorkNo;
      this.sigReturnOrders = sigReturnOrders;
      this.sigSendNo = sigSendNo;
      this.sigSendName = sigSendName;
      this.sigSendUnit = sigSendUnit;
      this.sigSignPeople = sigSignPeople;
      this.sigSignDate = sigSignDate;
      this.sigSignType = sigSignType;
      this.sigEntry = sigEntry;
      this.sigAbnormalRemarks = sigAbnormalRemarks;
      this.sigInvalidSign = sigInvalidSign;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public SignatureEntry() {
   }

   @Override
   public String toString() {
      return "SignatureEntry{" +
              "sigNo='" + sigNo + '\'' +
              ", sigWorkNo='" + sigWorkNo + '\'' +
              ", sigReturnOrders=" + sigReturnOrders +
              ", sigSendNo='" + sigSendNo + '\'' +
              ", sigSendName='" + sigSendName + '\'' +
              ", sigSendUnit='" + sigSendUnit + '\'' +
              ", sigSignPeople='" + sigSignPeople + '\'' +
              ", sigSignDate=" + sigSignDate +
              ", sigSignType=" + sigSignType +
              ", sigEntry='" + sigEntry + '\'' +
              ", sigAbnormalRemarks='" + sigAbnormalRemarks + '\'' +
              ", sigInvalidSign=" + sigInvalidSign +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}