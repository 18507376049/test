/***********************************************************************
 * Module:  DetailStock.java
 * Author:  Administrator
 * Purpose: Defines the Class DetailStock
 ***********************************************************************/

import java.util.*;

/** @pdOid 42baf3a8-cedb-4500-a28e-46e1566af70d */
public class DetailStock {
   /** 库存明细编号
    *             
    * 
    * @pdOid 241685c2-d6c5-468b-87f5-71c9becc8906 */
   private java.lang.String detAilstockId;
   /** 物品编号
    *             
    * 
    * @pdOid abcb3a9b-3f95-4d07-8e59-abccb2791f50 */
   private java.lang.String detArticlesCoded;
   /** 物品名称
    *             
    * 
    * @pdOid f55f6c90-1e58-4fb2-9513-aa43d250f46d */
   private java.lang.String stoName;
   /** 计划价格
    *             
    * 
    * @pdOid 3cd35a4b-9f4d-479d-84d0-7af28f6e975d */
   private double stoPrice;
   /** 规格
    *             
    * 
    * @pdOid 1905dbec-e0db-48c9-b83a-95ad19966514 */
   private java.lang.String stoStandard;
   /** 计量单位
    *             
    * 
    * @pdOid 994a531e-0a37-4e16-af25-c5ea7ff11167 */
   private java.lang.String stoMeasurementUnit;
   /** 状态
    *             
    * 
    * @pdOid 41ae60b7-172f-430b-a232-e7e9b950562d */
   private int stoStatus;
   /** 类型
    *             
    * 
    * @pdOid 05887ff6-292e-4b43-9c4f-038d187666ae */
   private java.lang.String stoType;
   /** 起始号段
    *             
    * 
    * @pdOid 768ab9e5-4793-46d2-bcc0-3e1269b43f8e */
   private java.lang.String stoOrigin;
   /** 截止号段
    *             
    * 
    * @pdOid 34b324e5-3b08-4505-a439-e1346a268350 */
   private java.lang.String stoEnd;
   /** 金额
    *             
    * 
    * @pdOid 5f719351-15fc-4557-b4ce-f422851d99ce */
   private double stoMoney;
   /** 库存数量
    *             
    * 
    * @pdOid a5c4a71a-ac2c-4cea-81f3-f90335d098cf */
   private int detStockNumber;
   /** 销售数量
    *             
    * 
    * @pdOid b655602a-8a9d-48f9-978e-f31ecbb7466d */
   private int detSalesNumber;
   /** 入库数量
    *             
    * 
    * @pdOid 1b299bda-0dd4-41c7-9a3a-851f57662cae */
   private int detBelaiDup;
   /** 仓库编号
    *             
    * 
    * @pdOid 623a86d3-a70d-47b7-8e9f-f8019b0bc122 */
   private java.lang.String detWarID;
   /** @pdOid 5183aded-7b53-48b2-8734-00295f7b143c */
   private java.lang.String duo1;
   /** @pdOid d62ba189-d77f-4b27-b270-33677ec8090e */
   private java.lang.String duo2;
   /** @pdOid b25957b2-ceea-45b2-8a5b-805d3854e54c */
   private java.lang.String duo3;
   
   /** @pdOid 2d71d6b2-d9e5-4e6c-9f5d-b403521b10d3 */
   public java.lang.String getDetAilstockId() {
      return detAilstockId;
   }
   
   /** @param newDetAilstockId
    * @pdOid 8fc1d92b-cde0-448b-a770-679d8765df92 */
   public void setDetAilstockId(java.lang.String newDetAilstockId) {
      detAilstockId = newDetAilstockId;
   }
   
   /** @pdOid f814ed80-92d8-4fa5-8f51-57d6be51f4ae */
   public java.lang.String getDetArticlesCoded() {
      return detArticlesCoded;
   }
   
   /** @param newDetArticlesCoded
    * @pdOid f96850da-1341-4eb6-a8b4-520bbd29ec6b */
   public void setDetArticlesCoded(java.lang.String newDetArticlesCoded) {
      detArticlesCoded = newDetArticlesCoded;
   }
   
   /** @pdOid 4aa8fa68-894d-4b8e-8a46-6a6d8820006f */
   public java.lang.String getStoName() {
      return stoName;
   }
   
   /** @param newStoName
    * @pdOid 5b5cf104-4b31-4894-b1d8-412002ee9378 */
   public void setStoName(java.lang.String newStoName) {
      stoName = newStoName;
   }
   
   /** @pdOid a3173385-b05f-4dbd-8f4d-648c0a2d1f72 */
   public double getStoPrice() {
      return stoPrice;
   }
   
   /** @param newStoPrice
    * @pdOid 7e007fa2-da73-471d-a8a6-391687cd70d1 */
   public void setStoPrice(double newStoPrice) {
      stoPrice = newStoPrice;
   }
   
   /** @pdOid 7653389e-5274-4c8c-8751-4597d03d1b80 */
   public java.lang.String getStoStandard() {
      return stoStandard;
   }
   
