/***********************************************************************
 * Module:  Packinfo.java
 * Author:  Administrator
 * Purpose: Defines the Class Packinfo
 ***********************************************************************/

import java.util.*;

/** @pdOid b725c546-5125-4e42-9b9f-fa6385f0ba92 */
public class Packinfo {
   /** 包装信息编号
    *             
    * 
    * @pdOid fbf00b55-1dff-42da-a867-6e40edd8bd36 */
   private java.lang.String pacNo;
   /** 工作单号
    *             
    * 
    * @pdOid c628c9da-a210-4f0d-849e-939848070e30 */
   private java.lang.String pacWosNo;
   /** 实际件数
    *             
    * 
    * @pdOid a8b3119c-c484-4a66-9b31-d7dd23dfd03e */
   private int pacQuantity;
   /** 实际重量
    *             
    * 
    * @pdOid 9752d081-cf74-469f-84e8-a74cd875f498 */
   private double pacWeight;
   /** 体积
    *             
    * 
    * @pdOid 36f83ce9-2108-4515-a273-1e87202f10d9 */
   private double pacFactVolume;
   /** 操作员
    *             
    * 
    * @pdOid 825be237-b391-48a6-89e6-802dc6194d44 */
   private java.lang.String pacOperator;
   /** 计费重量
    *             
    * 
    * @pdOid 92d80442-726a-404c-9d30-46b3d3e2dcbc */
   private double pacOverstepWeight;
   /** 实际体积
    *             
    * 
    * @pdOid 38f451e6-1317-422b-9995-e81b0a9fd341 */
   private int pacVolume;
   /** 包装费
    *             
    * 
    * @pdOid f3697b9f-88b5-4b83-8903-bbd9e390b156 */
   private int pacCost;
   /** 入库人
    *             
    * 
    * @pdOid 407cb616-459c-4c62-b1bf-9c2fc5d5c036 */
   private java.lang.String pacEnter;
   /** 入库时间
    *             
    * 
    * @pdOid 0df65c14-7916-4f5e-acb1-0fd80c7e83ed */
   private java.util.Date pacEnterDate;
   /** 出库人
    *             
    * 
    * @pdOid 3bfc9228-bd24-4b00-8e92-bee17ad8a971 */
   private java.lang.String pacLeave;
   /** 出库时间
    *             
    * 
    * @pdOid 3e47b92f-1343-4537-b2c2-c78f62f9be5b */
   private java.util.Date pacLeaveDate;
   /** 包装材料编号
    *             
    * 
    * @pdOid 9a174cb0-3349-4a1a-a753-c445753e7e63 */
   private java.lang.String pacArtNo;
   /** 包装价格
    *             
    * 
    * @pdOid a40d26a6-1912-4096-a163-dbea1bb4ad7b */
   private double pacArtPrice;
   /** 包装材料数量
    *             
    * 
    * @pdOid 10216ccd-90dc-4ba6-8d7f-63233324720f */
   private int pacArtNumber;
   /** 运费
    *             
    * 
    * @pdOid 93ed3db5-a568-4e68-89e7-ff3eeaa1c5c4 */
   private double pacYouPrice;
   /** 备注
    *             
    * 
    * @pdOid f4b7a07b-becb-45d8-b319-2cf8bdec8b1a */
   private java.lang.String pacDesc;
   /** @pdOid e3acb0d0-de85-4efa-8012-2bf0c0ef8d3c */
   private java.lang.String duo1;
   /** @pdOid 968acd14-ac04-4a2d-96c1-01eb99668dfb */
   private java.lang.String duo2;
   
   /** @pdOid c22d47e7-2511-4885-b46c-58cfac044551 */
   public java.lang.String getPacNo() {
      return pacNo;
   }
   
   /** @param newPacNo
    * @pdOid dddc416d-b649-4575-87c7-d522ed81df99 */
   public void setPacNo(java.lang.String newPacNo) {
      pacNo = newPacNo;
   }
   
   /** @pdOid 5ec0b095-8cc7-4d11-878c-6ce6ffd4ca5d */
   public java.lang.String getPacWosNo() {
      return pacWosNo;
   }
   
   /** @param newPacWosNo
    * @pdOid 3dccb673-2cf5-41cc-a839-55a775d33968 */
   public void setPacWosNo(java.lang.String newPacWosNo) {
      pacWosNo = newPacWosNo;
   }
   
   /** @pdOid ab8ae787-4919-407f-bbbe-e990b1292d6f */
   public int getPacQuantity() {
      return pacQuantity;
   }
   
   /** @param newPacQuantity
    * @pdOid 1db27edb-5c5e-4fab-93f0-f303578236b9 */
   public void setPacQuantity(int newPacQuantity) {
      pacQuantity = newPacQuantity;
   }
   
   /** @pdOid df1ac6ac-db1c-478b-bac3-19550aa711ab */
   public double getPacWeight() {
      return pacWeight;
   }
   
   /** @param newPacWeight
    * @pdOid e6d9bf3f-0d3c-40ad-96cb-f8274a663161 */
   public void setPacWeight(double newPacWeight) {
      pacWeight = newPacWeight;
   }
   
   /** @pdOid e57864b7-e903-4c75-85e1-1eccbc4e8365 */
   public double getPacFactVolume() {
      return pacFactVolume;
   }
   
   /** @param newPacFactVolume
    * @pdOid 9636b275-a312-4c3e-8834-29689248d97a */
   public void setPacFactVolume(double newPacFactVolume) {
      pacFactVolume = newPacFactVolume;
   }
   
