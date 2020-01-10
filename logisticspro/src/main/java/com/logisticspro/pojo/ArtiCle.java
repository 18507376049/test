package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 包装材料
 */
public class ArtiCle {
   /** 包装材料编号
    */
   private String artNo;
   /** 物品名称
    */
   private String artName;
   /** 规格
    */
   private String artStandard;
   /** 操作人工号
    */
   private String artOperateID;
   /** 操作人姓名
    */
   private String artOperateName;
   /** 操作时间
    */
   private java.util.Date artOperateTime;
   /** 计量单位
    */
   private String artCalculateUnit;
   /** 状态
    */
   private int artStatus = 0;
   /** 备注
    */
   private String artRemarks;
   /** 价格
    */
   private double artPlanPrice;
   /** 类型编号
    */
   private String artTypeId;
   /** 供货商编号
    */
   private String artSupID;
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

   public ArtiCle() {
   }

   public ArtiCle(String artNo, String artName, String artStandard, String artOperateID, String artOperateName, Date artOperateTime, String artCalculateUnit, int artStatus, String artRemarks, double artPlanPrice, String artTypeId, String artSupID, String duo1, String duo2, String duo3) {
      this.artNo = artNo;
      this.artName = artName;
      this.artStandard = artStandard;
      this.artOperateID = artOperateID;
      this.artOperateName = artOperateName;
      this.artOperateTime = artOperateTime;
      this.artCalculateUnit = artCalculateUnit;
      this.artStatus = artStatus;
      this.artRemarks = artRemarks;
      this.artPlanPrice = artPlanPrice;
      this.artTypeId = artTypeId;
      this.artSupID = artSupID;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "ArtiCle{" +
              "artNo='" + artNo + '\'' +
              ", artName='" + artName + '\'' +
              ", artStandard='" + artStandard + '\'' +
              ", artOperateID='" + artOperateID + '\'' +
              ", artOperateName='" + artOperateName + '\'' +
              ", artOperateTime=" + artOperateTime +
              ", artCalculateUnit='" + artCalculateUnit + '\'' +
              ", artStatus=" + artStatus +
              ", artRemarks='" + artRemarks + '\'' +
              ", artPlanPrice=" + artPlanPrice +
              ", artTypeId='" + artTypeId + '\'' +
              ", artSupID='" + artSupID + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getArtNo() {
      return artNo;
   }

   public void setArtNo(String artNo) {
      this.artNo = artNo;
   }

   public String getArtName() {
      return artName;
   }

   public void setArtName(String artName) {
      this.artName = artName;
   }

   public String getArtStandard() {
      return artStandard;
   }

   public void setArtStandard(String artStandard) {
      this.artStandard = artStandard;
   }

   public String getArtOperateID() {
      return artOperateID;
   }

   public void setArtOperateID(String artOperateID) {
      this.artOperateID = artOperateID;
   }

   public String getArtOperateName() {
      return artOperateName;
   }

   public void setArtOperateName(String artOperateName) {
      this.artOperateName = artOperateName;
   }

   public Date getArtOperateTime() {
      return artOperateTime;
   }

   public void setArtOperateTime(Date artOperateTime) {
      this.artOperateTime = artOperateTime;
   }

   public String getArtCalculateUnit() {
      return artCalculateUnit;
   }

   public void setArtCalculateUnit(String artCalculateUnit) {
      this.artCalculateUnit = artCalculateUnit;
   }

   public int getArtStatus() {
      return artStatus;
   }

   public void setArtStatus(int artStatus) {
      this.artStatus = artStatus;
   }

   public String getArtRemarks() {
      return artRemarks;
   }

   public void setArtRemarks(String artRemarks) {
      this.artRemarks = artRemarks;
   }

   public double getArtPlanPrice() {
      return artPlanPrice;
   }

   public void setArtPlanPrice(double artPlanPrice) {
      this.artPlanPrice = artPlanPrice;
   }

   public String getArtTypeId() {
      return artTypeId;
   }

   public void setArtTypeId(String artTypeId) {
      this.artTypeId = artTypeId;
   }

   public String getArtSupID() {
      return artSupID;
   }

   public void setArtSupID(String artSupID) {
      this.artSupID = artSupID;
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