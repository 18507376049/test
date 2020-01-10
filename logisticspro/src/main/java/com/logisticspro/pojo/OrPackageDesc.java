/***********************************************************************
 * Module:  OrPackageDesc.java
 * Author:  Administrator
 * Purpose: Defines the Class OrPackageDesc
 ***********************************************************************/

import java.util.*;

/** @pdOid 680a3305-f42b-4004-9c96-7e1dfc60f52f */
public class OrPackageDesc {
   /** 合包明细号
    *             
    * 
    * @pdOid 403fed7b-856a-4c36-ad1f-b8906807cc08 */
   private java.lang.String ordPackageNo;
   /** 工作单单号
    *             
    * 
    * @pdOid fa9e1d52-9f52-4d51-a500-9084e982eadc */
   private java.lang.String ordOdd;
   /** 重量
    *             
    * 
    * @pdOid 789c0a88-18d1-40d9-b3dd-d9ad8c93053e */
   private double ordWeight;
   /** 体积
    *             
    * 
    * @pdOid 005e7ea6-824b-4403-9bed-a536fb7b0641 */
   private double ordV;
   /** 件数
    *             
    * 
    * @pdOid 4ddd0dfb-ec98-4a7a-9d45-8b29a0b80a88 */
   private int ordNumber;
   /** 品名
    *             
    * 
    * @pdOid 735048f8-ad48-433b-8617-815b8b21794b */
   private java.lang.String ordName;
   /** 状态
    *             
    * 
    * @pdOid 1fff5c1b-7dd4-447b-bce9-df1673d6d855 */
   private int ordStatus = 0;
   /** 到达地
    *             
    * 
    * @pdOid 2633c60c-00d3-42f4-9d99-5c17b73b0d2f */
   private java.lang.String ordAddress;
   /** 到达时限
    *             
    * 
    * @pdOid 54209da7-e8ae-4abf-a2c3-68309babbead */
   private java.util.Date ordDeliveryTime;
   /** 合包单号
    *             
    * 
    * @pdOid 26023a64-6795-4cdc-9dd4-e2e67f72a3c6 */
   private java.lang.String ordOrpPackageNo;
   /** @pdOid eb9f59e5-fd58-48cb-8204-2fcc2beec8a3 */
   private java.lang.String duo1;
   /** @pdOid 49823d93-c378-4a64-8a47-7de54898f671 */
   private java.lang.String duo2;
   /** @pdOid 36279a28-56ee-451e-867d-73f54ddf66e8 */
   private java.lang.String duo3;
   
   /** @pdOid 329031f9-16c0-4018-90be-df515c51bd09 */
   public java.lang.String getOrdPackageNo() {
      return ordPackageNo;
   }
   
   /** @param newOrdPackageNo
    * @pdOid 20321ecb-6a3c-4d66-924d-36c31fe88562 */
   public void setOrdPackageNo(java.lang.String newOrdPackageNo) {
      ordPackageNo = newOrdPackageNo;
   }
   
   /** @pdOid f5b0bf83-5945-41d6-9cff-b856c81ba641 */
   public java.lang.String getOrdOdd() {
      return ordOdd;
   }
   
   /** @param newOrdOdd
    * @pdOid 93d398f1-d1b7-4fd6-8832-0f4051f5450e */
   public void setOrdOdd(java.lang.String newOrdOdd) {
      ordOdd = newOrdOdd;
   }
   
   /** @pdOid d03c8212-d21b-48a5-b30a-b39ecb19ba5d */
   public double getOrdWeight() {
      return ordWeight;
   }
   
   /** @param newOrdWeight
    * @pdOid 92e165c1-5f9e-401a-9b67-046bb84e4178 */
   public void setOrdWeight(double newOrdWeight) {
      ordWeight = newOrdWeight;
   }
   
   /** @pdOid ad17e6e6-95c1-4b96-9db2-fc3cf00149ff */
   public double getOrdV() {
      return ordV;
   }
   
   /** @param newOrdV
    * @pdOid a6ef41ca-3a19-48e8-a1cc-a4f4fb2320de */
   public void setOrdV(double newOrdV) {
      ordV = newOrdV;
   }
   
   /** @pdOid 9761851d-0745-4eff-ae54-554dccc63662 */
   public int getOrdNumber() {
      return ordNumber;
   }
   
   /** @param newOrdNumber
    * @pdOid d83e93ff-c6d6-451b-b540-6217f3827103 */
   public void setOrdNumber(int newOrdNumber) {
      ordNumber = newOrdNumber;
   }
   
   /** @pdOid 8365aa84-31ea-49a3-9360-adadc7a34565 */
   public java.lang.String getOrdName() {
      return ordName;
   }
   
   /** @param newOrdName
    * @pdOid c4f06147-3445-44e9-93b4-2359a4de63e9 */
   public void setOrdName(java.lang.String newOrdName) {
      ordName = newOrdName;
   }
   
   /** @pdOid 47a3b0a0-0bd0-4e62-870f-15d2afa9ecd9 */
   public int getOrdStatus() {
      return ordStatus;
   }
   
   /** @param newOrdStatus
    * @pdOid d9973ea6-1475-463f-b4bb-ac8786ebab7e */
   public void setOrdStatus(int newOrdStatus) {
      ordStatus = newOrdStatus;
   }
   
   /** @pdOid 02194412-824c-46d8-b994-2e9e4dc6aa15 */
   public java.lang.String getOrdAddress() {
      return ordAddress;
   }
   
   /** @param newOrdAddress
    * @pdOid 3a3dd598-9fee-4e81-862c-a2f4566c6aee */
   public void setOrdAddress(java.lang.String newOrdAddress) {
      ordAddress = newOrdAddress;
   }
   
   /** @pdOid 63552985-f57f-4ea7-9fcc-d2c6beff7ac2 */
   public java.util.Date getOrdDeliveryTime() {
      return ordDeliveryTime;
   }
   
   /** @param newOrdDeliveryTime
    * @pdOid 596effa9-0d5b-421e-ad9c-da902c44e95a */
   public void setOrdDeliveryTime(java.util.Date newOrdDeliveryTime) {
      ordDeliveryTime = newOrdDeliveryTime;
   }
   
   /** @pdOid 8a6e1762-4b77-4ab4-8d89-c02ccabedc13 */
   public java.lang.String getOrdOrpPackageNo() {
      return ordOrpPackageNo;
   }
   
   /** @param newOrdOrpPackageNo
    * @pdOid f5d1e812-ad1c-4a35-b58d-91c7cd4c4ed9 */
   public void setOrdOrpPackageNo(java.lang.String newOrdOrpPackageNo) {
      ordOrpPackageNo = newOrdOrpPackageNo;
   }
   
   /** @pdOid 02a94cdd-629c-43d8-95bd-e73ca35d594a */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid e6f6f9df-7628-4b13-ac38-1dbf0f860b32 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 49e3a06f-24bc-4234-bce7-2c7e8f9dda0b */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid af9714e2-f179-4855-bcf8-8078e7437814 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid a53a264d-3055-4b9a-a307-a032574b0c71 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid e6ec3799-2757-4dd2-a0f8-9ca25e4ed4d3 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}