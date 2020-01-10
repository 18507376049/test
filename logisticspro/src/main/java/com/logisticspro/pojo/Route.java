/***********************************************************************
 * Module:  Route.java
 * Author:  Administrator
 * Purpose: Defines the Class Route
 ***********************************************************************/

import java.util.*;

/** @pdOid ce2cd355-3caa-4534-b541-a7cafcae0658 */
public class Route {
   /** 线路ID
    *             
    * 
    * @pdOid 611d5d36-1238-4825-9c38-7f7a5f66fedc */
   private java.lang.String rouNo;
   /** 终点站ID
    *             
    * 
    * @pdOid 8133978e-deda-4e0d-9867-42e80b59d7b7 */
   private java.lang.String rouTerminusNo;
   /** 起点站ID
    *             
    * 
    * @pdOid 6d6c9773-71a4-47f2-9385-a8f79311fa44 */
   private java.lang.String rouOriginNo;
   /** 线路名称
    *             
    * 
    * @pdOid 665ef0fa-8e0d-4355-9d50-9cd4830ca16b */
   private java.lang.String rouName;
   /** 线路编码
    *             
    * 
    * @pdOid cf204eae-3aea-4f1a-bfb3-5ceb50f1a3b4 */
   private java.lang.String rouCoding;
   /** 线路时限
    *             
    * 
    * @pdOid ddf61aba-5551-4b10-8e43-c2c338e97bac */
   private java.util.Date rouTime;
   /** 里程
    *             
    * 
    * @pdOid f2bc9c4f-9a68-4500-bcfa-aaaa2f384c01 */
   private double rouMileage;
   /** 是否停开
    *             
    * 
    * @pdOid 501115cc-0086-4179-84ef-e6723fcb9078 */
   private int rouStoppage = 0;
   /** 备注
    *             
    * 
    * @pdOid 3419f055-6f5f-425a-a49e-8b285f3af171 */
   private java.lang.String rouComment;
   /** 运营商
    *             
    * 
    * @pdOid 47aeba5b-030f-43e1-87f7-f2297e6fd8df */
   private java.lang.String rouCarId;
   /** 线路类型ID
    *             
    * 
    * @pdOid bd747c33-0a7f-4077-968d-55bb7a463ba8 */
   private java.lang.String rouRoTNo;
   /** 线路所属单位
    *             
    * 
    * @pdOid 327a40ac-2f55-4360-827b-0b65b589988a */
   private java.lang.String rouLineUnitNo;
   /** @pdOid 5557dcbb-69cd-4a03-a9c8-c82591d262a3 */
   private java.lang.String duo1;
   /** @pdOid 6614c1c0-e3aa-4f09-8749-35d8bb0e5788 */
   private java.lang.String duo2;
   /** @pdOid b7f8120d-7898-4aaf-990c-783bacea57c2 */
   private java.lang.String duo3;
   
   /** @pdOid c6151619-55ef-47d2-8de8-ca65402397e1 */
   public java.lang.String getRouNo() {
      return rouNo;
   }
   
   /** @param newRouNo
    * @pdOid 4b058fa8-d0e1-4fa5-b4c8-de6270cddf1c */
   public void setRouNo(java.lang.String newRouNo) {
      rouNo = newRouNo;
   }
   
   /** @pdOid a86d20d2-02d7-49b5-8443-d8093291eb07 */
   public java.lang.String getRouTerminusNo() {
      return rouTerminusNo;
   }
   
   /** @param newRouTerminusNo
    * @pdOid 8d3863af-cb29-49da-985f-49c0264298e7 */
   public void setRouTerminusNo(java.lang.String newRouTerminusNo) {
      rouTerminusNo = newRouTerminusNo;
   }
   
   /** @pdOid 6f60129a-535c-4090-b9f5-c92318a8930c */
   public java.lang.String getRouOriginNo() {
      return rouOriginNo;
   }
   
   /** @param newRouOriginNo
    * @pdOid 7f7a8b46-bd3b-492e-927c-88aaf8e6bf93 */
   public void setRouOriginNo(java.lang.String newRouOriginNo) {
      rouOriginNo = newRouOriginNo;
   }
   
