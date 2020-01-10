/***********************************************************************
 * Module:  GodownEntryDetail.java
 * Author:  Administrator
 * Purpose: Defines the Class GodownEntryDetail
 ***********************************************************************/

import java.util.*;

/** @pdOid b2440964-3ac7-4883-b588-c375ca257c05 */
public class GodownEntryDetail {
   /** 入库明细单号
    *             
    * 
    * @pdOid 491419fe-3939-4390-97e1-23cd2a0c9e1d */
   private java.lang.String gedNo;
   /** 货物编码
    *             
    * 
    * @pdOid fd5b4b16-bd4e-4800-a3fd-aaf316c39836 */
   private java.lang.String gedNumber;
   /** @pdOid 5cc069f2-0b2a-4a4f-a31a-41bafa3a6c8d */
   private java.lang.String gedName;
   /** 起始号段
    *             
    * 
    * @pdOid dc0b43b9-4dc0-4781-9ff9-eebe42feee5a */
   private java.lang.String gedOrigin;
   /** 截止号段
    *             
    * 
    * @pdOid 1bede0c7-33a7-499b-a4e8-52414b9507f1 */
   private java.lang.String gedEnd;
   /** 入库数量
    *             
    * 
    * @pdOid 1bebe775-80cb-459c-87f0-3bfe6bad01e5 */
   private int gedQuantity;
   /** 实际数量
    *             
    * 
    * @pdOid 9986da91-72bb-4a4e-ab1a-d784a43cfa88 */
   private int gedRealityQuantity;
   /** 价格
    *             
    * 
    * @pdOid 71bf6f80-0511-4311-bf9b-245388551f94 */
   private double gedPrice;
   /** 规格
    *             
    * 
    * @pdOid da4b0c09-74ea-4657-a4ab-b8b1fc42e905 */
   private java.lang.String gedStandard;
   /** 类型
    *             
    * 
    * @pdOid b63080ff-be5d-420c-9fde-7ca62a348993 */
   private java.lang.String gedType;
   /** 计量单位
    *             
    * 
    * @pdOid 5ea87aca-8b45-47ec-be0d-ef93dc2b3f95 */
   private java.lang.String gedUnit;
   /** 状态
    *             
    * 
    * @pdOid b3563a86-2cd5-47f1-b064-5d66c976898a */
   private int gedStatus = 0;
   /** 入库单号
    *             
    * 
    * @pdOid e8fe4403-c40a-44eb-b0b9-3abfdf3c61cd */
   private java.lang.String gedGodNo;
   /** @pdOid d2dff8f2-0946-417f-85e3-0506e742affc */
   private java.lang.String duo1;
   /** @pdOid c321f78a-6f5d-4878-9520-672f2f71657c */
   private java.lang.String duo2;
   
   /** @pdOid 04ddf0e8-28f3-4698-85c6-e010d8c7ac15 */
   public java.lang.String getGedNo() {
      return gedNo;
   }
   
   /** @param newGedNo
    * @pdOid 64263a95-071e-4836-af12-73dbdad62544 */
   public void setGedNo(java.lang.String newGedNo) {
      gedNo = newGedNo;
   }
   
   /** @pdOid 998fa3fe-4f46-4756-b71f-1a418ff653dd */
   public java.lang.String getGedNumber() {
      return gedNumber;
   }
   
   /** @param newGedNumber
    * @pdOid e7b1343d-e265-4b4e-886d-16eca2726ce0 */
   public void setGedNumber(java.lang.String newGedNumber) {
      gedNumber = newGedNumber;
   }
   
   /** @pdOid ba4ab8d5-db57-4b58-92e6-167c8a4e502d */
   public java.lang.String getGedName() {
      return gedName;
   }
   
   /** @param newGedName
    * @pdOid 2102ea5d-83df-401f-a606-156f60de1d6d */
   public void setGedName(java.lang.String newGedName) {
      gedName = newGedName;
   }
   
   /** @pdOid a8a65d9d-ee16-4322-932c-4d1ab7d80722 */
   public java.lang.String getGedOrigin() {
      return gedOrigin;
   }
   