   /** @pdOid 83d27a71-1740-47ad-ab25-bbd337e51d4a */
   public java.lang.String getPacOperator() {
      return pacOperator;
   }
   
   /** @param newPacOperator
    * @pdOid f1233293-0db7-4d71-a8ef-fc7c8636ea0c */
   public void setPacOperator(java.lang.String newPacOperator) {
      pacOperator = newPacOperator;
   }
   
   /** @pdOid afaf15a6-fb6c-4db9-bcce-e1c86ce8764b */
   public double getPacOverstepWeight() {
      return pacOverstepWeight;
   }
   
   /** @param newPacOverstepWeight
    * @pdOid 6f908581-e6bb-4205-aae4-dda7b75c2f28 */
   public void setPacOverstepWeight(double newPacOverstepWeight) {
      pacOverstepWeight = newPacOverstepWeight;
   }
   
   /** @pdOid 938c17c5-46d6-4653-8b57-96d9007f66f3 */
   public int getPacVolume() {
      return pacVolume;
   }
   
   /** @param newPacVolume
    * @pdOid 54b833c3-e605-4303-800f-93de4fdafcb0 */
   public void setPacVolume(int newPacVolume) {
      pacVolume = newPacVolume;
   }
   
   /** @pdOid a94c61e0-1ec7-4959-a975-483f24ff4bfe */
   public int getPacCost() {
      return pacCost;
   }
   
   /** @param newPacCost
    * @pdOid 9d0a57e9-1d5e-48d0-a361-e5cb77148998 */
   public void setPacCost(int newPacCost) {
      pacCost = newPacCost;
   }
   
   /** @pdOid 730b81d6-bf17-40b0-8b62-550d74262b49 */
   public java.lang.String getPacEnter() {
      return pacEnter;
   }
   
   /** @param newPacEnter
    * @pdOid d771629c-b343-4bd3-bb35-5b531b2fba1f */
   public void setPacEnter(java.lang.String newPacEnter) {
      pacEnter = newPacEnter;
   }
   
   /** @pdOid 608904e7-2135-4a41-807a-30fc8bd37de5 */
   public java.util.Date getPacEnterDate() {
      return pacEnterDate;
   }
   
   /** @param newPacEnterDate
    * @pdOid ef5fbfd3-82a4-4395-a6cb-90319381d249 */
   public void setPacEnterDate(java.util.Date newPacEnterDate) {
      pacEnterDate = newPacEnterDate;
   }
   
   /** @pdOid 05fe610c-8824-4127-93ef-cf2d01d56bab */
   public java.lang.String getPacLeave() {
      return pacLeave;
   }
   
   /** @param newPacLeave
    * @pdOid 4577f468-53dd-418a-924d-445d02abeab2 */
   public void setPacLeave(java.lang.String newPacLeave) {
      pacLeave = newPacLeave;
   }
   
   /** @pdOid 8bbb2103-8853-4195-9dee-097ca8bb86f2 */
   public java.util.Date getPacLeaveDate() {
      return pacLeaveDate;
   }
   
   /** @param newPacLeaveDate
    * @pdOid eef6e824-c9a8-474b-9c4d-5e558351d25e */
   public void setPacLeaveDate(java.util.Date newPacLeaveDate) {
      pacLeaveDate = newPacLeaveDate;
   }
   
   /** @pdOid 5cf83f21-19e7-45e9-9fba-9c56776d55bb */
   public java.lang.String getPacArtNo() {
      return pacArtNo;
   }
   
   /** @param newPacArtNo
    * @pdOid 187ac352-c87f-406c-bdba-d455f01c5f44 */
   public void setPacArtNo(java.lang.String newPacArtNo) {
      pacArtNo = newPacArtNo;
   }
   
   /** @pdOid 85455583-0194-402f-a1a8-5dd24cf33d81 */
   public double getPacArtPrice() {
      return pacArtPrice;
   }
   
   /** @param newPacArtPrice
    * @pdOid a750fa7f-9597-46f7-b499-6f8d062de9e0 */
   public void setPacArtPrice(double newPacArtPrice) {
      pacArtPrice = newPacArtPrice;
   }
   
   /** @pdOid cba5d339-53ad-4687-a1c9-c5aa4894d5a2 */
   public int getPacArtNumber() {
      return pacArtNumber;
   }
   
   /** @param newPacArtNumber
    * @pdOid 6437f692-21df-4fcb-bab9-b57434eb98e0 */
   public void setPacArtNumber(int newPacArtNumber) {
      pacArtNumber = newPacArtNumber;
   }
   
   /** @pdOid 4d65b5c9-f8c9-4155-a68b-c343337c8016 */
   public double getPacYouPrice() {
      return pacYouPrice;
   }
   
   /** @param newPacYouPrice
    * @pdOid 935bf9af-f15b-439a-9cd9-432c63d00ef7 */
   public void setPacYouPrice(double newPacYouPrice) {
      pacYouPrice = newPacYouPrice;
   }
   
   /** @pdOid b0d2965a-f4a8-4aec-ad48-61667f657ba4 */
   public java.lang.String getPacDesc() {
      return pacDesc;
   }
   
   /** @param newPacDesc
    * @pdOid 95c090a6-961d-4692-bc89-c466506fb9eb */
   public void setPacDesc(java.lang.String newPacDesc) {
      pacDesc = newPacDesc;
   }
   
   /** @pdOid 84a1d84e-984b-49c9-a5c5-77db707c8901 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 596d6c23-0852-43d3-9bff-ba5002d2a60d */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 38124a65-5f9d-41bc-8da6-d8d9bc2b545d */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 443475db-872e-4be2-8ce9-6a6d6f544d6f */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}