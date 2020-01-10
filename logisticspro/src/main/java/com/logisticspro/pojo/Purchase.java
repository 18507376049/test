package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 材料进销
 */
public class Purchase {
   /**
    * 材料进销编号
    */
   private String purChaseId;
   /**
    * 单号
    */
   private String purStorageId;
   /**
    * 类型编号
    */
   private String purRtoTypeId;
   /**
    * 送货方名称
    */
   private String purDeliverName;
   /**
    * 联系人
    */
   private String purContacts;
   /**
    * 联系电话
    */
   private String purContactsPhone;
   /**
    * 发货人
    */
   private String purConsignee;
   /**
    * 发货时间
    */
   private Date purConsigneeTime;
   /**
    * 调拨单号
    */
   private String purAllocateNumber;
   /**
    * 所属单位
    */
   private String purSuborUnit;
   /**
    * 领用类型
    */
   private String purUseType;
   /**
    * 货物编号
    */
   private String purGoodsNo;
   /**
    * 货物名称
    */
   private String purGoodsName;
   /**
    * 领用人工号
    */
   private String datRecipientId;
   /**
    * 领用人姓名
    */
   private String datRecipientName;
   /**
    * 领用时间
    */
   private Date datRecipientDate;
   /**
    * 审核人工号
    */
   private String datAuditorId;
   /**
    * 审核人姓名
    */
   private String datAuditorName;
   /**
    * 审核时间
    */
   private Date datAuditorDate;
   /**
    * 开单人工号
    */
   private String datBillerId;
   /**
    * 开单人姓名
    */
   private String datBillerName;
   /**
    * 开单时间
    */
   private Date datBillerDate;
   /**
    * 库存编号
    */
   private String purWarID;
   /**
    *
    * */
   private String duo1;
   /**
    *
    *  */
   private String duo2;
   /**
    *
    * */
   private String duo3;

   public Purchase() {
   }

