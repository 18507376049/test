/***********************************************************************
 * Module:  StockSecurity.java
 * Author:  Administrator
 * Purpose: Defines the Class StockSecurity
 ***********************************************************************/

import java.util.*;

/** @pdOid 054ad9f8-3c91-4df1-b9b4-fa775d0ae59b */
public class StockSecurity {
   /** 库存安全编号
    *             
    * 
    * @pdOid 5168801d-7285-4b68-8f3a-33ecaf9c9d2f */
   private java.lang.String stoNo;
   /** 物品编码
    *             
    * 
    * @pdOid 4c16cc9e-7381-4201-a2aa-929cd99c720c */
   private java.lang.String stoNumber;
   /** 物品名称
    *             
    * 
    * @pdOid fb36570d-eb2c-4951-a910-1a5bec2bc06f */
   private java.lang.String stoName;
   /** 上限
    *             
    * 
    * @pdOid 359b9415-58ff-4c7e-b3c4-bdb0cdb46f02 */
   private int stoSuperiorLimit;
   /** 下限
    *             
    * 
    * @pdOid fbf612c9-a159-4446-8f52-7c8460f7926f */
   private int stoLowerLimit;
   /** 规格
    *             
    * 
    * @pdOid c34fafd9-4097-4202-bec1-2398d4e9adfd */
   private java.lang.String stoStandard;
   /** 类型
    *             
    * 
    * @pdOid 000a5668-23a6-494f-92e9-6642372a6c1e */
   private java.lang.String stoType;
   /** 操作人工号
    *             
    * 
    * @pdOid 36a590f0-1c91-4eaa-840b-d80228907efd */
   private java.lang.String stoOperationStaffNo;
   /** 操作人姓名
    *             
    * 
    * @pdOid 7056a44a-4d4e-438e-90b0-205d1e9873b4 */
   private java.lang.String stoOperationStaffName;
   /** 操作时间
    *             
    * 
    * @pdOid 4b8d7244-6c4f-4cdb-9c88-d1cae1d2f1be */
   private java.util.Date stoOperateTime;
   /** 状态
    *             
    * 
    * @pdOid 84369921-02df-43e2-b8d3-48c249e40e4f */
   private int stoStatus = 0;
   /** @pdOid 97ec4cda-9bef-4d67-af64-8e3918d4c2f1 */
   private java.lang.String duo1;
   /** @pdOid b547c530-aa67-4105-8c27-5c71fb5acc5a */
   private java.lang.String duo2;
   
   /** @pdOid d4cd3eae-7879-4271-b7ef-6817b8b07bbc */
   public java.lang.String getStoNo() {
      return stoNo;
   }
   
   /** @param newStoNo
    * @pdOid d2a14413-68a8-4288-8cd9-1f6035df295e */
   public void setStoNo(java.lang.String newStoNo) {
      stoNo = newStoNo;
   }
   
   /** @pdOid 559c7013-08bc-461b-b88a-7dcbfe811e92 */
   public java.lang.String getStoNumber() {
      return stoNumber;
   }
   
   /** @param newStoNumber
    * @pdOid d74d0054-b037-4f3a-843c-c9f25ed64936 */
   public void setStoNumber(java.lang.String newStoNumber) {
      stoNumber = newStoNumber;
   }
   
   /** @pdOid 6ff19b0d-bcf3-4773-909f-acd9c497ccef */
   public java.lang.String getStoName() {
      return stoName;
   }
   
   /** @param newStoName
    * @pdOid 5040ebd5-0458-4306-a6cd-2881c439a651 */
   public void setStoName(java.lang.String newStoName) {
      stoName = newStoName;
   }
   
   /** @pdOid 7554e177-3893-49a7-a61d-c9095821f505 */
   public int getStoSuperiorLimit() {
      return stoSuperiorLimit;
   }
   
   /** @param newStoSuperiorLimit
    * @pdOid 77e43cb4-5266-4432-8783-f1f848f346cf */
   public void setStoSuperiorLimit(int newStoSuperiorLimit) {
      stoSuperiorLimit = newStoSuperiorLimit;
   }
   
   /** @pdOid c9e2fa16-8919-4aeb-9ccc-7c9d667cfda8 */
   public int getStoLowerLimit() {
      return stoLowerLimit;
   }
   
   /** @param newStoLowerLimit
    * @pdOid fc8cea50-af4e-45e5-9609-413f58635fd4 */
   public void setStoLowerLimit(int newStoLowerLimit) {
      stoLowerLimit = newStoLowerLimit;
   }
   
   /** @pdOid 7970dd47-e0df-4230-b796-20e032356d05 */
   public java.lang.String getStoStandard() {
      return stoStandard;
   }
   
   /** @param newStoStandard
    * @pdOid 21d9591e-2a73-41be-9462-25eb8adc4cb7 */
   public void setStoStandard(java.lang.String newStoStandard) {
      stoStandard = newStoStandard;
   }
   
   /** @pdOid 23223f26-7d94-4af8-9ed0-f784a38d2a99 */
   public java.lang.String getStoType() {
      return stoType;
   }
   
   /** @param newStoType
    * @pdOid 9af59c21-ac5a-44af-8214-a577d2cf5c63 */
   public void setStoType(java.lang.String newStoType) {
      stoType = newStoType;
   }
   
   /** @pdOid 77f231ca-d066-46cd-9640-759abd5c4f57 */
   public java.lang.String getStoOperationStaffNo() {
      return stoOperationStaffNo;
   }
   
   /** @param newStoOperationStaffNo
    * @pdOid d7f92466-8d03-4e69-be8e-dfadc684122b */
   public void setStoOperationStaffNo(java.lang.String newStoOperationStaffNo) {
      stoOperationStaffNo = newStoOperationStaffNo;
   }
   
   /** @pdOid 8f7f5535-bb2b-4842-bbe1-d2cb442514c2 */
   public java.lang.String getStoOperationStaffName() {
      return stoOperationStaffName;
   }
   
   /** @param newStoOperationStaffName
    * @pdOid 8be71950-b197-49d7-844f-1edcffec9557 */
   public void setStoOperationStaffName(java.lang.String newStoOperationStaffName) {
      stoOperationStaffName = newStoOperationStaffName;
   }
   
   /** @pdOid a3b7b81c-f457-49c9-a5b4-9c1aaeb00753 */
   public java.util.Date getStoOperateTime() {
      return stoOperateTime;
   }
   
   /** @param newStoOperateTime
    * @pdOid c6c6e5db-3bbe-4928-aebd-d8bc23dc1f71 */
   public void setStoOperateTime(java.util.Date newStoOperateTime) {
      stoOperateTime = newStoOperateTime;
   }
   
   /** @pdOid 3a16d1bd-dba7-42a8-8df9-a49cd30c566b */
   public int getStoStatus() {
      return stoStatus;
   }
   
   /** @param newStoStatus
    * @pdOid 239cb735-0698-45c6-b2c8-7e3a54a49b10 */
   public void setStoStatus(int newStoStatus) {
      stoStatus = newStoStatus;
   }
   
   /** @pdOid 2afe6503-94a8-4276-99ba-229b2da580ac */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 48f24f3b-c26e-4438-929b-e9d8b2dff22e */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 2dacaf64-a90f-40b0-b70c-ec84a3097757 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid ecbc6e9f-7c7f-4000-82c9-0191bf2005fa */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}