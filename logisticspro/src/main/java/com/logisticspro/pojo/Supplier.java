/***********************************************************************
 * Module:  Supplier.java
 * Author:  Administrator
 * Purpose: Defines the Class Supplier
 ***********************************************************************/

import java.util.*;

/** @pdOid 0c7a5b73-9d0e-441d-8ea5-2726e7aedfa6 */
public class Supplier {
   /** 供货商编号
    *             
    * 
    * @pdOid 35dfca80-cf11-4884-8259-8d9bc41859ad */
   private java.lang.String supID;
   /** 供货商名称
    *             
    * 
    * @pdOid f8a60330-a5be-455b-9047-4c5bd54115af */
   private java.lang.String supName;
   /** 联系人
    *             
    * 
    * @pdOid 43f6b804-bfac-4b09-ae1d-cf0f1a6d99c2 */
   private java.lang.String supLinkman;
   /** 联系电话
    *             
    * 
    * @pdOid 9e2857d8-9fba-4676-bccb-b7ee167e1ccf */
   private java.lang.String supPhone;
   /** 我方应付金额
    *             
    * 
    * @pdOid 79982b86-6228-47e0-85b9-98e78b5dd20c */
   private double supMoney;
   /** 联系地址编号
    *             
    * 
    * @pdOid af096582-3689-4764-aa03-cdf57a66f0ee */
   private java.lang.String supAddressNo;
   /** 详细地址
    *             
    * 
    * @pdOid d61bbfef-c54d-4753-9c30-771a39edb81c */
   private java.lang.String supAddress;
   /** 所属地区
    *             
    * 
    * @pdOid 29cff4c3-b9d3-4404-9137-4f7a24b5763a */
   private java.lang.String supRegion;
   /** 默认供货商
    *             
    * 
    * @pdOid b0d82312-fb34-433b-ac3b-d3a54c453e7e */
   private int supDefault = 0;
   /** 备注
    *             
    * 
    * @pdOid 2903c3de-4cd6-4846-b6dc-3d9e2e68e010 */
   private java.lang.String supComment;
   /** @pdOid e48de7ba-e5f2-4dac-99fb-677e23a42e0d */
   private java.lang.String duo1;
   /** @pdOid 6e50eb68-094b-4c3e-b15d-5fa85b5356fb */
   private java.lang.String duo2;
   /** @pdOid ce68cc94-1a7b-4547-b7f4-6688ee7ba248 */
   private java.lang.String duo3;
   
   /** @pdOid 7429d950-821c-4a72-a04d-fe2fdd3bb645 */
   public java.lang.String getSupID() {
      return supID;
   }
   
   /** @param newSupID
    * @pdOid 34bcd2ed-60ba-432a-b4b8-3155dda2595f */
   public void setSupID(java.lang.String newSupID) {
      supID = newSupID;
   }
   
   /** @pdOid 6365632d-eb05-4b13-b7c8-3e7ababa1361 */
   public java.lang.String getSupName() {
      return supName;
   }
   
   /** @param newSupName
    * @pdOid 9f582fcd-601d-40f2-ad88-6e5ba68585de */
   public void setSupName(java.lang.String newSupName) {
      supName = newSupName;
   }
   
   /** @pdOid b21a96a2-d280-4c0f-ba49-758057322d39 */
   public java.lang.String getSupLinkman() {
      return supLinkman;
   }
   
   /** @param newSupLinkman
    * @pdOid 61ee4471-599f-49e9-a317-7888a8c33129 */
   public void setSupLinkman(java.lang.String newSupLinkman) {
      supLinkman = newSupLinkman;
   }
   
   /** @pdOid fed7d158-6dd6-4278-a98b-0fe901e8cbdb */
   public java.lang.String getSupPhone() {
      return supPhone;
   }
   
   /** @param newSupPhone
    * @pdOid 7578f532-6322-466c-adf7-388184bd15dd */
   public void setSupPhone(java.lang.String newSupPhone) {
      supPhone = newSupPhone;
   }
   
   /** @pdOid 2ea281b7-1df3-4447-a88c-82a021f00410 */
   public double getSupMoney() {
      return supMoney;
   }
   
   /** @param newSupMoney
    * @pdOid 83f8ba9a-1c09-4538-bec3-83c543865803 */
   public void setSupMoney(double newSupMoney) {
      supMoney = newSupMoney;
   }
   
   /** @pdOid 52306be9-4c81-42cd-88bc-522b1a922453 */
   public java.lang.String getSupAddressNo() {
      return supAddressNo;
   }
   
   /** @param newSupAddressNo
    * @pdOid f8b97ce9-b611-41e3-b705-d9484fc50e35 */
   public void setSupAddressNo(java.lang.String newSupAddressNo) {
      supAddressNo = newSupAddressNo;
   }
   
   /** @pdOid 569d951f-96b1-4ead-8c52-5a9cc7476e95 */
   public java.lang.String getSupAddress() {
      return supAddress;
   }
   
   /** @param newSupAddress
    * @pdOid c3e15c60-8973-42a4-ae53-1c28aa858da5 */
   public void setSupAddress(java.lang.String newSupAddress) {
      supAddress = newSupAddress;
   }
   
   /** @pdOid a4fee3a8-e4fe-4548-9936-236c2d11fa55 */
   public java.lang.String getSupRegion() {
      return supRegion;
   }
   
   /** @param newSupRegion
    * @pdOid 0ea5c038-6aee-4d41-a9ac-69fdda09bf7b */
   public void setSupRegion(java.lang.String newSupRegion) {
      supRegion = newSupRegion;
   }
   
   /** @pdOid 7f4d879d-9e2b-4d43-95b8-3fd6c8de1400 */
   public int getSupDefault() {
      return supDefault;
   }
   
   /** @param newSupDefault
    * @pdOid af6652ca-88e4-49bc-9f46-3410c2d3115b */
   public void setSupDefault(int newSupDefault) {
      supDefault = newSupDefault;
   }
   
   /** @pdOid 4b7ea0c2-1f1b-4282-92db-91b67a239713 */
   public java.lang.String getSupComment() {
      return supComment;
   }
   
   /** @param newSupComment
    * @pdOid 4ba51b88-3b1a-49f3-9e9a-2083f4be2237 */
   public void setSupComment(java.lang.String newSupComment) {
      supComment = newSupComment;
   }
   
   /** @pdOid ac8200c5-f34b-41e8-8328-5a8bc5578fce */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 3899fd93-e8a1-4d9c-acb3-903ad8bb7f74 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid c5fe4a2a-0078-4610-b4b4-6e529c0b7a66 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 577225fb-9251-4c90-ae64-9f15067265e5 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 5b05ea18-7942-4f89-ac3d-ea5afa438311 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid c752e9d9-628d-4422-9100-cc66a3631d66 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}