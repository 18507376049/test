package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 区域
 */
public class Region {
   /**
    * 区域编号
    */
   private String regId;
   /**
    * 区域名称
    */
   private String regName;
   /**
    * 省份编号
    */
   private String regProvinceId;
   /**
    * 市级编号
    */
   private String regCityId;
   /**
    * 区县编号
    */
   private String regDistrictId;
   /**
    * 备注
    */
   private String regRemarks;
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

   public Region() {
   }

   public Region(String regId, String regName, String regProvinceId, String regCityId, String regDistrictId, String regRemarks, String duo1, String duo2, String duo3) {
      this.regId = regId;
      this.regName = regName;
      this.regProvinceId = regProvinceId;
      this.regCityId = regCityId;
      this.regDistrictId = regDistrictId;
      this.regRemarks = regRemarks;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Region{" +
              "regId='" + regId + '\'' +
              ", regName='" + regName + '\'' +
              ", regProvinceId='" + regProvinceId + '\'' +
              ", regCityId='" + regCityId + '\'' +
              ", regDistrictId='" + regDistrictId + '\'' +
              ", regRemarks='" + regRemarks + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getRegId() {
      return regId;
   }

   public void setRegId(String regId) {
      this.regId = regId;
   }

   public String getRegName() {
      return regName;
   }

   public void setRegName(String regName) {
      this.regName = regName;
   }

   public String getRegProvinceId() {
      return regProvinceId;
   }

   public void setRegProvinceId(String regProvinceId) {
      this.regProvinceId = regProvinceId;
   }

   public String getRegCityId() {
      return regCityId;
   }

   public void setRegCityId(String regCityId) {
      this.regCityId = regCityId;
   }

   public String getRegDistrictId() {
      return regDistrictId;
   }

   public void setRegDistrictId(String regDistrictId) {
      this.regDistrictId = regDistrictId;
   }

   public String getRegRemarks() {
      return regRemarks;
   }

   public void setRegRemarks(String regRemarks) {
      this.regRemarks = regRemarks;
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