package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 受理/查货咨询
 */
public class AcceptConsultation {
   /**
    * 咨询编号
    */
   private String accNo;
   /**
    * * 客户编号
    */
   private String accCliNo;
   /**
    * 客户名称
    */
   private String accName;
   /**
    * 工单号
    */
   private String accWorNo;
   /**
    * 联系电话
    */
   private String accContactNumber;
   /**
    * 短信序号
    */
   private String accMessageNo;
   /**
    * 手机
    */
   private String accPhone;
   /**
    * 传真
    */
   private String accFax;
   /**
    * 联系地址
   */
   private String accContactAddress;
   /**
    * 邮编
    */
   private String accPostcode;
   /**
    * EMAIL
    */
   private String accEmail;
   /**
    * 是否合作过
    */
   private int accIsCollaborate = 0;
   /**
    * 工作单号
    */
   private String accWorkNo;
   /**
    * 结算方式
    */
   private String accClearingWay;
   /**
    * 初始受理单位
    */
   private String accInitialUnit;
   /**
    * 通知单号
    */
   private String accOdd;
   /**
    * 取货单位
    */
   private String accPickupUnit;
   /**
    * 受理时间
    */
   private java.util.Date accTime;
   /**
    * 咨询类型
    */
   private String accConsultType;
   /**
    * 咨询方式
    */
   private String accConsultWay;
   /**
    * 咨询时间
    */
   private java.util.Date accConsultTime;
   /**
    * 咨询内容
    */
   private String accConsultContent;
   /**
    * 咨询结果
    */
   private String accConsultResult;
   /**
    *
    * */
   private String duo1;
   /**
    *  */
   private String duo2;
   /**
    *
    * */
   private String duo3;

   public AcceptConsultation() {
   }

