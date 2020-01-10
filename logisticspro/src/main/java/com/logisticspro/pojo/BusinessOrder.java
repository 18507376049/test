/***********************************************************************
 * Module:  BusinessOrder.java
 * Author:  Administrator
 * Purpose: Defines the Class BusinessOrder
 ***********************************************************************/

import java.util.*;

/** @pdOid 86cea55f-1a06-4e7d-9481-90192ae19a83 */
public class BusinessOrder {
   /** 业务通知单号
    *             
    * 
    * @pdOid e5122c3c-9280-4e1f-99ef-d1f366214fed */
   private java.lang.String busMemoNo;
   /** 客户编号
    *             
    * 
    * @pdOid b4e5a529-5e3f-471c-b4e7-652414c487c4 */
   private java.lang.String busCustomerNo;
   /** 客户单号
    *             
    * 
    * @pdOid a40c0b82-7a65-477d-bdb8-6b2fd43b3fca */
   private java.lang.String busCustomerOdd;
   /** 产品（品名）
    *             
    * 
    * @pdOid 463ddc9a-7793-4fc3-a28f-7881000180b9 */
   private java.lang.String busProduct;
   /** 预约取件时间
    *             
    * 
    * @pdOid 9e2eb4fa-68bb-4fae-8fae-20adc168afc8 */
   private java.util.Date busResPickupTime;
   /** 预约收件时间
    *             
    * 
    * @pdOid ccd5a395-7919-4b81-9720-c519e12ce3b5 */
   private java.util.Date busResReceiptTime;
   /** 调拨人
    *             
    * 
    * @pdOid 6d88cf20-542b-4a8b-bcb2-e70c4baf1b62 */
   private java.lang.String busAssigner;
   /** 分配时间
    *             
    * 
    * @pdOid 04579a77-88e5-4987-bbde-c6b4646b5db8 */
   private java.util.Date busAllocateTime;
   /** 预计重量
    *             
    * 
    * @pdOid fa4a9386-199f-4f29-9cd3-dc374da1ae2b */
   private double busWeight;
   /** 预计体积
    *             
    * 
    * @pdOid 455cdab8-3bbf-4108-bcc3-57fbec231f8d */
   private double busVolume;
   /** 取货人
    *             
    * 
    * @pdOid ec680da1-e4a1-4430-b709-b92651c12d10 */
   private java.lang.String busPickupPerson;
   /** 取货标识
    *             
    * 
    * @pdOid 74f1db95-6772-4f4c-a7a7-f1cb7b04c34a */
   private java.lang.String busPickupLogo;
   /** 取货单位
    *             
    * 
    * @pdOid 75bbbf2e-51b9-43b0-95c9-c2bf7ae51c5b */
   private java.lang.String busPickupUnit;
   /** 取货时间
    *             
    * 
    * @pdOid 6701cf53-e99f-4a6f-a0b2-823b4e9f71f7 */
   private java.util.Date busPickupTime;
   /** 派送地址
    *             
    * 
    * @pdOid a529a171-33c6-4263-8a34-009d1ad2445d */
   private java.lang.String busDeliAddress;
   /** 处理单位
    *             
    * 
    * @pdOid 6ff42782-93eb-4be8-b433-989bea10a8f5 */
   private java.lang.String busProcUnit;
   /** 通知单来源
    *             
    * 
    * @pdOid 8f5d9689-ff96-44e8-ab3a-03afa57aa01c */
   private java.lang.String busNotifiSource;
   /** 客户单号修改标志
    *             
    * 
    * @pdOid fb1ab5b6-a9eb-4c28-bb84-37f295e2b0d0 */
   private int busUpdateSign = 0;
   /** 分单类型
    *             
    * 
    * @pdOid f2717bfe-ea4e-46b8-9fde-3dbba230d0af */
   private java.lang.String busSingleType;
   /** 重要提示
    *             
    * 
    * @pdOid af5f1295-ccc8-4782-83c3-4da22af8236e */
   private java.lang.String busImportantNote;
   /** 备注
    *             
    * 
    * @pdOid 0b254e79-1101-471a-b90e-f25ebace29b1 */
   private java.lang.String busRemark;
   /** 咨询内容
    *             
    * 
    * @pdOid 6a190aff-010c-4764-a9cc-864d922d3cbd */
   private java.lang.String busConsultContent;
   /** 咨询结果
    *             
    * 
    * @pdOid c1d32c28-5b16-4f4e-98fe-be9afaf8d0bf */
   private java.lang.String busConsultResults;
   /** 受理人
    *             
    * 
    * @pdOid 34af406e-f322-4d23-9aad-e93e0949c82f */
   private java.lang.String busAcceptor;
   /** 咨询时间
    *             
    * 
    * @pdOid 10488c0b-5bf5-4ee5-a8e4-2d1cc1071a70 */
   private java.util.Date busConsultTime;
   /** @pdOid 67370efb-226b-45ce-96ba-ca06bc99371f */
   private java.lang.String duo1;
   /** @pdOid 5e167459-b9ff-4858-9474-e1383998b25d */
   private java.lang.String duo2;
   /** @pdOid 9ca2c3b3-1353-448f-bf87-47c5759643b3 */
   private java.lang.String duo3;
   
