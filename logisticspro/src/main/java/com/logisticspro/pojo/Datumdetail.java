/***********************************************************************
 * Module:  Datumdetail.java
 * Author:  Administrator
 * Purpose: Defines the Class Datumdetail
 ***********************************************************************/

import java.util.*;

/** @pdOid cf9aa525-e273-4b6c-b41e-159c9880eec2 */
public class Datumdetail {
   /** 材料进销明细编号
    *             
    * 
    * @pdOid 9e175156-47a1-4540-8510-f8992b3a6c07 */
   private java.lang.String datDetailId;
   /** 入库单号
    *             
    * 
    * @pdOid 38623487-d311-42cf-9025-aa06a2140873 */
   private java.lang.String datStorage;
   /** 出库单号
    *             
    * 
    * @pdOid c5d312f4-78a6-48d6-8ce5-296a3b6b148a */
   private java.lang.String datOutStorage;
   /** 货物编号
    *             
    * 
    * @pdOid 8074a28c-0cf8-470f-af02-c1fd65e631a1 */
   private java.lang.String purGoodsNo;
   /** 货物名称
    *             
    * 
    * @pdOid dda38b83-306c-43c2-96dc-9c3583018ad6 */
   private java.lang.String purGoodsName;
   /** 入库数量
    *             
    * 
    * @pdOid ee39bd42-bc4f-471c-9878-5771a36f78a7 */
   private int purStorageNumber;
   /** 出库数量
    *             
    * 
    * @pdOid 8d135cfb-8e03-4b66-8285-4330c30778f3 */
   private int purStoraOutNumber;
   /** 实际数量
    *             
    * 
    * @pdOid a5260da2-858a-4b21-864d-f1630339b272 */
   private int purNumber;
   /** 状态
    *             
    * 
    * @pdOid 3f6e8597-a11a-44c6-b2aa-76e178572b12 */
   private int purStatus = 0;
   /** 经办人单位
    *             
    * 
    * @pdOid ed80f677-802e-4a38-9316-1ad2a32290b9 */
   private java.lang.String datOperator;
   /** 经办人工号
    *             
    * 
    * @pdOid 9f3f05d7-7154-4ef2-bda3-183cb2899b5b */
   private java.lang.String datOperatorId;
   /** 经办人姓名
    *             
    * 
    * @pdOid eb5dc20a-b05d-4f81-854b-e1692df5ef79 */
   private java.lang.String datOperatorName;
   /** 材料进销编号
    *             
    * 
    * @pdOid fbc8c07b-e58d-44f6-b4e0-701812320970 */
   private java.lang.String datPurChaseId;
   /** @pdOid ecef0d95-1626-4a14-972a-144a23377aca */
   private java.lang.String duo1;
   /** @pdOid c1d2f39c-f65f-4fd6-96c3-e2be535965df */
   private java.lang.String duo2;
   /** @pdOid 0ae9c190-3559-4e52-be58-667cd590b840 */
   private java.lang.String duo3;
   
   /** @pdOid 0a369858-19de-43e2-85aa-a8a254ba281c */
   public java.lang.String getDatDetailId() {
      return datDetailId;
   }
   
   /** @param newDatDetailId
    * @pdOid 2e0d5dca-832f-4b7a-8cd3-248aaf844f99 */
   public void setDatDetailId(java.lang.String newDatDetailId) {
      datDetailId = newDatDetailId;
   }
   
   /** @pdOid 8f113af6-ca3c-482d-ad3f-017733b9dc9e */
   public java.lang.String getDatStorage() {
      return datStorage;
   }
   
   /** @param newDatStorage
    * @pdOid e5b918f7-374b-4f7c-a580-84df203e3888 */
   public void setDatStorage(java.lang.String newDatStorage) {
      datStorage = newDatStorage;
   }
   
   /** @pdOid 5d392982-18e1-41a4-b51a-b47a4d398574 */
   public java.lang.String getDatOutStorage() {
      return datOutStorage;
   }
   
   /** @param newDatOutStorage
    * @pdOid 691891c1-a8d2-4d79-a181-2ec39d6196bf */
   public void setDatOutStorage(java.lang.String newDatOutStorage) {
      datOutStorage = newDatOutStorage;
   }
   
   /** @pdOid fd2a989a-00bc-4c27-a540-e479dd35a798 */
   public java.lang.String getPurGoodsNo() {
      return purGoodsNo;
   }
   
