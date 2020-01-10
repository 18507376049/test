package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 库存类型
 */
public class RtoryType {
   /**
    * 库存类型编号
    */
   private String rtoTypeId;
   /**
    * 出库类型名称
    */
   private String rtoOutStorageType;
   /**
    * 入库类型名称
    */
   private String rtoStorageType;
   /**
    * 备注
    */
   private String rtoDesc;
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

   public RtoryType() {
   }

   public RtoryType(String rtoTypeId, String rtoOutStorageType, String rtoStorageType, String rtoDesc, String duo1, String duo2, String duo3) {
      this.rtoTypeId = rtoTypeId;
      this.rtoOutStorageType = rtoOutStorageType;
      this.rtoStorageType = rtoStorageType;
      this.rtoDesc = rtoDesc;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "RtoryType{" +
              "rtoTypeId='" + rtoTypeId + '\'' +
              ", rtoOutStorageType='" + rtoOutStorageType + '\'' +
              ", rtoStorageType='" + rtoStorageType + '\'' +
              ", rtoDesc='" + rtoDesc + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getRtoTypeId() {
      return rtoTypeId;
   }

   public void setRtoTypeId(String rtoTypeId) {
      this.rtoTypeId = rtoTypeId;
   }

   public String getRtoOutStorageType() {
      return rtoOutStorageType;
   }

   public void setRtoOutStorageType(String rtoOutStorageType) {
      this.rtoOutStorageType = rtoOutStorageType;
   }

   public String getRtoStorageType() {
      return rtoStorageType;
   }

   public void setRtoStorageType(String rtoStorageType) {
      this.rtoStorageType = rtoStorageType;
   }

   public String getRtoDesc() {
      return rtoDesc;
   }

   public void setRtoDesc(String rtoDesc) {
      this.rtoDesc = rtoDesc;
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