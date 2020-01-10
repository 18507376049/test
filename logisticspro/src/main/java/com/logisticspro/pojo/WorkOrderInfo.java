/***********************************************************************
 * Module:  WorkOrderInfo.java
 * Author:  Administrator
 * Purpose: Defines the Class WorkOrderInfo
 ***********************************************************************/

import java.util.*;

/** @pdOid 5add08c0-0c7f-4669-b10e-e4618d3da944 */
public class WorkOrderInfo {
   /** 工单号
    *             
    * 
    * @pdOid 2f237ca9-0c57-4719-af08-ca94c23542bc */
   private java.lang.String worNo;
   /** 工单类型
    *             
    * 
    * @pdOid 640572dc-d016-4f97-959d-f438771a1d47 */
   private java.lang.String worType;
   /** 通知单号
    *             
    * 
    * @pdOid 334ffa9b-8c17-48e3-affd-c8144318c4b2 */
   private java.lang.String worBusMemoNo;
   /** 状态
    *             
    * 
    * @pdOid e95a8bed-b213-4e1b-9255-da771e2dfae1 */
   private int worTakeState = 0;
   /** 短信序号
    *             
    * 
    * @pdOid df845976-d614-40fe-8687-897306721cbd */
   private java.lang.String worMessageNo;
   /** 工单生成时间
    *             
    * 
    * @pdOid e0760fb8-dc78-4426-86fd-c68ca4f8ad6d */
   private java.util.Date worGeneratedTime;
   /** 追单次数
    *             
    * 
    * @pdOid 9253bcb8-8970-4c01-8df2-8cfff10025af */
   private int worChaseNumber;
   /** 小件员编号
    *             
    * 
    * @pdOid d308cb40-185d-49b5-a5d3-a48aabbf7f4d */
   private java.lang.String worSmallCrewNo;
   /** 取件单位
    *             
    * 
    * @pdOid d5bfaaf6-0249-464c-94f8-d38ee029a088 */
   private java.lang.String worTakeUnit;
   /** 取件时间
    *             
    * 
    * @pdOid d7b4ba1e-dca6-48ea-a458-58ebfc803ad7 */
   private java.util.Date worTakeTime;
   /** 分拣编码
    *             
    * 
    * @pdOid e2b40c62-ac2c-4ddb-bcbb-90e014671fef */
   private java.lang.String worSortCode;
   /** @pdOid 881641f3-a4a5-4cc8-858b-271670288062 */
   private java.lang.String duo1;
   /** @pdOid 2512802d-f03a-4478-8507-f50f37b2e81d */
   private java.lang.String duo2;
   /** @pdOid 59ca7964-ee02-47eb-84f0-211c7414328c */
   private java.lang.String duo3;
   
   /** @pdOid 79de153a-04b1-4338-ab6a-84f7197cf141 */
   public java.lang.String getWorNo() {
      return worNo;
   }
   
   /** @param newWorNo
    * @pdOid ec653e73-ae60-42e1-b213-79385a2a9219 */
   public void setWorNo(java.lang.String newWorNo) {
      worNo = newWorNo;
   }
   
   /** @pdOid 58a34f3d-6760-4eff-9aa7-c4d4a226dd2b */
   public java.lang.String getWorType() {
      return worType;
   }
   
   /** @param newWorType
    * @pdOid 150a48a8-8dec-49b0-8eb5-3ef019041746 */
   public void setWorType(java.lang.String newWorType) {
      worType = newWorType;
   }
   
   /** @pdOid 5e8402a0-5900-4dda-9e42-fd630f0c20ec */
   public java.lang.String getWorBusMemoNo() {
      return worBusMemoNo;
   }
   
   /** @param newWorBusMemoNo
    * @pdOid a79d0e84-fe8b-46d1-872d-561dda0d5602 */
   public void setWorBusMemoNo(java.lang.String newWorBusMemoNo) {
      worBusMemoNo = newWorBusMemoNo;
   }
   