   /** @param newPurGoodsNo
    * @pdOid a28af3f4-bb45-4922-ad44-baa5bd59624e */
   public void setPurGoodsNo(java.lang.String newPurGoodsNo) {
      purGoodsNo = newPurGoodsNo;
   }
   
   /** @pdOid f25e6f51-313b-4772-a49f-ff6d3717b747 */
   public java.lang.String getPurGoodsName() {
      return purGoodsName;
   }
   
   /** @param newPurGoodsName
    * @pdOid 2aa0b34c-9b85-49e2-a64e-79461952fb09 */
   public void setPurGoodsName(java.lang.String newPurGoodsName) {
      purGoodsName = newPurGoodsName;
   }
   
   /** @pdOid bb9ddb76-51de-4a12-be73-cb1c443f2574 */
   public int getPurStorageNumber() {
      return purStorageNumber;
   }
   
   /** @param newPurStorageNumber
    * @pdOid de95e6b6-60fa-4ab6-bbef-4a1dfee048c5 */
   public void setPurStorageNumber(int newPurStorageNumber) {
      purStorageNumber = newPurStorageNumber;
   }
   
   /** @pdOid 7fcb6678-d602-4d31-8ff4-21da702d0e5b */
   public int getPurStoraOutNumber() {
      return purStoraOutNumber;
   }
   
   /** @param newPurStoraOutNumber
    * @pdOid 6cb76e6b-2d72-4e6d-b7bb-e26259e995e3 */
   public void setPurStoraOutNumber(int newPurStoraOutNumber) {
      purStoraOutNumber = newPurStoraOutNumber;
   }
   
   /** @pdOid fde4057a-fc53-42a2-83aa-4f92eda386de */
   public int getPurNumber() {
      return purNumber;
   }
   
   /** @param newPurNumber
    * @pdOid d760cb77-d3db-4ccf-a6f7-d8fdc8922d64 */
   public void setPurNumber(int newPurNumber) {
      purNumber = newPurNumber;
   }
   
   /** @pdOid 56a9a99b-9f9b-4af1-a878-1f40ed8cadbc */
   public int getPurStatus() {
      return purStatus;
   }
   
   /** @param newPurStatus
    * @pdOid 1b78fc17-8048-4604-a5c9-b1fb04454582 */
   public void setPurStatus(int newPurStatus) {
      purStatus = newPurStatus;
   }
   
   /** @pdOid 8c5ca7d4-61a2-4281-a41e-381b79cfa551 */
   public java.lang.String getDatOperator() {
      return datOperator;
   }
   
   /** @param newDatOperator
    * @pdOid a2c32c96-ffa9-42b2-8cc8-1a48f468683c */
   public void setDatOperator(java.lang.String newDatOperator) {
      datOperator = newDatOperator;
   }
   
   /** @pdOid 1ab16010-8863-43ba-85d3-c94dff604daa */
   public java.lang.String getDatOperatorId() {
      return datOperatorId;
   }
   
   /** @param newDatOperatorId
    * @pdOid ba64a96a-dfb5-4612-b8a8-697dd2193951 */
   public void setDatOperatorId(java.lang.String newDatOperatorId) {
      datOperatorId = newDatOperatorId;
   }
   
   /** @pdOid f32266cd-2c7f-41e2-ae61-186621b8c844 */
   public java.lang.String getDatOperatorName() {
      return datOperatorName;
   }
   
   /** @param newDatOperatorName
    * @pdOid 470bbc90-15e5-47a1-92e9-89e8677c3d98 */
   public void setDatOperatorName(java.lang.String newDatOperatorName) {
      datOperatorName = newDatOperatorName;
   }
   
   /** @pdOid 5084381c-4d88-4692-a133-52b5ea672c24 */
   public java.lang.String getDatPurChaseId() {
      return datPurChaseId;
   }
   
   /** @param newDatPurChaseId
    * @pdOid 1a8ddf30-1851-4aca-abd0-67d7f380938c */
   public void setDatPurChaseId(java.lang.String newDatPurChaseId) {
      datPurChaseId = newDatPurChaseId;
   }
   
   /** @pdOid 502005d5-3d8c-4218-ae58-a2bd7bce4cd4 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid fe9eb767-4ad1-41e5-b62a-2cdf0ae8b433 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 1a5a30e0-ec5a-4388-8405-b147eeaefa3a */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 28907bdd-2632-401d-b6ef-d137c0240ac1 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 0842da83-9dd7-4e3d-b2b0-a9dee9d5ce71 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid cdeba8cf-83b7-4b79-97ba-d0de468f167e */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}