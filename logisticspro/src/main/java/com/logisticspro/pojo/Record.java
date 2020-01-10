/***********************************************************************
 * Module:  Record.java
 * Author:  Administrator
 * Purpose: Defines the Class Record
 ***********************************************************************/

import java.util.*;

/** @pdOid eee8dedf-72a9-445b-b8cb-b579cca72678 */
public class Record {
   /** 基本档案编号
    * 
    * @pdOid f0c0ac4b-2827-40ea-a597-63569716c56c */
   private java.lang.String recNo;
   /** 基本档案名称
    * 
    * @pdOid 7ba7717c-1443-48a0-9867-94044e3638e1 */
   private java.lang.String recName;
   /** 档案是否分级
    *             
    * 
    * @pdOid 1100ca4b-9041-4379-886a-9bee5eb22fd3 */
   private int recScale = 0;
   /** 备注
    *             
    * 
    * @pdOid 931c896f-28fb-499d-85aa-ccbc35c6f98d */
   private java.lang.String recComment;
   /** 操作人员
    *             
    * 
    * @pdOid 32177b2e-d054-4235-82b8-d3d6bd4cb1f9 */
   private java.lang.String recEmployeeNo;
   /** 操作单位
    *             
    * 
    * @pdOid 110d7326-5171-45c1-9f33-825a1cbd34a4 */
   private java.lang.String recUnitNo;
   /** 操作时间
    *             
    * 
    * @pdOid a241fd58-8a22-435d-8059-95d4dd00b4f0 */
   private java.util.Date recTime;
   /** 状态
    *             
    * 
    * @pdOid 5ea92e72-bfc6-4677-b1e5-08dda57b1d42 */
   private int recStatus = 0;
   /** @pdOid dd26fbee-e29b-430d-ab97-9fe754f0afe6 */
   private java.lang.String duo1;
   /** @pdOid bc00e59f-4f4a-44e3-8168-09f9cc6af201 */
   private java.lang.String duo2;
   /** @pdOid 3d60a0dc-33d6-45f5-97b1-d68889e9930c */
   private java.lang.String duo3;
   
   /** @pdOid f0279302-81ba-4d1f-9fc4-ac20d518c8f4 */
   public java.lang.String getRecNo() {
      return recNo;
   }
   
   /** @param newRecNo
    * @pdOid c11ed170-9ad3-4636-ad6d-d2b0db26f85f */
   public void setRecNo(java.lang.String newRecNo) {
      recNo = newRecNo;
   }
   
   /** @pdOid 8a56fbfb-cf66-47c5-9421-1569b4640452 */
   public java.lang.String getRecName() {
      return recName;
   }
   
   /** @param newRecName
    * @pdOid ea038eeb-391b-4167-a5dc-ec7398f5344b */
   public void setRecName(java.lang.String newRecName) {
      recName = newRecName;
   }
   
   /** @pdOid 84995931-dfdd-411d-9f23-30b03b45c648 */
   public int getRecScale() {
      return recScale;
   }
   
   /** @param newRecScale
    * @pdOid 8d524cba-4b02-4d61-875e-5e24368bb563 */
   public void setRecScale(int newRecScale) {
      recScale = newRecScale;
   }
   
   /** @pdOid 172133dc-dab7-4775-a553-c1e348a2eb12 */
   public java.lang.String getRecComment() {
      return recComment;
   }
   
   /** @param newRecComment
    * @pdOid 673c13b4-a563-41b4-bd82-0a86bc02f932 */
   public void setRecComment(java.lang.String newRecComment) {
      recComment = newRecComment;
   }
   
   /** @pdOid 967f284c-ce2c-4269-bc6d-cf231db50cfc */
   public java.lang.String getRecEmployeeNo() {
      return recEmployeeNo;
   }
   
   /** @param newRecEmployeeNo
    * @pdOid c3b4fa00-50d1-45a2-8573-8e86e6311bd7 */
   public void setRecEmployeeNo(java.lang.String newRecEmployeeNo) {
      recEmployeeNo = newRecEmployeeNo;
   }
   
   /** @pdOid 2621476b-f86b-41ee-a820-58412459c039 */
   public java.lang.String getRecUnitNo() {
      return recUnitNo;
   }
   
   /** @param newRecUnitNo
    * @pdOid 5505190a-8de4-407e-b898-e585f8f01110 */
   public void setRecUnitNo(java.lang.String newRecUnitNo) {
      recUnitNo = newRecUnitNo;
   }
   
   /** @pdOid a6e5a175-78f4-4cf3-8b8f-b0415b50b3b1 */
   public java.util.Date getRecTime() {
      return recTime;
   }
   
   /** @param newRecTime
    * @pdOid 6381df10-b597-40ca-bafd-773f6e24a63d */
   public void setRecTime(java.util.Date newRecTime) {
      recTime = newRecTime;
   }
   
   /** @pdOid 67229a17-45d3-41b9-8774-b2c4e2817cc0 */
   public int getRecStatus() {
      return recStatus;
   }
   
   /** @param newRecStatus
    * @pdOid 92860e4a-88c7-45c3-9815-32b8ff03dd3e */
   public void setRecStatus(int newRecStatus) {
      recStatus = newRecStatus;
   }
   
   /** @pdOid 710c8cbe-f453-4d31-972f-2f398ed7fc5a */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 0cabd77c-87cb-43da-bad5-3f7256c7bd3b */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 8e271e48-3604-4547-9f82-7710ccad9b7a */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 9ab9305c-182e-45ee-bdbb-6a6c9ede6e68 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid c0c7808c-d90c-477a-b5c4-de46b668e033 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid fd4734a4-1811-4f3f-a578-9d77cdaa0ffe */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}