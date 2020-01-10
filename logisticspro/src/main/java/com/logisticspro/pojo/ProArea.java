package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 省市区
 */
public class ProArea {
   /**
    * 编号
    */
   private int proId;
   /**
    * 名称
    */
   private String proName;
   /**
    * 全称
    */
   private String proMergerName;
   /**
    * 层级 0 1 2 省市区县
    */
   private int proLevel;
   /**
    * 长途区号
    */
   private String proCode;
   /**
    * 邮编
    */
   private String proZipCode;
   /**
    * 首字母
    */
   private String proFirst;
   /**
    * 经度
    */
   private String proLng;
   /**
    * 纬度
    */
   private String proLat;
   /**
    * 简称
    */
   private String proShortName;
   /**
    * 父id
    */
   private int proParenetNo;
   /**
    * 描述
    */
   private String proDescription;
   /**
    * 拼音
    */
   private String proPinyin;

   public ProArea() {
   }

   public ProArea(int proId, String proName, String proMergerName, int proLevel, String proCode, String proZipCode, String proFirst, String proLng, String proLat, String proShortName, int proParenetNo, String proDescription, String proPinyin) {
      this.proId = proId;
      this.proName = proName;
      this.proMergerName = proMergerName;
      this.proLevel = proLevel;
      this.proCode = proCode;
      this.proZipCode = proZipCode;
      this.proFirst = proFirst;
      this.proLng = proLng;
      this.proLat = proLat;
      this.proShortName = proShortName;
      this.proParenetNo = proParenetNo;
      this.proDescription = proDescription;
      this.proPinyin = proPinyin;
   }

   @Override
   public String toString() {
      return "ProArea{" +
              "proId=" + proId +
              ", proName='" + proName + '\'' +
              ", proMergerName='" + proMergerName + '\'' +
              ", proLevel=" + proLevel +
              ", proCode='" + proCode + '\'' +
              ", proZipCode='" + proZipCode + '\'' +
              ", proFirst='" + proFirst + '\'' +
              ", proLng='" + proLng + '\'' +
              ", proLat='" + proLat + '\'' +
              ", proShortName='" + proShortName + '\'' +
              ", proParenetNo=" + proParenetNo +
              ", proDescription='" + proDescription + '\'' +
              ", proPinyin='" + proPinyin + '\'' +
              '}';
   }

   public int getProId() {
      return proId;
   }

   public void setProId(int proId) {
      this.proId = proId;
   }

   public String getProName() {
      return proName;
   }

   public void setProName(String proName) {
      this.proName = proName;
   }

   public String getProMergerName() {
      return proMergerName;
   }

   public void setProMergerName(String proMergerName) {
      this.proMergerName = proMergerName;
   }

   public int getProLevel() {
      return proLevel;
   }

   public void setProLevel(int proLevel) {
      this.proLevel = proLevel;
   }

   public String getProCode() {
      return proCode;
   }

   public void setProCode(String proCode) {
      this.proCode = proCode;
   }

   public String getProZipCode() {
      return proZipCode;
   }

   public void setProZipCode(String proZipCode) {
      this.proZipCode = proZipCode;
   }

   public String getProFirst() {
      return proFirst;
   }

   public void setProFirst(String proFirst) {
      this.proFirst = proFirst;
   }

   public String getProLng() {
      return proLng;
   }

   public void setProLng(String proLng) {
      this.proLng = proLng;
   }

   public String getProLat() {
      return proLat;
   }

   public void setProLat(String proLat) {
      this.proLat = proLat;
   }

   public String getProShortName() {
      return proShortName;
   }

   public void setProShortName(String proShortName) {
      this.proShortName = proShortName;
   }

   public int getProParenetNo() {
      return proParenetNo;
   }

   public void setProParenetNo(int proParenetNo) {
      this.proParenetNo = proParenetNo;
   }

   public String getProDescription() {
      return proDescription;
   }

   public void setProDescription(String proDescription) {
      this.proDescription = proDescription;
   }

   public String getProPinyin() {
      return proPinyin;
   }

   public void setProPinyin(String proPinyin) {
      this.proPinyin = proPinyin;
   }
}