/***********************************************************************
 * Module:  Standard.java
 * Author:  Administrator
 * Purpose: Defines the Class Standard
 ***********************************************************************/

import java.util.*;

/** @pdOid 91394489-1d2f-42d9-b427-422b3b96625a */
public class Standard {
   /** 收派时间编号
    *             
    * 
    * @pdOid d6f2e714-1e47-4e3f-9796-9ae1c14d02f2 */
   private java.lang.String staId;
   /** 收派时间名称
    *             
    * 
    * @pdOid 4fcba0f9-208d-46d8-b0ad-fe56c0a15176 */
   private java.lang.String staName;
   /** 平时上班时间
    *             
    * 
    * @pdOid 9fb0f547-df9f-46ae-91a6-ba7356278dbb */
   private java.util.Date staUpPeacetime;
   /** 平时下班时间
    *             
    * 
    * @pdOid 59b8b717-70dc-4a7b-be99-a8dd91476ebe */
   private java.util.Date staDownPeacetime;
   /** 周六上班时间
    *             周六上班时间
    *             
    * 
    * @pdOid 301e8f38-19f0-49ab-b86d-f48b3a2610aa */
   private java.util.Date staUpSaturday;
   /** 周六下班时间
    *             
    * 
    * @pdOid 0328ca8d-792c-4480-b18d-548ee72a9635 */
   private java.util.Date staDownSaturday;
   /** 周日上班时间
    *             
    * 
    * @pdOid 1fac4599-b764-4443-8d13-4f38b94002e2 */
   private java.util.Date staUpSunday;
   /** 周日下班时间
    *             
    * 
    * @pdOid e875769e-8cb1-4000-b9f2-b0d1c78da071 */
   private java.util.Date staDownSunday;
   /** 状态
    *             
    * 
    * @pdOid 6aa30e37-020f-4276-8735-25faafc65627 */
   private int staState;
   /** 所属单位
    *             
    * 
    * @pdOid 79434e25-37cb-4767-a128-bb3b4ca62b6f */
   private java.lang.String staUnit;
   /** 更新员工号
    *             
    * 
    * @pdOid 75e9e1de-bda3-4101-9fd1-43cf89c5d78a */
   private java.lang.String staStaff;
   /** 更新人姓名
    *             
    * 
    * @pdOid 2dc87aea-fe9a-4945-8810-81fd21e490f1 */
   private java.lang.String staPeopleName;
   /** 更新单位
    * 
    * @pdOid ca1bdf45-35bd-465d-bb78-de709ea2659f */
   private java.lang.String staNewTimeUnit;
   /** 跟新时间
    * 
    * @pdOid 9d8e082b-aa0f-4d78-b9cd-61731f1dd365 */
   private java.util.Date staNewTime;
   /** @pdOid af180bf4-1527-45ca-a2a4-0393a41e000b */
   private duo1           varchar(32) duo1;
   /** @pdOid 415ed628-157b-4684-9905-6f4e6200e7a1 */
   private java.lang.String duo2;
   
   /** @pdOid af938333-9f7f-45f3-b32c-224c4f5d75b9 */
   public java.lang.String getStaId() {
      return staId;
   }
   
   /** @param newStaId
    * @pdOid 6241d1ad-2bb6-4e8a-8502-2c4a7af5a876 */
   public void setStaId(java.lang.String newStaId) {
      staId = newStaId;
   }
   
   /** @pdOid 8bb1d0cf-3f09-449f-945e-3ae0c2b0ea46 */
   public java.lang.String getStaName() {
      return staName;
   }
   
   /** @param newStaName
    * @pdOid 17aa1ec1-fb09-44e0-945c-5d649fa0d6d7 */
   public void setStaName(java.lang.String newStaName) {
      staName = newStaName;
   }
   
   /** @pdOid 61ca1d9c-21e4-42c0-a572-ed4564fa7cab */
   public java.util.Date getStaUpPeacetime() {
      return staUpPeacetime;
   }
   
   /** @param newStaUpPeacetime
    * @pdOid 56857a84-25b3-48c7-b468-833f94c52b27 */
   public void setStaUpPeacetime(java.util.Date newStaUpPeacetime) {
      staUpPeacetime = newStaUpPeacetime;
   }
   
   /** @pdOid 87f052e2-d881-4efb-bbfb-2026051942ac */
   public java.util.Date getStaDownPeacetime() {
      return staDownPeacetime;
   }
   
   /** @param newStaDownPeacetime
    * @pdOid 98a4b89a-d9c5-467e-9c2d-5d903295a91a */
   public void setStaDownPeacetime(java.util.Date newStaDownPeacetime) {
      staDownPeacetime = newStaDownPeacetime;
   }
   
