/***********************************************************************
 * Module:  Purchase.java
 * Author:  Administrator
 * Purpose: Defines the Class Purchase
 ***********************************************************************/

import java.util.*;

/** @pdOid 64f229e6-4e2b-4400-9f5c-ae0418108507 */
public class Purchase {
   /** 材料进销编号
    *             
    * 
    * @pdOid 281e09e0-6237-4131-ae0f-4d54eb4d98c0 */
   private java.lang.String purChaseId;
   /** 单号
    *             
    * 
    * @pdOid fc3c26a4-dfac-4edb-8c89-cb8d998a1929 */
   private java.lang.String purStorageId;
   /** 类型编号
    *             
    * 
    * @pdOid 38caa13e-fe21-4533-8ade-2e0713241154 */
   private java.lang.String purRtoTypeId;
   /** 送货方名称
    *             
    * 
    * @pdOid 2e23feb7-7187-4d9f-b52c-176d18828165 */
   private java.lang.String purDeliverName;
   /** 联系人
    *             
    * 
    * @pdOid e3f8241f-35e5-4b95-a7b2-2c9851194764 */
   private java.lang.String purContacts;
   /** 联系电话
    *             
    * 
    * @pdOid 34ddbb71-aa21-4635-a888-c3d07b0f7189 */
   private java.lang.String purContactsPhone;
   /** 发货人
    *             
    * 
    * @pdOid 02033be2-2e35-47b7-9868-e34c684d6eb2 */
   private java.lang.String purConsignee;
   /** 发货时间
    *             
    * 
    * @pdOid a27be9bb-ca22-420d-b67c-431bfade4bea */
   private java.util.Date purConsigneeTime;
   /** 调拨单号
    *             
    * 
    * @pdOid b3dd6a4f-e1f3-4258-9480-8a0b99fb1966 */
   private java.lang.String purAllocateNumber;
   /** 所属单位
    *             
    * 
    * @pdOid d0960b88-486a-4183-8491-17d64ac4b24c */
   private java.lang.String purSuborUnit;
   /** 领用类型
    *             
    * 
    * @pdOid 747481a0-2efb-42b1-8be9-7a1c4ee0317c */
   private java.lang.String purUseType;
   /** 货物编号
    *             
    * 
    * @pdOid b3e64bf9-a1ea-408c-9326-f0c2cecf892e */
   private java.lang.String purGoodsNo;
   /** 货物名称
    *             
    * 
    * @pdOid 39bf5b68-9887-4b7c-8ce4-9b188136d038 */
   private java.lang.String purGoodsName;
   /** 领用人工号
    *             
    * 
    * @pdOid 80454043-0d00-4836-b26f-46472c734566 */
   private java.lang.String datRecipientId;
   /** 领用人姓名
    *             
    * 
    * @pdOid 22ba0cec-9e13-4954-900a-ccfac1b858c1 */
   private java.lang.String datRecipientName;
   /** 领用时间
    *             
    * 
    * @pdOid 09b4a938-fce5-40c4-a7ce-75862de203f6 */
   private java.util.Date datRecipientDate;
   /** 审核人工号
    *             
    * 
    * @pdOid 69667029-ec47-4e23-9161-518df8ce7798 */
   private java.lang.String datAuditorId;
   /** 审核人姓名
    *             
    * 
    * @pdOid 43743a83-1042-44ff-8716-b824f9f3a47f */
   private java.lang.String datAuditorName;
   /** 审核时间
    *             
    * 
    * @pdOid 48b9922d-f50d-44a8-9962-e4300d7739bc */
   private java.util.Date datAuditorDate;
   /** 开单人工号
    *             
    * 
    * @pdOid 559790e6-21f6-4e35-8540-54cb17d4d6d3 */
   private java.lang.String datBillerId;
   /** 开单人姓名
    *             
    * 
    * @pdOid 8e662065-b356-4389-9f09-ee8ab0219701 */
   private java.lang.String datBillerName;
   /** 开单时间
    *             
    * 
    * @pdOid b6c6da48-f49b-4803-ab8f-cb1969c43a01 */
   private java.util.Date datBillerDate;
   /** 库存编号
    *             
    * 
    * @pdOid a34381e5-db31-45a5-ac08-64b8c2378515 */
   private cusStatus purWarID;
   /** @pdOid 598634b8-df69-4b1d-8c86-a663ab670542 */
   private java.lang.String duo1;
   /** @pdOid 2dcc8c14-7389-41d3-ac31-5dcf70e0c48f */
   private java.lang.String duo2;
   /** @pdOid 7e549926-c81b-41bb-b48e-10e48e1975e4 */
   private java.lang.String duo3;
   
   /** @pdOid 52626da2-2b20-4708-8768-5a938ea4129b */
   public java.lang.String getPurChaseId() {
      return purChaseId;
   }
   
   /** @param newPurChaseId
    * @pdOid d6ace9f2-a32e-46a3-819d-0c2ef435bb1c */
   public void setPurChaseId(java.lang.String newPurChaseId) {
      purChaseId = newPurChaseId;
   }
   
