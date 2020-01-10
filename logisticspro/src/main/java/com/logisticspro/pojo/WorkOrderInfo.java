package com.logisticspro.pojo;
import java.util.*;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 工单
 */
public class WorkOrderInfo {
   /**
    * 工单号
    * */
   private String worNo;
   /**
    * 工单类型
    *  */
   private String worType;
   /**
    * 通知单号
    *  */
   private String worBusMemoNo;
   /**
    * 状态
    *  */
   private int worTakeState = 0;
   /**
    * 短信序号
    * */
   private String worMessageNo;
   /**
    * 工单生成时间
    *  */
   private Date worGeneratedTime;
   /**
    * 追单次数
    *  */
   private int worChaseNumber;
   /**
    * 小件员编号
    *  */
   private String worSmallCrewNo;
   /**
    * 取件单位
    *  */
   private String worTakeUnit;
   /**
    * 取件时间
    *  */
   private Date worTakeTime;
   /**
    * 分拣编码
    * */
   private String worSortCode;
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

   public String getWorNo() {
      return worNo;
   }

   public void setWorNo(String worNo) {
      this.worNo = worNo;
   }

   public String getWorType() {
      return worType;
   }

   public void setWorType(String worType) {
      this.worType = worType;
   }

   public String getWorBusMemoNo() {
      return worBusMemoNo;
   }

   public void setWorBusMemoNo(String worBusMemoNo) {
      this.worBusMemoNo = worBusMemoNo;
   }

   public int getWorTakeState() {
      return worTakeState;
   }

   public void setWorTakeState(int worTakeState) {
      this.worTakeState = worTakeState;
   }

   public String getWorMessageNo() {
      return worMessageNo;
   }

   public void setWorMessageNo(String worMessageNo) {
      this.worMessageNo = worMessageNo;
   }

   public Date getWorGeneratedTime() {
      return worGeneratedTime;
   }

   public void setWorGeneratedTime(Date worGeneratedTime) {
      this.worGeneratedTime = worGeneratedTime;
   }

   public int getWorChaseNumber() {
      return worChaseNumber;
   }

   public void setWorChaseNumber(int worChaseNumber) {
      this.worChaseNumber = worChaseNumber;
   }

   public String getWorSmallCrewNo() {
      return worSmallCrewNo;
   }

   public void setWorSmallCrewNo(String worSmallCrewNo) {
      this.worSmallCrewNo = worSmallCrewNo;
   }

   public String getWorTakeUnit() {
      return worTakeUnit;
   }

   public void setWorTakeUnit(String worTakeUnit) {
      this.worTakeUnit = worTakeUnit;
   }

   public Date getWorTakeTime() {
      return worTakeTime;
   }

   public void setWorTakeTime(Date worTakeTime) {
      this.worTakeTime = worTakeTime;
   }

   public String getWorSortCode() {
      return worSortCode;
   }

   public void setWorSortCode(String worSortCode) {
      this.worSortCode = worSortCode;
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

   public WorkOrderInfo(String worNo, String worType, String worBusMemoNo, int worTakeState, String worMessageNo, Date worGeneratedTime, int worChaseNumber, String worSmallCrewNo, String worTakeUnit, Date worTakeTime, String worSortCode, String duo1, String duo2, String duo3) {
      this.worNo = worNo;
      this.worType = worType;
      this.worBusMemoNo = worBusMemoNo;
      this.worTakeState = worTakeState;
      this.worMessageNo = worMessageNo;
      this.worGeneratedTime = worGeneratedTime;
      this.worChaseNumber = worChaseNumber;
      this.worSmallCrewNo = worSmallCrewNo;
      this.worTakeUnit = worTakeUnit;
      this.worTakeTime = worTakeTime;
      this.worSortCode = worSortCode;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public WorkOrderInfo() {
   }

   @Override
   public String toString() {
      return "WorkOrderInfo{" +
              "worNo='" + worNo + '\'' +
              ", worType='" + worType + '\'' +
              ", worBusMemoNo='" + worBusMemoNo + '\'' +
              ", worTakeState=" + worTakeState +
              ", worMessageNo='" + worMessageNo + '\'' +
              ", worGeneratedTime=" + worGeneratedTime +
              ", worChaseNumber=" + worChaseNumber +
              ", worSmallCrewNo='" + worSmallCrewNo + '\'' +
              ", worTakeUnit='" + worTakeUnit + '\'' +
              ", worTakeTime=" + worTakeTime +
              ", worSortCode='" + worSortCode + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}