/***********************************************************************
 * Module:  ProArea.java
 * Author:  Administrator
 * Purpose: Defines the Class ProArea
 ***********************************************************************/

import java.util.*;

/** @pdOid 0cd42fa5-5ff1-4ba5-9e69-44c536ac6a47 */
public class ProArea {
   /** 编号
    *             
    * 
    * @pdOid ae5790ac-fcc7-4780-8966-011fe00a7249 */
   private int proId;
   /** 名称
    *             
    * 
    * @pdOid 1688b44e-73d8-4b35-a535-c9aa0797bc76 */
   private java.lang.String proName;
   /** 全称
    *             
    * 
    * @pdOid ee8ff3e5-3caa-436e-9aad-75c1bacd916b */
   private java.lang.String proMergerName;
   /** 层级 0 1 2 省市区县
    *             
    * 
    * @pdOid 9357b272-f72d-444e-9ff4-ab7e510800ed */
   private int proLevel;
   /** 长途区号
    *             
    * 
    * @pdOid 5683a481-5c10-4c9d-bf54-5dc5999d2699 */
   private java.lang.String proCode;
   /** 邮编
    *             
    * 
    * @pdOid d483d272-365c-439a-8b46-a1d95353aa96 */
   private java.lang.String proZipCode;
   /** 首字母
    *             
    * 
    * @pdOid e1f0e603-3555-459a-979d-be081888389e */
   private java.lang.String proFirst;
   /** 经度
    *             
    * 
    * @pdOid 9fe66085-58f3-4f5a-ba3f-2a9463156ebb */
   private java.lang.String proLng;
   /** 纬度
    *             
    * 
    * @pdOid 34ee0803-fdf3-43bc-8c22-27e36e7c6cf7 */
   private java.lang.String proLat;
   /** 简称
    *             
    * 
    * @pdOid 02269e34-828d-42ce-84c2-75e644dc57bd */
   private java.lang.String proShortName;
   /** 父id
    *             
    * 
    * @pdOid 47a27113-80ba-498b-9678-2ce164aa506d */
   private int proParenetNo;
   /** 描述
    *             
    * 
    * @pdOid cbe857ae-a30b-4412-9ada-8d6d9d6adde2 */
   private java.lang.String proDescription;
   /** 拼音
    *             
    * 
    * @pdOid e8c96e3c-2cb7-4543-b71b-7388978ef5c3 */
   private java.lang.String proPinyin;
   
   /** @pdOid 72018abc-9022-4777-b339-63dfadf13a90 */
   public int getProId() {
      return proId;
   }
   
   /** @param newProId
    * @pdOid fde9655f-e184-46b9-a2c1-8d6c1fce183a */
   public void setProId(int newProId) {
      proId = newProId;
   }
   
   /** @pdOid fe527643-ecec-4805-b3a9-a3f2bf06bef4 */
   public java.lang.String getProName() {
      return proName;
   }
   
   /** @param newProName
    * @pdOid 35dd36be-e5c6-4f80-ad47-45fd39055bc9 */
   public void setProName(java.lang.String newProName) {
      proName = newProName;
   }
   
   /** @pdOid 432ee3fc-5cbf-4862-87f6-034895228843 */
   public java.lang.String getProMergerName() {
      return proMergerName;
   }
   
   /** @param newProMergerName
    * @pdOid 63ee023f-2b4e-46a2-b391-226a16a32b1d */
   public void setProMergerName(java.lang.String newProMergerName) {
      proMergerName = newProMergerName;
   }
   
   /** @pdOid 8071b98c-541f-4710-9eba-139631d1c789 */
   public int getProLevel() {
      return proLevel;
   }
   
   /** @param newProLevel
    * @pdOid 768d896a-80c6-4910-a9ee-bee16101f020 */
   public void setProLevel(int newProLevel) {
      proLevel = newProLevel;
   }
   
   /** @pdOid 68295ad3-d251-4b6e-95d4-b248f00ab866 */
   public java.lang.String getProCode() {
      return proCode;
   }
   
   /** @param newProCode
    * @pdOid 1a63f1c2-764b-4d7d-a3b2-6ae5445d5abb */
   public void setProCode(java.lang.String newProCode) {
      proCode = newProCode;
   }
   
   /** @pdOid ea32403e-b264-4e24-b1e1-a3dbc578a18f */
   public java.lang.String getProZipCode() {
      return proZipCode;
   }
   
   /** @param newProZipCode
    * @pdOid 854f6f9d-0fd7-481f-9a7e-6c3ce284d2c8 */
   public void setProZipCode(java.lang.String newProZipCode) {
      proZipCode = newProZipCode;
   }
   
   /** @pdOid cb406b34-da36-4b9f-a1ad-54395ffd88b9 */
   public java.lang.String getProFirst() {
      return proFirst;
   }
   
   /** @param newProFirst
    * @pdOid 7923344b-837b-484d-a12f-7005ac84d08f */
   public void setProFirst(java.lang.String newProFirst) {
      proFirst = newProFirst;
   }
   
   /** @pdOid 530efbac-40b5-47bc-a9ff-7fa468da8cb1 */
   public java.lang.String getProLng() {
      return proLng;
   }
   
   /** @param newProLng
    * @pdOid 6f9652cc-b3a0-4d3d-a7be-a3afb509b7cb */
   public void setProLng(java.lang.String newProLng) {
      proLng = newProLng;
   }
   
   /** @pdOid 008d0fbf-fbfc-477c-9b92-2203b2d5f9bf */
   public java.lang.String getProLat() {
      return proLat;
   }
   
   /** @param newProLat
    * @pdOid 1eb3cec6-9177-43f4-846c-98f4adb29022 */
   public void setProLat(java.lang.String newProLat) {
      proLat = newProLat;
   }
   
   /** @pdOid bcb134d1-9991-4e3c-8b45-55318752b1f1 */
   public java.lang.String getProShortName() {
      return proShortName;
   }
   
   /** @param newProShortName
    * @pdOid 285d3ba5-a587-45ad-aa0e-b4d4a0789816 */
   public void setProShortName(java.lang.String newProShortName) {
      proShortName = newProShortName;
   }
   
   /** @pdOid ae04b4a8-0929-4490-98f2-c83242df1494 */
   public int getProParenetNo() {
      return proParenetNo;
   }
   
   /** @param newProParenetNo
    * @pdOid 7aafe523-52f4-4990-9f94-1bdaf8ec532b */
   public void setProParenetNo(int newProParenetNo) {
      proParenetNo = newProParenetNo;
   }
   
   /** @pdOid a01c514f-2b24-417d-97a5-d7be3ff1e71f */
   public java.lang.String getProDescription() {
      return proDescription;
   }
   
   /** @param newProDescription
    * @pdOid 3dc52aa1-4543-46b9-a5d6-5f2f19ec5dea */
   public void setProDescription(java.lang.String newProDescription) {
      proDescription = newProDescription;
   }
   
   /** @pdOid e568d0c0-2576-464d-b17c-a9cfea96f234 */
   public java.lang.String getProPinyin() {
      return proPinyin;
   }
   
   /** @param newProPinyin
    * @pdOid 07e7789c-5afc-4c70-987e-63704b85b4de */
   public void setProPinyin(java.lang.String newProPinyin) {
      proPinyin = newProPinyin;
   }

}