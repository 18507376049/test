/***********************************************************************
 * Module:  OutboundListDetail.java
 * Author:  Administrator
 * Purpose: Defines the Class OutboundListDetail
 ***********************************************************************/

import java.util.*;

/** @pdOid 0987b983-6b26-4382-89f6-218103ddfdc3 */
public class OutboundListDetail {
   /** 出库明细单号
    *             
    * 
    * @pdOid 61bbc480-2ae5-4ce3-b12d-274ceb75a5aa */
   private java.lang.String oldOIwnEntry;
   /** 货物编码
    *             
    * 
    * @pdOid 84301556-b1ee-4031-a5b7-b88433d13c75 */
   private java.lang.String oldNumber;
   /** 货物名称
    *             
    * 
    * @pdOid 1eff2ccc-d4cc-4b10-b750-7ba293c7a304 */
   private java.lang.String oldName;
   /** 起始号段
    *             
    * 
    * @pdOid 7f8d1120-1245-4bc1-8751-b70f52b7d2c4 */
   private java.lang.String oldOrigin;
   /** 截止号段
    *             
    * 
    * @pdOid bfa0519f-9e26-48bc-86ad-afd72e2cd08b */
   private java.lang.String oldEnd;
   /** 出库数量
    *             
    * 
    * @pdOid 1fa5eab4-6a7e-46f7-aae6-c6951ef2d2fd */
   private int oldQuantity;
   /** 实际数量
    *             
    * 
    * @pdOid 3fec3694-e432-49e4-bdfc-64addac8b59a */
   private int oldRealityQuantity;
   /** 价格
    *             
    * 
    * @pdOid f03577e7-5738-4932-8b8a-3f6488333a27 */
   private double oldPrice;
   /** 规格
    *             
    * 
    * @pdOid 0ef69fb4-fea9-47b2-ba46-79bfb57a7b33 */
   private java.lang.String oldStandard;
   /** 类型
    *             
    * 
    * @pdOid 30b6dbf1-f04d-4f2f-895f-65f6cb74825f */
   private java.lang.String oldType;
   /** 计量单位
    *             
    * 
    * @pdOid 5a75b8f3-287e-40cc-9dcc-865889f7c814 */
   private java.lang.String oldUnit;
   /** 状态
    *             
    * 
    * @pdOid d1b4bb1b-3427-4390-a653-f02fe15ebc91 */
   private int oldStatus;
   /** 出库单号
    *             
    * 
    * @pdOid 28677128-6df5-496c-a3b1-c4f988290d3e */
   private java.lang.String oldOlmownEntry;
   /** @pdOid 74177d88-4c51-455d-b9dd-e932376b8f8d */
   private java.lang.String duo1;
   /** @pdOid 22a902e3-c19d-43a4-a030-21e37e4f7973 */
   private java.lang.String duo2;
   
   /** @pdOid d0ea2a2f-3d81-42bc-bfc2-9f4a67eecd93 */
   public java.lang.String getOldOIwnEntry() {
      return oldOIwnEntry;
   }
   
   /** @param newOldOIwnEntry
    * @pdOid 20f9310d-1bb5-476f-aee0-40cfd3781f05 */
   public void setOldOIwnEntry(java.lang.String newOldOIwnEntry) {
      oldOIwnEntry = newOldOIwnEntry;
   }
   
   /** @pdOid 3b62a13e-0caf-47bd-8ba4-e6934632e08b */
   public java.lang.String getOldNumber() {
      return oldNumber;
   }
   
   /** @param newOldNumber
    * @pdOid 0e768b18-85e1-48e8-9721-b0c37b1b7e64 */
   public void setOldNumber(java.lang.String newOldNumber) {
      oldNumber = newOldNumber;
   }
   
   /** @pdOid c6d2c589-c970-43a4-b131-946c6b699782 */
   public java.lang.String getOldName() {
      return oldName;
   }
   
   /** @param newOldName
    * @pdOid 00faa407-7b4f-4b91-aaf1-467f6f594434 */
   public void setOldName(java.lang.String newOldName) {
      oldName = newOldName;
   }
   
   /** @pdOid 8637c7de-ec34-4fd2-8436-057ab79b811c */
   public java.lang.String getOldOrigin() {
      return oldOrigin;
   }
   