   /** @param newGedOrigin
    * @pdOid 0d4ac028-efd5-4dfd-a2fa-092302e337ce */
   public void setGedOrigin(java.lang.String newGedOrigin) {
      gedOrigin = newGedOrigin;
   }
   
   /** @pdOid 4a00e615-6ffd-4f7e-b3bc-37f5ba55870d */
   public java.lang.String getGedEnd() {
      return gedEnd;
   }
   
   /** @param newGedEnd
    * @pdOid eb42ec0c-b688-445a-9dd0-4b2edd4b61c7 */
   public void setGedEnd(java.lang.String newGedEnd) {
      gedEnd = newGedEnd;
   }
   
   /** @pdOid 2d731ab7-2659-47bb-9bc6-237e02fd696a */
   public int getGedQuantity() {
      return gedQuantity;
   }
   
   /** @param newGedQuantity
    * @pdOid f597dce1-5caf-48bd-9090-f0d951745ba7 */
   public void setGedQuantity(int newGedQuantity) {
      gedQuantity = newGedQuantity;
   }
   
   /** @pdOid 4394d0c6-bf3a-4764-8d0f-29e370df28c5 */
   public int getGedRealityQuantity() {
      return gedRealityQuantity;
   }
   
   /** @param newGedRealityQuantity
    * @pdOid 07001948-7f38-42fc-9f72-79dfd3fe86cd */
   public void setGedRealityQuantity(int newGedRealityQuantity) {
      gedRealityQuantity = newGedRealityQuantity;
   }
   
   /** @pdOid 9740be38-4757-4997-9661-abfd0b83751d */
   public double getGedPrice() {
      return gedPrice;
   }
   
   /** @param newGedPrice
    * @pdOid af54c5dc-9e0c-4e09-8d84-1dbbc3eaa715 */
   public void setGedPrice(double newGedPrice) {
      gedPrice = newGedPrice;
   }
   
   /** @pdOid d18884f5-093a-4f59-9c7f-726209ea206b */
   public java.lang.String getGedStandard() {
      return gedStandard;
   }
   
   /** @param newGedStandard
    * @pdOid 4e12cba8-eb13-468e-b43a-58480627d75a */
   public void setGedStandard(java.lang.String newGedStandard) {
      gedStandard = newGedStandard;
   }
   
   /** @pdOid eae2cdc7-f293-42fa-af85-046c14622994 */
   public java.lang.String getGedType() {
      return gedType;
   }
   
   /** @param newGedType
    * @pdOid 1b1df758-0a34-4069-b9d7-810c47af061a */
   public void setGedType(java.lang.String newGedType) {
      gedType = newGedType;
   }
   
   /** @pdOid f93f7320-0280-4ecd-981d-3df21ff2b483 */
   public java.lang.String getGedUnit() {
      return gedUnit;
   }
   
   /** @param newGedUnit
    * @pdOid 956ec670-748b-439f-b433-4f5ec7faba38 */
   public void setGedUnit(java.lang.String newGedUnit) {
      gedUnit = newGedUnit;
   }
   
   /** @pdOid 202f9ce1-8999-4658-8b52-a08ca021d30d */
   public int getGedStatus() {
      return gedStatus;
   }
   
   /** @param newGedStatus
    * @pdOid 04f76a18-5fa2-4c6f-8a48-0bbf40fccfe8 */
   public void setGedStatus(int newGedStatus) {
      gedStatus = newGedStatus;
   }
   
   /** @pdOid 2dfdf649-5e42-4872-8427-4b9d2451788c */
   public java.lang.String getGedGodNo() {
      return gedGodNo;
   }
   
   /** @param newGedGodNo
    * @pdOid e6d8d0eb-1a60-4fdf-98de-0a516274edda */
   public void setGedGodNo(java.lang.String newGedGodNo) {
      gedGodNo = newGedGodNo;
   }
   
   /** @pdOid 88b173ce-e503-4191-aa73-442fecdc8b61 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid ae69235d-72be-4872-ac12-0044a75f1f4a */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid e5e07dcb-28b2-4fe2-88d1-a054bcd1000e */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid d0ce60eb-6dbb-44b8-a91f-0be79668ff50 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}