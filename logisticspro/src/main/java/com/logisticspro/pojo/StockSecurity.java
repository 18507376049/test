package com.logisticspro.pojo;
import java.util.*;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 库存安全
 */
public class StockSecurity {
   /**
    * 库存安全编号
    *  */
   private String stoNo;
   /**
    * 物品编码
    * */
   private String stoNumber;
   /**
    * 物品名称
    * */
   private String stoName;
   /**
    * 上限
    * */
   private int stoSuperiorLimit;
   /**
    * 下限
    * */
   private int stoLowerLimit;
   /**
    * 规格
    *  */
   private String stoStandard;
   /**
    * 类型
    *  */
   private String stoType;
   /**
    * 操作人工号
    *  */
   private String stoOperationStaffNo;
   /**
    * 操作人姓名
    *  */
   private String stoOperationStaffName;
   /**
    * 操作时间
    * */
   private Date stoOperateTime;
   /**
    * 状态
    *  */
   private int stoStatus = 0;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public String getStoNo() {
      return stoNo;
   }

   public void setStoNo(String stoNo) {
      this.stoNo = stoNo;
   }

   public String getStoNumber() {
      return stoNumber;
   }

   public void setStoNumber(String stoNumber) {
      this.stoNumber = stoNumber;
   }

   public String getStoName() {
      return stoName;
   }

   public void setStoName(String stoName) {
      this.stoName = stoName;
   }

   public int getStoSuperiorLimit() {
      return stoSuperiorLimit;
   }

   public void setStoSuperiorLimit(int stoSuperiorLimit) {
      this.stoSuperiorLimit = stoSuperiorLimit;
   }

   public int getStoLowerLimit() {
      return stoLowerLimit;
   }

   public void setStoLowerLimit(int stoLowerLimit) {
      this.stoLowerLimit = stoLowerLimit;
   }

   public String getStoStandard() {
      return stoStandard;
   }

   public void setStoStandard(String stoStandard) {
      this.stoStandard = stoStandard;
   }

   public String getStoType() {
      return stoType;
   }

   public void setStoType(String stoType) {
      this.stoType = stoType;
   }

   public String getStoOperationStaffNo() {
      return stoOperationStaffNo;
   }

   public void setStoOperationStaffNo(String stoOperationStaffNo) {
      this.stoOperationStaffNo = stoOperationStaffNo;
   }

   public String getStoOperationStaffName() {
      return stoOperationStaffName;
   }

   public void setStoOperationStaffName(String stoOperationStaffName) {
      this.stoOperationStaffName = stoOperationStaffName;
   }

   public Date getStoOperateTime() {
      return stoOperateTime;
   }

   public void setStoOperateTime(Date stoOperateTime) {
      this.stoOperateTime = stoOperateTime;
   }

   public int getStoStatus() {
      return stoStatus;
   }

   public void setStoStatus(int stoStatus) {
      this.stoStatus = stoStatus;
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

   public StockSecurity(String stoNo, String stoNumber, String stoName, int stoSuperiorLimit, int stoLowerLimit, String stoStandard, String stoType, String stoOperationStaffNo, String stoOperationStaffName, Date stoOperateTime, int stoStatus, String duo1, String duo2) {
      this.stoNo = stoNo;
      this.stoNumber = stoNumber;
      this.stoName = stoName;
      this.stoSuperiorLimit = stoSuperiorLimit;
      this.stoLowerLimit = stoLowerLimit;
      this.stoStandard = stoStandard;
      this.stoType = stoType;
      this.stoOperationStaffNo = stoOperationStaffNo;
      this.stoOperationStaffName = stoOperationStaffName;
      this.stoOperateTime = stoOperateTime;
      this.stoStatus = stoStatus;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   public StockSecurity() {
   }

   @Override
   public String toString() {
      return "StockSecurity{" +
              "stoNo='" + stoNo + '\'' +
              ", stoNumber='" + stoNumber + '\'' +
              ", stoName='" + stoName + '\'' +
              ", stoSuperiorLimit=" + stoSuperiorLimit +
              ", stoLowerLimit=" + stoLowerLimit +
              ", stoStandard='" + stoStandard + '\'' +
              ", stoType='" + stoType + '\'' +
              ", stoOperationStaffNo='" + stoOperationStaffNo + '\'' +
              ", stoOperationStaffName='" + stoOperationStaffName + '\'' +
              ", stoOperateTime=" + stoOperateTime +
              ", stoStatus=" + stoStatus +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }
}