/***********************************************************************
 * Module:  ArrivalTimeEntry.java
 * Author:  Administrator
 * Purpose: Defines the Class ArrivalTimeEntry
 ***********************************************************************/

import java.util.*;

/** @pdOid fdd16a68-a021-43f6-a49d-ccf713b8bede */
public class ArrivalTimeEntry {
   /** 到达时间编号
    *             
    * 
    * @pdOid 1d61082b-3b36-4119-84dc-e0c77538d273 */
   private java.lang.String ateNo;
   /** 交接单号
    *             
    * 
    * @pdOid 0cc333c8-fd28-488a-ad8d-7077d7e533c5 */
   private java.lang.String ateReceiptNo;
   /** 到达地
    *             
    * 
    * @pdOid 5d6a0c29-9345-4760-87f5-a590fb9a45e6 */
   private 1 varchar(32) ateDestinationPort;
   /** 预计离开本地时间
    *             
    * 
    * @pdOid 888da0bc-5a43-4dd4-bcb1-2ad2ce6d933b */
   private java.util.Date ateEstimTimeLea;
   /** 预计到达下一站时间
    *             
    * 
    * @pdOid 53565692-9b4f-4faf-bd3c-8f12e25f4940 */
   private java.util.Date ateEstimTimeArri;
   /** 实际到达本地时间
    *             
    * 
    * @pdOid 86bd6534-4218-4129-b132-b9ab737ec9d2 */
   private java.util.Date ateActTime;
   /** 录入人
    *             
    * 
    * @pdOid 85e8f072-10c2-489e-a76f-f0f81d1de8cf */
   private java.lang.String ateDataEntryClerk;
   /** 录入时间
    *             
    * 
    * @pdOid c42e7c6f-4200-445f-974c-cde7038f706a */
   private java.util.Date ateInputTime;
   /** 录入单位
    *             
    * 
    * @pdOid e09c0a12-5244-4a23-bd66-134cb28103c4 */
   private java.lang.String ateDanNo;
   /** 状态
    *             
    * 
    * @pdOid 6d8e6f66-49ec-44f6-93c6-b9cdc8ce8b47 */
   private int ateStatus = 0;
   /** @pdOid e572c8c6-37be-451e-82f7-6f67af19da3a */
   private java.lang.String duo1;
   /** @pdOid 2912d6a1-8aa5-4183-b2fd-e397b67175b8 */
   private java.lang.String duo2;
   /** @pdOid 8d9b1569-f24c-4508-bc63-3637ac5dfe70 */
   private java.lang.String duo3;
   
   /** @pdOid df161eb5-c780-4bbf-8eed-fcb801dd3249 */
   public java.lang.String getAteNo() {
      return ateNo;
   }
   
   /** @param newAteNo
    * @pdOid b93ada30-907a-44cc-ab9b-5b2de85b7561 */
   public void setAteNo(java.lang.String newAteNo) {
      ateNo = newAteNo;
   }
   
   /** @pdOid 2379bab6-0d54-49e6-bf0e-1b5f23f0f60d */
   public java.lang.String getAteReceiptNo() {
      return ateReceiptNo;
   }
   
   /** @param newAteReceiptNo
    * @pdOid ce4349ff-0a98-4fef-b6ea-8cc0c8123063 */
   public void setAteReceiptNo(java.lang.String newAteReceiptNo) {
      ateReceiptNo = newAteReceiptNo;
   }
   
   /** @pdOid 26c8d7c4-ce08-492e-a304-2f96f7940a50 */
   public 1 varchar(32) getAteDestinationPort() {
      return ateDestinationPort;
   }
   
   /** @param newAteDestinationPort
    * @pdOid 60a0f734-c9ed-43b1-94d4-704322a31195 */
   public void setAteDestinationPort(1 varchar(32) newAteDestinationPort) {
      ateDestinationPort = newAteDestinationPort;
   }
   
   /** @pdOid 72592856-f894-4adc-990e-7b568e9aa187 */
   public java.util.Date getAteEstimTimeLea() {
      return ateEstimTimeLea;
   }
   
   /** @param newAteEstimTimeLea
    * @pdOid 9554471f-57a0-4ab0-a81f-96edb1a11420 */
   public void setAteEstimTimeLea(java.util.Date newAteEstimTimeLea) {
      ateEstimTimeLea = newAteEstimTimeLea;
   }
   
   /** @pdOid aa0b322f-069e-427d-b90b-e052acf3ca76 */
   public java.util.Date getAteEstimTimeArri() {
      return ateEstimTimeArri;
   }
   
   /** @param newAteEstimTimeArri
    * @pdOid b0fd830e-680c-43be-967f-4586ea8d7f50 */
   public void setAteEstimTimeArri(java.util.Date newAteEstimTimeArri) {
      ateEstimTimeArri = newAteEstimTimeArri;
   }
   
   /** @pdOid f6144659-e682-459e-b317-bcb34d824a7a */
   public java.util.Date getAteActTime() {
      return ateActTime;
   }
   
   /** @param newAteActTime
    * @pdOid b766f082-8487-4df6-87fd-4ac0ec15eb16 */
   public void setAteActTime(java.util.Date newAteActTime) {
      ateActTime = newAteActTime;
   }
   
   /** @pdOid e02e3060-fe69-409a-9f96-09344d0f81b3 */
   public java.lang.String getAteDataEntryClerk() {
      return ateDataEntryClerk;
   }
   
   /** @param newAteDataEntryClerk
    * @pdOid 1b2d5df7-717f-46b1-bbc0-b9401a293655 */
   public void setAteDataEntryClerk(java.lang.String newAteDataEntryClerk) {
      ateDataEntryClerk = newAteDataEntryClerk;
   }
   
   /** @pdOid cc46c43b-6e44-4fcf-bd3a-966ec69e06a4 */
   public java.util.Date getAteInputTime() {
      return ateInputTime;
   }
   
   /** @param newAteInputTime
    * @pdOid 5429fee0-a095-4cb1-b8f5-fb5888aac0c5 */
   public void setAteInputTime(java.util.Date newAteInputTime) {
      ateInputTime = newAteInputTime;
   }
   
   /** @pdOid 0ed2ceba-809e-4bcd-8282-21493f4715ce */
   public java.lang.String getAteDanNo() {
      return ateDanNo;
   }
   
   /** @param newAteDanNo
    * @pdOid 41c2fbb6-8464-46a4-b52c-0ddf902c62bc */
   public void setAteDanNo(java.lang.String newAteDanNo) {
      ateDanNo = newAteDanNo;
   }
   
   /** @pdOid 3ef5d7f5-db7f-4de2-91c1-c3817bafc64b */
   public int getAteStatus() {
      return ateStatus;
   }
   
   /** @param newAteStatus
    * @pdOid 1c09bc95-7f1e-4bec-bf61-a1cd1428f537 */
   public void setAteStatus(int newAteStatus) {
      ateStatus = newAteStatus;
   }
   
   /** @pdOid cbdec7cd-0058-4426-af6b-6c66686c1ad9 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid f1d83d6b-db27-416a-9a49-a4760d1620ac */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid af2bde2d-cb91-4def-87f3-0dd55c9d4045 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 5d7d4536-6833-48cf-9ec4-e59a2a77d9d7 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 3f86b1b4-e140-40d0-b25d-af0557b94bee */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 946cdb57-0290-4c0a-9f69-87e41616c24b */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}