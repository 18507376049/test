package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 盘库
 */
public class Inventory {
   /**
    * 盘库单号
    */
   private String invNo;
   /**
    * 扫描设备号
    */
   private String invScaDeviceNumber;
   /**
    * 总件数
    */
   private int invTotalNumber;
   /**
    * 盘库人编号
    */
   private String invPerson;
   /**
    * 盘库时间
    */
   private Date invTime;
   /**
    * 操作单位
    */
   private String invOperationUnit;
   /**
    * 仓库编号
    */
   private String invWareNo;

   public Inventory() {
   }

   public Inventory(String invNo, String invScaDeviceNumber, int invTotalNumber, String invPerson, Date invTime, String invOperationUnit, String invWareNo) {
      this.invNo = invNo;
      this.invScaDeviceNumber = invScaDeviceNumber;
      this.invTotalNumber = invTotalNumber;
      this.invPerson = invPerson;
      this.invTime = invTime;
      this.invOperationUnit = invOperationUnit;
      this.invWareNo = invWareNo;
   }

   @Override
   public String toString() {
      return "Inventory{" +
              "invNo='" + invNo + '\'' +
              ", invScaDeviceNumber='" + invScaDeviceNumber + '\'' +
              ", invTotalNumber=" + invTotalNumber +
              ", invPerson='" + invPerson + '\'' +
              ", invTime=" + invTime +
              ", invOperationUnit='" + invOperationUnit + '\'' +
              ", invWareNo='" + invWareNo + '\'' +
              '}';
   }

   public String getInvNo() {
      return invNo;
   }

   public void setInvNo(String invNo) {
      this.invNo = invNo;
   }

   public String getInvScaDeviceNumber() {
      return invScaDeviceNumber;
   }

   public void setInvScaDeviceNumber(String invScaDeviceNumber) {
      this.invScaDeviceNumber = invScaDeviceNumber;
   }

   public int getInvTotalNumber() {
      return invTotalNumber;
   }

   public void setInvTotalNumber(int invTotalNumber) {
      this.invTotalNumber = invTotalNumber;
   }

   public String getInvPerson() {
      return invPerson;
   }

   public void setInvPerson(String invPerson) {
      this.invPerson = invPerson;
   }

   public Date getInvTime() {
      return invTime;
   }

   public void setInvTime(Date invTime) {
      this.invTime = invTime;
   }

   public String getInvOperationUnit() {
      return invOperationUnit;
   }

   public void setInvOperationUnit(String invOperationUnit) {
      this.invOperationUnit = invOperationUnit;
   }

   public String getInvWareNo() {
      return invWareNo;
   }

   public void setInvWareNo(String invWareNo) {
      this.invWareNo = invWareNo;
   }
}