   /** @pdOid 4916c6b3-6068-4a86-9758-875868a2f8b1 */
   public java.lang.String getBusMemoNo() {
      return busMemoNo;
   }
   
   /** @param newBusMemoNo
    * @pdOid dcca9d71-b4ca-4e96-af7a-c4946af3f56c */
   public void setBusMemoNo(java.lang.String newBusMemoNo) {
      busMemoNo = newBusMemoNo;
   }
   
   /** @pdOid bcd25436-c105-4fc2-aefd-183fe17e2696 */
   public java.lang.String getBusCustomerNo() {
      return busCustomerNo;
   }
   
   /** @param newBusCustomerNo
    * @pdOid c57c73f5-130e-4262-997a-e0bc6ccb076a */
   public void setBusCustomerNo(java.lang.String newBusCustomerNo) {
      busCustomerNo = newBusCustomerNo;
   }
   
   /** @pdOid 38b7c2eb-76b6-4fbb-aa96-b4a7fd1486a9 */
   public java.lang.String getBusCustomerOdd() {
      return busCustomerOdd;
   }
   
   /** @param newBusCustomerOdd
    * @pdOid f90d2640-0223-4e68-a340-7845fb9eb22f */
   public void setBusCustomerOdd(java.lang.String newBusCustomerOdd) {
      busCustomerOdd = newBusCustomerOdd;
   }
   
   /** @pdOid be85d7bc-3ce4-4e89-b03d-8f318c754340 */
   public java.lang.String getBusProduct() {
      return busProduct;
   }
   
   /** @param newBusProduct
    * @pdOid 49821413-24c3-47f0-a118-240cfdf1c711 */
   public void setBusProduct(java.lang.String newBusProduct) {
      busProduct = newBusProduct;
   }
   
   /** @pdOid cc967e5d-5e66-4d32-8a41-28abdff1a08d */
   public java.util.Date getBusResPickupTime() {
      return busResPickupTime;
   }
   
   /** @param newBusResPickupTime
    * @pdOid c6592cf0-b1ef-4a04-baad-112f1f1670f7 */
   public void setBusResPickupTime(java.util.Date newBusResPickupTime) {
      busResPickupTime = newBusResPickupTime;
   }
   
   /** @pdOid 13630510-890a-4b7f-aded-ac2a7a2c5189 */
   public java.util.Date getBusResReceiptTime() {
      return busResReceiptTime;
   }
   
   /** @param newBusResReceiptTime
    * @pdOid ceb847e2-f83b-4432-b564-5a9103329979 */
   public void setBusResReceiptTime(java.util.Date newBusResReceiptTime) {
      busResReceiptTime = newBusResReceiptTime;
   }
   
   /** @pdOid 06c28968-2a9e-4db3-885e-b383a8d7a80e */
   public java.lang.String getBusAssigner() {
      return busAssigner;
   }
   
   /** @param newBusAssigner
    * @pdOid 2d75bb4a-e827-484c-b1a8-c4a9a505b002 */
   public void setBusAssigner(java.lang.String newBusAssigner) {
      busAssigner = newBusAssigner;
   }
   