   /** @pdOid 422b1745-fb26-415e-9781-d248e4f713b3 */
   public java.util.Date getStaUpSaturday() {
      return staUpSaturday;
   }
   
   /** @param newStaUpSaturday
    * @pdOid df9aee80-7ad4-4dac-a531-8263cec3cce0 */
   public void setStaUpSaturday(java.util.Date newStaUpSaturday) {
      staUpSaturday = newStaUpSaturday;
   }
   
   /** @pdOid a90249aa-646e-4c8b-8d72-05af2f49faaf */
   public java.util.Date getStaDownSaturday() {
      return staDownSaturday;
   }
   
   /** @param newStaDownSaturday
    * @pdOid 6a2fa070-8f81-490b-9f18-a14f0d82784f */
   public void setStaDownSaturday(java.util.Date newStaDownSaturday) {
      staDownSaturday = newStaDownSaturday;
   }
   
   /** @pdOid da455933-2be5-413c-af67-99680a9329a2 */
   public java.util.Date getStaUpSunday() {
      return staUpSunday;
   }
   
   /** @param newStaUpSunday
    * @pdOid 7ed195ee-9253-4714-a902-0cfb2fded94a */
   public void setStaUpSunday(java.util.Date newStaUpSunday) {
      staUpSunday = newStaUpSunday;
   }
   
   /** @pdOid 7c0cf93f-eab7-4ca7-94fa-01532f814b21 */
   public java.util.Date getStaDownSunday() {
      return staDownSunday;
   }
   
   /** @param newStaDownSunday
    * @pdOid 4b7e4a01-6984-4b72-9c65-0cada10dda72 */
   public void setStaDownSunday(java.util.Date newStaDownSunday) {
      staDownSunday = newStaDownSunday;
   }
   
   /** @pdOid 52690b2b-be12-4ad7-98dc-f6dfcae91e8c */
   public int getStaState() {
      return staState;
   }
   
   /** @param newStaState
    * @pdOid 1ffa05b6-ad3a-49bd-bb53-cbb2be892b7a */
   public void setStaState(int newStaState) {
      staState = newStaState;
   }
   
   /** @pdOid 5acce44b-8328-4e71-be4a-85125289c8a7 */
   public java.lang.String getStaUnit() {
      return staUnit;
   }
   
   /** @param newStaUnit
    * @pdOid 1b3d67bd-d153-482c-b5a3-d15e8c111a7f */
   public void setStaUnit(java.lang.String newStaUnit) {
      staUnit = newStaUnit;
   }
   
   /** @pdOid b1030c72-6ac4-45c0-b560-477de29b746c */
   public java.lang.String getStaStaff() {
      return staStaff;
   }
   
   /** @param newStaStaff
    * @pdOid 86b8766f-66cc-4d02-a146-be08f9020ecf */
   public void setStaStaff(java.lang.String newStaStaff) {
      staStaff = newStaStaff;
   }
   
   /** @pdOid c3efc5f3-ed32-4d5f-9b01-f1927f7bb289 */
   public java.lang.String getStaPeopleName() {
      return staPeopleName;
   }
   
   /** @param newStaPeopleName
    * @pdOid bc55de5f-d2d3-495d-9129-8c75bd17cc71 */
   public void setStaPeopleName(java.lang.String newStaPeopleName) {
      staPeopleName = newStaPeopleName;
   }
   
   /** @pdOid bd011cc3-907d-42bb-bdcc-3ca65ad62297 */
   public java.lang.String getStaNewTimeUnit() {
      return staNewTimeUnit;
   }
   
   /** @param newStaNewTimeUnit
    * @pdOid 1be96fb0-78d0-408e-ae5b-84e07ab1dbbe */
   public void setStaNewTimeUnit(java.lang.String newStaNewTimeUnit) {
      staNewTimeUnit = newStaNewTimeUnit;
   }
   
   /** @pdOid fcd5d69b-87d9-4c72-b336-d7bdb31d0250 */
   public java.util.Date getStaNewTime() {
      return staNewTime;
   }
   
   /** @param newStaNewTime
    * @pdOid a20d0600-46d7-47e5-a5ff-7b37a6229610 */
   public void setStaNewTime(java.util.Date newStaNewTime) {
      staNewTime = newStaNewTime;
   }
   
   /** @pdOid 45627d2d-b25d-4987-88e2-c67a4d504826 */
   public duo1           varchar(32) getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid b256a2f5-73f0-49dc-b430-55463cc636ca */
   public void setDuo1(duo1           varchar(32) newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid d01a54c1-39cc-4d07-a8bb-f94ab1bae0b9 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid ece13d8e-376a-4939-aad5-117d524301c0 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}