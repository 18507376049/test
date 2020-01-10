package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 业务通知单
 */
public class BusinessOrder {
   /**
    * 业务通知单号
    */
   private String busMemoNo;
   /**
    * 客户编号
    */
   private String busCustomerNo;
   /**
    * 客户单号
    */
   private String busCustomerOdd;
   /**
    * 产品（品名）
    */
   private String busProduct;
   /**
    * 预约取件时间
    */
   private Date busResPickupTime;
   /**
    * 预约收件时间
    */
   private Date busResReceiptTime;
   /**
    * 调拨人
    */
   private String busAssigner;
   /**
    * 分配时间
    */
   private Date busAllocateTime;
   /**
    * 预计重量
   */
   private double busWeight;
   /**
    * 预计体积
    */
   private double busVolume;
   /**
    * 取货人
    */
   private String busPickupPerson;
   /**
    * 取货标识
    */
   private String busPickupLogo;
   /**
    * 取货单位
    */
   private String busPickupUnit;
   /**
    * 取货时间
    */
   private Date busPickupTime;
   /**
    * 派送地址
    */
   private String busDeliAddress;
   /**
    * 处理单位
    */
   private String busProcUnit;
   /**
    * 通知单来源
    */
   private String busNotifiSource;
   /**
    * 客户单号修改标志
    */
   private int busUpdateSign = 0;
   /**
    * 分单类型
    */
   private String busSingleType;
   /**
    * 重要提示
    */
   private String busImportantNote;
   /**
    * 备注
    */
   private String busRemark;
   /**
    * 咨询内容
    */
   private String busConsultContent;
   /**
    * 咨询结果
    */
   private String busConsultResults;
   /**
    * 受理人
    */
   private String busAcceptor;
   /**
    * 咨询时间
    */
   private Date busConsultTime;
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

   public BusinessOrder() {
   }