   public Purchase(String purChaseId, String purStorageId, String purRtoTypeId, String purDeliverName, String purContacts, String purContactsPhone, String purConsignee, Date purConsigneeTime, String purAllocateNumber, String purSuborUnit, String purUseType, String purGoodsNo, String purGoodsName, String datRecipientId, String datRecipientName, Date datRecipientDate, String datAuditorId, String datAuditorName, Date datAuditorDate, String datBillerId, String datBillerName, Date datBillerDate, String purWarID, String duo1, String duo2, String duo3) {
      this.purChaseId = purChaseId;
      this.purStorageId = purStorageId;
      this.purRtoTypeId = purRtoTypeId;
      this.purDeliverName = purDeliverName;
      this.purContacts = purContacts;
      this.purContactsPhone = purContactsPhone;
      this.purConsignee = purConsignee;
      this.purConsigneeTime = purConsigneeTime;
      this.purAllocateNumber = purAllocateNumber;
      this.purSuborUnit = purSuborUnit;
      this.purUseType = purUseType;
      this.purGoodsNo = purGoodsNo;
      this.purGoodsName = purGoodsName;
      this.datRecipientId = datRecipientId;
      this.datRecipientName = datRecipientName;
      this.datRecipientDate = datRecipientDate;
      this.datAuditorId = datAuditorId;
      this.datAuditorName = datAuditorName;
      this.datAuditorDate = datAuditorDate;
      this.datBillerId = datBillerId;
      this.datBillerName = datBillerName;
      this.datBillerDate = datBillerDate;
      this.purWarID = purWarID;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Purchase{" +
              "purChaseId='" + purChaseId + '\'' +
              ", purStorageId='" + purStorageId + '\'' +
              ", purRtoTypeId='" + purRtoTypeId + '\'' +
              ", purDeliverName='" + purDeliverName + '\'' +
              ", purContacts='" + purContacts + '\'' +
              ", purContactsPhone='" + purContactsPhone + '\'' +
              ", purConsignee='" + purConsignee + '\'' +
              ", purConsigneeTime=" + purConsigneeTime +
              ", purAllocateNumber='" + purAllocateNumber + '\'' +
              ", purSuborUnit='" + purSuborUnit + '\'' +
              ", purUseType='" + purUseType + '\'' +
              ", purGoodsNo='" + purGoodsNo + '\'' +
              ", purGoodsName='" + purGoodsName + '\'' +
              ", datRecipientId='" + datRecipientId + '\'' +
              ", datRecipientName='" + datRecipientName + '\'' +
              ", datRecipientDate=" + datRecipientDate +
              ", datAuditorId='" + datAuditorId + '\'' +
              ", datAuditorName='" + datAuditorName + '\'' +
              ", datAuditorDate=" + datAuditorDate +
              ", datBillerId='" + datBillerId + '\'' +
              ", datBillerName='" + datBillerName + '\'' +
              ", datBillerDate=" + datBillerDate +
              ", purWarID='" + purWarID + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getPurChaseId() {
      return purChaseId;
   }

   public void setPurChaseId(String purChaseId) {
      this.purChaseId = purChaseId;
   }

   public String getPurStorageId() {
      return purStorageId;
   }

   public void setPurStorageId(String purStorageId) {
      this.purStorageId = purStorageId;
   }

   public String getPurRtoTypeId() {
      return purRtoTypeId;
   }

   public void setPurRtoTypeId(String purRtoTypeId) {
      this.purRtoTypeId = purRtoTypeId;
   }

   public String getPurDeliverName() {
      return purDeliverName;
   }

   public void setPurDeliverName(String purDeliverName) {
      this.purDeliverName = purDeliverName;
   }

   public String getPurContacts() {
      return purContacts;
   }

   public void setPurContacts(String purContacts) {
      this.purContacts = purContacts;
   }

   public String getPurContactsPhone() {
      return purContactsPhone;
   }

   public void setPurContactsPhone(String purContactsPhone) {
      this.purContactsPhone = purContactsPhone;
   }

   public String getPurConsignee() {
      return purConsignee;
   }

   public void setPurConsignee(String purConsignee) {
      this.purConsignee = purConsignee;
   }

   public Date getPurConsigneeTime() {
      return purConsigneeTime;
   }

   public void setPurConsigneeTime(Date purConsigneeTime) {
      this.purConsigneeTime = purConsigneeTime;
   }

   public String getPurAllocateNumber() {
      return purAllocateNumber;
   }

   public void setPurAllocateNumber(String purAllocateNumber) {
      this.purAllocateNumber = purAllocateNumber;
   }

   public String getPurSuborUnit() {
      return purSuborUnit;
   }

   public void setPurSuborUnit(String purSuborUnit) {
      this.purSuborUnit = purSuborUnit;
   }

   public String getPurUseType() {
      return purUseType;
   }

   public void setPurUseType(String purUseType) {
      this.purUseType = purUseType;
   }

   public String getPurGoodsNo() {
      return purGoodsNo;
   }

   public void setPurGoodsNo(String purGoodsNo) {
      this.purGoodsNo = purGoodsNo;
   }

   public String getPurGoodsName() {
      return purGoodsName;
   }

   public void setPurGoodsName(String purGoodsName) {
      this.purGoodsName = purGoodsName;
   }

   public String getDatRecipientId() {
      return datRecipientId;
   }

   public void setDatRecipientId(String datRecipientId) {
      this.datRecipientId = datRecipientId;
   }

   public String getDatRecipientName() {
      return datRecipientName;
   }

   public void setDatRecipientName(String datRecipientName) {
      this.datRecipientName = datRecipientName;
   }

   public Date getDatRecipientDate() {
      return datRecipientDate;
   }

   public void setDatRecipientDate(Date datRecipientDate) {
      this.datRecipientDate = datRecipientDate;
   }

   public String getDatAuditorId() {
      return datAuditorId;
   }

   public void setDatAuditorId(String datAuditorId) {
      this.datAuditorId = datAuditorId;
   }

   public String getDatAuditorName() {
      return datAuditorName;
   }

   public void setDatAuditorName(String datAuditorName) {
      this.datAuditorName = datAuditorName;
   }

   public Date getDatAuditorDate() {
      return datAuditorDate;
   }

   public void setDatAuditorDate(Date datAuditorDate) {
      this.datAuditorDate = datAuditorDate;
   }

   public String getDatBillerId() {
      return datBillerId;
   }

   public void setDatBillerId(String datBillerId) {
      this.datBillerId = datBillerId;
   }

   public String getDatBillerName() {
      return datBillerName;
   }

   public void setDatBillerName(String datBillerName) {
      this.datBillerName = datBillerName;
   }

   public Date getDatBillerDate() {
      return datBillerDate;
   }

   public void setDatBillerDate(Date datBillerDate) {
      this.datBillerDate = datBillerDate;
   }

   public String getPurWarID() {
      return purWarID;
   }

   public void setPurWarID(String purWarID) {
      this.purWarID = purWarID;
   }

   public String getDuo1() {
      return duo1;
   }

   public void setDuo1(String duo1) {
      this.duo1 = duo1;
   }

   public String getDuo2() {
      return duo2;
   }

   public void setDuo2(String duo2) {
      this.duo2 = duo2;
   }

   public String getDuo3() {
      return duo3;
   }

   public void setDuo3(String duo3) {
      this.duo3 = duo3;
   }
}