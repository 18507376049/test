/***********************************************************************
 * Module:  OutboundListMain.java
 * Author:  Administrator
 * Purpose: Defines the Class OutboundListMain
 ***********************************************************************/

import java.util.*;

/** @pdOid 6b990e25-fe1e-4fa5-a0f2-de3cb0a4de02 */
public class OutboundListMain {
   /** 出库单号
    *             
    * 
    * @pdOid a3bc426f-409a-431c-8fce-1a73ad9afb91 */
   private java.lang.String olmownEntry;
   /** 出库类型
    *             
    * 
    * @pdOid ef51bff1-072d-4d21-8b41-c2823c8594e4 */
   private java.lang.String olmType;
   /** 运输单号
    *             
    * 
    * @pdOid f30104c5-2f24-4e54-b5c8-afc9b77dbb8a */
   private java.lang.String olmTransport;
   /** 所属单位
    *             
    * 
    * @pdOid c88f7032-fde9-4225-9fac-9584752589ac */
   private java.lang.String olmUnit;
   /** 开单人工号
    *             
    * 
    * @pdOid 91f93bf0-31b7-4d29-a737-a4aac51c7f3d */
   private java.lang.String olmOperationStaffNo;
   /** 开单人姓名
    *             
    * 
    * @pdOid dd96b0f0-1078-4253-8936-d6b38adc0b37 */
   private java.lang.String olmOperationStaffName;
   /** 开单时间
    *             
    * 
    * @pdOid f6133816-b5da-43b5-bdce-a51ec175bc9e */
   private java.util.Date olmTime;
   /** 经办人工号
    *             
    * 
    * @pdOid 88394507-5148-4c8a-8dec-f93de2b47c0a */
   private java.lang.String olmOperatorNo;
   /** 经办人姓名
    *             
    * 
    * @pdOid 1107a1d2-59f3-4273-adc9-68834734e0b7 */
   private java.lang.String olmOperatorName;
   /** 客户编号
    *             
    * 
    * @pdOid a89c2337-2ab6-4d42-a6ec-b99b2f5c2daa */
   private java.lang.String olmClientNo;
   /** 客户名称
    *             
    * 
    * @pdOid d91d4a1c-1a85-4785-b646-d99c165e92e2 */
   private java.lang.String olmClientName;
   /** 领用人工号
    *             
    * 
    * @pdOid c808fdab-1315-4fad-ba5f-86c3a8719e19 */
   private java.lang.String olmUseNo;
   /** 领用人姓名
    *             
    * 
    * @pdOid 0b02d0fe-1b40-4797-a318-05d643dc92bd */
   private java.lang.String olmUseName;
   /** 领用时间
    *             
    * 
    * @pdOid fb632c9d-d315-4f4e-a811-dc389fc7f9fa */
   private java.util.Date olmUseTime;
   /** @pdOid 238cbd63-ec90-4909-b69e-47e3cbe3f884 */
   private java.lang.String duo1;
   /** @pdOid 01eeee5c-f2be-41ab-923b-bd6a6a0038fb */
   private java.lang.String duo2;
   
   /** @pdOid a0c9dc11-a9b5-438a-b003-1b2ff958b6fc */
   public java.lang.String getOlmownEntry() {
      return olmownEntry;
   }
   
   /** @param newOlmownEntry
    * @pdOid 23c23ace-a0de-46d1-9868-76c4043e84f0 */
   public void setOlmownEntry(java.lang.String newOlmownEntry) {
      olmownEntry = newOlmownEntry;
   }
   
   /** @pdOid f2a49731-8f9c-491a-931c-f6e7435089ef */
   public java.lang.String getOlmType() {
      return olmType;
   }
   
   /** @param newOlmType
    * @pdOid a6ae5a25-b3aa-4412-97cc-b70af5ae6847 */
   public void setOlmType(java.lang.String newOlmType) {
      olmType = newOlmType;
   }
   
   /** @pdOid d54c0b37-4fa7-41d5-8b87-c402447c82b8 */
   public java.lang.String getOlmTransport() {
      return olmTransport;
   }
   
   /** @param newOlmTransport
    * @pdOid 0bd20f08-9ca1-4662-a589-6368dc4ee0e3 */
   public void setOlmTransport(java.lang.String newOlmTransport) {
      olmTransport = newOlmTransport;
   }
   
   /** @pdOid a01a0f3e-3a25-4022-aa4d-6d55b8b0dd3d */
   public java.lang.String getOlmUnit() {
      return olmUnit;
   }
   
   /** @param newOlmUnit
    * @pdOid 10494244-c117-4e85-82f9-02fb04fa9ee9 */
   public void setOlmUnit(java.lang.String newOlmUnit) {
      olmUnit = newOlmUnit;
   }
   
