/***********************************************************************
 * Module:  Authority.java
 * Author:  Administrator
 * Purpose: Defines the Class Authority
 ***********************************************************************/

import java.util.*;

/** @pdOid f3e6a78a-e1e8-46bb-ada4-22ed73607671 */
public class Authority {
   /** 权限编号
    *             
    * 
    * @pdOid afbc82ff-1fb8-4894-869c-8b2b6288ca50 */
   private java.lang.String autNo;
   /** 权限名称
    *             
    * 
    * @pdOid 40c0ff89-a6eb-42b0-8e52-005aea7c35c7 */
   private java.lang.String autName;
   /** 父权限编号
    *             
    * 
    * @pdOid e8d1a6af-15bc-4df9-b6da-83c2c2bc3091 */
   private autParentNo varchar(32) autParentNo;
   /** 权限描述
    *             
    * 
    * @pdOid 803c7166-ac6c-420f-a1d2-6db2da8ac34d */
   private java.lang.String autDesc;
   /** 权限功能按钮
    *             
    * 
    * @pdOid 9c00c119-8553-40a0-829d-41fcf8e4b00c */
   private java.lang.String autButton;
   /** 权限图片
    *             
    * 
    * @pdOid 8b827133-4334-4512-ae17-89f619b4a3f4 */
   private java.lang.String autImg;
   /** 权限页面地址
    *             
    * 
    * @pdOid f888b970-76fe-45bb-820a-d64ea9e21cd8 */
   private java.lang.String autUrl;
   /** 权限排序
    *             
    * 
    * @pdOid 51dbd43c-9798-4ff6-9bf8-6a4d593b1b08 */
   private int autOrderNumber;
   /** 权限的过滤器
    *             
    * 
    * @pdOid 5aed1f1d-a5fb-4e38-a720-bdea2b25fe93 */
   private java.lang.String autFilter;
   /** 状态
    *             
    * 
    * @pdOid 97b73bec-6f28-4086-9ca5-750ddf74b840 */
   private int autStatus = 0;
   
   /** @pdOid 53cd172e-b303-484a-9f3e-f475e33eb99e */
   public java.lang.String getAutNo() {
      return autNo;
   }
   
   /** @param newAutNo
    * @pdOid 9599c97a-cbb2-4feb-b10c-b66710a09de0 */
   public void setAutNo(java.lang.String newAutNo) {
      autNo = newAutNo;
   }
   
   /** @pdOid 75061870-fae6-48ca-aeaa-c57d05d9e9b3 */
   public java.lang.String getAutName() {
      return autName;
   }
   
   /** @param newAutName
    * @pdOid bac4571a-6bc1-4d95-a129-150c30ab495d */
   public void setAutName(java.lang.String newAutName) {
      autName = newAutName;
   }
   
   /** @pdOid 417d3666-7759-4bfb-b4ef-11b24dbf911c */
   public autParentNo varchar(32) getAutParentNo() {
      return autParentNo;
   }
   
   /** @param newAutParentNo
    * @pdOid e7b88541-8215-40a4-8dba-0862b7a09141 */
   public void setAutParentNo(autParentNo varchar(32) newAutParentNo) {
      autParentNo = newAutParentNo;
   }
   
   /** @pdOid 200616a0-471f-48b5-b529-7af98dea0493 */
   public java.lang.String getAutDesc() {
      return autDesc;
   }
   
   /** @param newAutDesc
    * @pdOid 65113a45-d8b0-478f-b61c-71fc9a63fa90 */
   public void setAutDesc(java.lang.String newAutDesc) {
      autDesc = newAutDesc;
   }
   
   /** @pdOid 09d7d294-6502-478e-8a41-afc69e85778f */
   public java.lang.String getAutButton() {
      return autButton;
   }
   
   /** @param newAutButton
    * @pdOid 99cdff3b-0f66-477b-a958-b7ea895b3486 */
   public void setAutButton(java.lang.String newAutButton) {
      autButton = newAutButton;
   }
   
   /** @pdOid c48814e6-4fac-4a07-a08c-a1d2dadd8293 */
   public java.lang.String getAutImg() {
      return autImg;
   }
   
   /** @param newAutImg
    * @pdOid 41f92512-76a4-4a85-83c4-c5763520f05e */
   public void setAutImg(java.lang.String newAutImg) {
      autImg = newAutImg;
   }
   
   /** @pdOid ee404da6-4377-4987-8495-96459e53c2e8 */
   public java.lang.String getAutUrl() {
      return autUrl;
   }
   
   /** @param newAutUrl
    * @pdOid 6af504c9-0913-4aa7-aa72-63eac3e77849 */
   public void setAutUrl(java.lang.String newAutUrl) {
      autUrl = newAutUrl;
   }
   
   /** @pdOid e8a9b2c8-fa32-4702-ad1d-7975f2638c94 */
   public int getAutOrderNumber() {
      return autOrderNumber;
   }
   
   /** @param newAutOrderNumber
    * @pdOid 98575c40-6781-40bb-b8d2-c7842327f2c8 */
   public void setAutOrderNumber(int newAutOrderNumber) {
      autOrderNumber = newAutOrderNumber;
   }
   
   /** @pdOid 23e6ed5b-2405-4fe4-82eb-0d66281fc5c2 */
   public java.lang.String getAutFilter() {
      return autFilter;
   }
   
   /** @param newAutFilter
    * @pdOid dcb3664f-b52d-42d8-964f-b48ddf50bbd9 */
   public void setAutFilter(java.lang.String newAutFilter) {
      autFilter = newAutFilter;
   }
   
   /** @pdOid f62645f2-2eea-4987-af5a-9105050cf243 */
   public int getAutStatus() {
      return autStatus;
   }
   
   /** @param newAutStatus
    * @pdOid 252266d5-3684-46a6-875d-3a2b4323b0e4 */
   public void setAutStatus(int newAutStatus) {
      autStatus = newAutStatus;
   }

}