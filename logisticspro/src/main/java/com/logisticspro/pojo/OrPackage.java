/***********************************************************************
 * Module:  OrPackage.java
 * Author:  Administrator
 * Purpose: Defines the Class OrPackage
 ***********************************************************************/

import java.util.*;

/** @pdOid 2605d1f0-a971-4760-99d9-600d037f4f66 */
public class OrPackage {
   /** 合包单号
    *             
    * 
    * @pdOid 0a698d70-cac4-4071-ae3c-f074f335355f */
   private java.lang.String orpPackageNo;
   /** 合包人
    *             
    * 
    * @pdOid 586429ec-d652-4c5b-bafa-e68e70be5608 */
   private java.lang.String orpPackagePerson;
   /** 封签号（原来是设备号）
    *             
    * 
    * @pdOid 3e3b4b7f-4fa4-41b0-893e-8238c15f2b3e */
   private java.lang.String orpDeviceNumber;
   /** 到达地
    *             
    * 
    * @pdOid 2bf0d549-2155-4195-afb3-a42b9c407c66 */
   private java.lang.String orpArrivalPoint;
   /** 计算到达地
    *             
    * 
    * @pdOid baeee7f1-d10f-4736-a4c5-9dac4244dda8 */
   private java.lang.String orpCalculArrival;
   /** 送达时限
    *             
    * 
    * @pdOid c366d8b1-fc79-452b-b987-eee9d645a89b */
   private java.util.Date orpDeliveryTime;
   /** 总件数
    *             
    * 
    * @pdOid 00c8d8a8-e246-43fd-9409-b22b97baab2e */
   private int orpTatalJian;
   /** 总重量
    *             
    * 
    * @pdOid 6cd87371-8cf7-49de-b8b8-ac844a5dbde0 */
   private double orpTatalWeight;
   /** 总体积
    *             
    * 
    * @pdOid 8bd49dc0-1689-4f37-8eb3-3b2291453486 */
   private double orpTatalV;
   /** 状态
    *             
    * 
    * @pdOid 7bc6bf78-4c95-498c-bc53-20c8568b6b68 */
   private int orpStatus = 0;
   
   /** @pdOid 3c2145bb-9842-42c5-b8dd-615e3a3b3dca */
   public java.lang.String getOrpPackageNo() {
      return orpPackageNo;
   }
   
   /** @param newOrpPackageNo
    * @pdOid 88ab0bc5-2c90-4389-875c-dc774ab6a779 */
   public void setOrpPackageNo(java.lang.String newOrpPackageNo) {
      orpPackageNo = newOrpPackageNo;
   }
   
   /** @pdOid 11815f1e-cd15-4317-8396-855f5c8818f0 */
   public java.lang.String getOrpPackagePerson() {
      return orpPackagePerson;
   }
   
   /** @param newOrpPackagePerson
    * @pdOid 3bd7526d-e56d-4cff-aa8f-da3343a89203 */
   public void setOrpPackagePerson(java.lang.String newOrpPackagePerson) {
      orpPackagePerson = newOrpPackagePerson;
   }
   
   /** @pdOid 11dbc8a6-d77a-4de5-9104-eba80ea96b6c */
   public java.lang.String getOrpDeviceNumber() {
      return orpDeviceNumber;
   }
   
   /** @param newOrpDeviceNumber
    * @pdOid c627cc37-6880-4d53-98bd-cd34a3b06173 */
   public void setOrpDeviceNumber(java.lang.String newOrpDeviceNumber) {
      orpDeviceNumber = newOrpDeviceNumber;
   }
   
   /** @pdOid 1b6e2a36-745a-4dfe-b3f6-14beae2ee3c5 */
   public java.lang.String getOrpArrivalPoint() {
      return orpArrivalPoint;
   }
   
   /** @param newOrpArrivalPoint
    * @pdOid 8a00123c-a379-461d-ad84-1da76d535234 */
   public void setOrpArrivalPoint(java.lang.String newOrpArrivalPoint) {
      orpArrivalPoint = newOrpArrivalPoint;
   }
   
   /** @pdOid b10b9f7e-2e8f-4ce8-9681-2fe4916b9933 */
   public java.lang.String getOrpCalculArrival() {
      return orpCalculArrival;
   }
   
   /** @param newOrpCalculArrival
    * @pdOid 6127c6be-6347-4f32-8c66-be9a1294a2e7 */
   public void setOrpCalculArrival(java.lang.String newOrpCalculArrival) {
      orpCalculArrival = newOrpCalculArrival;
   }
   
   /** @pdOid c34fd657-2d03-4b69-a14e-298180c2154e */
   public java.util.Date getOrpDeliveryTime() {
      return orpDeliveryTime;
   }
   
   /** @param newOrpDeliveryTime
    * @pdOid 0777b773-5d9a-47a1-a4dc-92919be1120c */
   public void setOrpDeliveryTime(java.util.Date newOrpDeliveryTime) {
      orpDeliveryTime = newOrpDeliveryTime;
   }
   
   /** @pdOid 0e1588c7-7a84-4a7f-83be-9496ee650794 */
   public int getOrpTatalJian() {
      return orpTatalJian;
   }
   
   /** @param newOrpTatalJian
    * @pdOid 5756efbc-091d-4dcb-891f-c209693e8cee */
   public void setOrpTatalJian(int newOrpTatalJian) {
      orpTatalJian = newOrpTatalJian;
   }
   
   /** @pdOid d1760b55-cc7a-4d8c-ae15-cdd703907265 */
   public double getOrpTatalWeight() {
      return orpTatalWeight;
   }
   
   /** @param newOrpTatalWeight
    * @pdOid ec4af96f-8b15-45e9-85e4-d3e6005cd460 */
   public void setOrpTatalWeight(double newOrpTatalWeight) {
      orpTatalWeight = newOrpTatalWeight;
   }
   
   /** @pdOid 4caec0e3-3321-4947-8640-d7db2fae9117 */
   public double getOrpTatalV() {
      return orpTatalV;
   }
   
   /** @param newOrpTatalV
    * @pdOid ba3c2f2e-dae4-42dd-aac3-2fb53ebf3956 */
   public void setOrpTatalV(double newOrpTatalV) {
      orpTatalV = newOrpTatalV;
   }
   
   /** @pdOid da27faa0-c1c2-4035-bb75-7029a478044d */
   public int getOrpStatus() {
      return orpStatus;
   }
   
   /** @param newOrpStatus
    * @pdOid a8f74dbe-43ea-45ff-943a-06633ad3b6b2 */
   public void setOrpStatus(int newOrpStatus) {
      orpStatus = newOrpStatus;
   }

}