/***********************************************************************
 * Module:  CancelReceiptRequest.java
 * Author:  Administrator
 * Purpose: Defines the Class CancelReceiptRequest
 ***********************************************************************/

import java.util.*;

/** @pdOid 3bc96e6a-ae11-4bf4-ae27-1242aa71aea5 */
public class CancelReceiptRequest {
   /** 取消签收编号
    *             
    * 
    * @pdOid c88efc2a-245a-4009-8679-f226ccede2a7 */
   private java.lang.String carNo;
   /** 申请单号
    *             
    * 
    * @pdOid e9414bdd-732f-4555-b4a2-2e2b05621077 */
   private java.lang.String carApplOdd;
   /** 工作单号
    *             
    * 
    * @pdOid b0077633-acac-4ce1-856e-5b01c743e550 */
   private java.lang.String carMoenyidmNo;
   /** 派送单位
    *             
    * 
    * @pdOid c33dd61e-5ad5-4e30-af89-7f096699e81b */
   private java.lang.String carSendTheUnit;
   /** 派送时间
    *             
    * 
    * @pdOid c3faced4-3aea-4fc5-a227-f8b59d24fda9 */
   private java.util.Date carDeliveryData;
   /** 签收状态
    *             
    * 
    * @pdOid 10eab9b4-105c-49ec-8191-c7c355d2ea33 */
   private int carSignStatus = 0;
   /** 审批状态
    *             
    * 
    * @pdOid cefbc230-7949-45f7-9c58-b38d5d746119 */
   private int carApprovalStatus = 0;
   /** 申请原因
    *             
    * 
    * @pdOid e4f8abc0-ec53-4cfb-b8c1-67b818f37f5f */
   private java.lang.String carApplyCause;
   /** 申请人
    *             
    * 
    * @pdOid 12257dc4-325c-4eb0-845c-a5c13fa4730f */
   private java.lang.String carProposerNo;
   /** 申请单位
    *             
    * 
    * @pdOid 3f00f844-254c-4786-98a6-8bbd8e377e13 */
   private java.lang.String carApplicantUnit;
   /** 申请时间
    *             
    * 
    * @pdOid 47778be7-1196-4623-9f5b-f23ff2871db3 */
   private java.util.Date carApplicationDate;
   /** @pdOid ff03684f-cf9c-4948-bce9-79cd4a336bcc */
   private java.lang.String dou1;
   /** @pdOid 350a8ece-d6a4-4105-b365-216b1b57cec2 */
   private java.lang.String dou2;
   
   /** @pdOid ef44222e-b612-4269-92ed-7be3902197ce */
   public java.lang.String getCarNo() {
      return carNo;
   }
   
   /** @param newCarNo
    * @pdOid f3612342-a495-4f79-9a9e-d68159453807 */
   public void setCarNo(java.lang.String newCarNo) {
      carNo = newCarNo;
   }
   
   /** @pdOid be293048-fd68-44f8-ac96-5693a67082c3 */
   public java.lang.String getCarApplOdd() {
      return carApplOdd;
   }
   
   /** @param newCarApplOdd
    * @pdOid 72ec0008-a62f-40c6-b791-c7e66ae89cf6 */
   public void setCarApplOdd(java.lang.String newCarApplOdd) {
      carApplOdd = newCarApplOdd;
   }
   
   /** @pdOid a9a82085-f808-43f7-9b75-8c4a49bbf4af */
   public java.lang.String getCarMoenyidmNo() {
      return carMoenyidmNo;
   }
   
   /** @param newCarMoenyidmNo
    * @pdOid e918ad42-3da0-407a-8ffc-16adf0795ac6 */
   public void setCarMoenyidmNo(java.lang.String newCarMoenyidmNo) {
      carMoenyidmNo = newCarMoenyidmNo;
   }
   
   /** @pdOid 824e6d96-3a1d-48ac-a6e4-8b84061edd07 */
   public java.lang.String getCarSendTheUnit() {
      return carSendTheUnit;
   }
   
