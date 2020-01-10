/***********************************************************************
 * Module:  InventorySubsidiary.java
 * Author:  Administrator
 * Purpose: Defines the Class InventorySubsidiary
 ***********************************************************************/

import java.util.*;

/** @pdOid 9bb7a7a9-254a-4899-822e-c054c18472b6 */
public class InventorySubsidiary {
   /** 盘库明细单号
    *             
    * 
    * @pdOid 37829a03-d397-4377-b20d-29b65ba2f62e */
   private java.lang.String insNo;
   /** 工作单号
    *             
    * 
    * @pdOid ea877b81-d3fa-4780-8f3c-3deccbce9f35 */
   private java.lang.String insWorkOrderNo;
   /** 合包号
    *             
    * 
    * @pdOid 5835ce29-df6e-42a5-9a17-fb71896b4f18 */
   private java.lang.String insOrPackageNo;
   /** 件数
    *             
    * 
    * @pdOid 27fa2018-7ec6-4ede-9cd3-c8533063c0d6 */
   private int insNumberCases;
   /** 重量
    *             
    * 
    * @pdOid 004b1a59-6126-434b-878a-12202e3aec8e */
   private double insWeight;
   /** 体积
    *             
    * 
    * @pdOid d7193037-e9ff-49a8-b140-66feeaa20932 */
   private double insVolume;
   /** 是否破损
    *             
    * 
    * @pdOid 37f2536c-e572-4be2-a69e-0d1f23de6ad9 */
   private int insWhetherDamage;
   /** 入库交接单号
    *             
    * 
    * @pdOid c49572df-a520-4294-878b-9288ad63067e */
   private java.lang.String insOutBounNumber;
   /** 类型
    *             
    * 
    * @pdOid 94cf91ca-fa24-44eb-b9b4-fb5e929b273b */
   private java.lang.String insType;
   /** 到达地
    *             
    * 
    * @pdOid eae33a7a-1083-4f0a-ad5a-58ac1ffa563b */
   private java.lang.String insArrivalPoint;
   /** 入库人
    *             
    * 
    * @pdOid e8148ecd-bf30-4ea1-9ad4-d2ef8450c3e6 */
   private java.lang.String insWarePerson;
   /** 入库时间
    *             
    * 
    * @pdOid 59f328c0-13a0-4f6c-898b-43dd27d6d748 */
   private java.util.Date insWareTime;
   /** 盘库单号
    *             
    * 
    * @pdOid dc69dba5-157d-4160-887a-c6301c766627 */
   private java.lang.String insInvNo;
   /** @pdOid 55d57745-a4e0-4c73-9be3-f0f219c0857a */
   private java.lang.String duo1;
   /** @pdOid 3bb37aa5-edee-436d-aaf9-cf5d3c087099 */
   private java.lang.String duo2;
   /** @pdOid bb50d00b-8cfc-426c-b897-5e00b8185fb6 */
   private java.lang.String duo3;
   
   /** @pdOid 44a33063-31e7-4104-9413-2d04dd8be1d7 */
   public java.lang.String getInsNo() {
      return insNo;
   }
   
   /** @param newInsNo
    * @pdOid f5c7e58b-9d04-4fe2-a5d8-09939b636c00 */
   public void setInsNo(java.lang.String newInsNo) {
      insNo = newInsNo;
   }
   
   /** @pdOid 410b9a25-ed68-4dcf-ba38-d2ceb73e6715 */
   public java.lang.String getInsWorkOrderNo() {
      return insWorkOrderNo;
   }
   
   /** @param newInsWorkOrderNo
    * @pdOid 8921e3b6-5440-417f-ba04-569181077d55 */
   public void setInsWorkOrderNo(java.lang.String newInsWorkOrderNo) {
      insWorkOrderNo = newInsWorkOrderNo;
   }
   
   /** @pdOid e3e34e30-f47a-4d29-b5dc-549737f03251 */
   public java.lang.String getInsOrPackageNo() {
      return insOrPackageNo;
   }
   
   /** @param newInsOrPackageNo
    * @pdOid d5812593-b6d8-4806-b255-11e021cbd408 */
   public void setInsOrPackageNo(java.lang.String newInsOrPackageNo) {
      insOrPackageNo = newInsOrPackageNo;
   }
   
   /** @pdOid e69b4b6a-a39a-4011-9e36-48bf03245af1 */
   public int getInsNumberCases() {
      return insNumberCases;
   }
   
