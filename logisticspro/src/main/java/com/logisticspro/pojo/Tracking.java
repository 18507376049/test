/***********************************************************************
 * Module:  Tracking.java
 * Author:  Administrator
 * Purpose: Defines the Class Tracking
 ***********************************************************************/

import java.util.*;

/** @pdOid 4a191344-7dd0-4b3d-82b3-0bac580b896d */
public class Tracking {
   /** 跟踪编号
    *             
    * 
    * @pdOid 3561a05a-69ff-4733-9d33-96cc475b8f74 */
   private java.lang.String traNo;
   /** 线路类型
    *             
    * 
    * @pdOid a0cb7055-2900-4b69-a2a7-c01af7a9b6b9 */
   private java.lang.String traLineType;
   /** 线路名称
    *             
    * 
    * @pdOid cb5242fe-c9cd-4091-9240-bc6bcf9e07f8 */
   private java.lang.String traLineName;
   /** 线路ID
    *             
    * 
    * @pdOid 0ffea229-940f-4d6f-9be1-b1ab5a5d0acf */
   private java.lang.String traRouNo;
   /** 物流状态
    *             
    * 
    * @pdOid edfb2b07-5080-4716-8919-aaf6db0eda1a */
   private int traStatus = 0;
   /** 物流单号
    *             
    * 
    * @pdOid 06645558-705c-4615-a14b-0aec52238199 */
   private java.lang.String traLogNo;
   /** @pdOid fb006a5a-7cab-4dbb-bfed-b178125afc86 */
   private java.lang.String duo1;
   /** @pdOid f83525c3-6f71-457c-b8f7-c351a74dfff9 */
   private java.lang.String duo2;
   /** @pdOid 51cb5663-a3bb-4908-8790-072b6422210b */
   private java.lang.String duo3;
   
   /** @pdOid 15ac6814-da20-4443-863e-c5f93562e61f */
   public java.lang.String getTraNo() {
      return traNo;
   }
   
   /** @param newTraNo
    * @pdOid 1108da3f-9e76-4a5b-a746-9aadaa621c51 */
   public void setTraNo(java.lang.String newTraNo) {
      traNo = newTraNo;
   }
   
   /** @pdOid ef13e62f-4b5b-44cf-b729-16ec0768c21e */
   public java.lang.String getTraLineType() {
      return traLineType;
   }
   
   /** @param newTraLineType
    * @pdOid 656b2e89-da83-4d7d-a83b-6a9c2ad0731d */
   public void setTraLineType(java.lang.String newTraLineType) {
      traLineType = newTraLineType;
   }
   
   /** @pdOid 28452629-f4e0-4d79-aba6-5bead112b253 */
   public java.lang.String getTraLineName() {
      return traLineName;
   }
   
   /** @param newTraLineName
    * @pdOid da95e430-2d73-4ece-91df-aa0c4bd42e6f */
   public void setTraLineName(java.lang.String newTraLineName) {
      traLineName = newTraLineName;
   }
   
   /** @pdOid e0afc245-0d35-42d7-8328-d66799c7cc3f */
   public java.lang.String getTraRouNo() {
      return traRouNo;
   }
   
   /** @param newTraRouNo
    * @pdOid d04b08cc-7709-4018-8225-3b44aeb86adf */
   public void setTraRouNo(java.lang.String newTraRouNo) {
      traRouNo = newTraRouNo;
   }
   
   /** @pdOid f32a3ee5-f360-4665-811b-ca82140cecfc */
   public int getTraStatus() {
      return traStatus;
   }
   
   /** @param newTraStatus
    * @pdOid 48e3c6bb-9712-4cf1-9e7d-e8bcd74b3733 */
   public void setTraStatus(int newTraStatus) {
      traStatus = newTraStatus;
   }
   
   /** @pdOid addaee0e-287f-4880-882d-5141a3a3662e */
   public java.lang.String getTraLogNo() {
      return traLogNo;
   }
   
   /** @param newTraLogNo
    * @pdOid 5280e480-ac06-4b4f-8778-24ef40c4fb2b */
   public void setTraLogNo(java.lang.String newTraLogNo) {
      traLogNo = newTraLogNo;
   }
   
   /** @pdOid e099d7a9-48ea-4393-9196-85e1c3333657 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid dc7dac9e-4142-4a93-9265-1804bffed245 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 75a80a1c-6857-45cb-a3a0-f55c6940459b */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 8ad86f75-0564-47f9-9d4b-1cbd144795e3 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 5b9d83a5-eb39-4330-ad69-ce553808d800 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 67ae37c2-b83a-4694-ae24-b3e6dd7d70cd */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}