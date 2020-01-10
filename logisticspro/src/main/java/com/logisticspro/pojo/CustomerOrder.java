/***********************************************************************
 * Module:  CustomerOrder.java
 * Author:  Administrator
 * Purpose: Defines the Class CustomerOrder
 ***********************************************************************/

import java.util.*;

/** @pdOid 2f94fdce-4967-4f03-8236-a4b0e7c3e0c2 */
public class CustomerOrder {
   /** 客户订单单号
    *             
    * 
    * @pdOid c5adc43e-4e1f-4b10-8f25-4a3860caea8a */
   private java.lang.String cusOdd;
   /** 电话
    *             
    * 
    * @pdOid ccdddc9d-5866-46ff-b641-97546b50565e */
   private java.lang.String cusNumber;
   /** 工作单单号
    *             
    * 
    * @pdOid 5d80630d-2e9b-4533-89fb-0cb015a948b2 */
   private java.lang.String cusWorkNo;
   /** 客户编号
    *             
    * 
    * @pdOid 58d357bc-b523-4a3a-bd8d-e9c96f729270 */
   private java.lang.String cusCilNo;
   /** 工单生成时间
    *             
    * 
    * @pdOid beedbf76-5daf-4dbd-b14c-bc7e2f71be32 */
   private java.util.Date cusWorkOrderTime;
   /** 寄件地址
    *             
    * 
    * @pdOid b81bde25-1838-4de3-9cff-69855b177d55 */
   private java.lang.String cusRecAddress;
   /** 取件地址
    *             
    * 
    * @pdOid 348752c3-25fd-4987-b28d-e9ab8375b393 */
   private java.lang.String cusPickupAddress;
   /** 当前状态
    *             
    * 
    * @pdOid e9411b17-1d57-4b78-b3e5-2d6f102e2e97 */
   private int cusCurrentStatus = 0;
   /** 销单原因
    *             
    * 
    * @pdOid 63f65cd8-a45d-492d-b991-f2b4c87705dd */
   private java.lang.String cusSinglePin;
   /** 操作人工号
    *             
    * 
    * @pdOid 4a492b02-5e42-40ea-aa61-a1378f7f8ca0 */
   private java.lang.String cusOperateNo;
   /** 操作人姓名
    *             
    * 
    * @pdOid 6e64370e-4018-40d1-acd7-3ffe5c22d62d */
   private java.lang.String cusOperateName;
   /** 操作单位
    *             
    * 
    * @pdOid 6101c3ba-5c3e-40f7-ab73-e390174d4326 */
   private java.lang.String cusOperateUnit;
   /** 操作时间
    *             
    * 
    * @pdOid da4dc69c-56fe-4d2b-bddc-70c3e9c8abc9 */
   private java.util.Date cusOperateTime;
   /** 当前操作人
    *             
    * 
    * @pdOid 37d6462d-879b-4079-ac32-39184b3fdc9a */
   private java.lang.String cusCurrentOperate;
   /** 操作人电话
    *             
    * 
    * @pdOid 8bb728e1-bb41-4ac9-a3a7-872d58d6142f */
   private java.lang.String cusOperateNumber;
   /** 当前操作单位
    *             
    * 
    * @pdOid a5943fca-f61f-4b60-a393-ba2c44c6e4af */
   private java.lang.String cusCurrOperateUnit;
   /** 追单次数
    * 
    * @pdOid ff5e229f-68a2-4dc2-b7e6-14a08482c656 */
   private int cusAfterSingleNum;
   /** 状态
    *             
    * 
    * @pdOid a077428b-445d-467a-9e7a-9b2443c2a346 */
   private int cusStatus = 0;
   /** @pdOid dd467f0d-fa94-4015-8d2e-12c1e4b9a176 */
   private java.lang.String duo1;
   /** @pdOid 258c5bf8-dfe7-41dc-90a3-d1a899d71cce */
   private java.lang.String duo2;
   /** @pdOid 681bfb47-9dd4-48b8-a33a-b2969daf45a3 */
   private java.lang.String duo3;
   
   /** @pdOid 5361e835-c92e-4c6e-8a03-4ea5f3bb36b5 */
   public java.lang.String getCusOdd() {
      return cusOdd;
   }
   
