/***********************************************************************
 * Module:  OutStorage.java
 * Author:  Administrator
 * Purpose: Defines the Class OutStorage
 ***********************************************************************/

import java.util.*;

/** @pdOid 37823d40-fc4b-4f3a-82a7-9fd0775725ff */
public class OutStorage {
   /** 分拣出库单号
    *             
    * 
    * @pdOid 30e50f81-abb8-4d70-bd03-a39f45d40c1f */
   private java.lang.String ousOdd;
   /** 出库交接单号
    *             
    * 
    * @pdOid 5e8bf208-1c6a-4749-8dc4-ffd97493d7c4 */
   private java.lang.String ousOutNumber;
   /** 物流方向
    *             
    * 
    * @pdOid 456fef6b-3c48-4d3b-8dd6-5f9e5d783702 */
   private java.lang.String ousLogiDirec;
   /** 运输方式
    *             
    * 
    * @pdOid c9d8cc8e-b08d-47f4-b51b-38a0be0da602 */
   private java.lang.String ousModeTranspor;
   /** 承运商
    *             
    * 
    * @pdOid 052ab0ce-3034-4907-905e-0d2570c70530 */
   private java.lang.String ousCommonCarrier;
   /** 接货人
    *             
    * 
    * @pdOid a6680baa-f46d-4336-95da-763a7e305d2d */
   private java.lang.String ousMasterPorter;
   /** 交货人
    *             
    * 
    * @pdOid c80828be-fe4c-494e-a8a2-5c38c252895c */
   private java.lang.String ousDeliveMan;
   /** 交货时间
    *             
    * 
    * @pdOid dd544df8-f076-4c5d-b52a-34cde30259e9 */
   private java.util.Date ousDeliveryTime;
   /** 交货单位
    *             
    * 
    * @pdOid 10cd7f19-970a-4de0-9d11-62a101c5a587 */
   private java.lang.String ousDeliveryUnit;
   /** 仓库编号
    *             
    * 
    * @pdOid 7047c93b-5765-4589-a433-8da250b5a469 */
   private java.lang.String ousPisWareNo;
   /** @pdOid ca797fd9-4829-4985-a8a1-a6790d39217e */
   private java.lang.String duo1;
   /** @pdOid 6617d08a-4272-4ee0-b67e-8a8246b4c77c */
   private java.lang.String duo2;
   
   /** @pdOid 37b97119-7b0d-45af-8c6e-25c42ce9dfaf */
   public java.lang.String getOusOdd() {
      return ousOdd;
   }
   
   /** @param newOusOdd
    * @pdOid 4a51e700-50f1-4471-b05e-d264de51cb9a */
   public void setOusOdd(java.lang.String newOusOdd) {
      ousOdd = newOusOdd;
   }
   
   /** @pdOid 0892c3d3-6115-4134-8fe2-9c2395593e0c */
   public java.lang.String getOusOutNumber() {
      return ousOutNumber;
   }
   
   /** @param newOusOutNumber
    * @pdOid cd30acca-72d0-451a-a48c-bba23fd90ea8 */
   public void setOusOutNumber(java.lang.String newOusOutNumber) {
      ousOutNumber = newOusOutNumber;
   }
   
   /** @pdOid 3ad992cc-7434-414f-aeaf-68171641d957 */
   public java.lang.String getOusLogiDirec() {
      return ousLogiDirec;
   }
   
   /** @param newOusLogiDirec
    * @pdOid 5b03e0b6-8443-4977-81f1-897a43ac926a */
   public void setOusLogiDirec(java.lang.String newOusLogiDirec) {
      ousLogiDirec = newOusLogiDirec;
   }
   
   /** @pdOid d35dafae-f34d-4f98-992f-05a8edff4b6f */
   public java.lang.String getOusModeTranspor() {
      return ousModeTranspor;
   }
   
   /** @param newOusModeTranspor
    * @pdOid c39c8bdc-1978-4da4-a1c3-6b53aa580111 */
   public void setOusModeTranspor(java.lang.String newOusModeTranspor) {
      ousModeTranspor = newOusModeTranspor;
   }
   
   /** @pdOid 2c356672-19cb-4be5-8222-ea905170436e */
   public java.lang.String getOusCommonCarrier() {
      return ousCommonCarrier;
   }
   
   /** @param newOusCommonCarrier
    * @pdOid b61e71f2-1a5c-425a-860c-9d72075ae5b4 */
   public void setOusCommonCarrier(java.lang.String newOusCommonCarrier) {
      ousCommonCarrier = newOusCommonCarrier;
   }
   
   /** @pdOid 0c4e3161-c25d-4729-8c2b-d147df3e0616 */
   public java.lang.String getOusMasterPorter() {
      return ousMasterPorter;
   }
   
   /** @param newOusMasterPorter
    * @pdOid b1c6f1db-a5bf-4648-ad41-365be94de6bc */
   public void setOusMasterPorter(java.lang.String newOusMasterPorter) {
      ousMasterPorter = newOusMasterPorter;
   }
   
   /** @pdOid a388acdb-b34d-4fa9-bd16-8166c1f8cc03 */
   public java.lang.String getOusDeliveMan() {
      return ousDeliveMan;
   }
   
   /** @param newOusDeliveMan
    * @pdOid 6c6c79d2-7b90-440e-ae01-f4c97978be1a */
   public void setOusDeliveMan(java.lang.String newOusDeliveMan) {
      ousDeliveMan = newOusDeliveMan;
   }
   
   /** @pdOid 57782d7a-6bcd-4f9c-a05b-40f6413f8e34 */
   public java.util.Date getOusDeliveryTime() {
      return ousDeliveryTime;
   }
   
   /** @param newOusDeliveryTime
    * @pdOid 31e7d9b6-fa9c-4e1a-bf27-1ba6e68998fb */
   public void setOusDeliveryTime(java.util.Date newOusDeliveryTime) {
      ousDeliveryTime = newOusDeliveryTime;
   }
   
   /** @pdOid 539fcc22-f5da-44dd-b35c-980e88fa2e99 */
   public java.lang.String getOusDeliveryUnit() {
      return ousDeliveryUnit;
   }
   
   /** @param newOusDeliveryUnit
    * @pdOid e880329e-34c7-4035-b958-bc58675786ec */
   public void setOusDeliveryUnit(java.lang.String newOusDeliveryUnit) {
      ousDeliveryUnit = newOusDeliveryUnit;
   }
   
   /** @pdOid 0058fba2-2389-4809-a752-d9a1cd32b7e8 */
   public java.lang.String getOusPisWareNo() {
      return ousPisWareNo;
   }
   
   /** @param newOusPisWareNo
    * @pdOid 12f78a10-8211-41c3-91b7-47997fdff933 */
   public void setOusPisWareNo(java.lang.String newOusPisWareNo) {
      ousPisWareNo = newOusPisWareNo;
   }
   
   /** @pdOid 74dd7546-e9b2-4630-8d8b-516d19ad17da */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 9cbb87f2-c941-4773-bd3a-debec288921e */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 5beb291e-bb7b-4295-9bee-4a05f12f8ddd */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 0dbc61b8-ab47-4cba-ada2-9e00da69901e */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}