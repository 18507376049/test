package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 核销明细
 */
public class Detail {
   /** 核销明细单号
    */
   private String detNo;
   /** 货物编码
    */
   private String detCoding;
   /** 货物名称
    */
   private String detName;
   /** 客户编号
    */
   private String detCilentNo;
   /** 客户名称
    */
   private String detKeHuName;
   /** 起始号段
    */
   private String detBegin;
   /** 截止号段
    */
   private String detFinish;
   /** 条码
    */
   private String detBar;
   /** 数量
    */
   private int detQuantity;
   /** 计划价格
    */
   private double detPrice;
   /** 规格
    */
   private String detSpecification;
   /** 类型
    */
   private String detCancellationTime;
   /** 计量单位
    */
   private String detUnit;
   /** 金额
    */
   private double detMoney;
   /** 状态
    */
   private int detState = 0;
   /**
    *
    * */
   private String detVerNo;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public Detail() {
   }

   public Detail(String detNo, String detCoding, String detName, String detCilentNo, String detKeHuName, String detBegin, String detFinish, String detBar, int detQuantity, double detPrice, String detSpecification, String detCancellationTime, String detUnit, double detMoney, int detState, String detVerNo, String duo1, String duo2) {
      this.detNo = detNo;
      this.detCoding = detCoding;
      this.detName = detName;
      this.detCilentNo = detCilentNo;
      this.detKeHuName = detKeHuName;
      this.detBegin = detBegin;
      this.detFinish = detFinish;
      this.detBar = detBar;
      this.detQuantity = detQuantity;
      this.detPrice = detPrice;
      this.detSpecification = detSpecification;
      this.detCancellationTime = detCancellationTime;
      this.detUnit = detUnit;
      this.detMoney = detMoney;
      this.detState = detState;
      this.detVerNo = detVerNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "Detail{" +
              "detNo='" + detNo + '\'' +
              ", detCoding='" + detCoding + '\'' +
              ", detName='" + detName + '\'' +
              ", detCilentNo='" + detCilentNo + '\'' +
              ", detKeHuName='" + detKeHuName + '\'' +
              ", detBegin='" + detBegin + '\'' +
              ", detFinish='" + detFinish + '\'' +
              ", detBar='" + detBar + '\'' +
              ", detQuantity=" + detQuantity +
              ", detPrice=" + detPrice +
              ", detSpecification='" + detSpecification + '\'' +
              ", detCancellationTime='" + detCancellationTime + '\'' +
              ", detUnit='" + detUnit + '\'' +
              ", detMoney=" + detMoney +
              ", detState=" + detState +
              ", detVerNo='" + detVerNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getDetNo() {
      return detNo;
   }

   public void setDetNo(String detNo) {
      this.detNo = detNo;
   }

   public String getDetCoding() {
      return detCoding;
   }

   public void setDetCoding(String detCoding) {
      this.detCoding = detCoding;
   }

   public String getDetName() {
      return detName;
   }

   public void setDetName(String detName) {
      this.detName = detName;
   }

   public String getDetCilentNo() {
      return detCilentNo;
   }

   public void setDetCilentNo(String detCilentNo) {
      this.detCilentNo = detCilentNo;
   }

   public String getDetKeHuName() {
      return detKeHuName;
   }

   public void setDetKeHuName(String detKeHuName) {
      this.detKeHuName = detKeHuName;
   }

   public String getDetBegin() {
      return detBegin;
   }

   public void setDetBegin(String detBegin) {
      this.detBegin = detBegin;
   }

   public String getDetFinish() {
      return detFinish;
   }

   public void setDetFinish(String detFinish) {
      this.detFinish = detFinish;
   }

   public String getDetBar() {
      return detBar;
   }

   public void setDetBar(String detBar) {
      this.detBar = detBar;
   }

   public int getDetQuantity() {
      return detQuantity;
   }

   public void setDetQuantity(int detQuantity) {
      this.detQuantity = detQuantity;
   }

   public double getDetPrice() {
      return detPrice;
   }

   public void setDetPrice(double detPrice) {
      this.detPrice = detPrice;
   }

   public String getDetSpecification() {
      return detSpecification;
   }

   public void setDetSpecification(String detSpecification) {
      this.detSpecification = detSpecification;
   }

   public String getDetCancellationTime() {
      return detCancellationTime;
   }

   public void setDetCancellationTime(String detCancellationTime) {
      this.detCancellationTime = detCancellationTime;
   }

   public String getDetUnit() {
      return detUnit;
   }

   public void setDetUnit(String detUnit) {
      this.detUnit = detUnit;
   }

   public double getDetMoney() {
      return detMoney;
   }

   public void setDetMoney(double detMoney) {
      this.detMoney = detMoney;
   }

   public int getDetState() {
      return detState;
   }

   public void setDetState(int detState) {
      this.detState = detState;
   }

   public String getDetVerNo() {
      return detVerNo;
   }

   public void setDetVerNo(String detVerNo) {
      this.detVerNo = detVerNo;
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