   /** @param newCusOdd
    * @pdOid 4718642c-c915-4b47-82c2-a72fb88ed369 */
   public void setCusOdd(java.lang.String newCusOdd) {
      cusOdd = newCusOdd;
   }
   
   /** @pdOid 2bc1c658-b426-40e3-8fb7-4e5c8b9b868b */
   public java.lang.String getCusNumber() {
      return cusNumber;
   }
   
   /** @param newCusNumber
    * @pdOid 50ee8153-4d0e-4217-8dcb-e1dfd03e4c13 */
   public void setCusNumber(java.lang.String newCusNumber) {
      cusNumber = newCusNumber;
   }
   
   /** @pdOid 5a4c02e1-78a4-4183-a9cc-285deb2a9f56 */
   public java.lang.String getCusWorkNo() {
      return cusWorkNo;
   }
   
   /** @param newCusWorkNo
    * @pdOid b2b7c606-8ebd-4d2b-9fc1-3aa4b5fb4699 */
   public void setCusWorkNo(java.lang.String newCusWorkNo) {
      cusWorkNo = newCusWorkNo;
   }
   
   /** @pdOid 96e9e327-1c49-47f6-8b14-77a5b82c1a71 */
   public java.lang.String getCusCilNo() {
      return cusCilNo;
   }
   
   /** @param newCusCilNo
    * @pdOid f5fdaff8-de58-4002-a8a9-06908c9dda9a */
   public void setCusCilNo(java.lang.String newCusCilNo) {
      cusCilNo = newCusCilNo;
   }
   
   /** @pdOid c55dc4aa-8379-48c9-9a5d-68b471301191 */
   public java.util.Date getCusWorkOrderTime() {
      return cusWorkOrderTime;
   }
   
   /** @param newCusWorkOrderTime
    * @pdOid 39142ab7-5808-4122-8869-f080dbfd045f */
   public void setCusWorkOrderTime(java.util.Date newCusWorkOrderTime) {
      cusWorkOrderTime = newCusWorkOrderTime;
   }
   
   /** @pdOid 9e5810e7-72d5-4e29-9082-c8f9121d1490 */
   public java.lang.String getCusRecAddress() {
      return cusRecAddress;
   }
   
   /** @param newCusRecAddress
    * @pdOid 17d6adbd-229e-4d35-aa66-c7ac33e625f1 */
   public void setCusRecAddress(java.lang.String newCusRecAddress) {
      cusRecAddress = newCusRecAddress;
   }
   
   /** @pdOid 799e8a03-22bb-42d0-a463-75ea1637df86 */
   public java.lang.String getCusPickupAddress() {
      return cusPickupAddress;
   }
   
   /** @param newCusPickupAddress
    * @pdOid c1dfe988-036c-4d1a-9819-2b0687d4c8d5 */
   public void setCusPickupAddress(java.lang.String newCusPickupAddress) {
      cusPickupAddress = newCusPickupAddress;
   }
   
   /** @pdOid 73d0baa0-cc32-4cec-bdeb-d1766f630ce1 */
   public int getCusCurrentStatus() {
      return cusCurrentStatus;
   }
   
   /** @param newCusCurrentStatus
    * @pdOid b3e0ec25-4d4a-4475-9d01-8aa942105d90 */
   public void setCusCurrentStatus(int newCusCurrentStatus) {
      cusCurrentStatus = newCusCurrentStatus;
   }
   
   /** @pdOid 75637d67-6abf-4b8e-a087-eacbadfbca29 */
   public java.lang.String getCusSinglePin() {
      return cusSinglePin;
   }
   
   /** @param newCusSinglePin
    * @pdOid ba0431d9-0d58-4d46-9d8b-95c3a6bebe95 */
   public void setCusSinglePin(java.lang.String newCusSinglePin) {
      cusSinglePin = newCusSinglePin;
   }
   
   /** @pdOid 5681dd70-b3e0-47eb-9967-bcae5d6de7e1 */
   public java.lang.String getCusOperateNo() {
      return cusOperateNo;
   }
   
   /** @param newCusOperateNo
    * @pdOid 1cef083e-85f5-4d5d-89e7-255d7eb02905 */
   public void setCusOperateNo(java.lang.String newCusOperateNo) {
      cusOperateNo = newCusOperateNo;
   }
   
