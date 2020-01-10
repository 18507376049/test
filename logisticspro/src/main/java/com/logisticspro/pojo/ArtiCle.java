/***********************************************************************
 * Module:  ArtiCle.java
 * Author:  Administrator
 * Purpose: Defines the Class ArtiCle
 ***********************************************************************/

import java.util.*;

/** @pdOid 75cedc06-43b9-4861-bf58-500fd4ab1f1a */
public class ArtiCle {
   /** 包装材料编号
    *             
    * 
    * @pdOid 55fd8e40-54cb-48ec-88b8-50e942dc36a1 */
   private java.lang.String artNo;
   /** 物品名称
    *             
    * 
    * @pdOid 1452dea3-16d5-4580-a3a6-6c5ed5cc1129 */
   private java.lang.String artName;
   /** 规格
    *             
    * 
    * @pdOid 9b7d5d04-d4fb-43b4-9b4c-24a488f09b36 */
   private java.lang.String artStandard;
   /** 操作人工号
    *             
    * 
    * @pdOid f8be5d6e-c015-44c3-933c-2e662fbe2c58 */
   private java.lang.String artOperateID;
   /** 操作人姓名
    *             
    * 
    * @pdOid 13bc5407-197a-4c05-a17f-ced2439a9fc1 */
   private java.lang.String artOperateName;
   /** 操作时间
    *             
    * 
    * @pdOid 4e846c05-5aa2-43ae-9a22-f263dddef412 */
   private java.util.Date artOperateTime;
   /** 计量单位
    *             
    * 
    * @pdOid 7ab4b122-9077-4e77-9637-c7ac1efeb54b */
   private java.lang.String artCalculateUnit;
   /** 状态
    *             
    * 
    * @pdOid 1e6bd26e-82d2-4ca4-8340-cc8390c7895b */
   private int artStatus = 0;
   /** 备注
    *             
    * 
    * @pdOid ad3ed8ad-50ac-4288-8f02-e2ce82d20c8c */
   private java.lang.String artRemarks;
   /** 价格
    *             
    * 
    * @pdOid ca9d93e4-b914-4c20-add0-15f36d1acca5 */
   private double artPlanPrice;
   /** 类型编号
    *             
    * 
    * @pdOid 67721e3e-6a92-4093-b20d-3fb816f4bab9 */
   private java.lang.String artTypeId;
   /** 供货商编号
    *             
    * 
    * @pdOid c90f20ff-299e-4ce1-b527-d8169d8bf568 */
   private java.lang.String artSupID;
   /** @pdOid b2465013-144b-4fa0-9011-40ac024da6f7 */
   private java.lang.String duo1;
   /** @pdOid 78244c75-558f-4546-b247-0c7081890936 */
   private java.lang.String duo2;
   /** @pdOid 3cd29785-eb29-49f2-8d1a-39171438c9a8 */
   private java.lang.String duo3;
   
   /** @pdOid 527304cd-aef7-4568-b0b2-4c75a0089bc5 */
   public java.lang.String getArtNo() {
      return artNo;
   }
   
   /** @param newArtNo
    * @pdOid f640d8c9-d8be-4204-af49-0b9f557f3b4b */
   public void setArtNo(java.lang.String newArtNo) {
      artNo = newArtNo;
   }
   
   /** @pdOid 06da7c2c-490a-4f52-8175-4722b19c11a9 */
   public java.lang.String getArtName() {
      return artName;
   }
   
   /** @param newArtName
    * @pdOid 6da5114a-779f-4b6e-a297-20ac8ae14e7c */
   public void setArtName(java.lang.String newArtName) {
      artName = newArtName;
   }
   
   /** @pdOid e363eb42-3e3d-48e1-b156-ec72cdffc2aa */
   public java.lang.String getArtStandard() {
      return artStandard;
   }
   
   /** @param newArtStandard
    * @pdOid 44b5ec60-f466-4a58-9ab1-cef0d25ba50e */
   public void setArtStandard(java.lang.String newArtStandard) {
      artStandard = newArtStandard;
   }
   
   /** @pdOid 960b18cf-79cb-481c-80d2-f7cff20ff385 */
   public java.lang.String getArtOperateID() {
      return artOperateID;
   }
   
