package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 员工角色
 */
public class GodownEntryDetail {
   /**
    * 入库明细单号
    */
   private String gedNo;
   /**
    * 货物编码
    */
   private String gedNumber;
   /**
    * 货物名称
    * */
   private String gedName;
   /** 起始号段
   */
   private String gedOrigin;
   /** 截止号段
     */
   private String gedEnd;
   /** 入库数量
     */
   private int gedQuantity;
   /** 实际数量
    */
   private int gedRealityQuantity;
   /** 价格
    */
   private double gedPrice;
   /** 规格
    */
   private String gedStandard;
   /** 类型
    */
   private String gedType;
   /** 计量单位
    */
   private String gedUnit;
   /** 状态
    */
   private int gedStatus = 0;
   /** 入库单号
    */
   private String gedGodNo;
   /**
    *
    *  */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public GodownEntryDetail() {
   }

   public GodownEntryDetail(String gedNo, String gedNumber, String gedName, String gedOrigin, String gedEnd, int gedQuantity, int gedRealityQuantity, double gedPrice, String gedStandard, String gedType, String gedUnit, int gedStatus, String gedGodNo, String duo1, String duo2) {
      this.gedNo = gedNo;
      this.gedNumber = gedNumber;
      this.gedName = gedName;
      this.gedOrigin = gedOrigin;
      this.gedEnd = gedEnd;
      this.gedQuantity = gedQuantity;
      this.gedRealityQuantity = gedRealityQuantity;
      this.gedPrice = gedPrice;
      this.gedStandard = gedStandard;
      this.gedType = gedType;
      this.gedUnit = gedUnit;
      this.gedStatus = gedStatus;
      this.gedGodNo = gedGodNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "GodownEntryDetail{" +
              "gedNo='" + gedNo + '\'' +
              ", gedNumber='" + gedNumber + '\'' +
              ", gedName='" + gedName + '\'' +
              ", gedOrigin='" + gedOrigin + '\'' +
              ", gedEnd='" + gedEnd + '\'' +
              ", gedQuantity=" + gedQuantity +
              ", gedRealityQuantity=" + gedRealityQuantity +
              ", gedPrice=" + gedPrice +
              ", gedStandard='" + gedStandard + '\'' +
              ", gedType='" + gedType + '\'' +
              ", gedUnit='" + gedUnit + '\'' +
              ", gedStatus=" + gedStatus +
              ", gedGodNo='" + gedGodNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getGedNo() {
      return gedNo;
   }

   public void setGedNo(String gedNo) {
      this.gedNo = gedNo;
   }

   public String getGedNumber() {
      return gedNumber;
   }

   public void setGedNumber(String gedNumber) {
      this.gedNumber = gedNumber;
   }

   public String getGedName() {
      return gedName;
   }

   public void setGedName(String gedName) {
      this.gedName = gedName;
   }

   public String getGedOrigin() {
      return gedOrigin;
   }

   public void setGedOrigin(String gedOrigin) {
      this.gedOrigin = gedOrigin;
   }

   public String getGedEnd() {
      return gedEnd;
   }

   public void setGedEnd(String gedEnd) {
      this.gedEnd = gedEnd;
   }

   public int getGedQuantity() {
      return gedQuantity;
   }

   public void setGedQuantity(int gedQuantity) {
      this.gedQuantity = gedQuantity;
   }

   public int getGedRealityQuantity() {
      return gedRealityQuantity;
   }

   public void setGedRealityQuantity(int gedRealityQuantity) {
      this.gedRealityQuantity = gedRealityQuantity;
   }

   public double getGedPrice() {
      return gedPrice;
   }

   public void setGedPrice(double gedPrice) {
      this.gedPrice = gedPrice;
   }

   public String getGedStandard() {
      return gedStandard;
   }

   public void setGedStandard(String gedStandard) {
      this.gedStandard = gedStandard;
   }

   public String getGedType() {
      return gedType;
   }

   public void setGedType(String gedType) {
      this.gedType = gedType;
   }

   public String getGedUnit() {
      return gedUnit;
   }

   public void setGedUnit(String gedUnit) {
      this.gedUnit = gedUnit;
   }

   public int getGedStatus() {
      return gedStatus;
   }

   public void setGedStatus(int gedStatus) {
      this.gedStatus = gedStatus;
   }

   public String getGedGodNo() {
      return gedGodNo;
   }

   public void setGedGodNo(String gedGodNo) {
      this.gedGodNo = gedGodNo;
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