   /** @param newStoStandard
    * @pdOid 1d6d7af4-09a6-4212-9095-1a46e5184ef9 */
   public void setStoStandard(java.lang.String newStoStandard) {
      stoStandard = newStoStandard;
   }
   
   /** @pdOid 087dd9ee-62dc-4d3e-843b-e172e2dc9cf1 */
   public java.lang.String getStoMeasurementUnit() {
      return stoMeasurementUnit;
   }
   
   /** @param newStoMeasurementUnit
    * @pdOid b4f44490-bb3b-427f-b5c4-e0d816026926 */
   public void setStoMeasurementUnit(java.lang.String newStoMeasurementUnit) {
      stoMeasurementUnit = newStoMeasurementUnit;
   }
   
   /** @pdOid c9a7c65e-1230-4a4b-bc7f-c970e5cd900e */
   public int getStoStatus() {
      return stoStatus;
   }
   
   /** @param newStoStatus
    * @pdOid f2920786-9972-49f6-bcce-9de9a38f7e54 */
   public void setStoStatus(int newStoStatus) {
      stoStatus = newStoStatus;
   }
   
   /** @pdOid 31153942-d7fa-4f69-8cbc-28689544b63f */
   public java.lang.String getStoType() {
      return stoType;
   }
   
   /** @param newStoType
    * @pdOid bf5ec7eb-0f3d-4bd0-a911-4efefcc1c2cc */
   public void setStoType(java.lang.String newStoType) {
      stoType = newStoType;
   }
   
   /** @pdOid b1880ea5-aeda-4f6a-9eb1-1b3b4a3a1209 */
   public java.lang.String getStoOrigin() {
      return stoOrigin;
   }
   
   /** @param newStoOrigin
    * @pdOid 4633ec87-d7a0-44ce-b48c-3977194fd6e3 */
   public void setStoOrigin(java.lang.String newStoOrigin) {
      stoOrigin = newStoOrigin;
   }
   
   /** @pdOid 22029557-89b4-40b8-9477-7ee669933bf5 */
   public java.lang.String getStoEnd() {
      return stoEnd;
   }
   
   /** @param newStoEnd
    * @pdOid f2d85bae-cdf5-402c-a05d-d9425d86e2b9 */
   public void setStoEnd(java.lang.String newStoEnd) {
      stoEnd = newStoEnd;
   }
   
   /** @pdOid bdf8caf6-92cd-4e2e-84d3-5bf4cea8ba97 */
   public double getStoMoney() {
      return stoMoney;
   }
   
   /** @param newStoMoney
    * @pdOid e9be74f2-f6da-48a7-97a7-8e5d0f43979f */
   public void setStoMoney(double newStoMoney) {
      stoMoney = newStoMoney;
   }
   
   /** @pdOid 79426676-7029-4dd8-8746-2afac894aef1 */
   public int getDetStockNumber() {
      return detStockNumber;
   }
   
   /** @param newDetStockNumber
    * @pdOid 5a9d55e2-c6c2-4daf-8baf-70da9cea5b50 */
   public void setDetStockNumber(int newDetStockNumber) {
      detStockNumber = newDetStockNumber;
   }
   
   /** @pdOid 92079651-448a-495c-b56a-b6d7755b2ad2 */
   public int getDetSalesNumber() {
      return detSalesNumber;
   }
   
   /** @param newDetSalesNumber
    * @pdOid f0cc10bd-70ef-4c82-8108-5e6cec21441f */
   public void setDetSalesNumber(int newDetSalesNumber) {
      detSalesNumber = newDetSalesNumber;
   }
   
   /** @pdOid ff6a3f99-0fa6-40c1-972d-279bfbb55396 */
   public int getDetBelaiDup() {
      return detBelaiDup;
   }
   
   /** @param newDetBelaiDup
    * @pdOid cf4ed1e0-c09b-48b6-99a2-1d5a5fb0a339 */
   public void setDetBelaiDup(int newDetBelaiDup) {
      detBelaiDup = newDetBelaiDup;
   }
   
   /** @pdOid 9b833559-c04c-4a72-b861-7081a57791cd */
   public java.lang.String getDetWarID() {
      return detWarID;
   }
   
   /** @param newDetWarID
    * @pdOid a124f7a9-1dbb-4735-b0f9-3deca70c0aac */
   public void setDetWarID(java.lang.String newDetWarID) {
      detWarID = newDetWarID;
   }
   
   /** @pdOid 8d94170d-afe2-4617-839e-d3bc1d65ca95 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 5c79fd2e-f97e-449e-9981-a03dc5ece87d */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 5fe953ef-88e9-448e-861d-13073162ab30 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid e4bddfb1-316a-4350-ae0d-a463b3ef9bb1 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 030c2136-2910-4430-911f-e34cf758555f */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 7293810c-f8db-4a8f-8567-606e1c56ecf8 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}