   /** @pdOid 9ecdf85b-9bfb-4474-a101-035ad7f0dc78 */
   public java.lang.String getRouName() {
      return rouName;
   }
   
   /** @param newRouName
    * @pdOid 365fdb50-aff8-4435-8501-e347016c8ea3 */
   public void setRouName(java.lang.String newRouName) {
      rouName = newRouName;
   }
   
   /** @pdOid c05f6feb-6b00-4a20-b85a-b7bffc973efe */
   public java.lang.String getRouCoding() {
      return rouCoding;
   }
   
   /** @param newRouCoding
    * @pdOid c8fd19a9-778f-41dc-ba1d-81329a39f807 */
   public void setRouCoding(java.lang.String newRouCoding) {
      rouCoding = newRouCoding;
   }
   
   /** @pdOid 93226aca-e46c-4f08-9caf-e98191461c3e */
   public java.util.Date getRouTime() {
      return rouTime;
   }
   
   /** @param newRouTime
    * @pdOid f689c93d-1126-48c4-b6ca-50afaf38877a */
   public void setRouTime(java.util.Date newRouTime) {
      rouTime = newRouTime;
   }
   
   /** @pdOid 18533e52-475e-45f0-a1ea-f4cf35027cec */
   public double getRouMileage() {
      return rouMileage;
   }
   
   /** @param newRouMileage
    * @pdOid 0c3a36b8-b74f-4dd9-a19a-72becbd58b50 */
   public void setRouMileage(double newRouMileage) {
      rouMileage = newRouMileage;
   }
   
   /** @pdOid df4ab745-453c-4f1d-b5c4-f0b5c59642ff */
   public int getRouStoppage() {
      return rouStoppage;
   }
   
   /** @param newRouStoppage
    * @pdOid b9fd4302-2bb5-42f4-a9fd-69197b4bb8df */
   public void setRouStoppage(int newRouStoppage) {
      rouStoppage = newRouStoppage;
   }
   
   /** @pdOid e03e2aa2-8a25-4649-820f-19d972a7c158 */
   public java.lang.String getRouComment() {
      return rouComment;
   }
   
   /** @param newRouComment
    * @pdOid b04a3e19-9e17-463c-a5e6-44c244e46ac3 */
   public void setRouComment(java.lang.String newRouComment) {
      rouComment = newRouComment;
   }
   
   /** @pdOid 7a6aeb18-1b1c-44a9-bfcd-ca734a3e1cd5 */
   public java.lang.String getRouCarId() {
      return rouCarId;
   }
   
   /** @param newRouCarId
    * @pdOid 970aeb2f-20f5-40ce-bd7f-7e8ebeee54fc */
   public void setRouCarId(java.lang.String newRouCarId) {
      rouCarId = newRouCarId;
   }
   
   /** @pdOid 1a1c328d-bf7e-4615-aceb-5b39fb852a8b */
   public java.lang.String getRouRoTNo() {
      return rouRoTNo;
   }
   
   /** @param newRouRoTNo
    * @pdOid 985d91e6-c45e-4434-803f-931aa31740db */
   public void setRouRoTNo(java.lang.String newRouRoTNo) {
      rouRoTNo = newRouRoTNo;
   }
   
   /** @pdOid 097d6680-48cb-4ad0-aea3-89be0d479bae */
   public java.lang.String getRouLineUnitNo() {
      return rouLineUnitNo;
   }
   
   /** @param newRouLineUnitNo
    * @pdOid fe05626b-22d6-4fd5-8d27-14822e8a6b68 */
   public void setRouLineUnitNo(java.lang.String newRouLineUnitNo) {
      rouLineUnitNo = newRouLineUnitNo;
   }
   
   /** @pdOid 85f2ebfe-ec01-47ac-b96a-14a8681e7537 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid cc5d2d2b-fbac-4021-b095-53a663591131 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid a5424573-41c0-4082-ad10-8c0d534d6fb7 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 7e32a65a-d4cc-4265-994b-04e927f07c5b */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 5f297b18-1dc0-4844-8525-53efa8d4fdc9 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid a0449007-b3eb-4828-a605-017aa8df5f01 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}