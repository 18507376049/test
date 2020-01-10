/***********************************************************************
 * Module:  AcceptConsultation.java
 * Author:  Administrator
 * Purpose: Defines the Class AcceptConsultation
 ***********************************************************************/

import java.util.*;

/** @pdOid 75420be5-3c30-4fe6-898e-ad4a617bcd48 */
public class AcceptConsultation {
   /** 咨询编号
    *             
    * 
    * @pdOid aab7f733-4ea1-41d3-9c94-830a9057e12d */
   private java.lang.String accNo;
   /** 客户编号
    *             
    * 
    * @pdOid 824ed39d-164e-4c91-97b8-4efe7d18d5ce */
   private java.lang.String accCliNo;
   /** 客户名称
    *             
    * 
    * @pdOid 2b5494cf-dc14-4b0d-957b-021943a2299a */
   private java.lang.String accName;
   /** 工单号
    *             
    * 
    * @pdOid 6b502e09-53a8-4f39-a8d6-62934e2baee3 */
   private java.lang.String accWorNo;
   /** 联系电话
    *             
    * 
    * @pdOid ac3a48e3-7a19-4170-ae94-fb3413e7d8c4 */
   private java.lang.String accContactNumber;
   /** 短信序号
    *             
    * 
    * @pdOid 6bae9f68-20e5-4fed-b5d5-31204c1cd9e4 */
   private java.lang.String accMessageNo;
   /** 手机
    *             
    * 
    * @pdOid 15ea4429-4391-42a8-b707-bb83d531c92c */
   private java.lang.String accPhone;
   /** 传真
    *             
    * 
    * @pdOid ad859bee-209d-4555-b6bf-ce9c3d8eff5f */
   private java.lang.String accFax;
   /** 联系地址
    *             
    * 
    * @pdOid cc970856-8d9f-483c-90d8-687f92c9c00a */
   private java.lang.String accContactAddress;
   /** 邮编
    *             
    * 
    * @pdOid 611da138-63a5-411e-9f98-c0a5afdcf2bf */
   private java.lang.String accPostcode;
   /** EMAIL
    *             
    * 
    * @pdOid 2d5c2455-7db2-4896-a720-8b199d2ee5d2 */
   private java.lang.String accEmail;
   /** 是否合作过
    *             
    * 
    * @pdOid c8de5e24-51ae-4991-9b93-fba92b3a219b */
   private int accIsCollaborate = 0;
   /** 工作单号
    *             
    * 
    * @pdOid 7b03a83d-955a-40c0-8048-91bc22ae077d */
   private java.lang.String accWorkNo;
   /** 结算方式
    *             
    * 
    * @pdOid e0406d27-e377-4bcf-910e-9f92e454acc1 */
   private java.lang.String accClearingWay;
   /** 初始受理单位
    *             
    * 
    * @pdOid 53545a82-a081-4afe-bc87-334f718716b9 */
   private java.lang.String accInitialUnit;
   /** 通知单号
    *             
    * 
    * @pdOid 27a24153-0251-4283-a178-d5ebebb4bbb9 */
   private java.lang.String accOdd;
   /** 取货单位
    *             
    * 
    * @pdOid 8639acec-a1ad-4103-8c73-506c0d25d06e */
   private java.lang.String accPickupUnit;
   /** 受理时间
    *             
    * 
    * @pdOid 1c44caf7-2a7d-48ab-a382-3f2f7a1b86b6 */
   private java.util.Date accTime;
   /** 咨询类型
    *             
    * 
    * @pdOid 395a1461-42ea-4f97-8ca5-86a06d4ea0f7 */
   private java.lang.String accConsultType;
   /** 咨询方式
    *             
    * 
    * @pdOid 62b9bda1-67f9-48b4-80e6-5d7a8edf71a5 */
   private java.lang.String accConsultWay;
   /** 咨询时间
    *             
    * 
    * @pdOid 70de367c-8747-49e8-b931-2d33cba28c50 */
   private java.util.Date accConsultTime;
   /** 咨询内容
    *             
    * 
    * @pdOid ca03e425-6856-4987-bb9e-8d6dad786122 */
   private java.lang.String accConsultContent;
   /** 咨询结果
    *             
    * 
    * @pdOid 12322d8e-b1c8-48b8-9f14-4f535f9d2937 */
   private java.lang.String accConsultResult;
   /** @pdOid c7b638d5-2201-475e-ba36-9ee8a40131a1 */
   private java.lang.String duo1;
   /** @pdOid f18844d9-2764-4987-91bb-935a1c77cd5a */
   private java.lang.String duo2;
   /** @pdOid 50f98aca-1f4d-4979-b302-248262a38f69 */
   private java.lang.String duo3;
   
   /** @pdOid e8780312-9c4b-47d5-980f-8236abf098d9 */
   public java.lang.String getAccNo() {
      return accNo;
   }
   
