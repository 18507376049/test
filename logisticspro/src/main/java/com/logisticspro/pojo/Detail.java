/***********************************************************************
 * Module:  Detail.java
 * Author:  Administrator
 * Purpose: Defines the Class Detail
 ***********************************************************************/

import java.util.*;

/** @pdOid 9f8189fe-c831-4623-be15-8db5cd1ec6b9 */
public class Detail {
   /** 核销明细单号
    *             
    * 
    * @pdOid 31dfbbe1-c3db-4d3c-9c2e-92c385e22171 */
   private java.lang.String detNo;
   /** 货物编码
    *             
    * 
    * @pdOid 41b54893-3a57-48ac-9c9d-def6e27a38c8 */
   private java.lang.String detCoding;
   /** 货物名称
    *             
    * 
    * @pdOid b0058c5b-fb8b-4813-be62-af349536b495 */
   private java.lang.String detName;
   /** 客户编号
    *             
    * 
    * @pdOid b2fa61ad-acf6-49bc-9bd7-1312690e7ac7 */
   private java.lang.String detCilentNo;
   /** 客户名称
    *             
    * 
    * @pdOid 1dcc6ed4-8a1f-4db1-95de-dbf355a2c9ff */
   private java.lang.String detKeHuName;
   /** 起始号段
    *             
    * 
    * @pdOid feda1889-cecd-47f8-8332-45f7097cb22a */
   private java.lang.String detBegin;
   /** 截止号段
    *             
    * 
    * @pdOid 9a434f7f-d971-4695-817b-fc7a2f279f59 */
   private java.lang.String detFinish;
   /** 条码
    *             
    * 
    * @pdOid 47390088-7c95-4fe0-8131-3317d2be5d2b */
   private java.lang.String detBar;
   /** 数量
    *             
    * 
    * @pdOid c4d16d32-c32e-461a-93d4-ccd143164f9c */
   private int detQuantity;
   /** 计划价格
    *             
    * 
    * @pdOid bb41b3f3-e992-4d17-b7e9-553abb7aead7 */
   private double detPrice;
   /** 规格
    *             
    * 
    * @pdOid cdaf3566-0d5a-4b6d-85bf-2435828daf39 */
   private java.lang.String detSpecification;
   /** 类型
    *             
    * 
    * @pdOid aa87d753-e172-43b9-a19f-7e4f5f44e490 */
   private java.lang.String detCancellationTime;
   /** 计量单位
    *             
    * 
    * @pdOid 84ba5d8c-7bc6-4510-a7bc-15701c722364 */
   private java.lang.String detUnit;
   /** 金额
    *             
    * 
    * @pdOid 010abddd-8cfe-4182-9814-846b8e370d58 */
   private double detMoney;
   /** 状态
    *             
    * 
    * @pdOid c47ec38f-f378-41c2-af93-e86d520edad9 */
   private int detState = 0;
   /** @pdOid 02cdd7fe-b2c8-462a-be64-bc23f02bfb5b */
   private java.lang.String detVerNo;
   /** @pdOid db6782f6-09e5-4a91-94d8-339e2d7c61b2 */
   private java.lang.String duo1;
   /** @pdOid 48c2e825-be30-4876-abfe-b8e952bc665e */
   private java.lang.String duo2;
   
   /** @pdOid e8a7863b-7bdb-4594-a10a-17932d238a0e */
   public java.lang.String getDetNo() {
      return detNo;
   }
   
   /** @param newDetNo
    * @pdOid 4d90b55e-46e2-4d31-8c5b-0a7111ca9f15 */
   public void setDetNo(java.lang.String newDetNo) {
      detNo = newDetNo;
   }
   
   /** @pdOid 0695a322-d241-4ce3-aac8-e887011b8fd4 */
   public java.lang.String getDetCoding() {
      return detCoding;
   }
   
   /** @param newDetCoding
    * @pdOid 6eeeb849-479d-4fd2-b8e8-19e6b97f02c3 */
   public void setDetCoding(java.lang.String newDetCoding) {
      detCoding = newDetCoding;
   }
   
   /** @pdOid 6393a4a3-0695-43ad-8a79-0d01b922076b */
   public java.lang.String getDetName() {
      return detName;
   }
   
   /** @param newDetName
    * @pdOid 9f78e9b2-c3b1-47d4-93af-974a86613eb1 */
   public void setDetName(java.lang.String newDetName) {
      detName = newDetName;
   }
   
   /** @pdOid b5920da2-5b9e-437d-94bf-207f00f6db0d */
   public java.lang.String getDetCilentNo() {
      return detCilentNo;
   }
   
   /** @param newDetCilentNo
    * @pdOid f004b79d-24b3-4a1f-aeac-aa5c9ceee006 */
   public void setDetCilentNo(java.lang.String newDetCilentNo) {
      detCilentNo = newDetCilentNo;
   }
   
   /** @pdOid 4ca308f6-a871-4933-b4b2-31b1ae0c71e5 */
   public java.lang.String getDetKeHuName() {
      return detKeHuName;
   }
   