   public BusinessOrder(String busMemoNo, String busCustomerNo, String busCustomerOdd, String busProduct, Date busResPickupTime, Date busResReceiptTime, String busAssigner, Date busAllocateTime, double busWeight, double busVolume, String busPickupPerson, String busPickupLogo, String busPickupUnit, Date busPickupTime, String busDeliAddress, String busProcUnit, String busNotifiSource, int busUpdateSign, String busSingleType, String busImportantNote, String busRemark, String busConsultContent, String busConsultResults, String busAcceptor, Date busConsultTime, String duo1, String duo2, String duo3) {
      this.busMemoNo = busMemoNo;
      this.busCustomerNo = busCustomerNo;
      this.busCustomerOdd = busCustomerOdd;
      this.busProduct = busProduct;
      this.busResPickupTime = busResPickupTime;
      this.busResReceiptTime = busResReceiptTime;
      this.busAssigner = busAssigner;
      this.busAllocateTime = busAllocateTime;
      this.busWeight = busWeight;
      this.busVolume = busVolume;
      this.busPickupPerson = busPickupPerson;
      this.busPickupLogo = busPickupLogo;
      this.busPickupUnit = busPickupUnit;
      this.busPickupTime = busPickupTime;
      this.busDeliAddress = busDeliAddress;
      this.busProcUnit = busProcUnit;
      this.busNotifiSource = busNotifiSource;
      this.busUpdateSign = busUpdateSign;
      this.busSingleType = busSingleType;
      this.busImportantNote = busImportantNote;
      this.busRemark = busRemark;
      this.busConsultContent = busConsultContent;
      this.busConsultResults = busConsultResults;
      this.busAcceptor = busAcceptor;
      this.busConsultTime = busConsultTime;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "BusinessOrder{" +
              "busMemoNo='" + busMemoNo + '\'' +
              ", busCustomerNo='" + busCustomerNo + '\'' +
              ", busCustomerOdd='" + busCustomerOdd + '\'' +
              ", busProduct='" + busProduct + '\'' +
              ", busResPickupTime=" + busResPickupTime +
              ", busResReceiptTime=" + busResReceiptTime +
              ", busAssigner='" + busAssigner + '\'' +
              ", busAllocateTime=" + busAllocateTime +
              ", busWeight=" + busWeight +
              ", busVolume=" + busVolume +
              ", busPickupPerson='" + busPickupPerson + '\'' +
              ", busPickupLogo='" + busPickupLogo + '\'' +
              ", busPickupUnit='" + busPickupUnit + '\'' +
              ", busPickupTime=" + busPickupTime +
              ", busDeliAddress='" + busDeliAddress + '\'' +
              ", busProcUnit='" + busProcUnit + '\'' +
              ", busNotifiSource='" + busNotifiSource + '\'' +
              ", busUpdateSign=" + busUpdateSign +
              ", busSingleType='" + busSingleType + '\'' +
              ", busImportantNote='" + busImportantNote + '\'' +
              ", busRemark='" + busRemark + '\'' +
              ", busConsultContent='" + busConsultContent + '\'' +
              ", busConsultResults='" + busConsultResults + '\'' +
              ", busAcceptor='" + busAcceptor + '\'' +
              ", busConsultTime=" + busConsultTime +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getBusMemoNo() {
      return busMemoNo;
   }

   public void setBusMemoNo(String busMemoNo) {
      this.busMemoNo = busMemoNo;
   }

   public String getBusCustomerNo() {
      return busCustomerNo;
   }

   public void setBusCustomerNo(String busCustomerNo) {
      this.busCustomerNo = busCustomerNo;
   }

   public String getBusCustomerOdd() {
      return busCustomerOdd;
   }

   public void setBusCustomerOdd(String busCustomerOdd) {
      this.busCustomerOdd = busCustomerOdd;
   }

   public String getBusProduct() {
      return busProduct;
   }

   public void setBusProduct(String busProduct) {
      this.busProduct = busProduct;
   }

   public Date getBusResPickupTime() {
      return busResPickupTime;
   }

   public void setBusResPickupTime(Date busResPickupTime) {
      this.busResPickupTime = busResPickupTime;
   }

   public Date getBusResReceiptTime() {
      return busResReceiptTime;
   }

   public void setBusResReceiptTime(Date busResReceiptTime) {
      this.busResReceiptTime = busResReceiptTime;
   }

   public String getBusAssigner() {
      return busAssigner;
   }

   public void setBusAssigner(String busAssigner) {
      this.busAssigner = busAssigner;
   }

   public Date getBusAllocateTime() {
      return busAllocateTime;
   }

   public void setBusAllocateTime(Date busAllocateTime) {
      this.busAllocateTime = busAllocateTime;
   }

   public double getBusWeight() {
      return busWeight;
   }

   public void setBusWeight(double busWeight) {
      this.busWeight = busWeight;
   }

   public double getBusVolume() {
      return busVolume;
   }

   public void setBusVolume(double busVolume) {
      this.busVolume = busVolume;
   }

   public String getBusPickupPerson() {
      return busPickupPerson;
   }

   public void setBusPickupPerson(String busPickupPerson) {
      this.busPickupPerson = busPickupPerson;
   }

   public String getBusPickupLogo() {
      return busPickupLogo;
   }

   public void setBusPickupLogo(String busPickupLogo) {
      this.busPickupLogo = busPickupLogo;
   }

   public String getBusPickupUnit() {
      return busPickupUnit;
   }

   public void setBusPickupUnit(String busPickupUnit) {
      this.busPickupUnit = busPickupUnit;
   }

   public Date getBusPickupTime() {
      return busPickupTime;
   }

   public void setBusPickupTime(Date busPickupTime) {
      this.busPickupTime = busPickupTime;
   }

   public String getBusDeliAddress() {
      return busDeliAddress;
   }

   public void setBusDeliAddress(String busDeliAddress) {
      this.busDeliAddress = busDeliAddress;
   }

   public String getBusProcUnit() {
      return busProcUnit;
   }

   public void setBusProcUnit(String busProcUnit) {
      this.busProcUnit = busProcUnit;
   }

   public String getBusNotifiSource() {
      return busNotifiSource;
   }

   public void setBusNotifiSource(String busNotifiSource) {
      this.busNotifiSource = busNotifiSource;
   }

   public int getBusUpdateSign() {
      return busUpdateSign;
   }

   public void setBusUpdateSign(int busUpdateSign) {
      this.busUpdateSign = busUpdateSign;
   }

   public String getBusSingleType() {
      return busSingleType;
   }

   public void setBusSingleType(String busSingleType) {
      this.busSingleType = busSingleType;
   }

   public String getBusImportantNote() {
      return busImportantNote;
   }

   public void setBusImportantNote(String busImportantNote) {
      this.busImportantNote = busImportantNote;
   }

   public String getBusRemark() {
      return busRemark;
   }

   public void setBusRemark(String busRemark) {
      this.busRemark = busRemark;
   }

   public String getBusConsultContent() {
      return busConsultContent;
   }

   public void setBusConsultContent(String busConsultContent) {
      this.busConsultContent = busConsultContent;
   }

   public String getBusConsultResults() {
      return busConsultResults;
   }

   public void setBusConsultResults(String busConsultResults) {
      this.busConsultResults = busConsultResults;
   }

   public String getBusAcceptor() {
      return busAcceptor;
   }

   public void setBusAcceptor(String busAcceptor) {
      this.busAcceptor = busAcceptor;
   }

   public Date getBusConsultTime() {
      return busConsultTime;
   }

   public void setBusConsultTime(Date busConsultTime) {
      this.busConsultTime = busConsultTime;
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