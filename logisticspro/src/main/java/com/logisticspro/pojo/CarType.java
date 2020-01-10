package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 车辆类型
 */
public class CarType {
   /**
    * 车辆类型编号
    */
   private String carTypeId;
   /**
    * 车辆类型名称
    */
   private String carTypeName;
   /**
    * 备注
    */
   private String carTypeDesc;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public CarType() {
   }

   public CarType(String carTypeId, String carTypeName, String carTypeDesc, String duo1, String duo2) {
      this.carTypeId = carTypeId;
      this.carTypeName = carTypeName;
      this.carTypeDesc = carTypeDesc;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "CarType{" +
              "carTypeId='" + carTypeId + '\'' +
              ", carTypeName='" + carTypeName + '\'' +
              ", carTypeDesc='" + carTypeDesc + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getCarTypeId() {
      return carTypeId;
   }

   public void setCarTypeId(String carTypeId) {
      this.carTypeId = carTypeId;
   }

   public String getCarTypeName() {
      return carTypeName;
   }

   public void setCarTypeName(String carTypeName) {
      this.carTypeName = carTypeName;
   }

   public String getCarTypeDesc() {
      return carTypeDesc;
   }

   public void setCarTypeDesc(String carTypeDesc) {
      this.carTypeDesc = carTypeDesc;
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