   /** @param newArtOperateID
    * @pdOid 59cc9090-88bc-48ce-8d01-7fcd3a04c0f3 */
   public void setArtOperateID(java.lang.String newArtOperateID) {
      artOperateID = newArtOperateID;
   }
   
   /** @pdOid c75d0625-fad1-4911-8c38-8d5399e81823 */
   public java.lang.String getArtOperateName() {
      return artOperateName;
   }
   
   /** @param newArtOperateName
    * @pdOid 2ee6c744-b7b7-4e38-bb09-1f9e748abedf */
   public void setArtOperateName(java.lang.String newArtOperateName) {
      artOperateName = newArtOperateName;
   }
   
   /** @pdOid 6070cadf-818b-4e30-b262-d5384992e5f6 */
   public java.util.Date getArtOperateTime() {
      return artOperateTime;
   }
   
   /** @param newArtOperateTime
    * @pdOid 297c21ff-7dfe-48aa-986c-a6ee454177af */
   public void setArtOperateTime(java.util.Date newArtOperateTime) {
      artOperateTime = newArtOperateTime;
   }
   
   /** @pdOid 0f0b5d44-0064-4418-b86d-cb5507fa47bd */
   public java.lang.String getArtCalculateUnit() {
      return artCalculateUnit;
   }
   
   /** @param newArtCalculateUnit
    * @pdOid 8c8e4470-05ec-4482-bfa8-ec00cd3110cf */
   public void setArtCalculateUnit(java.lang.String newArtCalculateUnit) {
      artCalculateUnit = newArtCalculateUnit;
   }
   
   /** @pdOid f579612e-9949-4d95-ae0f-faa921c6e409 */
   public int getArtStatus() {
      return artStatus;
   }
   
   /** @param newArtStatus
    * @pdOid 7b0261c8-d3e0-4c7c-96ac-3b89080b6bee */
   public void setArtStatus(int newArtStatus) {
      artStatus = newArtStatus;
   }
   
   /** @pdOid 727a3542-1c82-42dd-9b79-dcc250e54e12 */
   public java.lang.String getArtRemarks() {
      return artRemarks;
   }
   
   /** @param newArtRemarks
    * @pdOid 864a32c8-719b-429f-a648-6334cddde79b */
   public void setArtRemarks(java.lang.String newArtRemarks) {
      artRemarks = newArtRemarks;
   }
   
   /** @pdOid 250d24cc-893f-424a-bdc9-f1598ef0e7f4 */
   public double getArtPlanPrice() {
      return artPlanPrice;
   }
   
   /** @param newArtPlanPrice
    * @pdOid 803e3ea7-688d-469c-bc58-f73278c307a5 */
   public void setArtPlanPrice(double newArtPlanPrice) {
      artPlanPrice = newArtPlanPrice;
   }
   
   /** @pdOid 9a38fab7-cef0-47ae-b697-11a7e5fb9790 */
   public java.lang.String getArtTypeId() {
      return artTypeId;
   }
   
   /** @param newArtTypeId
    * @pdOid 52660f72-bb56-4daa-aa56-ad96a848a734 */
   public void setArtTypeId(java.lang.String newArtTypeId) {
      artTypeId = newArtTypeId;
   }
   
   /** @pdOid 4b2c6eaf-e6bb-4f55-8e58-7c772ba5d20e */
   public java.lang.String getArtSupID() {
      return artSupID;
   }
   
   /** @param newArtSupID
    * @pdOid c022f735-800d-4b96-a057-5d27af16ae3b */
   public void setArtSupID(java.lang.String newArtSupID) {
      artSupID = newArtSupID;
   }
   
   /** @pdOid c4024603-6bac-4abc-807b-941c669ceb7d */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 76810d82-35aa-4390-b6d3-8ef520de1e16 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 032aa312-f067-4994-a652-9d8306939628 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 59be143c-db18-4296-a5d4-6f5f07c0da27 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 56da7446-1cbc-42d4-baa9-3dc01b07a611 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 479ad27d-ac82-465c-b9fc-b071b1757854 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}