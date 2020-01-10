package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 出库
 */
public class OutboundListMain {
   /**
    * 出库单号
    */
   private String olmownEntry;
   /**
    * 出库类型
    */
   private String olmType;
   /**
    * 运输单号
    */
   private String olmTransport;
   /**
    * 所属单位
    */
   private String olmUnit;
   /**
    * 开单人工号
    */
   private String olmOperationStaffNo;
   /**
    * 开单人姓名
    */
   private String olmOperationStaffName;
   /**
    * 开单时间
    */
   private Date olmTime;
   /**
    * 经办人工号
    */
   private String olmOperatorNo;
   /**
    * 经办人姓名
    */
   private String olmOperatorName;
   /**
    * 客户编号
    */
   private String olmClientNo;
   /**
    * 客户名称
    */
   private String olmClientName;
   /**
    * 领用人工号
    */
   private String olmUseNo;
   /**
    * 领用人姓名
    *
    * @pdOid 0b02d0fe-1b40-4797-a318-05d643dc92bd
    */
   private String olmUseName;
   /**
    * 领用时间
    */
   private Date olmUseTime;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public OutboundListMain() {
   }

   public OutboundListMain(String olmownEntry, String olmType, String olmTransport, String olmUnit, String olmOperationStaffNo, String olmOperationStaffName, Date olmTime, String olmOperatorNo, String olmOperatorName, String olmClientNo, String olmClientName, String olmUseNo, String olmUseName, Date olmUseTime, String duo1, String duo2) {
      this.olmownEntry = olmownEntry;
      this.olmType = olmType;
      this.olmTransport = olmTransport;
      this.olmUnit = olmUnit;
      this.olmOperationStaffNo = olmOperationStaffNo;
      this.olmOperationStaffName = olmOperationStaffName;
      this.olmTime = olmTime;
      this.olmOperatorNo = olmOperatorNo;
      this.olmOperatorName = olmOperatorName;
      this.olmClientNo = olmClientNo;
      this.olmClientName = olmClientName;
      this.olmUseNo = olmUseNo;
      this.olmUseName = olmUseName;
      this.olmUseTime = olmUseTime;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "OutboundListMain{" +
              "olmownEntry='" + olmownEntry + '\'' +
              ", olmType='" + olmType + '\'' +
              ", olmTransport='" + olmTransport + '\'' +
              ", olmUnit='" + olmUnit + '\'' +
              ", olmOperationStaffNo='" + olmOperationStaffNo + '\'' +
              ", olmOperationStaffName='" + olmOperationStaffName + '\'' +
              ", olmTime=" + olmTime +
              ", olmOperatorNo='" + olmOperatorNo + '\'' +
              ", olmOperatorName='" + olmOperatorName + '\'' +
              ", olmClientNo='" + olmClientNo + '\'' +
              ", olmClientName='" + olmClientName + '\'' +
              ", olmUseNo='" + olmUseNo + '\'' +
              ", olmUseName='" + olmUseName + '\'' +
              ", olmUseTime=" + olmUseTime +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getOlmownEntry() {
      return olmownEntry;
   }

   public void setOlmownEntry(String olmownEntry) {
      this.olmownEntry = olmownEntry;
   }

   public String getOlmType() {
      return olmType;
   }

   public void setOlmType(String olmType) {
      this.olmType = olmType;
   }

   public String getOlmTransport() {
      return olmTransport;
   }

   public void setOlmTransport(String olmTransport) {
      this.olmTransport = olmTransport;
   }

   public String getOlmUnit() {
      return olmUnit;
   }

   public void setOlmUnit(String olmUnit) {
      this.olmUnit = olmUnit;
   }

   public String getOlmOperationStaffNo() {
      return olmOperationStaffNo;
   }

   public void setOlmOperationStaffNo(String olmOperationStaffNo) {
      this.olmOperationStaffNo = olmOperationStaffNo;
   }

   public String getOlmOperationStaffName() {
      return olmOperationStaffName;
   }

   public void setOlmOperationStaffName(String olmOperationStaffName) {
      this.olmOperationStaffName = olmOperationStaffName;
   }

   public Date getOlmTime() {
      return olmTime;
   }

   public void setOlmTime(Date olmTime) {
      this.olmTime = olmTime;
   }

   public String getOlmOperatorNo() {
      return olmOperatorNo;
   }

   public void setOlmOperatorNo(String olmOperatorNo) {
      this.olmOperatorNo = olmOperatorNo;
   }

   public String getOlmOperatorName() {
      return olmOperatorName;
   }

   public void setOlmOperatorName(String olmOperatorName) {
      this.olmOperatorName = olmOperatorName;
   }

   public String getOlmClientNo() {
      return olmClientNo;
   }

   public void setOlmClientNo(String olmClientNo) {
      this.olmClientNo = olmClientNo;
   }

   public String getOlmClientName() {
      return olmClientName;
   }

   public void setOlmClientName(String olmClientName) {
      this.olmClientName = olmClientName;
   }

   public String getOlmUseNo() {
      return olmUseNo;
   }

   public void setOlmUseNo(String olmUseNo) {
      this.olmUseNo = olmUseNo;
   }

   public String getOlmUseName() {
      return olmUseName;
   }

   public void setOlmUseName(String olmUseName) {
      this.olmUseName = olmUseName;
   }

   public Date getOlmUseTime() {
      return olmUseTime;
   }

   public void setOlmUseTime(Date olmUseTime) {
      this.olmUseTime = olmUseTime;
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