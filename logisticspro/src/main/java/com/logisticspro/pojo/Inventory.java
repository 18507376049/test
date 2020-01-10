/***********************************************************************
 * Module:  Inventory.java
 * Author:  Administrator
 * Purpose: Defines the Class Inventory
 ***********************************************************************/

import java.util.*;

/** @pdOid d6a9d7e4-a4be-42fd-bbd7-12a950c9f77e */
public class Inventory {
   /** 盘库单号
    *             
    * 
    * @pdOid b7342bf9-4e30-4ca7-98e2-ae54bff205b4 */
   private java.lang.String invNo;
   /** 扫描设备号
    *             
    * 
    * @pdOid 7eaaa70b-673f-46f3-8052-8012e9cf8344 */
   private java.lang.String invScaDeviceNumber;
   /** 总件数
    *             
    * 
    * @pdOid 797414f7-c9e2-49d6-8eba-942b0313736e */
   private int invTotalNumber;
   /** 盘库人编号
    *             
    * 
    * @pdOid 51be4c91-7f2b-49de-a4a6-840cd7bbf92b */
   private java.lang.String invPerson;
   /** 盘库时间
    *             
    * 
    * @pdOid 4ee39e8a-86b2-44eb-9503-68d9ed78a31b */
   private java.util.Date invTime;
   /** 操作单位
    *             
    * 
    * @pdOid 8b6b112a-03e7-401a-a443-1e470665b5b4 */
   private java.lang.String invOperationUnit;
   /** 仓库编号
    *             
    * 
    * @pdOid ec3c1e0a-17da-4d1a-aa35-09b3b18693f1 */
   private java.lang.String invWareNo;
   
   /** @pdOid 8590c37c-fcbd-4885-b827-7e3ad279e098 */
   public java.lang.String getInvNo() {
      return invNo;
   }
   
   /** @param newInvNo
    * @pdOid 6166614c-06de-4fe9-a7fa-61e6b67aa3a2 */
   public void setInvNo(java.lang.String newInvNo) {
      invNo = newInvNo;
   }
   
   /** @pdOid a0a20d73-8583-47fd-806f-e658a4fd93c8 */
   public java.lang.String getInvScaDeviceNumber() {
      return invScaDeviceNumber;
   }
   
   /** @param newInvScaDeviceNumber
    * @pdOid dbeaba2b-b349-4aa2-bae3-491412833ae9 */
   public void setInvScaDeviceNumber(java.lang.String newInvScaDeviceNumber) {
      invScaDeviceNumber = newInvScaDeviceNumber;
   }
   
   /** @pdOid a0362295-3331-42d2-97a9-ca3e73c8104e */
   public int getInvTotalNumber() {
      return invTotalNumber;
   }
   
   /** @param newInvTotalNumber
    * @pdOid 470c783d-f660-4fa6-ae48-6beeb9870bc6 */
   public void setInvTotalNumber(int newInvTotalNumber) {
      invTotalNumber = newInvTotalNumber;
   }
   
   /** @pdOid 5db1f538-26bf-4b66-836b-571073db38c9 */
   public java.lang.String getInvPerson() {
      return invPerson;
   }
   
   /** @param newInvPerson
    * @pdOid 6aa7e95a-e76b-4d2c-96f3-34048058c6be */
   public void setInvPerson(java.lang.String newInvPerson) {
      invPerson = newInvPerson;
   }
   
   /** @pdOid dfb13745-a90d-4309-9c1f-11c0b42e5f8c */
   public java.util.Date getInvTime() {
      return invTime;
   }
   
   /** @param newInvTime
    * @pdOid 4df019ac-a833-4195-b6a9-d8e283f1f578 */
   public void setInvTime(java.util.Date newInvTime) {
      invTime = newInvTime;
   }
   
   /** @pdOid 7ff6dc08-f510-4440-8850-a1a30d416674 */
   public java.lang.String getInvOperationUnit() {
      return invOperationUnit;
   }
   
   /** @param newInvOperationUnit
    * @pdOid cd7a68f5-07a5-466f-b96d-058b97f84ab1 */
   public void setInvOperationUnit(java.lang.String newInvOperationUnit) {
      invOperationUnit = newInvOperationUnit;
   }
   
   /** @pdOid 1f653594-9277-4bde-b1ff-31ecbc934b51 */
   public java.lang.String getInvWareNo() {
      return invWareNo;
   }
   
   /** @param newInvWareNo
    * @pdOid 8e32ed6a-b03a-49da-afb8-a3110ba0abe1 */
   public void setInvWareNo(java.lang.String newInvWareNo) {
      invWareNo = newInvWareNo;
   }

}