   /** @pdOid 7d247606-f1b0-455f-90f2-3b24026186a0 */
   public java.util.Date getBusAllocateTime() {
      return busAllocateTime;
   }
   
   /** @param newBusAllocateTime
    * @pdOid eb7d64e6-a13b-4189-884b-a22d9ed78bff */
   public void setBusAllocateTime(java.util.Date newBusAllocateTime) {
      busAllocateTime = newBusAllocateTime;
   }
   
   /** @pdOid 853ab63d-a8d3-4c69-b038-d8dbc4c66c76 */
   public double getBusWeight() {
      return busWeight;
   }
   
   /** @param newBusWeight
    * @pdOid 29c1a6b3-3c1b-417b-92af-16d13e1b727e */
   public void setBusWeight(double newBusWeight) {
      busWeight = newBusWeight;
   }
   
   /** @pdOid 0b393b5e-c4fb-449a-a784-ad1ee2e80f8e */
   public double getBusVolume() {
      return busVolume;
   }
   
   /** @param newBusVolume
    * @pdOid c8c228e4-4e51-48c3-b9d4-8f58712e0e97 */
   public void setBusVolume(double newBusVolume) {
      busVolume = newBusVolume;
   }
   
   /** @pdOid 99a24d26-79f8-4221-8521-a03beae5bfac */
   public java.lang.String getBusPickupPerson() {
      return busPickupPerson;
   }
   
   /** @param newBusPickupPerson
    * @pdOid 0f77e74a-9b19-4b0a-a119-abc1b7f8948a */
   public void setBusPickupPerson(java.lang.String newBusPickupPerson) {
      busPickupPerson = newBusPickupPerson;
   }
   
   /** @pdOid 99909366-b409-4c58-a7db-9b6e3ccd8a43 */
   public java.lang.String getBusPickupLogo() {
      return busPickupLogo;
   }
   
   /** @param newBusPickupLogo
    * @pdOid 03b1fe96-ac6d-4d23-a8f2-2b1a7a1f0b17 */
   public void setBusPickupLogo(java.lang.String newBusPickupLogo) {
      busPickupLogo = newBusPickupLogo;
   }
   
   /** @pdOid 98f75c11-5c3c-423f-9bfb-27e682ef6c60 */
   public java.lang.String getBusPickupUnit() {
      return busPickupUnit;
   }
   
   /** @param newBusPickupUnit
    * @pdOid fec37640-a918-430f-a17f-507162a3d918 */
   public void setBusPickupUnit(java.lang.String newBusPickupUnit) {
      busPickupUnit = newBusPickupUnit;
   }
   
   /** @pdOid 3a8ef20b-99e2-4b3d-b54d-17c515f76b7d */
   public java.util.Date getBusPickupTime() {
      return busPickupTime;
   }
   
   /** @param newBusPickupTime
    * @pdOid 5f5d801b-eb21-41d0-b9f3-39ab256d10c8 */
   public void setBusPickupTime(java.util.Date newBusPickupTime) {
      busPickupTime = newBusPickupTime;
   }
   
   /** @pdOid 194f9c77-15c1-4bc6-b1d6-a22d03f07e86 */
   public java.lang.String getBusDeliAddress() {
      return busDeliAddress;
   }
   
   /** @param newBusDeliAddress
    * @pdOid 9e12a917-8c5b-4b3c-8a0d-935d7c68d261 */
   public void setBusDeliAddress(java.lang.String newBusDeliAddress) {
      busDeliAddress = newBusDeliAddress;
   }
   
   /** @pdOid be604b3e-ff43-4a7d-83f8-0476405a38c5 */
   public java.lang.String getBusProcUnit() {
      return busProcUnit;
   }
   
   /** @param newBusProcUnit
    * @pdOid cce2c85b-0550-4b71-abcb-3cb0555ba40a */
   public void setBusProcUnit(java.lang.String newBusProcUnit) {
      busProcUnit = newBusProcUnit;
   }
   
   /** @pdOid cc9c08a4-5730-4a17-81f2-84fddb908490 */
   public java.lang.String getBusNotifiSource() {
      return busNotifiSource;
   }
   
