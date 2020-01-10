/***********************************************************************
 * Module:  Goods.java
 * Author:  Administrator
 * Purpose: Defines the Class Goods
 ***********************************************************************/

import java.util.*;

/** @pdOid 65530955-5d25-4e9e-a952-ea0a696b90b0 */
public class Goods {
   /** 物品编码
    *             
    * 
    * @pdOid 671c4e1f-1ac2-4ad1-a5ff-8e52a031d048 */
   private java.lang.String gooNumber;
   /** 计划价格
    *             
    * 
    * @pdOid 54bdb5fb-f989-4881-a485-f32cd617fdef */
   private java.lang.String gooName;
   /** 物品名称
    *             
    * 
    * @pdOid 93135d15-fe76-4ce3-8aec-2939e1d4c0c2 */
   private double gooPrice;
   /** 规格
    *             
    * 
    * @pdOid 47eb4c47-e53b-445b-8e1c-d0603d9df437 */
   private java.lang.String gooStandard;
   /** 计量单位
    *             
    * 
    * @pdOid 9f42a8d7-2590-4d1f-ae17-aad4f89afeac */
   private java.lang.String gooMeasurementUnit;
   /** 状态
    *             
    * 
    * @pdOid f488e37d-16b6-4eb3-a2da-c12131cda798 */
   private java.lang.String gooStatus;
   /** 操作人工号
    *             
    * 
    * @pdOid 2dc3fbb3-0527-4bbf-b45d-9c979f761278 */
   private java.lang.String gooEmploNo;
   /** 操作人姓名
    *             
    * 
    * @pdOid bdc3e861-d82b-4c49-830b-d8f88a8f29a6 */
   private java.lang.String gooEmploName;
   /** 操作时间
    *             
    * 
    * @pdOid dc046568-43e6-4408-a6c4-c52c7910136c */
   private java.util.Date gooTime;
   /** @pdOid b1603800-3b6e-498d-9cbd-90eb13e57029 */
   private java.lang.String duo1;
   /** @pdOid 1cc3ca64-ad1a-41f3-8f56-cdafd5ea5f5c */
   private java.lang.String duo2;
   
   /** @pdOid d2b93788-8a3d-416e-bc24-262dc136d738 */
   public java.lang.String getGooNumber() {
      return gooNumber;
   }
   
   /** @param newGooNumber
    * @pdOid f9bfaaea-7a1a-4bbc-a645-a7bcee4cc329 */
   public void setGooNumber(java.lang.String newGooNumber) {
      gooNumber = newGooNumber;
   }
   
   /** @pdOid 1a18084e-d171-4eee-a6dc-f577175194f2 */
   public java.lang.String getGooName() {
      return gooName;
   }
   
   /** @param newGooName
    * @pdOid 11f58154-6719-4ed0-bc19-029cfe691a65 */
   public void setGooName(java.lang.String newGooName) {
      gooName = newGooName;
   }
   
   /** @pdOid a6f58e4e-d431-49a0-96e4-ad9b7d75898c */
   public double getGooPrice() {
      return gooPrice;
   }
   
   /** @param newGooPrice
    * @pdOid e3af1761-8b11-457c-8023-0ee57ffcffdc */
   public void setGooPrice(double newGooPrice) {
      gooPrice = newGooPrice;
   }
   
   /** @pdOid fbe7b035-cf98-4468-bb52-27e7c35a7207 */
   public java.lang.String getGooStandard() {
      return gooStandard;
   }
   
   /** @param newGooStandard
    * @pdOid eb424f8a-d0e9-4e5c-97ce-a35dfd3ef235 */
   public void setGooStandard(java.lang.String newGooStandard) {
      gooStandard = newGooStandard;
   }
   
   /** @pdOid 1aeecda2-50dd-4c70-b9ef-38e483270fcd */
   public java.lang.String getGooMeasurementUnit() {
      return gooMeasurementUnit;
   }
   
   /** @param newGooMeasurementUnit
    * @pdOid bb8e1c08-e0e0-4e00-936f-af6f9c92b692 */
   public void setGooMeasurementUnit(java.lang.String newGooMeasurementUnit) {
      gooMeasurementUnit = newGooMeasurementUnit;
   }
   
   /** @pdOid 7efd584f-a0f5-402d-a92f-59751588fe78 */
   public java.lang.String getGooStatus() {
      return gooStatus;
   }
   
   /** @param newGooStatus
    * @pdOid 9b820e48-403b-4a66-8389-b594413b824c */
   public void setGooStatus(java.lang.String newGooStatus) {
      gooStatus = newGooStatus;
   }
   
   /** @pdOid 1be17eed-7d2d-4cfb-a708-d16ee6d81194 */
   public java.lang.String getGooEmploNo() {
      return gooEmploNo;
   }
   
   /** @param newGooEmploNo
    * @pdOid 62aa9c41-3c54-472d-bcf4-d9bec8c6a9f9 */
   public void setGooEmploNo(java.lang.String newGooEmploNo) {
      gooEmploNo = newGooEmploNo;
   }
   
   /** @pdOid 7cfe09ae-920a-499b-80b3-19e68301578b */
   public java.lang.String getGooEmploName() {
      return gooEmploName;
   }
   
   /** @param newGooEmploName
    * @pdOid 848073a6-1414-438e-8025-0b30341ae88f */
   public void setGooEmploName(java.lang.String newGooEmploName) {
      gooEmploName = newGooEmploName;
   }
   
   /** @pdOid 6323ab9f-175f-4b4e-9329-6c0cb529cea9 */
   public java.util.Date getGooTime() {
      return gooTime;
   }
   
   /** @param newGooTime
    * @pdOid 6debdd5c-cd3b-4218-aac6-97425f88405a */
   public void setGooTime(java.util.Date newGooTime) {
      gooTime = newGooTime;
   }
   
   /** @pdOid 88febbbe-6859-4c1b-898d-4b96c64e9344 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 89cad828-8838-4ec8-ace3-3f553f4c5560 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 0846e5e4-b0f3-4638-b29b-fac11b190f01 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 5fb15535-7145-43d0-9181-0524228da856 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}