   /** @param newCarSendTheUnit
    * @pdOid 46b3636b-a43e-415f-a862-e598c7d7d38e */
   public void setCarSendTheUnit(java.lang.String newCarSendTheUnit) {
      carSendTheUnit = newCarSendTheUnit;
   }
   
   /** @pdOid aae4780a-c3b8-400e-b598-49aa52be88ce */
   public java.util.Date getCarDeliveryData() {
      return carDeliveryData;
   }
   
   /** @param newCarDeliveryData
    * @pdOid 6244c842-443e-46b9-9376-31a9cbcebd04 */
   public void setCarDeliveryData(java.util.Date newCarDeliveryData) {
      carDeliveryData = newCarDeliveryData;
   }
   
   /** @pdOid fc986b0e-4e77-4081-bfd4-6f427301e0e2 */
   public int getCarSignStatus() {
      return carSignStatus;
   }
   
   /** @param newCarSignStatus
    * @pdOid 1bbd8bb0-3153-43f5-b321-1b4370df10e6 */
   public void setCarSignStatus(int newCarSignStatus) {
      carSignStatus = newCarSignStatus;
   }
   
   /** @pdOid 805f563a-efc3-4da9-b421-1735d157e39c */
   public int getCarApprovalStatus() {
      return carApprovalStatus;
   }
   
   /** @param newCarApprovalStatus
    * @pdOid 9dfaf945-a6c3-46cd-8694-a369790fbc68 */
   public void setCarApprovalStatus(int newCarApprovalStatus) {
      carApprovalStatus = newCarApprovalStatus;
   }
   
   /** @pdOid 90b9c7b7-4133-4c0f-97a9-b47b54838016 */
   public java.lang.String getCarApplyCause() {
      return carApplyCause;
   }
   
   /** @param newCarApplyCause
    * @pdOid 32b4b5a3-d9ae-4b4c-a80d-28108f6bbee9 */
   public void setCarApplyCause(java.lang.String newCarApplyCause) {
      carApplyCause = newCarApplyCause;
   }
   
   /** @pdOid 773293e0-c1c3-4157-b5ce-d4ede09e5f5d */
   public java.lang.String getCarProposerNo() {
      return carProposerNo;
   }
   
   /** @param newCarProposerNo
    * @pdOid 3b4d3064-8c9f-4e9b-97c4-fb998bbc9e99 */
   public void setCarProposerNo(java.lang.String newCarProposerNo) {
      carProposerNo = newCarProposerNo;
   }
   
   /** @pdOid 408c3d15-8c3d-4905-af31-f17926b7488b */
   public java.lang.String getCarApplicantUnit() {
      return carApplicantUnit;
   }
   
   /** @param newCarApplicantUnit
    * @pdOid c573f7e8-96de-45fc-b356-b85b52d2b204 */
   public void setCarApplicantUnit(java.lang.String newCarApplicantUnit) {
      carApplicantUnit = newCarApplicantUnit;
   }
   
   /** @pdOid 3291562a-896b-4535-9cd2-8f7edb5f14ea */
   public java.util.Date getCarApplicationDate() {
      return carApplicationDate;
   }
   
   /** @param newCarApplicationDate
    * @pdOid 211d8b04-eb16-4e4e-a4d6-56910b948d7b */
   public void setCarApplicationDate(java.util.Date newCarApplicationDate) {
      carApplicationDate = newCarApplicationDate;
   }
   
   /** @pdOid 1480a93d-e1f4-4cd9-abd5-258c89b2d26a */
   public java.lang.String getDou1() {
      return dou1;
   }
   
   /** @param newDou1
    * @pdOid 01d54311-870e-4fd2-8ae0-0256e75c559c */
   public void setDou1(java.lang.String newDou1) {
      dou1 = newDou1;
   }
   
   /** @pdOid 43cafa4c-ea0a-4e3d-9e4e-682451d476c1 */
   public java.lang.String getDou2() {
      return dou2;
   }
   
   /** @param newDou2
    * @pdOid ed395d29-1321-4536-b4fa-23e468cc4f50 */
   public void setDou2(java.lang.String newDou2) {
      dou2 = newDou2;
   }

}