   /** @param newBusNotifiSource
    * @pdOid b6cc400d-28e3-4624-af84-84e98cad93a7 */
   public void setBusNotifiSource(java.lang.String newBusNotifiSource) {
      busNotifiSource = newBusNotifiSource;
   }
   
   /** @pdOid 7eb9947c-c879-4925-b104-8cb6313e623f */
   public int getBusUpdateSign() {
      return busUpdateSign;
   }
   
   /** @param newBusUpdateSign
    * @pdOid fc482a4f-ff14-489c-911c-6b95eea7fad8 */
   public void setBusUpdateSign(int newBusUpdateSign) {
      busUpdateSign = newBusUpdateSign;
   }
   
   /** @pdOid b34f5fd9-301b-403c-9896-18ae59549330 */
   public java.lang.String getBusSingleType() {
      return busSingleType;
   }
   
   /** @param newBusSingleType
    * @pdOid 9eafe90e-1150-4d81-82f4-70500a79f44a */
   public void setBusSingleType(java.lang.String newBusSingleType) {
      busSingleType = newBusSingleType;
   }
   
   /** @pdOid cd426c93-eb50-40d7-bafe-1c16e3b8e5b4 */
   public java.lang.String getBusImportantNote() {
      return busImportantNote;
   }
   
   /** @param newBusImportantNote
    * @pdOid 21e768d2-2d7e-4542-a81e-d1fb3e8c7a75 */
   public void setBusImportantNote(java.lang.String newBusImportantNote) {
      busImportantNote = newBusImportantNote;
   }
   
   /** @pdOid c9c086fa-5402-4d15-ab18-67a7f8d4859a */
   public java.lang.String getBusRemark() {
      return busRemark;
   }
   
   /** @param newBusRemark
    * @pdOid b4bede44-99e3-4f4c-be3c-4ce85d77ace7 */
   public void setBusRemark(java.lang.String newBusRemark) {
      busRemark = newBusRemark;
   }
   
   /** @pdOid cdc10f44-0fc3-401f-b61c-be9de8b771cc */
   public java.lang.String getBusConsultContent() {
      return busConsultContent;
   }
   
   /** @param newBusConsultContent
    * @pdOid d195f219-8a25-4f6b-af82-219abb18d187 */
   public void setBusConsultContent(java.lang.String newBusConsultContent) {
      busConsultContent = newBusConsultContent;
   }
   
   /** @pdOid 7d430c48-01ff-46a7-bf03-d6087d7aec03 */
   public java.lang.String getBusConsultResults() {
      return busConsultResults;
   }
   
   /** @param newBusConsultResults
    * @pdOid ef2209d5-ac27-4ed5-8e89-669596346de2 */
   public void setBusConsultResults(java.lang.String newBusConsultResults) {
      busConsultResults = newBusConsultResults;
   }
   
   /** @pdOid 61854519-3d62-43f1-91c5-d5a6e314740b */
   public java.lang.String getBusAcceptor() {
      return busAcceptor;
   }
   
   /** @param newBusAcceptor
    * @pdOid 64da7980-e205-440b-8f9c-16f2c4c0148c */
   public void setBusAcceptor(java.lang.String newBusAcceptor) {
      busAcceptor = newBusAcceptor;
   }
   
   /** @pdOid 5b72f792-2676-4b73-9d84-2ab3af38e835 */
   public java.util.Date getBusConsultTime() {
      return busConsultTime;
   }
   
   /** @param newBusConsultTime
    * @pdOid 53ef1c7a-b978-4b51-8828-85092ffff8be */
   public void setBusConsultTime(java.util.Date newBusConsultTime) {
      busConsultTime = newBusConsultTime;
   }
   
   /** @pdOid 93fc8d4d-63bc-451d-bd00-c44e1a96b9a3 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid a3e3d1ac-839e-4925-8006-0ac9960f2253 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 1c0511d9-7d88-4d70-b370-bbca4c0fa695 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid add30b2c-0cea-497d-8481-a5c5172d1731 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid f13e10a8-9885-4499-9345-47db83bbeb54 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 8ea4c2a8-41db-4c55-b5c6-75e20bc4fe03 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}