   /** @pdOid 217f1800-b46b-4e63-a4a4-bc7dd651b6db */
   public java.lang.String getOlmOperationStaffNo() {
      return olmOperationStaffNo;
   }
   
   /** @param newOlmOperationStaffNo
    * @pdOid 063f0939-0817-44d4-a517-c0595e009949 */
   public void setOlmOperationStaffNo(java.lang.String newOlmOperationStaffNo) {
      olmOperationStaffNo = newOlmOperationStaffNo;
   }
   
   /** @pdOid eda196e5-6fda-40cd-9f23-89288bffad7a */
   public java.lang.String getOlmOperationStaffName() {
      return olmOperationStaffName;
   }
   
   /** @param newOlmOperationStaffName
    * @pdOid 4d1f72fa-955c-4c3a-bd97-4f3e85e34fb3 */
   public void setOlmOperationStaffName(java.lang.String newOlmOperationStaffName) {
      olmOperationStaffName = newOlmOperationStaffName;
   }
   
   /** @pdOid b35f769b-9207-465e-ad2d-95187c509294 */
   public java.util.Date getOlmTime() {
      return olmTime;
   }
   
   /** @param newOlmTime
    * @pdOid 12a9a324-be6f-4333-9867-af50ee68b43c */
   public void setOlmTime(java.util.Date newOlmTime) {
      olmTime = newOlmTime;
   }
   
   /** @pdOid 9877a6fe-be93-412b-993b-f09c1dcb71b0 */
   public java.lang.String getOlmOperatorNo() {
      return olmOperatorNo;
   }
   
   /** @param newOlmOperatorNo
    * @pdOid 2a8caebc-29af-445c-b76b-5528e6d0c34a */
   public void setOlmOperatorNo(java.lang.String newOlmOperatorNo) {
      olmOperatorNo = newOlmOperatorNo;
   }
   
   /** @pdOid b1e16bff-ca95-4b9d-ba0a-8f5fff5c2bb5 */
   public java.lang.String getOlmOperatorName() {
      return olmOperatorName;
   }
   
   /** @param newOlmOperatorName
    * @pdOid 2968e44b-458a-4fad-8d95-93dd01825a50 */
   public void setOlmOperatorName(java.lang.String newOlmOperatorName) {
      olmOperatorName = newOlmOperatorName;
   }
   
   /** @pdOid 2b2a5334-aa13-430f-8888-9781ff61c25d */
   public java.lang.String getOlmClientNo() {
      return olmClientNo;
   }
   
   /** @param newOlmClientNo
    * @pdOid b39271f0-9c54-44c4-9584-6f9895b7be92 */
   public void setOlmClientNo(java.lang.String newOlmClientNo) {
      olmClientNo = newOlmClientNo;
   }
   
   /** @pdOid b1ccb81d-cae8-4ec1-b7ba-eb0c7eb66367 */
   public java.lang.String getOlmClientName() {
      return olmClientName;
   }
   
   /** @param newOlmClientName
    * @pdOid 4d26e7ab-226b-4c4c-a6d6-c4096cc5c95e */
   public void setOlmClientName(java.lang.String newOlmClientName) {
      olmClientName = newOlmClientName;
   }
   
   /** @pdOid 08d79e18-7c7b-473b-9eca-66b8b8314c1e */
   public java.lang.String getOlmUseNo() {
      return olmUseNo;
   }
   
   /** @param newOlmUseNo
    * @pdOid 5f9bf866-83ca-4c59-a8a0-1b1c19f20d5d */
   public void setOlmUseNo(java.lang.String newOlmUseNo) {
      olmUseNo = newOlmUseNo;
   }
   
   /** @pdOid 9b2eeae3-3ec7-4bb7-b284-e304efa0b9f4 */
   public java.lang.String getOlmUseName() {
      return olmUseName;
   }
   
   /** @param newOlmUseName
    * @pdOid 9733de51-452d-477b-8a6e-1458ab028e36 */
   public void setOlmUseName(java.lang.String newOlmUseName) {
      olmUseName = newOlmUseName;
   }
   
   /** @pdOid 344cdf23-dcbe-458b-b747-6175f2b87cd7 */
   public java.util.Date getOlmUseTime() {
      return olmUseTime;
   }
   
   /** @param newOlmUseTime
    * @pdOid 9a03dbbc-20d9-4613-8932-d8c0af40e860 */
   public void setOlmUseTime(java.util.Date newOlmUseTime) {
      olmUseTime = newOlmUseTime;
   }
   
   /** @pdOid 991b9152-29b9-490c-b04e-bfc666ab0bcf */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 24192c69-774e-46a1-ba2c-ed3877581ae5 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 78df8602-23f9-4dc7-98c7-03dad07ae78c */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 579a1e4d-bd2f-441d-84d9-ea76a2a5948f */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}