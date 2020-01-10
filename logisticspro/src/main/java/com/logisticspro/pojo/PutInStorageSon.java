/***********************************************************************
 * Module:  PutInStorageSon.java
 * Author:  Administrator
 * Purpose: Defines the Class PutInStorageSon
 ***********************************************************************/

import java.util.*;

/** @pdOid 6d60e916-8f41-4d11-86df-7c7e2e147e4e */
public class PutInStorageSon {
   /** 入库分拣单号
    *             
    * 
    * @pdOid 09606496-dd5d-4485-8816-7d71ed3155ae */
   private java.lang.String pusOdd;
   /** 合包号
    *             
    * 
    * @pdOid 0addfc0f-1d65-415a-a785-af057b7735b8 */
   private java.lang.String pusOrPackageNo;
   /** 状态
    *             
    * 
    * @pdOid c434433b-5984-486d-9023-a916b3e684a7 */
   private int pusStatus = 0;
   /** 分拣入库编号
    *             
    * 
    * @pdOid 8bfa8ab5-36ac-48cd-9fee-65a253832ceb */
   private java.lang.String pusPisNo;
   /** @pdOid f794cc42-a7d5-4356-8782-5d8c811b6180 */
   private java.lang.String duo1;
   /** @pdOid 46e83e4c-2054-4782-8ae7-466f65046b14 */
   private java.lang.String duo2;
   
   /** @pdOid 06e5e136-a4b0-45bd-878f-ebe894cc1e90 */
   public java.lang.String getPusOdd() {
      return pusOdd;
   }
   
   /** @param newPusOdd
    * @pdOid 36ff0a91-c75e-4f69-a9b0-ebf38f5de5d9 */
   public void setPusOdd(java.lang.String newPusOdd) {
      pusOdd = newPusOdd;
   }
   
   /** @pdOid c53b6b2a-9329-4f47-9160-8e73372f9095 */
   public java.lang.String getPusOrPackageNo() {
      return pusOrPackageNo;
   }
   
   /** @param newPusOrPackageNo
    * @pdOid 2c93f5fc-6fdd-4e11-bed0-8bb0de63d339 */
   public void setPusOrPackageNo(java.lang.String newPusOrPackageNo) {
      pusOrPackageNo = newPusOrPackageNo;
   }
   
   /** @pdOid c7dddb81-b5ab-4326-b806-59e872ed1655 */
   public int getPusStatus() {
      return pusStatus;
   }
   
   /** @param newPusStatus
    * @pdOid da07c299-bfa7-4831-9991-3f1666eaa1b4 */
   public void setPusStatus(int newPusStatus) {
      pusStatus = newPusStatus;
   }
   
   /** @pdOid c06690bb-d3b5-4b36-820a-84bbf8147a67 */
   public java.lang.String getPusPisNo() {
      return pusPisNo;
   }
   
   /** @param newPusPisNo
    * @pdOid a0b380fd-6873-425f-85d5-9bccef8051eb */
   public void setPusPisNo(java.lang.String newPusPisNo) {
      pusPisNo = newPusPisNo;
   }
   
   /** @pdOid 64254804-6a2f-4695-b029-96edada9881a */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid fb0737c1-0943-41c5-a90e-f3c4db544e01 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid e20e9dfc-7376-4e1b-abd1-0d0a99c81c01 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid c7aa997d-c97a-4335-8ea0-de57a3bb6542 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}