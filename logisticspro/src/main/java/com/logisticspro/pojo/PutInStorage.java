/***********************************************************************
 * Module:  PutInStorage.java
 * Author:  Administrator
 * Purpose: Defines the Class PutInStorage
 ***********************************************************************/

import java.util.*;

/** @pdOid 32d631fb-29f2-4d13-b93e-fbd0d11bc00b */
public class PutInStorage {
   /** 分拣入库编号
    *             
    * 
    * @pdOid a613ff1d-3b8e-437a-b0cf-ba266285ed2e */
   private java.lang.String pisNo;
   /** 入库交接单号
    *             
    * 
    * @pdOid d042d5fc-c05b-4ea5-ae8b-e17dec837180 */
   private java.lang.String pisReceiptNumber;
   /** 接货时间
    *             
    * 
    * @pdOid 16a32e32-f7bf-49a3-9be7-28e3b7d2e7f8 */
   private java.util.Date pisPickTime;
   /** 接货人
    *             
    * 
    * @pdOid edc3e548-fcbf-4a06-b38d-960e2a55559e */
   private java.lang.String pisMasterPorter;
   /** 接收单位
    *             
    * 
    * @pdOid ac7cd3bb-4cce-434a-8a4f-22782bd47999 */
   private java.lang.String pisReceiver;
   /** 发货人
    *             
    * 
    * @pdOid c18c803f-f4a8-48cd-924b-33776aac5752 */
   private java.lang.String pisConsigner;
   /** 发货单位
    *             
    * 
    * @pdOid af91bf6a-b0df-4b2b-a3ff-c9e6061f068f */
   private java.lang.String pisForwUnit;
   /** 仓库编号
    *             
    * 
    * @pdOid 321a5370-5fb9-4fc5-adad-02d81935b05e */
   private java.lang.String pisWareNo;
   /** @pdOid 27de3fc4-c372-48a5-a8c5-692dc0055600 */
   private java.lang.String duo1;
   /** @pdOid ad760348-dee1-4442-86de-823c5d086799 */
   private java.lang.String duo2;
   /** @pdOid ed6f7e79-2ec9-4a84-9cc1-4fb2c717706b */
   private java.lang.String duo3;
   
   /** @pdOid f5053368-2dfc-4050-ba92-756184a200fd */
   public java.lang.String getPisNo() {
      return pisNo;
   }
   
   /** @param newPisNo
    * @pdOid 5bfdf877-30e8-45d3-b156-d40e37711c8d */
   public void setPisNo(java.lang.String newPisNo) {
      pisNo = newPisNo;
   }
   
   /** @pdOid 2df3d76d-4ca8-41a3-978a-f30adcd04c13 */
   public java.lang.String getPisReceiptNumber() {
      return pisReceiptNumber;
   }
   
   /** @param newPisReceiptNumber
    * @pdOid d2eb44f7-14b0-4747-91c2-87248be2a729 */
   public void setPisReceiptNumber(java.lang.String newPisReceiptNumber) {
      pisReceiptNumber = newPisReceiptNumber;
   }
   
   /** @pdOid 95959325-6021-4f93-800e-1e4067108fae */
   public java.util.Date getPisPickTime() {
      return pisPickTime;
   }
   
   /** @param newPisPickTime
    * @pdOid 61f75dd6-610c-4167-ac9b-45fa02c033e5 */
   public void setPisPickTime(java.util.Date newPisPickTime) {
      pisPickTime = newPisPickTime;
   }
   
   /** @pdOid 6ca3bb73-5c32-4456-a31e-ebd44310b564 */
   public java.lang.String getPisMasterPorter() {
      return pisMasterPorter;
   }
   
   /** @param newPisMasterPorter
    * @pdOid ec2eb3a7-081f-42bc-8920-0d9d53728d8a */
   public void setPisMasterPorter(java.lang.String newPisMasterPorter) {
      pisMasterPorter = newPisMasterPorter;
   }
   
   /** @pdOid f5cf5400-6a10-40f2-8a5e-1c519608528c */
   public java.lang.String getPisReceiver() {
      return pisReceiver;
   }
   
   /** @param newPisReceiver
    * @pdOid 10a606d9-9416-4b05-b30f-74c0607aa17e */
   public void setPisReceiver(java.lang.String newPisReceiver) {
      pisReceiver = newPisReceiver;
   }
   
   /** @pdOid 8beb40bc-4ed0-4c21-8a55-24b657193d3f */
   public java.lang.String getPisConsigner() {
      return pisConsigner;
   }
   
   /** @param newPisConsigner
    * @pdOid ddccd084-a7a1-48b2-bb17-b1d65ed67391 */
   public void setPisConsigner(java.lang.String newPisConsigner) {
      pisConsigner = newPisConsigner;
   }
   
   /** @pdOid 41460d11-b830-4e96-ace4-80d9c71535fa */
   public java.lang.String getPisForwUnit() {
      return pisForwUnit;
   }
   
   /** @param newPisForwUnit
    * @pdOid c276f5b3-aced-4947-ae41-50dc39cce952 */
   public void setPisForwUnit(java.lang.String newPisForwUnit) {
      pisForwUnit = newPisForwUnit;
   }
   
   /** @pdOid c205494e-84b3-4981-a109-787e60b24222 */
   public java.lang.String getPisWareNo() {
      return pisWareNo;
   }
   
   /** @param newPisWareNo
    * @pdOid 15966aad-e142-4edc-8602-a98228f51b0e */
   public void setPisWareNo(java.lang.String newPisWareNo) {
      pisWareNo = newPisWareNo;
   }
   
   /** @pdOid cac211af-fb6b-41a0-be65-1b58a75eeb93 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid fac4c6d6-3d78-40a1-94ee-d8e98132a4c1 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid ce1d7b3b-96c2-4a39-97e7-12c93007403a */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid b3b3d23b-ec51-4ce3-8e2a-6a1033bce7bb */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid a732cf7d-e504-479d-a5ec-942af3867f9b */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 370aa377-bd33-4a83-8eab-0ae35f8b6b51 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}