/***********************************************************************
 * Module:  PropagandaTask.java
 * Author:  Administrator
 * Purpose: Defines the Class PropagandaTask
 ***********************************************************************/

import java.util.*;

/** @pdOid baefb33b-f9b2-4d23-964c-6d72816aaf14 */
public class PropagandaTask {
   /** 宣传编号
    *             
    * 
    * @pdOid 838ae06b-7607-49ff-b95a-88d1faacc23b */
   private java.lang.String prtNo;
   /** 宣传概要
    *             
    * 
    * @pdOid 82ba20ab-194f-4fbb-bab4-48e820aea7f0 */
   private java.lang.String prtPubliOutline;
   /** 发布时间
    *             
    * 
    * @pdOid a0e6ba03-4ab6-4570-ac2e-83854162b7e1 */
   private java.util.Date prtReleaseDate;
   /** 失效时间
    *             
    * 
    * @pdOid e5b8b851-e0fa-407c-b81c-f10cb3756ca9 */
   private java.util.Date prtExpiryDate;
   /** 更新时间
    *             
    * 
    * @pdOid f7ec3cdc-601b-4328-b91a-30b1f4228510 */
   private java.util.Date prtUpdateDate;
   /** 更新单位
    *             
    * 
    * @pdOid 4e08acb1-8771-4a55-80c5-27b1cf6ca654 */
   private java.lang.String prtUpdateUnit;
   /** 更新人
    *             
    * 
    * @pdOid cdd1c402-8744-4dd7-b7b1-05c4f1f220d3 */
   private java.lang.String prtUpdateEmplNo;
   /** 状态
    *             
    * 
    * @pdOid 03b4ac8d-9e6b-4aef-a092-21e56777c98a */
   private int prtStatus;
   /** 宣传内容
    *             
    * 
    * @pdOid 00b0602e-9772-4c5f-9123-21bcdc6dfe8b */
   private java.lang.String promotionContent;
   /** @pdOid beea6cd4-3913-4dc0-98e1-5600f575ffd4 */
   private java.lang.String dou1;
   /** @pdOid 47a78a22-f72c-4164-adda-9f20b7480b03 */
   private java.lang.String dou2;
   
   /** @pdOid 66419bfa-932f-42aa-a19a-02580964e255 */
   public java.lang.String getPrtNo() {
      return prtNo;
   }
   
   /** @param newPrtNo
    * @pdOid 6ff22448-bccd-4d3d-a81a-6e2658a930b5 */
   public void setPrtNo(java.lang.String newPrtNo) {
      prtNo = newPrtNo;
   }
   
   /** @pdOid fa53cf74-7c84-48c2-8fce-c4d4f677ce60 */
   public java.lang.String getPrtPubliOutline() {
      return prtPubliOutline;
   }
   
   /** @param newPrtPubliOutline
    * @pdOid 3efd8992-656b-4d02-bab2-ec6b599bbd28 */
   public void setPrtPubliOutline(java.lang.String newPrtPubliOutline) {
      prtPubliOutline = newPrtPubliOutline;
   }
   
   /** @pdOid 322c4e7a-fa86-472a-a953-8ceca366629d */
   public java.util.Date getPrtReleaseDate() {
      return prtReleaseDate;
   }
   
   /** @param newPrtReleaseDate
    * @pdOid 430ac0c0-6cce-4989-885c-54a46ab7d314 */
   public void setPrtReleaseDate(java.util.Date newPrtReleaseDate) {
      prtReleaseDate = newPrtReleaseDate;
   }
   
   /** @pdOid 5aed1d7d-b61b-4d0f-8e1b-f601b9974f41 */
   public java.util.Date getPrtExpiryDate() {
      return prtExpiryDate;
   }
   
   /** @param newPrtExpiryDate
    * @pdOid e9d33255-3aad-4455-9447-5195fca157fc */
   public void setPrtExpiryDate(java.util.Date newPrtExpiryDate) {
      prtExpiryDate = newPrtExpiryDate;
   }
   
   /** @pdOid a74a85db-b049-4b09-b675-32e8e7052a38 */
   public java.util.Date getPrtUpdateDate() {
      return prtUpdateDate;
   }
   
   /** @param newPrtUpdateDate
    * @pdOid 5b1e1c0d-3b18-4ffa-895d-96788c6fc1fa */
   public void setPrtUpdateDate(java.util.Date newPrtUpdateDate) {
      prtUpdateDate = newPrtUpdateDate;
   }
   
   /** @pdOid b623d6dd-b512-425c-9947-339c0c7b7e56 */
   public java.lang.String getPrtUpdateUnit() {
      return prtUpdateUnit;
   }
   
   /** @param newPrtUpdateUnit
    * @pdOid e328bb95-6447-48dd-b302-30f43865bd76 */
   public void setPrtUpdateUnit(java.lang.String newPrtUpdateUnit) {
      prtUpdateUnit = newPrtUpdateUnit;
   }
   
   /** @pdOid aa1f0d46-82c4-4a13-8d5a-2b4172ad802d */
   public java.lang.String getPrtUpdateEmplNo() {
      return prtUpdateEmplNo;
   }
   
   /** @param newPrtUpdateEmplNo
    * @pdOid c264b80f-0185-4d85-a09d-b504af9e506d */
   public void setPrtUpdateEmplNo(java.lang.String newPrtUpdateEmplNo) {
      prtUpdateEmplNo = newPrtUpdateEmplNo;
   }
   
   /** @pdOid 144c44de-7c2a-4d93-8a41-4b9436054763 */
   public int getPrtStatus() {
      return prtStatus;
   }
   
   /** @param newPrtStatus
    * @pdOid ed8046e8-2d5b-4b5c-aa13-c1200ceb2418 */
   public void setPrtStatus(int newPrtStatus) {
      prtStatus = newPrtStatus;
   }
   
   /** @pdOid 6dcefa31-4c9a-4df6-9b0c-2eb8c381fd27 */
   public java.lang.String getPromotionContent() {
      return promotionContent;
   }
   
   /** @param newPromotionContent
    * @pdOid 2630dce4-622e-426f-8199-bba6961dce12 */
   public void setPromotionContent(java.lang.String newPromotionContent) {
      promotionContent = newPromotionContent;
   }
   
   /** @pdOid 9013821c-2795-4441-8670-868c2274c73d */
   public java.lang.String getDou1() {
      return dou1;
   }
   
   /** @param newDou1
    * @pdOid deae72f9-cb8c-4fcc-87e6-103a29599617 */
   public void setDou1(java.lang.String newDou1) {
      dou1 = newDou1;
   }
   
   /** @pdOid 8517a0ed-3504-47aa-8c55-5404e1b196ff */
   public java.lang.String getDou2() {
      return dou2;
   }
   
   /** @param newDou2
    * @pdOid ab7796be-83f2-44e9-9312-1fd610515984 */
   public void setDou2(java.lang.String newDou2) {
      dou2 = newDou2;
   }

}