   /** @pdOid a3ff437f-b4cb-4256-865c-2d3bbe437cbe */
   public java.lang.String getCusOperateName() {
      return cusOperateName;
   }
   
   /** @param newCusOperateName
    * @pdOid 6c215a36-6b5a-4b39-b1d3-dfba59f08f44 */
   public void setCusOperateName(java.lang.String newCusOperateName) {
      cusOperateName = newCusOperateName;
   }
   
   /** @pdOid b4b479c5-4366-4602-a529-21274c31e633 */
   public java.lang.String getCusOperateUnit() {
      return cusOperateUnit;
   }
   
   /** @param newCusOperateUnit
    * @pdOid 5118e4eb-1198-4968-8bd3-029a5892767b */
   public void setCusOperateUnit(java.lang.String newCusOperateUnit) {
      cusOperateUnit = newCusOperateUnit;
   }
   
   /** @pdOid 2fac27ea-d0ea-4b73-a2ae-f4bb69c47522 */
   public java.util.Date getCusOperateTime() {
      return cusOperateTime;
   }
   
   /** @param newCusOperateTime
    * @pdOid 4156e3c4-99e7-4cb6-baa8-622962325270 */
   public void setCusOperateTime(java.util.Date newCusOperateTime) {
      cusOperateTime = newCusOperateTime;
   }
   
   /** @pdOid 63bbd70f-e634-4ada-9abf-cf16d8db92cb */
   public java.lang.String getCusCurrentOperate() {
      return cusCurrentOperate;
   }
   
   /** @param newCusCurrentOperate
    * @pdOid e3a0aa1d-eb57-4138-bcb5-9b24a8a3635b */
   public void setCusCurrentOperate(java.lang.String newCusCurrentOperate) {
      cusCurrentOperate = newCusCurrentOperate;
   }
   
   /** @pdOid 48bb0b17-4828-4bd2-8320-8d7a09e54c16 */
   public java.lang.String getCusOperateNumber() {
      return cusOperateNumber;
   }
   
   /** @param newCusOperateNumber
    * @pdOid 50d779c9-619c-4e0b-ae9b-c8cb1d368d9a */
   public void setCusOperateNumber(java.lang.String newCusOperateNumber) {
      cusOperateNumber = newCusOperateNumber;
   }
   
   /** @pdOid ff273034-db64-46a7-a952-c1d7cbbaf1a3 */
   public java.lang.String getCusCurrOperateUnit() {
      return cusCurrOperateUnit;
   }
   
   /** @param newCusCurrOperateUnit
    * @pdOid ec819dc1-5b3a-454c-9994-15bde006624a */
   public void setCusCurrOperateUnit(java.lang.String newCusCurrOperateUnit) {
      cusCurrOperateUnit = newCusCurrOperateUnit;
   }
   
   /** @pdOid 63c276a5-401b-43a1-bb6b-8e203355c213 */
   public int getCusAfterSingleNum() {
      return cusAfterSingleNum;
   }
   
   /** @param newCusAfterSingleNum
    * @pdOid c003bb9a-15df-4d1c-969a-6459c54a80d5 */
   public void setCusAfterSingleNum(int newCusAfterSingleNum) {
      cusAfterSingleNum = newCusAfterSingleNum;
   }
   
   /** @pdOid 0872f2fd-54d6-4822-b31c-0bc422e87af2 */
   public int getCusStatus() {
      return cusStatus;
   }
   
   /** @param newCusStatus
    * @pdOid d366e9a5-d782-4caf-b54e-131688859e24 */
   public void setCusStatus(int newCusStatus) {
      cusStatus = newCusStatus;
   }
   
   /** @pdOid c827458c-e154-4cb5-8072-17ccdc640d0e */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid a26831f2-faf4-4cb8-b180-ffa0a12adb2b */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 6b6593c2-ce56-46fc-94fe-6ae6e84b8e1f */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 04af6236-8f1e-4ddc-9400-f72d08b409ac */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 431ee6f1-446a-41d3-82c3-b5c17853cbc2 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid cece2b73-1285-4148-860e-2a7bbec20916 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}