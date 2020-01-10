package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 库存明细
 */
public class DetailStock {
   /**
    * 库存明细编号
    */
   private String detAilstockId;
   /**
    * 物品编号
    */
   private String detArticlesCoded;
   /** 物品名称
    */
   private String stoName;
   /** 计划价格
    */
   private double stoPrice;
   /** 规格
     */
   private String stoStandard;
   /** 计量单位
    */
   private String stoMeasurementUnit;
   /** 状态
    */
   private int stoStatus;
   /** 类型
    */
   private String stoType;
   /** 起始号段
    */
   private String stoOrigin;
   /** 截止号段
    */
   private String stoEnd;
   /** 金额
    */
   private double stoMoney;
   /** 库存数量
    */
   private int detStockNumber;
   /** 销售数量
    */
   private int detSalesNumber;
   /** 入库数量
     */
   private int detBelaiDup;
   /** 仓库编号
    */
   private String detWarID;
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

   public DetailStock() {
   }

   public DetailStock(String detAilstockId, String detArticlesCoded, String stoName, double stoPrice, String stoStandard, String stoMeasurementUnit, int stoStatus, String stoType, String stoOrigin, String stoEnd, double stoMoney, int detStockNumber, int detSalesNumber, int detBelaiDup, String detWarID, String duo1, String duo2, String duo3) {
      this.detAilstockId = detAilstockId;
      this.detArticlesCoded = detArticlesCoded;
      this.stoName = stoName;
      this.stoPrice = stoPrice;
      this.stoStandard = stoStandard;
      this.stoMeasurementUnit = stoMeasurementUnit;
      this.stoStatus = stoStatus;
      this.stoType = stoType;
      this.stoOrigin = stoOrigin;
      this.stoEnd = stoEnd;
      this.stoMoney = stoMoney;
      this.detStockNumber = detStockNumber;
      this.detSalesNumber = detSalesNumber;
      this.detBelaiDup = detBelaiDup;
      this.detWarID = detWarID;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "DetailStock{" +
              "detAilstockId='" + detAilstockId + '\'' +
              ", detArticlesCoded='" + detArticlesCoded + '\'' +
              ", stoName='" + stoName + '\'' +
              ", stoPrice=" + stoPrice +
              ", stoStandard='" + stoStandard + '\'' +
              ", stoMeasurementUnit='" + stoMeasurementUnit + '\'' +
              ", stoStatus=" + stoStatus +
              ", stoType='" + stoType + '\'' +
              ", stoOrigin='" + stoOrigin + '\'' +
              ", stoEnd='" + stoEnd + '\'' +
              ", stoMoney=" + stoMoney +
              ", detStockNumber=" + detStockNumber +
              ", detSalesNumber=" + detSalesNumber +
              ", detBelaiDup=" + detBelaiDup +
              ", detWarID='" + detWarID + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getDetAilstockId() {
      return detAilstockId;
   }

   public void setDetAilstockId(String detAilstockId) {
      this.detAilstockId = detAilstockId;
   }

   public String getDetArticlesCoded() {
      return detArticlesCoded;
   }

   public void setDetArticlesCoded(String detArticlesCoded) {
      this.detArticlesCoded = detArticlesCoded;
   }

   public String getStoName() {
      return stoName;
   }

   public void setStoName(String stoName) {
      this.stoName = stoName;
   }

   public double getStoPrice() {
      return stoPrice;
   }

   public void setStoPrice(double stoPrice) {
      this.stoPrice = stoPrice;
   }

   public String getStoStandard() {
      return stoStandard;
   }

   public void setStoStandard(String stoStandard) {
      this.stoStandard = stoStandard;
   }

   public String getStoMeasurementUnit() {
      return stoMeasurementUnit;
   }

   public void setStoMeasurementUnit(String stoMeasurementUnit) {
      this.stoMeasurementUnit = stoMeasurementUnit;
   }

   public int getStoStatus() {
      return stoStatus;
   }

   public void setStoStatus(int stoStatus) {
      this.stoStatus = stoStatus;
   }

   public String getStoType() {
      return stoType;
   }

   public void setStoType(String stoType) {
      this.stoType = stoType;
   }

   public String getStoOrigin() {
      return stoOrigin;
   }

   public void setStoOrigin(String stoOrigin) {
      this.stoOrigin = stoOrigin;
   }

   public String getStoEnd() {
      return stoEnd;
   }

   public void setStoEnd(String stoEnd) {
      this.stoEnd = stoEnd;
   }

   public double getStoMoney() {
      return stoMoney;
   }

   public void setStoMoney(double stoMoney) {
      this.stoMoney = stoMoney;
   }

   public int getDetStockNumber() {
      return detStockNumber;
   }

   public void setDetStockNumber(int detStockNumber) {
      this.detStockNumber = detStockNumber;
   }

   public int getDetSalesNumber() {
      return detSalesNumber;
   }

   public void setDetSalesNumber(int detSalesNumber) {
      this.detSalesNumber = detSalesNumber;
   }

   public int getDetBelaiDup() {
      return detBelaiDup;
   }

   public void setDetBelaiDup(int detBelaiDup) {
      this.detBelaiDup = detBelaiDup;
   }

   public String getDetWarID() {
      return detWarID;
   }

   public void setDetWarID(String detWarID) {
      this.detWarID = detWarID;
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