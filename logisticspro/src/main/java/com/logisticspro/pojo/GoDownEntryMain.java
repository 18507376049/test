package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 入库
 */
public class GoDownEntryMain {
   /**
    * 入库单号
    */
   private String godownNo;
   /**
    * 入库类型
    */
   private String godType;
   /**
    * 运输单号
    */
   private String godTransport;
   /**
    * 采购订单号
    */
   private String godPurchase;
   /**
    * 所属单位
    */
   private String godUnit;
   /**
    * 状态
    */
   private int godStatus;
   /**
    * 开单人工号
    */
   private String godOperationStaffNo;
   /**
    * 开单人姓名
    */
   private String godOperationStaffName;
   /**
    * 开单时间
    */
   private Date godTime;
   /**
    * 备注
    */
   private String godRemarks;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public GoDownEntryMain() {
   }

   public GoDownEntryMain(String godownNo, String godType, String godTransport, String godPurchase, String godUnit, int godStatus, String godOperationStaffNo, String godOperationStaffName, Date godTime, String godRemarks, String duo1, String duo2) {
      this.godownNo = godownNo;
      this.godType = godType;
      this.godTransport = godTransport;
      this.godPurchase = godPurchase;
      this.godUnit = godUnit;
      this.godStatus = godStatus;
      this.godOperationStaffNo = godOperationStaffNo;
      this.godOperationStaffName = godOperationStaffName;
      this.godTime = godTime;
      this.godRemarks = godRemarks;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "GoDownEntryMain{" +
              "godownNo='" + godownNo + '\'' +
              ", godType='" + godType + '\'' +
              ", godTransport='" + godTransport + '\'' +
              ", godPurchase='" + godPurchase + '\'' +
              ", godUnit='" + godUnit + '\'' +
              ", godStatus=" + godStatus +
              ", godOperationStaffNo='" + godOperationStaffNo + '\'' +
              ", godOperationStaffName='" + godOperationStaffName + '\'' +
              ", godTime=" + godTime +
              ", godRemarks='" + godRemarks + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getGodownNo() {
      return godownNo;
   }

   public void setGodownNo(String godownNo) {
      this.godownNo = godownNo;
   }

   public String getGodType() {
      return godType;
   }

   public void setGodType(String godType) {
      this.godType = godType;
   }

   public String getGodTransport() {
      return godTransport;
   }

   public void setGodTransport(String godTransport) {
      this.godTransport = godTransport;
   }

   public String getGodPurchase() {
      return godPurchase;
   }

   public void setGodPurchase(String godPurchase) {
      this.godPurchase = godPurchase;
   }

   public String getGodUnit() {
      return godUnit;
   }

   public void setGodUnit(String godUnit) {
      this.godUnit = godUnit;
   }

   public int getGodStatus() {
      return godStatus;
   }

   public void setGodStatus(int godStatus) {
      this.godStatus = godStatus;
   }

   public String getGodOperationStaffNo() {
      return godOperationStaffNo;
   }

   public void setGodOperationStaffNo(String godOperationStaffNo) {
      this.godOperationStaffNo = godOperationStaffNo;
   }

   public String getGodOperationStaffName() {
      return godOperationStaffName;
   }

   public void setGodOperationStaffName(String godOperationStaffName) {
      this.godOperationStaffName = godOperationStaffName;
   }

   public Date getGodTime() {
      return godTime;
   }

   public void setGodTime(Date godTime) {
      this.godTime = godTime;
   }

   public String getGodRemarks() {
      return godRemarks;
   }

   public void setGodRemarks(String godRemarks) {
      this.godRemarks = godRemarks;
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