   /** @pdOid 66ef7e08-f423-447f-a92b-e23a6650349f */
   public int getWorTakeState() {
      return worTakeState;
   }
   
   /** @param newWorTakeState
    * @pdOid 029c721c-0baa-4a9b-8955-cfcfc83c3423 */
   public void setWorTakeState(int newWorTakeState) {
      worTakeState = newWorTakeState;
   }
   
   /** @pdOid 6b758714-659b-4573-a9b7-3478abceda2c */
   public java.lang.String getWorMessageNo() {
      return worMessageNo;
   }
   
   /** @param newWorMessageNo
    * @pdOid db25d4a5-d3eb-4266-8ff0-41775fcc9a95 */
   public void setWorMessageNo(java.lang.String newWorMessageNo) {
      worMessageNo = newWorMessageNo;
   }
   
   /** @pdOid 6dcaa30f-d9e1-4a24-b47e-cee2a361374b */
   public java.util.Date getWorGeneratedTime() {
      return worGeneratedTime;
   }
   
   /** @param newWorGeneratedTime
    * @pdOid 80a4653a-6593-45ad-bb7b-c102493fa4f4 */
   public void setWorGeneratedTime(java.util.Date newWorGeneratedTime) {
      worGeneratedTime = newWorGeneratedTime;
   }
   
   /** @pdOid 1695d0e5-e039-4145-a05d-db4d8d37195c */
   public int getWorChaseNumber() {
      return worChaseNumber;
   }
   
   /** @param newWorChaseNumber
    * @pdOid 6f73f495-7cd0-44bb-9c88-d5360bcdcfa2 */
   public void setWorChaseNumber(int newWorChaseNumber) {
      worChaseNumber = newWorChaseNumber;
   }
   
   /** @pdOid 2d99d74e-24db-454e-b967-8dbee3d72326 */
   public java.lang.String getWorSmallCrewNo() {
      return worSmallCrewNo;
   }
   
   /** @param newWorSmallCrewNo
    * @pdOid cec57830-130c-42ff-9fb2-091bb9a809e0 */
   public void setWorSmallCrewNo(java.lang.String newWorSmallCrewNo) {
      worSmallCrewNo = newWorSmallCrewNo;
   }
   
   /** @pdOid 5f02df5f-9d00-4cf8-95ed-ce88c1c1bd34 */
   public java.lang.String getWorTakeUnit() {
      return worTakeUnit;
   }
   
   /** @param newWorTakeUnit
    * @pdOid 2bd6cc6d-a7e7-4bf0-b7f1-65cc1287a57b */
   public void setWorTakeUnit(java.lang.String newWorTakeUnit) {
      worTakeUnit = newWorTakeUnit;
   }
   
   /** @pdOid d1c62cef-3013-4868-ade5-8ddb256b4a0b */
   public java.util.Date getWorTakeTime() {
      return worTakeTime;
   }
   
   /** @param newWorTakeTime
    * @pdOid d5fee881-6104-4840-acf3-fd20df364141 */
   public void setWorTakeTime(java.util.Date newWorTakeTime) {
      worTakeTime = newWorTakeTime;
   }
   
   /** @pdOid 8313e6bc-af20-44b0-8fb7-a64061632bf4 */
   public java.lang.String getWorSortCode() {
      return worSortCode;
   }
   
   /** @param newWorSortCode
    * @pdOid 98f02a63-1d4a-47c0-ae35-05068939f4e7 */
   public void setWorSortCode(java.lang.String newWorSortCode) {
      worSortCode = newWorSortCode;
   }
   
   /** @pdOid f016501c-1245-42c1-865d-525c562d981c */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid e6761e2b-c20d-415a-b5c9-a7f970bd3ae1 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid d03417b2-cd85-4998-ae5f-5e8e43b0c3d9 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 6afac5a0-ef1c-40fe-87e6-0c7418763a9a */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid b40928c1-66e8-4ddd-bd9e-872a52aed442 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid ae11ef23-ff8f-4b60-9125-308f7705e286 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}