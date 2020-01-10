/***********************************************************************
 * Module:  Pick.java
 * Author:  Administrator
 * Purpose: Defines the Class Pick
 ***********************************************************************/

import java.util.*;

/** @pdOid 5270488d-9740-4f62-b24e-25dac8ce64ef */
public class Pick {
   /** 收派标准编号
    *             
    * 
    * @pdOid e8be37c0-44dc-43d4-a3cd-5653413e4833 */
   private java.lang.String picNo;
   /** 收派标准名称
    *             
    * 
    * @pdOid 96824216-63f9-4a19-8e9f-b3fa4fc82847 */
   private java.lang.String picName;
   /** 最小重量
    *             
    * 
    * @pdOid 5cbf93fd-696d-4c6d-8629-a954777ca2b3 */
   private double picMinWe;
   /** 最大重量
    *             
    * 
    * @pdOid 53adb56d-b9a2-45b7-b97a-53f31438b4f6 */
   private double picMaxWe;
   /** 最小长度
    *             
    * 
    * @pdOid 696e5234-5269-4e84-84ce-31d696a72558 */
   private int picMinLe;
   /** 最大长度
    *             
    * 
    * @pdOid 8ac1b50d-9ec5-40e3-bcc3-07b81d53f483 */
   private int picMaxLe;
   /** 费用
    *             
    * 
    * @pdOid fd2451de-7bff-4661-ba93-474a6b58e435 */
   private double picPrice;
   /** 作废标志
    *             
    * 
    * @pdOid 350d31a3-bdda-4494-8d5f-3c886d0f7f0d */
   private int picSign = 0;
   /** 派送人员
    *             
    * 
    * @pdOid 775b7bb7-ff28-4872-9770-699aab4b22d7 */
   private java.lang.String picEmployeeNo;
   /** 操作单位
    *             
    * 
    * @pdOid 945313fc-2ec7-4df1-8813-58c1a262115d */
   private java.lang.String picUnitNo;
   /** 操作时间
    *             
    * 
    * @pdOid c6dd12d3-4952-46ea-ab7a-d069ff5a1a47 */
   private java.util.Date picTime;
   /** 开单人
    *             
    * 
    * @pdOid 6f04f744-a7d5-402c-8683-b6eb8923f730 */
   private java.lang.String picKaiEmploNo;
   /** @pdOid 9f5c2427-5900-491c-b1a6-0caccd8daad3 */
   private java.lang.String duo1;
   /** @pdOid 226a2a6f-2417-4c18-82e2-fed5f4f3c007 */
   private java.lang.String duo2;
   /** @pdOid 00aad53c-0e5a-4f0a-8351-181aef3a4e94 */
   private java.lang.String duo3;
   
   /** @pdOid b83eb41a-5d0c-4c95-a4d2-a94362842864 */
   public java.lang.String getPicNo() {
      return picNo;
   }
   
   /** @param newPicNo
    * @pdOid d4bcec32-64f4-47a9-bb31-ae15f12b4b57 */
   public void setPicNo(java.lang.String newPicNo) {
      picNo = newPicNo;
   }
   
   /** @pdOid 2a7dc72f-0056-4f44-9a1a-16884e14665e */
   public java.lang.String getPicName() {
      return picName;
   }
   
   /** @param newPicName
    * @pdOid 6b96624a-d0d9-4b7f-bd88-0dcfca19164f */
   public void setPicName(java.lang.String newPicName) {
      picName = newPicName;
   }
   
   /** @pdOid 1945c46f-d10a-4760-a46a-03043d8be5b9 */
   public double getPicMinWe() {
      return picMinWe;
   }
   
   /** @param newPicMinWe
    * @pdOid d36d72cf-037a-4ba7-af88-3ef1c864b516 */
   public void setPicMinWe(double newPicMinWe) {
      picMinWe = newPicMinWe;
   }
   
   /** @pdOid 252c363c-e5dd-4cac-9798-bd9fafb01c04 */
   public double getPicMaxWe() {
      return picMaxWe;
   }
   