   /** @pdOid 9080c45f-140f-4705-afe9-65f8c0cbe4ba */
   public java.lang.String getPurStorageId() {
      return purStorageId;
   }
   
   /** @param newPurStorageId
    * @pdOid e5654cea-01b9-41cd-a944-59987334ad3f */
   public void setPurStorageId(java.lang.String newPurStorageId) {
      purStorageId = newPurStorageId;
   }
   
   /** @pdOid 47032578-c1b8-424d-810e-52bf9e50af36 */
   public java.lang.String getPurRtoTypeId() {
      return purRtoTypeId;
   }
   
   /** @param newPurRtoTypeId
    * @pdOid 203b6a54-6c68-47d1-983d-3840d005af92 */
   public void setPurRtoTypeId(java.lang.String newPurRtoTypeId) {
      purRtoTypeId = newPurRtoTypeId;
   }
   
   /** @pdOid 9b45af7d-99de-40ac-aa2e-d9818985cba2 */
   public java.lang.String getPurDeliverName() {
      return purDeliverName;
   }
   
   /** @param newPurDeliverName
    * @pdOid 7a9ce6e0-5de9-4237-a902-d24291e0bc79 */
   public void setPurDeliverName(java.lang.String newPurDeliverName) {
      purDeliverName = newPurDeliverName;
   }
   
   /** @pdOid 706895e7-36c9-4ccb-80ca-f9007e53e4f0 */
   public java.lang.String getPurContacts() {
      return purContacts;
   }
   
   /** @param newPurContacts
    * @pdOid 7a2dc1eb-8106-4712-a1eb-e01f24af5587 */
   public void setPurContacts(java.lang.String newPurContacts) {
      purContacts = newPurContacts;
   }
   
   /** @pdOid fdffc8e6-2c12-4467-a0ca-f86a9fe4209b */
   public java.lang.String getPurContactsPhone() {
      return purContactsPhone;
   }
   
   /** @param newPurContactsPhone
    * @pdOid e6fec987-f3d8-4537-ad6f-cde3d1a7c963 */
   public void setPurContactsPhone(java.lang.String newPurContactsPhone) {
      purContactsPhone = newPurContactsPhone;
   }
   
   /** @pdOid df837a81-4938-44d9-a335-0f088f58c100 */
   public java.lang.String getPurConsignee() {
      return purConsignee;
   }
   
   /** @param newPurConsignee
    * @pdOid e07eac4b-3376-4440-ab84-85b0356a88ec */
   public void setPurConsignee(java.lang.String newPurConsignee) {
      purConsignee = newPurConsignee;
   }
   
   /** @pdOid 524aa789-2ff2-4c0b-a8e4-c7abb2dbfd90 */
   public java.util.Date getPurConsigneeTime() {
      return purConsigneeTime;
   }
   
   /** @param newPurConsigneeTime
    * @pdOid bbf74d63-e377-4287-94fb-041883ac10e1 */
   public void setPurConsigneeTime(java.util.Date newPurConsigneeTime) {
      purConsigneeTime = newPurConsigneeTime;
   }
   
   /** @pdOid 7a7b3fe1-d2e1-42e4-8b56-505b6c050cc1 */
   public java.lang.String getPurAllocateNumber() {
      return purAllocateNumber;
   }
   
   /** @param newPurAllocateNumber
    * @pdOid fad15ba4-f869-4fc3-bfce-a2e9291a98d2 */
   public void setPurAllocateNumber(java.lang.String newPurAllocateNumber) {
      purAllocateNumber = newPurAllocateNumber;
   }
   
   /** @pdOid 22e4c662-043f-42cf-82b3-735c45c98e82 */
   public java.lang.String getPurSuborUnit() {
      return purSuborUnit;
   }
   
   /** @param newPurSuborUnit
    * @pdOid 8fa8fbc5-7aec-46d4-bdcf-f9c807dd7872 */
   public void setPurSuborUnit(java.lang.String newPurSuborUnit) {
      purSuborUnit = newPurSuborUnit;
   }
   
   /** @pdOid 8f284cfb-8223-480c-9b93-5710b49f8c0b */
   public java.lang.String getPurUseType() {
      return purUseType;
   }
   
   /** @param newPurUseType
    * @pdOid 4d80ac2e-b704-477f-adb1-e976f8f09807 */
   public void setPurUseType(java.lang.String newPurUseType) {
      purUseType = newPurUseType;
   }
   
   /** @pdOid 394d906e-0a9c-4cac-8bed-27fa802e01be */
   public java.lang.String getPurGoodsNo() {
      return purGoodsNo;
   }
   
   /** @param newPurGoodsNo
    * @pdOid 8dc2af0b-d5db-413c-9511-e3c9687f1ed9 */
   public void setPurGoodsNo(java.lang.String newPurGoodsNo) {
      purGoodsNo = newPurGoodsNo;
   }
   
   /** @pdOid 61026ddb-14a5-41a7-ad54-25fe36d98b1d */
   public java.lang.String getPurGoodsName() {
      return purGoodsName;
   }
   