   /** @param newAccNo
    * @pdOid 747e5d5e-0e1a-4aa0-a0c5-eab2dd372b77 */
   public void setAccNo(java.lang.String newAccNo) {
      accNo = newAccNo;
   }
   
   /** @pdOid 3b635a13-2701-4491-b198-0e3c8fdbedff */
   public java.lang.String getAccCliNo() {
      return accCliNo;
   }
   
   /** @param newAccCliNo
    * @pdOid 4e64ab91-4f6c-4e42-aaa6-dc3a72e1a9f6 */
   public void setAccCliNo(java.lang.String newAccCliNo) {
      accCliNo = newAccCliNo;
   }
   
   /** @pdOid 90c1dee9-dc24-4504-9aaf-23f2a4ff8b84 */
   public java.lang.String getAccName() {
      return accName;
   }
   
   /** @param newAccName
    * @pdOid a6ee4485-6415-4e86-85b7-d3c021d904a5 */
   public void setAccName(java.lang.String newAccName) {
      accName = newAccName;
   }
   
   /** @pdOid c6ba1092-31b3-46f5-b890-98dad8b2e02c */
   public java.lang.String getAccWorNo() {
      return accWorNo;
   }
   
   /** @param newAccWorNo
    * @pdOid 7701aecc-1637-4a05-b3d6-0625becf69b5 */
   public void setAccWorNo(java.lang.String newAccWorNo) {
      accWorNo = newAccWorNo;
   }
   
   /** @pdOid 923259ce-59b8-486c-a092-23b90e592cf9 */
   public java.lang.String getAccContactNumber() {
      return accContactNumber;
   }
   
   /** @param newAccContactNumber
    * @pdOid f79765a2-b4e6-4c5e-835f-9978ba14b498 */
   public void setAccContactNumber(java.lang.String newAccContactNumber) {
      accContactNumber = newAccContactNumber;
   }
   
   /** @pdOid 3ed425a0-e7d7-498b-8a78-35d681243c33 */
   public java.lang.String getAccMessageNo() {
      return accMessageNo;
   }
   
   /** @param newAccMessageNo
    * @pdOid 786c955d-e7fe-4c72-bd42-3ea594e7923b */
   public void setAccMessageNo(java.lang.String newAccMessageNo) {
      accMessageNo = newAccMessageNo;
   }
   
   /** @pdOid c48d8d29-a2dc-4797-b7cc-9f4bb63e898f */
   public java.lang.String getAccPhone() {
      return accPhone;
   }
   
   /** @param newAccPhone
    * @pdOid c6842303-21dd-4b20-8e3c-49adf823e29c */
   public void setAccPhone(java.lang.String newAccPhone) {
      accPhone = newAccPhone;
   }
   
   /** @pdOid 5883c18e-52cd-42d7-b332-30d76f390954 */
   public java.lang.String getAccFax() {
      return accFax;
   }
   
   /** @param newAccFax
    * @pdOid e032596d-95a1-4362-b595-3d03ca102f29 */
   public void setAccFax(java.lang.String newAccFax) {
      accFax = newAccFax;
   }
   
   /** @pdOid 67666a16-d13d-47e9-93a2-276cb2340c39 */
   public java.lang.String getAccContactAddress() {
      return accContactAddress;
   }
   
   /** @param newAccContactAddress
    * @pdOid 95ecb15d-9fd9-42c5-bb22-e7273dfef805 */
   public void setAccContactAddress(java.lang.String newAccContactAddress) {
      accContactAddress = newAccContactAddress;
   }
   
   /** @pdOid 5a3d3e66-ceb2-44e5-b326-1c3b4b0b592f */
   public java.lang.String getAccPostcode() {
      return accPostcode;
   }
   
   /** @param newAccPostcode
    * @pdOid 3b90c075-8eb0-4d9a-afc4-d4c5b65a0b9b */
   public void setAccPostcode(java.lang.String newAccPostcode) {
      accPostcode = newAccPostcode;
   }
   
   /** @pdOid 74311691-d753-46ae-9708-51de7a744886 */
   public java.lang.String getAccEmail() {
      return accEmail;
   }
   
   /** @param newAccEmail
    * @pdOid ef3c06b2-0c27-4060-a1ac-c0406b7f93aa */
   public void setAccEmail(java.lang.String newAccEmail) {
      accEmail = newAccEmail;
   }
   
   /** @pdOid 2b3a8323-c5d6-4dd6-b1fb-a44092f995bb */
   public int getAccIsCollaborate() {
      return accIsCollaborate;
   }
   
   /** @param newAccIsCollaborate
    * @pdOid 1cbf4d1b-7c63-4170-80f2-b8f447aa223d */
   public void setAccIsCollaborate(int newAccIsCollaborate) {
      accIsCollaborate = newAccIsCollaborate;
   }
   
   /** @pdOid 4113e3a3-be07-460f-b3e2-6ded79e1258a */
   public java.lang.String getAccWorkNo() {
      return accWorkNo;
   }
   
