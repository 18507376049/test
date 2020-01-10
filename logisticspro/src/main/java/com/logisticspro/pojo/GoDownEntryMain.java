/***********************************************************************
 * Module:  GoDownEntryMain.java
 * Author:  Administrator
 * Purpose: Defines the Class GoDownEntryMain
 ***********************************************************************/

import java.util.*;

/** @pdOid 5069cd35-20f4-4f27-bca6-506f8f06a1c9 */
public class GoDownEntryMain {
   /** 入库单号
    *             
    * 
    * @pdOid e781228e-f706-4330-a223-00446ab41a80 */
   private java.lang.String godownNo;
   /** 入库类型
    *             
    * 
    * @pdOid fbe6e2a6-c153-450a-9354-4bc7500b5ba5 */
   private java.lang.String godType;
   /** 运输单号
    *             
    * 
    * @pdOid 3e946eb9-7193-4de0-aee2-dfdac9f57302 */
   private java.lang.String godTransport;
   /** 采购订单号
    *             
    * 
    * @pdOid abfb96c8-a0d5-459a-a373-7870af8d3e0b */
   private java.lang.String godPurchase;
   /** 所属单位
    *             
    * 
    * @pdOid 2bda9810-7525-49b9-9ac1-e23290e7f20f */
   private java.lang.String godUnit;
   /** 状态
    *             
    * 
    * @pdOid 4c7bbe1f-372d-4b02-a84f-8be043238157 */
   private int godStatus;
   /** 开单人工号
    *             
    * 
    * @pdOid 206e4603-ec1d-41aa-835a-657719d2fa8b */
   private java.lang.String godOperationStaffNo;
   /** 开单人姓名
    *             
    * 
    * @pdOid 04451eb8-b068-492b-ba87-23f1f5ce23f5 */
   private java.lang.String godOperationStaffName;
   /** 开单时间
    *             
    * 
    * @pdOid a6fa209b-ced8-48d7-b252-f33bed6de91f */
   private java.util.Date godTime;
   /** 备注
    *             
    * 
    * @pdOid ceef1400-a5cd-4eab-9df1-97d9c98256a9 */
   private java.lang.String godRemarks;
   /** @pdOid d4518370-5d8c-4f28-9109-080cf07b856d */
   private java.lang.String duo1;
   /** @pdOid c6f8aebb-7f43-46be-b3a9-69c8061f102d */
   private java.lang.String duo2;
   
   /** @pdOid fb69b2a3-49ef-45fb-a66b-de11a048f9e5 */
   public java.lang.String getGodownNo() {
      return godownNo;
   }
   
   /** @param newGodownNo
    * @pdOid 3760bdab-c8d0-441d-afae-3d74281d3925 */
   public void setGodownNo(java.lang.String newGodownNo) {
      godownNo = newGodownNo;
   }
   
   /** @pdOid 38540b34-a929-4fd8-a621-96afc853f58a */
   public java.lang.String getGodType() {
      return godType;
   }
   
   /** @param newGodType
    * @pdOid 7a867e97-039a-416b-ab13-3f65ee5c45d8 */
   public void setGodType(java.lang.String newGodType) {
      godType = newGodType;
   }
   
   /** @pdOid c194596c-e6cf-4742-9759-1b20dbf431f8 */
   public java.lang.String getGodTransport() {
      return godTransport;
   }
   
   /** @param newGodTransport
    * @pdOid 4efc52c2-fb04-4084-947e-bbd9333b38af */
   public void setGodTransport(java.lang.String newGodTransport) {
      godTransport = newGodTransport;
   }
   
   /** @pdOid 3c0ec217-850a-40be-96ce-e3b90681b0d4 */
   public java.lang.String getGodPurchase() {
      return godPurchase;
   }
   
   /** @param newGodPurchase
    * @pdOid e70fa7d8-889f-4742-8fe1-d6afcfa37e54 */
   public void setGodPurchase(java.lang.String newGodPurchase) {
      godPurchase = newGodPurchase;
   }
   
   /** @pdOid 59902cb2-8a67-4a4d-a07d-e4b878b499a9 */
   public java.lang.String getGodUnit() {
      return godUnit;
   }
   
   /** @param newGodUnit
    * @pdOid b2bc1f84-030f-4748-a98a-6adddf20124f */
   public void setGodUnit(java.lang.String newGodUnit) {
      godUnit = newGodUnit;
   }
   
   /** @pdOid 407a47d1-5909-4a9c-ba91-8e2284e24035 */
   public int getGodStatus() {
      return godStatus;
   }
   
   /** @param newGodStatus
    * @pdOid 4f466dbf-6d49-4c37-9daa-d5b6addf6140 */
   public void setGodStatus(int newGodStatus) {
      godStatus = newGodStatus;
   }
   
   /** @pdOid 0cdf25a2-1e91-4eaf-8c7b-92118d039897 */
   public java.lang.String getGodOperationStaffNo() {
      return godOperationStaffNo;
   }
   
   /** @param newGodOperationStaffNo
    * @pdOid 7ba91240-59e3-4817-adda-da5f68226eee */
   public void setGodOperationStaffNo(java.lang.String newGodOperationStaffNo) {
      godOperationStaffNo = newGodOperationStaffNo;
   }
   
   /** @pdOid c08cebfc-1773-4bb3-aadf-02090069268b */
   public java.lang.String getGodOperationStaffName() {
      return godOperationStaffName;
   }
   
   /** @param newGodOperationStaffName
    * @pdOid 489b8414-11ee-42d3-b507-aa23415dd71e */
   public void setGodOperationStaffName(java.lang.String newGodOperationStaffName) {
      godOperationStaffName = newGodOperationStaffName;
   }
   
   /** @pdOid c20040ff-aa46-42a6-8faf-b7e2b5d63917 */
   public java.util.Date getGodTime() {
      return godTime;
   }
   
   /** @param newGodTime
    * @pdOid 10071513-649f-468b-ac34-0ec12821d0d5 */
   public void setGodTime(java.util.Date newGodTime) {
      godTime = newGodTime;
   }
   
   /** @pdOid 5950e52e-20e5-4e5c-8a76-f8f9b724c4e2 */
   public java.lang.String getGodRemarks() {
      return godRemarks;
   }
   
   /** @param newGodRemarks
    * @pdOid 38532eb5-5db8-41be-8af8-519438fd0fba */
   public void setGodRemarks(java.lang.String newGodRemarks) {
      godRemarks = newGodRemarks;
   }
   
   /** @pdOid 8df6843c-35ad-48e8-9f61-ba4b22af6aaa */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 617f5822-7a4e-4687-a650-1698ff01c3d6 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid c91b60ad-9720-4f2b-975a-8419cb12344f */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid e719d913-c001-4604-a32d-c1713e48adcb */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}