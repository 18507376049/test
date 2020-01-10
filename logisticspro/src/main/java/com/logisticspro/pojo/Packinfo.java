package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 包装信息
 */
public class Packinfo {
   /**
    * 包装信息编号
    */
   private String pacNo;
   /**
    * 工作单号
    */
   private String pacWosNo;
   /**
    * 实际件数
    */
   private int pacQuantity;
   /**
    * 实际重量
    */
   private double pacWeight;
   /**
    * 体积
    */
   private double pacFactVolume;
   /**
    * 操作员
    */
   private String pacOperator;
   /**
    * 计费重量
    */
   private double pacOverstepWeight;
   /**
    * 实际体积
    */
   private int pacVolume;
   /**
    * 包装费
    */
   private int pacCost;
   /**
    * 入库人
    */
   private String pacEnter;
   /**
    * 入库时间
    */
   private Date pacEnterDate;
   /**
    * 出库人
    */
   private String pacLeave;
   /**
    * 出库时间
    */
   private Date pacLeaveDate;
   /**
    * 包装材料编号
    */
   private String pacArtNo;
   /**
    * 包装价格
    */
   private double pacArtPrice;
   /**
    * 包装材料数量
    */
   private int pacArtNumber;
   /**
    * 运费
    */
   private double pacYouPrice;
   /**
    * 备注
    */
   private String pacDesc;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public Packinfo() {
   }

   public Packinfo(String pacNo, String pacWosNo, int pacQuantity, double pacWeight, double pacFactVolume, String pacOperator, double pacOverstepWeight, int pacVolume, int pacCost, String pacEnter, Date pacEnterDate, String pacLeave, Date pacLeaveDate, String pacArtNo, double pacArtPrice, int pacArtNumber, double pacYouPrice, String pacDesc, String duo1, String duo2) {
      this.pacNo = pacNo;
      this.pacWosNo = pacWosNo;
      this.pacQuantity = pacQuantity;
      this.pacWeight = pacWeight;
      this.pacFactVolume = pacFactVolume;
      this.pacOperator = pacOperator;
      this.pacOverstepWeight = pacOverstepWeight;
      this.pacVolume = pacVolume;
      this.pacCost = pacCost;
      this.pacEnter = pacEnter;
      this.pacEnterDate = pacEnterDate;
      this.pacLeave = pacLeave;
      this.pacLeaveDate = pacLeaveDate;
      this.pacArtNo = pacArtNo;
      this.pacArtPrice = pacArtPrice;
      this.pacArtNumber = pacArtNumber;
      this.pacYouPrice = pacYouPrice;
      this.pacDesc = pacDesc;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "Packinfo{" +
              "pacNo='" + pacNo + '\'' +
              ", pacWosNo='" + pacWosNo + '\'' +
              ", pacQuantity=" + pacQuantity +
              ", pacWeight=" + pacWeight +
              ", pacFactVolume=" + pacFactVolume +
              ", pacOperator='" + pacOperator + '\'' +
              ", pacOverstepWeight=" + pacOverstepWeight +
              ", pacVolume=" + pacVolume +
              ", pacCost=" + pacCost +
              ", pacEnter='" + pacEnter + '\'' +
              ", pacEnterDate=" + pacEnterDate +
              ", pacLeave='" + pacLeave + '\'' +
              ", pacLeaveDate=" + pacLeaveDate +
              ", pacArtNo='" + pacArtNo + '\'' +
              ", pacArtPrice=" + pacArtPrice +
              ", pacArtNumber=" + pacArtNumber +
              ", pacYouPrice=" + pacYouPrice +
              ", pacDesc='" + pacDesc + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getPacNo() {
      return pacNo;
   }

   public void setPacNo(String pacNo) {
      this.pacNo = pacNo;
   }

   public String getPacWosNo() {
      return pacWosNo;
   }

   public void setPacWosNo(String pacWosNo) {
      this.pacWosNo = pacWosNo;
   }

   public int getPacQuantity() {
      return pacQuantity;
   }

   public void setPacQuantity(int pacQuantity) {
      this.pacQuantity = pacQuantity;
   }

   public double getPacWeight() {
      return pacWeight;
   }

   public void setPacWeight(double pacWeight) {
      this.pacWeight = pacWeight;
   }

   public double getPacFactVolume() {
      return pacFactVolume;
   }

   public void setPacFactVolume(double pacFactVolume) {
      this.pacFactVolume = pacFactVolume;
   }

   public String getPacOperator() {
      return pacOperator;
   }

   public void setPacOperator(String pacOperator) {
      this.pacOperator = pacOperator;
   }

   public double getPacOverstepWeight() {
      return pacOverstepWeight;
   }

   public void setPacOverstepWeight(double pacOverstepWeight) {
      this.pacOverstepWeight = pacOverstepWeight;
   }

   public int getPacVolume() {
      return pacVolume;
   }

   public void setPacVolume(int pacVolume) {
      this.pacVolume = pacVolume;
   }

   public int getPacCost() {
      return pacCost;
   }

   public void setPacCost(int pacCost) {
      this.pacCost = pacCost;
   }

   public String getPacEnter() {
      return pacEnter;
   }

   public void setPacEnter(String pacEnter) {
      this.pacEnter = pacEnter;
   }

   public Date getPacEnterDate() {
      return pacEnterDate;
   }

   public void setPacEnterDate(Date pacEnterDate) {
      this.pacEnterDate = pacEnterDate;
   }

   public String getPacLeave() {
      return pacLeave;
   }

   public void setPacLeave(String pacLeave) {
      this.pacLeave = pacLeave;
   }

   public Date getPacLeaveDate() {
      return pacLeaveDate;
   }

   public void setPacLeaveDate(Date pacLeaveDate) {
      this.pacLeaveDate = pacLeaveDate;
   }

   public String getPacArtNo() {
      return pacArtNo;
   }

   public void setPacArtNo(String pacArtNo) {
      this.pacArtNo = pacArtNo;
   }

   public double getPacArtPrice() {
      return pacArtPrice;
   }

   public void setPacArtPrice(double pacArtPrice) {
      this.pacArtPrice = pacArtPrice;
   }

   public int getPacArtNumber() {
      return pacArtNumber;
   }

   public void setPacArtNumber(int pacArtNumber) {
      this.pacArtNumber = pacArtNumber;
   }

   public double getPacYouPrice() {
      return pacYouPrice;
   }

   public void setPacYouPrice(double pacYouPrice) {
      this.pacYouPrice = pacYouPrice;
   }

   public String getPacDesc() {
      return pacDesc;
   }

   public void setPacDesc(String pacDesc) {
      this.pacDesc = pacDesc;
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