   /** @param newOldOrigin
    * @pdOid e1bf8e5d-e86d-4ea2-8f99-b6cd720be622 */
   public void setOldOrigin(java.lang.String newOldOrigin) {
      oldOrigin = newOldOrigin;
   }
   
   /** @pdOid 5e801e01-5a63-4890-b1a7-3da032e43cca */
   public java.lang.String getOldEnd() {
      return oldEnd;
   }
   
   /** @param newOldEnd
    * @pdOid 83a19006-571e-47da-a201-38ec5dea187a */
   public void setOldEnd(java.lang.String newOldEnd) {
      oldEnd = newOldEnd;
   }
   
   /** @pdOid 1d433063-90c7-4ffb-a021-f67d65728211 */
   public int getOldQuantity() {
      return oldQuantity;
   }
   
   /** @param newOldQuantity
    * @pdOid ff08b520-cdbe-44a2-aa5b-8dab7137a3ef */
   public void setOldQuantity(int newOldQuantity) {
      oldQuantity = newOldQuantity;
   }
   
   /** @pdOid 77bacfdc-99ad-4638-a115-0bb3e6bd8996 */
   public int getOldRealityQuantity() {
      return oldRealityQuantity;
   }
   
   /** @param newOldRealityQuantity
    * @pdOid e8fe1c35-5ad4-4085-b556-43b62f64d42b */
   public void setOldRealityQuantity(int newOldRealityQuantity) {
      oldRealityQuantity = newOldRealityQuantity;
   }
   
   /** @pdOid e6812fe6-170f-4474-aee9-c1be24d8a369 */
   public double getOldPrice() {
      return oldPrice;
   }
   
   /** @param newOldPrice
    * @pdOid e1bd2a18-1863-4d9c-b2d3-27ba67dab94c */
   public void setOldPrice(double newOldPrice) {
      oldPrice = newOldPrice;
   }
   
   /** @pdOid 50bdc5dc-12e4-409e-af35-3469e25dbac2 */
   public java.lang.String getOldStandard() {
      return oldStandard;
   }
   
   /** @param newOldStandard
    * @pdOid 99ca1c77-b778-4440-98ee-4ce5d9a572ab */
   public void setOldStandard(java.lang.String newOldStandard) {
      oldStandard = newOldStandard;
   }
   
   /** @pdOid 200bbd17-6346-417b-acff-8a87a9bf6c8c */
   public java.lang.String getOldType() {
      return oldType;
   }
   
   /** @param newOldType
    * @pdOid bfe0830b-e5f9-4466-a004-9b8f2a292cc8 */
   public void setOldType(java.lang.String newOldType) {
      oldType = newOldType;
   }
   
   /** @pdOid b12644d8-519d-493e-99fb-c7e10a33405e */
   public java.lang.String getOldUnit() {
      return oldUnit;
   }
   
   /** @param newOldUnit
    * @pdOid 46c1cc99-aa3f-4149-8b4e-1bfe30963d8e */
   public void setOldUnit(java.lang.String newOldUnit) {
      oldUnit = newOldUnit;
   }
   
   /** @pdOid 4988a9ca-01b3-4ee0-bfe4-51e9f236be94 */
   public int getOldStatus() {
      return oldStatus;
   }
   
   /** @param newOldStatus
    * @pdOid 12088a2b-862f-4717-ba6c-78e3f502912c */
   public void setOldStatus(int newOldStatus) {
      oldStatus = newOldStatus;
   }
   
   /** @pdOid 060b6c03-8c66-4048-8841-7312b1c2f990 */
   public java.lang.String getOldOlmownEntry() {
      return oldOlmownEntry;
   }
   
   /** @param newOldOlmownEntry
    * @pdOid 53f8f89d-9c30-4a64-8e71-3ed3a0bbb5f9 */
   public void setOldOlmownEntry(java.lang.String newOldOlmownEntry) {
      oldOlmownEntry = newOldOlmownEntry;
   }
   
   /** @pdOid 4785ef7e-eacc-46d9-8c48-8fc0e91e21f1 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 39aa7126-46c6-4517-9009-68308d013a76 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 0ded6c87-7bc2-444c-972f-04ac9a6b2909 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 05415769-ade7-4941-835b-9765763c39f9 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}