   /** @param newAccWorkNo
    * @pdOid 11283a79-56e1-4803-80d0-799bf86c1a00 */
   public void setAccWorkNo(java.lang.String newAccWorkNo) {
      accWorkNo = newAccWorkNo;
   }
   
   /** @pdOid 1eb8e698-d2fd-4850-8aaf-e0640e252e03 */
   public java.lang.String getAccClearingWay() {
      return accClearingWay;
   }
   
   /** @param newAccClearingWay
    * @pdOid 60c49678-b219-458e-9d46-3273f85410e8 */
   public void setAccClearingWay(java.lang.String newAccClearingWay) {
      accClearingWay = newAccClearingWay;
   }
   
   /** @pdOid 40ed4c3b-abbb-410c-8e51-ee977fbda742 */
   public java.lang.String getAccInitialUnit() {
      return accInitialUnit;
   }
   
   /** @param newAccInitialUnit
    * @pdOid 1eee9903-db24-4b7c-9ed4-52d4c1ed1a07 */
   public void setAccInitialUnit(java.lang.String newAccInitialUnit) {
      accInitialUnit = newAccInitialUnit;
   }
   
   /** @pdOid 2f28451e-6554-439c-b033-533e248c01b7 */
   public java.lang.String getAccOdd() {
      return accOdd;
   }
   
   /** @param newAccOdd
    * @pdOid aad7dd31-0c7d-4a6a-bfbe-3d54fc62ca19 */
   public void setAccOdd(java.lang.String newAccOdd) {
      accOdd = newAccOdd;
   }
   
   /** @pdOid 9a5e8719-2f68-466e-bb89-d8cdde0c4c17 */
   public java.lang.String getAccPickupUnit() {
      return accPickupUnit;
   }
   
   /** @param newAccPickupUnit
    * @pdOid 66eb73be-b9df-48d3-9205-5f27e387099a */
   public void setAccPickupUnit(java.lang.String newAccPickupUnit) {
      accPickupUnit = newAccPickupUnit;
   }
   
   /** @pdOid 2ba0d5bf-d158-4809-a5f4-cdf21677d870 */
   public java.util.Date getAccTime() {
      return accTime;
   }
   
   /** @param newAccTime
    * @pdOid 622c5c47-3e92-4439-bf52-d662593ee2b1 */
   public void setAccTime(java.util.Date newAccTime) {
      accTime = newAccTime;
   }
   
   /** @pdOid c17cd487-1cd1-4cb4-bb93-e591a5cc3e36 */
   public java.lang.String getAccConsultType() {
      return accConsultType;
   }
   
   /** @param newAccConsultType
    * @pdOid 51d9911c-95b3-49ff-897b-05b335c81704 */
   public void setAccConsultType(java.lang.String newAccConsultType) {
      accConsultType = newAccConsultType;
   }
   
   /** @pdOid f2f4d2bd-52be-4808-a3e0-9f6d369ed2e0 */
   public java.lang.String getAccConsultWay() {
      return accConsultWay;
   }
   
   /** @param newAccConsultWay
    * @pdOid b0b6526c-c723-4fee-bc6e-a842b2c9b3ba */
   public void setAccConsultWay(java.lang.String newAccConsultWay) {
      accConsultWay = newAccConsultWay;
   }
   
   /** @pdOid 9cb75c6c-a0c3-4c37-879a-70aa11b10c11 */
   public java.util.Date getAccConsultTime() {
      return accConsultTime;
   }
   
   /** @param newAccConsultTime
    * @pdOid 91964ff9-7965-40b5-834a-d7dd1d5e9e77 */
   public void setAccConsultTime(java.util.Date newAccConsultTime) {
      accConsultTime = newAccConsultTime;
   }
   
   /** @pdOid 549d6c05-8c67-4e9a-b264-2436a25a6832 */
   public java.lang.String getAccConsultContent() {
      return accConsultContent;
   }
   
   /** @param newAccConsultContent
    * @pdOid 42ea1e51-e752-4adc-a1e7-8e3d97fbcfc8 */
   public void setAccConsultContent(java.lang.String newAccConsultContent) {
      accConsultContent = newAccConsultContent;
   }
   
   /** @pdOid 702915a5-85a1-43bc-b001-c903d14c710b */
   public java.lang.String getAccConsultResult() {
      return accConsultResult;
   }
   
   /** @param newAccConsultResult
    * @pdOid 788a2aa7-5930-4834-a9e3-82fdc6dad43c */
   public void setAccConsultResult(java.lang.String newAccConsultResult) {
      accConsultResult = newAccConsultResult;
   }
   
   /** @pdOid c40f0d38-ecae-48f6-b404-c1be8d9c58c9 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 1aea59b0-c6e1-4025-8c7a-e5f4ab43f910 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid f946927f-af20-4e77-bdf4-9ca21a03ca7f */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 49bc6ce8-374d-44ed-9248-4fe130c18e7f */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 055e3989-811c-4d2d-909f-2f3648773963 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 40ef895d-ffe9-44c6-a25f-26dc2bf0b83a */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}