   /** @param newDetKeHuName
    * @pdOid e3857bba-0749-4de3-8bb1-64e58b7a5074 */
   public void setDetKeHuName(java.lang.String newDetKeHuName) {
      detKeHuName = newDetKeHuName;
   }
   
   /** @pdOid 868dd9b0-15ec-4264-871c-97e28a08c6c5 */
   public java.lang.String getDetBegin() {
      return detBegin;
   }
   
   /** @param newDetBegin
    * @pdOid 54fc7b52-3089-4e0f-b16f-fa3c59aeeb57 */
   public void setDetBegin(java.lang.String newDetBegin) {
      detBegin = newDetBegin;
   }
   
   /** @pdOid 39da6b4b-7f91-4f17-8667-dd1314385a77 */
   public java.lang.String getDetFinish() {
      return detFinish;
   }
   
   /** @param newDetFinish
    * @pdOid 4423c2bd-68d1-4d80-b8f9-387717faec79 */
   public void setDetFinish(java.lang.String newDetFinish) {
      detFinish = newDetFinish;
   }
   
   /** @pdOid d4a7fb63-7b55-421b-b048-f3235d01b496 */
   public java.lang.String getDetBar() {
      return detBar;
   }
   
   /** @param newDetBar
    * @pdOid c380c677-e4bc-4b86-b50d-3c2c4b0467ae */
   public void setDetBar(java.lang.String newDetBar) {
      detBar = newDetBar;
   }
   
   /** @pdOid 6558ea8b-f823-4d9b-96d4-7414e7d2c935 */
   public int getDetQuantity() {
      return detQuantity;
   }
   
   /** @param newDetQuantity
    * @pdOid 6548aace-dc30-4920-8b40-6f7c0ecc8ad9 */
   public void setDetQuantity(int newDetQuantity) {
      detQuantity = newDetQuantity;
   }
   
   /** @pdOid 27f06668-e0a1-4cf9-b4c3-3ede45d92b18 */
   public double getDetPrice() {
      return detPrice;
   }
   
   /** @param newDetPrice
    * @pdOid 50b0e9ff-d95b-470e-83e9-5c9ec5db1684 */
   public void setDetPrice(double newDetPrice) {
      detPrice = newDetPrice;
   }
   
   /** @pdOid 859f9a91-f578-4dc6-a017-4c5d7ae3ab9d */
   public java.lang.String getDetSpecification() {
      return detSpecification;
   }
   
   /** @param newDetSpecification
    * @pdOid 7cdb0dcd-1dfb-4a7b-8538-cbeb98d4daba */
   public void setDetSpecification(java.lang.String newDetSpecification) {
      detSpecification = newDetSpecification;
   }
   
   /** @pdOid 2ce82a91-df2c-4f05-bcae-c97a69fb33b5 */
   public java.lang.String getDetCancellationTime() {
      return detCancellationTime;
   }
   
   /** @param newDetCancellationTime
    * @pdOid 51130e98-307d-4925-beb6-e77c99101b41 */
   public void setDetCancellationTime(java.lang.String newDetCancellationTime) {
      detCancellationTime = newDetCancellationTime;
   }
   
   /** @pdOid 757ca98d-1d73-4c52-b4d9-b0edfca07db2 */
   public java.lang.String getDetUnit() {
      return detUnit;
   }
   
   /** @param newDetUnit
    * @pdOid f577a245-2a3d-48cb-9bfc-de2826c09220 */
   public void setDetUnit(java.lang.String newDetUnit) {
      detUnit = newDetUnit;
   }
   
   /** @pdOid 200da44d-4256-48d7-81f2-765b08815aaf */
   public double getDetMoney() {
      return detMoney;
   }
   
   /** @param newDetMoney
    * @pdOid 58490309-f38e-4d2d-9ad1-0e2b9aed376c */
   public void setDetMoney(double newDetMoney) {
      detMoney = newDetMoney;
   }
   
   /** @pdOid 103a4b61-7f9d-46f2-a7c2-6fe0a95de407 */
   public int getDetState() {
      return detState;
   }
   
   /** @param newDetState
    * @pdOid d3d11699-f2c5-47e9-bfa6-d46b3a3cddd6 */
   public void setDetState(int newDetState) {
      detState = newDetState;
   }
   
   /** @pdOid a0107ec6-12a1-411d-be94-00d460916f2f */
   public java.lang.String getDetVerNo() {
      return detVerNo;
   }
   
   /** @param newDetVerNo
    * @pdOid 19cb5d1c-14b3-4e14-be84-ad409489db5c */
   public void setDetVerNo(java.lang.String newDetVerNo) {
      detVerNo = newDetVerNo;
   }
   
   /** @pdOid 69119713-d88f-4f77-a6b7-f0c92ff7f8bd */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 3af2ca80-f454-4e20-b2d9-1f7dc559e882 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid c973fce8-0a2a-4150-9d67-7c840d075cad */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 6ab2caeb-426d-46ee-a19e-6878c4190078 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}