   public AcceptConsultation(String accNo, String accCliNo, String accName, String accWorNo, String accContactNumber, String accMessageNo, String accPhone, String accFax, String accContactAddress, String accPostcode, String accEmail, int accIsCollaborate, String accWorkNo, String accClearingWay, String accInitialUnit, String accOdd, String accPickupUnit, Date accTime, String accConsultType, String accConsultWay, Date accConsultTime, String accConsultContent, String accConsultResult, String duo1, String duo2, String duo3) {
      this.accNo = accNo;
      this.accCliNo = accCliNo;
      this.accName = accName;
      this.accWorNo = accWorNo;
      this.accContactNumber = accContactNumber;
      this.accMessageNo = accMessageNo;
      this.accPhone = accPhone;
      this.accFax = accFax;
      this.accContactAddress = accContactAddress;
      this.accPostcode = accPostcode;
      this.accEmail = accEmail;
      this.accIsCollaborate = accIsCollaborate;
      this.accWorkNo = accWorkNo;
      this.accClearingWay = accClearingWay;
      this.accInitialUnit = accInitialUnit;
      this.accOdd = accOdd;
      this.accPickupUnit = accPickupUnit;
      this.accTime = accTime;
      this.accConsultType = accConsultType;
      this.accConsultWay = accConsultWay;
      this.accConsultTime = accConsultTime;
      this.accConsultContent = accConsultContent;
      this.accConsultResult = accConsultResult;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "AcceptConsultation{" +
              "accNo='" + accNo + '\'' +
              ", accCliNo='" + accCliNo + '\'' +
              ", accName='" + accName + '\'' +
              ", accWorNo='" + accWorNo + '\'' +
              ", accContactNumber='" + accContactNumber + '\'' +
              ", accMessageNo='" + accMessageNo + '\'' +
              ", accPhone='" + accPhone + '\'' +
              ", accFax='" + accFax + '\'' +
              ", accContactAddress='" + accContactAddress + '\'' +
              ", accPostcode='" + accPostcode + '\'' +
              ", accEmail='" + accEmail + '\'' +
              ", accIsCollaborate=" + accIsCollaborate +
              ", accWorkNo='" + accWorkNo + '\'' +
              ", accClearingWay='" + accClearingWay + '\'' +
              ", accInitialUnit='" + accInitialUnit + '\'' +
              ", accOdd='" + accOdd + '\'' +
              ", accPickupUnit='" + accPickupUnit + '\'' +
              ", accTime=" + accTime +
              ", accConsultType='" + accConsultType + '\'' +
              ", accConsultWay='" + accConsultWay + '\'' +
              ", accConsultTime=" + accConsultTime +
              ", accConsultContent='" + accConsultContent + '\'' +
              ", accConsultResult='" + accConsultResult + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getAccNo() {
      return accNo;
   }

   public void setAccNo(String accNo) {
      this.accNo = accNo;
   }

   public String getAccCliNo() {
      return accCliNo;
   }

   public void setAccCliNo(String accCliNo) {
      this.accCliNo = accCliNo;
   }

   public String getAccName() {
      return accName;
   }

   public void setAccName(String accName) {
      this.accName = accName;
   }

   public String getAccWorNo() {
      return accWorNo;
   }

   public void setAccWorNo(String accWorNo) {
      this.accWorNo = accWorNo;
   }

   public String getAccContactNumber() {
      return accContactNumber;
   }

   public void setAccContactNumber(String accContactNumber) {
      this.accContactNumber = accContactNumber;
   }

   public String getAccMessageNo() {
      return accMessageNo;
   }

   public void setAccMessageNo(String accMessageNo) {
      this.accMessageNo = accMessageNo;
   }

   public String getAccPhone() {
      return accPhone;
   }

   public void setAccPhone(String accPhone) {
      this.accPhone = accPhone;
   }

   public String getAccFax() {
      return accFax;
   }

   public void setAccFax(String accFax) {
      this.accFax = accFax;
   }

   public String getAccContactAddress() {
      return accContactAddress;
   }

   public void setAccContactAddress(String accContactAddress) {
      this.accContactAddress = accContactAddress;
   }

   public String getAccPostcode() {
      return accPostcode;
   }

   public void setAccPostcode(String accPostcode) {
      this.accPostcode = accPostcode;
   }

   public String getAccEmail() {
      return accEmail;
   }

   public void setAccEmail(String accEmail) {
      this.accEmail = accEmail;
   }

   public int getAccIsCollaborate() {
      return accIsCollaborate;
   }

   public void setAccIsCollaborate(int accIsCollaborate) {
      this.accIsCollaborate = accIsCollaborate;
   }

   public String getAccWorkNo() {
      return accWorkNo;
   }

   public void setAccWorkNo(String accWorkNo) {
      this.accWorkNo = accWorkNo;
   }

   public String getAccClearingWay() {
      return accClearingWay;
   }

   public void setAccClearingWay(String accClearingWay) {
      this.accClearingWay = accClearingWay;
   }

   public String getAccInitialUnit() {
      return accInitialUnit;
   }

   public void setAccInitialUnit(String accInitialUnit) {
      this.accInitialUnit = accInitialUnit;
   }

   public String getAccOdd() {
      return accOdd;
   }

   public void setAccOdd(String accOdd) {
      this.accOdd = accOdd;
   }

   public String getAccPickupUnit() {
      return accPickupUnit;
   }

   public void setAccPickupUnit(String accPickupUnit) {
      this.accPickupUnit = accPickupUnit;
   }

   public Date getAccTime() {
      return accTime;
   }

   public void setAccTime(Date accTime) {
      this.accTime = accTime;
   }

   public String getAccConsultType() {
      return accConsultType;
   }

   public void setAccConsultType(String accConsultType) {
      this.accConsultType = accConsultType;
   }

   public String getAccConsultWay() {
      return accConsultWay;
   }

   public void setAccConsultWay(String accConsultWay) {
      this.accConsultWay = accConsultWay;
   }

   public Date getAccConsultTime() {
      return accConsultTime;
   }

   public void setAccConsultTime(Date accConsultTime) {
      this.accConsultTime = accConsultTime;
   }

   public String getAccConsultContent() {
      return accConsultContent;
   }

   public void setAccConsultContent(String accConsultContent) {
      this.accConsultContent = accConsultContent;
   }

   public String getAccConsultResult() {
      return accConsultResult;
   }

   public void setAccConsultResult(String accConsultResult) {
      this.accConsultResult = accConsultResult;
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