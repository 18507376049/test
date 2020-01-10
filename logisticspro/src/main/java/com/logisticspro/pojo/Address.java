package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 地址
 */
public class Address {
   /**
    * 地址编号
    */
   private String addId;
   /**
    * 省份编号
    */
   private int addProvinceNo;
   /**
    * 市级编号
    */
   private int addCityNo;
   /**
    * 区级编号
    */
   private int addDistrictNo;
   /**
    * 详细地址
    */
   private String addDetail;
   /**
    * 描述
    */
   private String addDescribe;
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

   public Address() {
   }

   public Address(String addId, int addProvinceNo, int addCityNo, int addDistrictNo, String addDetail, String addDescribe, String duo1, String duo2, String duo3) {
      this.addId = addId;
      this.addProvinceNo = addProvinceNo;
      this.addCityNo = addCityNo;
      this.addDistrictNo = addDistrictNo;
      this.addDetail = addDetail;
      this.addDescribe = addDescribe;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Address{" +
              "addId='" + addId + '\'' +
              ", addProvinceNo=" + addProvinceNo +
              ", addCityNo=" + addCityNo +
              ", addDistrictNo=" + addDistrictNo +
              ", addDetail='" + addDetail + '\'' +
              ", addDescribe='" + addDescribe + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getAddId() {
      return addId;
   }

   public void setAddId(String addId) {
      this.addId = addId;
   }

   public int getAddProvinceNo() {
      return addProvinceNo;
   }

   public void setAddProvinceNo(int addProvinceNo) {
      this.addProvinceNo = addProvinceNo;
   }

   public int getAddCityNo() {
      return addCityNo;
   }

   public void setAddCityNo(int addCityNo) {
      this.addCityNo = addCityNo;
   }

   public int getAddDistrictNo() {
      return addDistrictNo;
   }

   public void setAddDistrictNo(int addDistrictNo) {
      this.addDistrictNo = addDistrictNo;
   }

   public String getAddDetail() {
      return addDetail;
   }

   public void setAddDetail(String addDetail) {
      this.addDetail = addDetail;
   }

   public String getAddDescribe() {
      return addDescribe;
   }

   public void setAddDescribe(String addDescribe) {
      this.addDescribe = addDescribe;
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