   /** @param newPicMaxWe
    * @pdOid fb415f35-f1d1-44f3-a8bc-c6d79adb70d7 */
   public void setPicMaxWe(double newPicMaxWe) {
      picMaxWe = newPicMaxWe;
   }
   
   /** @pdOid 240e168a-8d61-4b79-8ebb-3c376e73657e */
   public int getPicMinLe() {
      return picMinLe;
   }
   
   /** @param newPicMinLe
    * @pdOid 64aa08df-43ba-48eb-9539-34d34e1f7eef */
   public void setPicMinLe(int newPicMinLe) {
      picMinLe = newPicMinLe;
   }
   
   /** @pdOid f2d94c38-08ec-4a8b-a95f-511aa653061d */
   public int getPicMaxLe() {
      return picMaxLe;
   }
   
   /** @param newPicMaxLe
    * @pdOid 869b07a8-3e91-4aeb-af1f-3ab9f25ee268 */
   public void setPicMaxLe(int newPicMaxLe) {
      picMaxLe = newPicMaxLe;
   }
   
   /** @pdOid df215128-89ad-4f75-8bb0-0ec475e18a17 */
   public double getPicPrice() {
      return picPrice;
   }
   
   /** @param newPicPrice
    * @pdOid c2dcda06-f19c-421f-a34a-1508a457c11c */
   public void setPicPrice(double newPicPrice) {
      picPrice = newPicPrice;
   }
   
   /** @pdOid c8ea9009-50b0-46c1-821d-5b26519b51cc */
   public int getPicSign() {
      return picSign;
   }
   
   /** @param newPicSign
    * @pdOid 253225c5-322c-4f1c-bf41-99824b0570e9 */
   public void setPicSign(int newPicSign) {
      picSign = newPicSign;
   }
   
   /** @pdOid e4a0f5ac-7055-4853-920f-4b2d236ce39e */
   public java.lang.String getPicEmployeeNo() {
      return picEmployeeNo;
   }
   
   /** @param newPicEmployeeNo
    * @pdOid b3a4b66f-d1e5-4e13-88a4-4c2bfb0a257e */
   public void setPicEmployeeNo(java.lang.String newPicEmployeeNo) {
      picEmployeeNo = newPicEmployeeNo;
   }
   
   /** @pdOid 51d71962-2132-4dff-9db5-d67d83811c32 */
   public java.lang.String getPicUnitNo() {
      return picUnitNo;
   }
   
   /** @param newPicUnitNo
    * @pdOid 47efe66b-77ff-4ef3-be31-a19a46117f29 */
   public void setPicUnitNo(java.lang.String newPicUnitNo) {
      picUnitNo = newPicUnitNo;
   }
   
   /** @pdOid 29bc3a99-d864-433e-a772-bee0b1a268c8 */
   public java.util.Date getPicTime() {
      return picTime;
   }
   
   /** @param newPicTime
    * @pdOid ce38cc35-4a78-42d2-9dc3-2b301ebc9a72 */
   public void setPicTime(java.util.Date newPicTime) {
      picTime = newPicTime;
   }
   
   /** @pdOid 2c882348-3b07-4d6a-abc1-7d9200ed3b94 */
   public java.lang.String getPicKaiEmploNo() {
      return picKaiEmploNo;
   }
   
   /** @param newPicKaiEmploNo
    * @pdOid 63310b5e-6ed0-42fa-b0c0-0737f5c4adcc */
   public void setPicKaiEmploNo(java.lang.String newPicKaiEmploNo) {
      picKaiEmploNo = newPicKaiEmploNo;
   }
   
   /** @pdOid 7853458c-c959-43e5-80b7-3f392dd758c4 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 4edfc097-035a-4a22-9fd6-0684e31c384d */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 61637c97-db47-4f72-9a0f-5b0d44cbfcc7 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 0f66ed2a-556e-4d3d-b2bc-7dfd1ed33f27 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 80a8260a-39d9-4c86-aa41-eca75de3a9de */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 906016d4-aa10-4be2-ac02-af6fcaae73f0 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}