   /** @param newPurGoodsName
    * @pdOid 0813d883-f1d4-4631-955a-e5e1bbbfef53 */
   public void setPurGoodsName(java.lang.String newPurGoodsName) {
      purGoodsName = newPurGoodsName;
   }
   
   /** @pdOid 0657e1b7-700c-4260-b917-7258101983c8 */
   public java.lang.String getDatRecipientId() {
      return datRecipientId;
   }
   
   /** @param newDatRecipientId
    * @pdOid ade09ec2-700f-4064-8dc3-0db32115e50e */
   public void setDatRecipientId(java.lang.String newDatRecipientId) {
      datRecipientId = newDatRecipientId;
   }
   
   /** @pdOid 71014a79-453c-425e-8250-c06f4284f903 */
   public java.lang.String getDatRecipientName() {
      return datRecipientName;
   }
   
   /** @param newDatRecipientName
    * @pdOid 90d7b7c3-3af2-4007-9e27-b2df4187d36e */
   public void setDatRecipientName(java.lang.String newDatRecipientName) {
      datRecipientName = newDatRecipientName;
   }
   
   /** @pdOid e4069acb-3c95-47d8-9012-bfdce1f5fc47 */
   public java.util.Date getDatRecipientDate() {
      return datRecipientDate;
   }
   
   /** @param newDatRecipientDate
    * @pdOid d83b0ead-dd30-470d-b04a-97c63942bbe0 */
   public void setDatRecipientDate(java.util.Date newDatRecipientDate) {
      datRecipientDate = newDatRecipientDate;
   }
   
   /** @pdOid 1fe40555-8064-4b0a-8be8-fffcc894d034 */
   public java.lang.String getDatAuditorId() {
      return datAuditorId;
   }
   
   /** @param newDatAuditorId
    * @pdOid d021ea8f-90ce-444e-a398-d0498d391856 */
   public void setDatAuditorId(java.lang.String newDatAuditorId) {
      datAuditorId = newDatAuditorId;
   }
   
   /** @pdOid 45a6d88e-a038-48e5-b363-888a0d0407e4 */
   public java.lang.String getDatAuditorName() {
      return datAuditorName;
   }
   
   /** @param newDatAuditorName
    * @pdOid e42adc66-beab-4913-a31a-aa7a2b2d7a46 */
   public void setDatAuditorName(java.lang.String newDatAuditorName) {
      datAuditorName = newDatAuditorName;
   }
   
   /** @pdOid a5b12df0-8d6a-4be6-b3f2-fa56b24ba63a */
   public java.util.Date getDatAuditorDate() {
      return datAuditorDate;
   }
   
   /** @param newDatAuditorDate
    * @pdOid 0ea518d4-369b-418e-b007-1b2adad960a5 */
   public void setDatAuditorDate(java.util.Date newDatAuditorDate) {
      datAuditorDate = newDatAuditorDate;
   }
   
   /** @pdOid 9c3811c7-653b-4d4d-9d27-7808dbff1180 */
   public java.lang.String getDatBillerId() {
      return datBillerId;
   }
   
   /** @param newDatBillerId
    * @pdOid bedd4977-bc52-4efa-9bb8-ad5e47a291f5 */
   public void setDatBillerId(java.lang.String newDatBillerId) {
      datBillerId = newDatBillerId;
   }
   
   /** @pdOid a3024042-b985-4169-8930-0970d33551a2 */
   public java.lang.String getDatBillerName() {
      return datBillerName;
   }
   
   /** @param newDatBillerName
    * @pdOid 3b1607a8-f9ba-4b5d-9d28-ca66bb22a613 */
   public void setDatBillerName(java.lang.String newDatBillerName) {
      datBillerName = newDatBillerName;
   }
   
   /** @pdOid ff655a2b-1648-49ef-9e80-9da45c789f40 */
   public java.util.Date getDatBillerDate() {
      return datBillerDate;
   }
   
   /** @param newDatBillerDate
    * @pdOid 373c56d3-df00-45cb-ae69-3af9eab2f027 */
   public void setDatBillerDate(java.util.Date newDatBillerDate) {
      datBillerDate = newDatBillerDate;
   }
   
   /** @pdOid 4cf3e1ca-d166-42b4-815d-832eea522d39 */
   public cusStatus getPurWarID() {
      return purWarID;
   }
   
   /** @param newPurWarID
    * @pdOid 20ee0b09-5bd6-4e7b-ad10-1f82e6b594af */
   public void setPurWarID(cusStatus newPurWarID) {
      purWarID = newPurWarID;
   }
   
   /** @pdOid 3061811f-0781-46fd-a0bd-9cbc1990e317 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid f1132aad-d04e-489f-b129-2b2a76427959 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid fc6610cc-4daf-4f5e-829a-f83a050055bb */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 5725942a-6084-4af1-912b-f7ba648f9120 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 7cde1884-d07c-4704-97a4-4ea7387a7732 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 58bbfbe0-1d18-447c-b4e8-3bf0c1097784 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}