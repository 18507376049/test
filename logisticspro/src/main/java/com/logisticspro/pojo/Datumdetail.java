package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 材料进销明细
 */
public class Datumdetail {
   /**
    * 材料进销明细编号
    */
   private String datDetailId;
   /**
    * 入库单号
    */
   private String datStorage;
   /**
    * 出库单号
    */
   private String datOutStorage;
   /**
    * 货物编号
    */
   private String purGoodsNo;
   /**
    * 货物名称
    */
   private String purGoodsName;
   /**
    * 入库数量
    */
   private int purStorageNumber;
   /**
    * 出库数量
    */
   private int purStoraOutNumber;
   /**
    * 实际数量
    */
   private int purNumber;
   /**
    * 状态
    */
   private int purStatus = 0;
   /**
    * 经办人单位
    */
   private String datOperator;
   /**
    * 经办人工号
    */
   private String datOperatorId;
   /**
    * 经办人姓名
    */
   private String datOperatorName;
   /**
    * 材料进销编号
    */
   private String datPurChaseId;
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

   public Datumdetail() {
   }

   public Datumdetail(String datDetailId, String datStorage, String datOutStorage, String purGoodsNo, String purGoodsName, int purStorageNumber, int purStoraOutNumber, int purNumber, int purStatus, String datOperator, String datOperatorId, String datOperatorName, String datPurChaseId, String duo1, String duo2, String duo3) {
      this.datDetailId = datDetailId;
      this.datStorage = datStorage;
      this.datOutStorage = datOutStorage;
      this.purGoodsNo = purGoodsNo;
      this.purGoodsName = purGoodsName;
      this.purStorageNumber = purStorageNumber;
      this.purStoraOutNumber = purStoraOutNumber;
      this.purNumber = purNumber;
      this.purStatus = purStatus;
      this.datOperator = datOperator;
      this.datOperatorId = datOperatorId;
      this.datOperatorName = datOperatorName;
      this.datPurChaseId = datPurChaseId;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Datumdetail{" +
              "datDetailId='" + datDetailId + '\'' +
              ", datStorage='" + datStorage + '\'' +
              ", datOutStorage='" + datOutStorage + '\'' +
              ", purGoodsNo='" + purGoodsNo + '\'' +
              ", purGoodsName='" + purGoodsName + '\'' +
              ", purStorageNumber=" + purStorageNumber +
              ", purStoraOutNumber=" + purStoraOutNumber +
              ", purNumber=" + purNumber +
              ", purStatus=" + purStatus +
              ", datOperator='" + datOperator + '\'' +
              ", datOperatorId='" + datOperatorId + '\'' +
              ", datOperatorName='" + datOperatorName + '\'' +
              ", datPurChaseId='" + datPurChaseId + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getDatDetailId() {
      return datDetailId;
   }

   public void setDatDetailId(String datDetailId) {
      this.datDetailId = datDetailId;
   }

   public String getDatStorage() {
      return datStorage;
   }

   public void setDatStorage(String datStorage) {
      this.datStorage = datStorage;
   }

   public String getDatOutStorage() {
      return datOutStorage;
   }

   public void setDatOutStorage(String datOutStorage) {
      this.datOutStorage = datOutStorage;
   }

   public String getPurGoodsNo() {
      return purGoodsNo;
   }

   public void setPurGoodsNo(String purGoodsNo) {
      this.purGoodsNo = purGoodsNo;
   }

   public String getPurGoodsName() {
      return purGoodsName;
   }

   public void setPurGoodsName(String purGoodsName) {
      this.purGoodsName = purGoodsName;
   }

   public int getPurStorageNumber() {
      return purStorageNumber;
   }

   public void setPurStorageNumber(int purStorageNumber) {
      this.purStorageNumber = purStorageNumber;
   }

   public int getPurStoraOutNumber() {
      return purStoraOutNumber;
   }

   public void setPurStoraOutNumber(int purStoraOutNumber) {
      this.purStoraOutNumber = purStoraOutNumber;
   }

   public int getPurNumber() {
      return purNumber;
   }

   public void setPurNumber(int purNumber) {
      this.purNumber = purNumber;
   }

   public int getPurStatus() {
      return purStatus;
   }

   public void setPurStatus(int purStatus) {
      this.purStatus = purStatus;
   }

   public String getDatOperator() {
      return datOperator;
   }

   public void setDatOperator(String datOperator) {
      this.datOperator = datOperator;
   }

   public String getDatOperatorId() {
      return datOperatorId;
   }

   public void setDatOperatorId(String datOperatorId) {
      this.datOperatorId = datOperatorId;
   }

   public String getDatOperatorName() {
      return datOperatorName;
   }

   public void setDatOperatorName(String datOperatorName) {
      this.datOperatorName = datOperatorName;
   }

   public String getDatPurChaseId() {
      return datPurChaseId;
   }

   public void setDatPurChaseId(String datPurChaseId) {
      this.datPurChaseId = datPurChaseId;
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