   /** @param newInsNumberCases
    * @pdOid da642cbd-bff2-4738-8fa9-5705e3d1f4b8 */
   public void setInsNumberCases(int newInsNumberCases) {
      insNumberCases = newInsNumberCases;
   }
   
   /** @pdOid 0a982555-2063-4062-9879-5157d107dbce */
   public double getInsWeight() {
      return insWeight;
   }
   
   /** @param newInsWeight
    * @pdOid 3711667b-5af7-4d90-8a42-b73ae7e18562 */
   public void setInsWeight(double newInsWeight) {
      insWeight = newInsWeight;
   }
   
   /** @pdOid 375a20e8-0c14-46f3-abdf-eb5d5950d142 */
   public double getInsVolume() {
      return insVolume;
   }
   
   /** @param newInsVolume
    * @pdOid 91d0d92c-6031-4b84-b0b8-9c8fd6ce96d1 */
   public void setInsVolume(double newInsVolume) {
      insVolume = newInsVolume;
   }
   
   /** @pdOid 7b5f67e1-780a-478d-8396-b079882c6a82 */
   public int getInsWhetherDamage() {
      return insWhetherDamage;
   }
   
   /** @param newInsWhetherDamage
    * @pdOid 9ce01d80-117e-42dc-be7c-291b6fa0f6e8 */
   public void setInsWhetherDamage(int newInsWhetherDamage) {
      insWhetherDamage = newInsWhetherDamage;
   }
   
   /** @pdOid 0c19b3ca-22de-44b9-90ce-82a5ea4a9193 */
   public java.lang.String getInsOutBounNumber() {
      return insOutBounNumber;
   }
   
   /** @param newInsOutBounNumber
    * @pdOid b38f56a4-893c-4dea-bfa9-656aaaf83afd */
   public void setInsOutBounNumber(java.lang.String newInsOutBounNumber) {
      insOutBounNumber = newInsOutBounNumber;
   }
   
   /** @pdOid 09af2537-5ca9-4135-8b1a-b7331cf10fd9 */
   public java.lang.String getInsType() {
      return insType;
   }
   
   /** @param newInsType
    * @pdOid 2fe50a48-8379-4ee0-a9be-1c1eb769cd5a */
   public void setInsType(java.lang.String newInsType) {
      insType = newInsType;
   }
   
   /** @pdOid 570cc0d5-f99a-4f37-8036-25638e979c4f */
   public java.lang.String getInsArrivalPoint() {
      return insArrivalPoint;
   }
   
   /** @param newInsArrivalPoint
    * @pdOid d0291cbb-97bf-4259-a25a-32ada9d92665 */
   public void setInsArrivalPoint(java.lang.String newInsArrivalPoint) {
      insArrivalPoint = newInsArrivalPoint;
   }
   
   /** @pdOid d7730329-ced7-4b8b-9905-41f6e8b28f6c */
   public java.lang.String getInsWarePerson() {
      return insWarePerson;
   }
   
   /** @param newInsWarePerson
    * @pdOid ea57d6e0-2f17-4000-b1d3-70ebd5472198 */
   public void setInsWarePerson(java.lang.String newInsWarePerson) {
      insWarePerson = newInsWarePerson;
   }
   
   /** @pdOid 613930ba-fba6-4a67-9e3d-7a8caf757681 */
   public java.util.Date getInsWareTime() {
      return insWareTime;
   }
   
   /** @param newInsWareTime
    * @pdOid bbd0b468-a3ef-447d-ba00-0d1b12a90942 */
   public void setInsWareTime(java.util.Date newInsWareTime) {
      insWareTime = newInsWareTime;
   }
   
   /** @pdOid 5569c93c-8edb-48f8-9822-724b13e9a529 */
   public java.lang.String getInsInvNo() {
      return insInvNo;
   }
   
   /** @param newInsInvNo
    * @pdOid 62a95cac-8a2a-4c77-9b0d-398b8dc80c10 */
   public void setInsInvNo(java.lang.String newInsInvNo) {
      insInvNo = newInsInvNo;
   }
   
   /** @pdOid ba9cdce4-6d9c-4077-84c1-c72452e52a1d */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 318a4a18-339c-4aa4-b0f9-e29e7c9642cf */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 24a92946-64d6-4dab-86f7-b3d842997f66 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 228dda08-ecd2-4008-b15d-d161718ddcc0 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid a72f7716-4268-485e-b480-2697effb23f2 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid e554ba40-d38e-4b63-9e35-0c4a7d800a0f */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}