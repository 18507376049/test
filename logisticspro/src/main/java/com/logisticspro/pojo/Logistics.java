/***********************************************************************
 * Module:  Logistics.java
 * Author:  Administrator
 * Purpose: Defines the Class Logistics
 ***********************************************************************/

import java.util.*;

/** @pdOid 35f17f10-e940-4e08-b1c6-9de69f4a970c */
public class Logistics {
   /** 物流单号
    *             
    * 
    * @pdOid 2362eb81-1295-4713-8065-ad3bfec5a47a */
   private java.lang.String logNo;
   /** 发站
    *             
    * 
    * @pdOid f8f4df5f-090e-4e43-867f-e12f2e504396 */
   private java.lang.String logStation;
   /** 到站
    *             
    * 
    * @pdOid 3c2f8154-395b-48fa-a1e4-4857891a2b8c */
   private java.lang.String logArrive;
   /** 调度人员
    *             
    * 
    * @pdOid 45322f91-ac15-4893-a1a2-c9748b49237f */
   private java.lang.String logScheduling;
   /** 发货司机
    *             
    * 
    * @pdOid 34572f57-4cbc-4a3a-bfc3-906032a446de */
   private java.lang.String logDriver;
   /** 发货员
    *             
    * 
    * @pdOid e333377c-d33f-4f01-9d8d-5be0ec9d418e */
   private java.lang.String logShippingNo;
   /** 发货时间
    *             发货时间
    *             
    * 
    * @pdOid 699637c4-2dd6-4d8d-b301-b67d99be51da */
   private java.util.Date logTime;
   /** 运送单号
    *             
    * 
    * @pdOid 2d65ac33-f219-44fb-b96b-bb60000aee20 */
   private java.lang.String logYunOdd;
   /** 线路ID
    *             
    * 
    * @pdOid bdb7195e-ada8-4443-982d-80e08593b83e */
   private java.lang.String logRouNo;
   /** @pdOid ed5e7335-78a2-42e8-b3bd-efe803d6d7dc */
   private java.lang.String duo1;
   /** @pdOid 6bd5829f-9871-4b9b-9005-ac132753ec90 */
   private java.lang.String duo2;
   /** @pdOid 9afa95c1-a955-478d-ad3d-6f6c65b77a87 */
   private java.lang.String duo3;
   
   /** @pdOid 590b2f72-3ca9-46ab-bf1f-41b976df20ad */
   public java.lang.String getLogNo() {
      return logNo;
   }
   
   /** @param newLogNo
    * @pdOid a1c1b8b8-f6a1-4421-b260-43306046ebe6 */
   public void setLogNo(java.lang.String newLogNo) {
      logNo = newLogNo;
   }
   
   /** @pdOid 86a95406-5464-4c57-b703-f06b3043a26c */
   public java.lang.String getLogStation() {
      return logStation;
   }
   
   /** @param newLogStation
    * @pdOid e3eb5916-da12-4b8b-9535-de41c9fd5a51 */
   public void setLogStation(java.lang.String newLogStation) {
      logStation = newLogStation;
   }
   
   /** @pdOid ae41f255-b9dc-4a1d-aa76-42c320d07498 */
   public java.lang.String getLogArrive() {
      return logArrive;
   }
   
   /** @param newLogArrive
    * @pdOid 62b1c863-c4ba-494d-9c4f-e173e49c0821 */
   public void setLogArrive(java.lang.String newLogArrive) {
      logArrive = newLogArrive;
   }
   
   /** @pdOid d7bf1fee-69e5-4a76-9f9c-52e42007de01 */
   public java.lang.String getLogScheduling() {
      return logScheduling;
   }
   
   /** @param newLogScheduling
    * @pdOid 70b18543-1491-495e-b967-b9db81dcd75f */
   public void setLogScheduling(java.lang.String newLogScheduling) {
      logScheduling = newLogScheduling;
   }
   
   /** @pdOid bb7c8e43-4bc8-4dbf-b52b-a5a74765d5ec */
   public java.lang.String getLogDriver() {
      return logDriver;
   }
   
   /** @param newLogDriver
    * @pdOid 9b11fff9-ced6-46fb-907b-a55aa132d827 */
   public void setLogDriver(java.lang.String newLogDriver) {
      logDriver = newLogDriver;
   }
   
   /** @pdOid 1d743393-f1e0-426b-b5a3-726170a7f318 */
   public java.lang.String getLogShippingNo() {
      return logShippingNo;
   }
   
   /** @param newLogShippingNo
    * @pdOid 58d34d63-1dfa-4cba-97d5-47e3486b5fd9 */
   public void setLogShippingNo(java.lang.String newLogShippingNo) {
      logShippingNo = newLogShippingNo;
   }
   
   /** @pdOid 97a6fb99-7742-4c66-b595-9dac98b7ceff */
   public java.util.Date getLogTime() {
      return logTime;
   }
   
   /** @param newLogTime
    * @pdOid 08fc009a-20dd-4178-8861-4a930c60e55d */
   public void setLogTime(java.util.Date newLogTime) {
      logTime = newLogTime;
   }
   
   /** @pdOid 3f58cf36-fb67-4a92-abcd-6716b6ee6ebe */
   public java.lang.String getLogYunOdd() {
      return logYunOdd;
   }
   
   /** @param newLogYunOdd
    * @pdOid eda277a5-1874-4596-aab2-3407d44e45d7 */
   public void setLogYunOdd(java.lang.String newLogYunOdd) {
      logYunOdd = newLogYunOdd;
   }
   
   /** @pdOid 0227989f-ed97-4b23-8113-e43dfd34f42d */
   public java.lang.String getLogRouNo() {
      return logRouNo;
   }
   
   /** @param newLogRouNo
    * @pdOid c245f1cf-7641-4dc4-8b07-42eabfc04480 */
   public void setLogRouNo(java.lang.String newLogRouNo) {
      logRouNo = newLogRouNo;
   }
   
   /** @pdOid 9a774634-586c-40c4-9658-67c49a6c1531 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid ceaa4893-0edc-4727-bc2e-4c145f3e8ccc */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 924fad71-3eb9-497c-ab97-531374ff5c6f */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid f6024b24-b36d-4cfd-bdbd-918f0eef7c50 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 2f172bca-5eb6-417b-9ff5-1355b2b7761c */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 477e13df-e169-4f3d-b28e-d4ef73d62b39 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}