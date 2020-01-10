/***********************************************************************
 * Module:  VerifyWeight.java
 * Author:  Administrator
 * Purpose: Defines the Class VerifyWeight
 ***********************************************************************/

import java.util.*;

/** @pdOid 775eff22-0974-4775-a501-52e425067c9d */
public class VerifyWeight {
   /** 核重操作编号
    *             
    * 
    * @pdOid 036a4dc1-accf-43b7-9034-c76aae888e50 */
   private java.lang.String verNo;
   /** 工作单单号
    *             
    * 
    * @pdOid 85b3956c-e4b4-4e67-b2f5-d1276223a73e */
   private java.lang.String verGongOdd;
   /** 原件数
    *             
    * 
    * @pdOid 92a65f9e-c58f-4e32-9025-d7b90520520a */
   private int verQuantity;
   /** 原重量
    *             
    * 
    * @pdOid 880465c3-26e5-4892-b941-e4e13eabe709 */
   private double verWeight;
   /** 到达地
    *             
    * 
    * @pdOid 393080d8-30e2-476f-b93e-8e6aabeaef89 */
   private java.lang.String verArri;
   /** 已核件数
    *             
    * 
    * @pdOid e70aed1b-0712-48bd-9a71-631a5f97aeed */
   private int verVerifyQua;
   /** 已核总量
    *             
    * 
    * @pdOid 499dcae7-f4b1-4967-ad0c-9ba65de49f05 */
   private double verVerifyWeight;
   /** 条码
    *             
    * 
    * @pdOid a5d04dfb-7583-49d0-b7bf-3dd78a9d7e4d */
   private java.lang.String verBarCode;
   /** 操作时间
    *             
    * 
    * @pdOid 08a5f07f-4f91-4d3b-b849-2517addd60fd */
   private java.util.Date verDate;
   /** 操作人
    *             
    * 
    * @pdOid 7e057943-a4a3-4924-ada7-8d110d61edf7 */
   private java.lang.String verOperator;
   /** 核重单位
    *             
    * 
    * @pdOid 2dd37d07-8044-42a7-a3cb-62eafdd953de */
   private java.lang.String vemUnit;
   /** @pdOid db629a7d-d290-450a-81d7-e23b5880de83 */
   private java.lang.String duo1;
   /** @pdOid 48d865d2-2ed5-40d7-a223-774c1763da4b */
   private java.lang.String duo2;
   
   /** @pdOid 3e951f98-ac73-4afa-ac91-1301e85fef4e */
   public java.lang.String getVerNo() {
      return verNo;
   }
   
   /** @param newVerNo
    * @pdOid c92b040a-91e3-497e-ba9f-b1b9505608b5 */
   public void setVerNo(java.lang.String newVerNo) {
      verNo = newVerNo;
   }
   
   /** @pdOid 9541b46a-3fd5-411e-ac02-ddc402d02bf6 */
   public java.lang.String getVerGongOdd() {
      return verGongOdd;
   }
   
   /** @param newVerGongOdd
    * @pdOid af975868-2b67-468c-879d-d9760f49976f */
   public void setVerGongOdd(java.lang.String newVerGongOdd) {
      verGongOdd = newVerGongOdd;
   }
   
   /** @pdOid 1203b47a-55a0-4278-98f3-f3ef10e629c2 */
   public int getVerQuantity() {
      return verQuantity;
   }
   
   /** @param newVerQuantity
    * @pdOid d5144b1f-eb34-4fbb-9084-58faa8513d55 */
   public void setVerQuantity(int newVerQuantity) {
      verQuantity = newVerQuantity;
   }
   
   /** @pdOid 8a1777ac-80b5-4c34-8f5c-2575e6acfc84 */
   public double getVerWeight() {
      return verWeight;
   }
   
   /** @param newVerWeight
    * @pdOid fcdaee30-7dc4-43d4-abe4-e7cd8fc5ab0a */
   public void setVerWeight(double newVerWeight) {
      verWeight = newVerWeight;
   }
   
   /** @pdOid b9dbda16-15d3-427c-a1c5-40f106e19dad */
   public java.lang.String getVerArri() {
      return verArri;
   }
   
   /** @param newVerArri
    * @pdOid 257739da-a86d-492f-a873-38171c121d84 */
   public void setVerArri(java.lang.String newVerArri) {
      verArri = newVerArri;
   }
   
   /** @pdOid a06aedd5-3a5e-4aa5-9a51-1726642bb328 */
   public int getVerVerifyQua() {
      return verVerifyQua;
   }
   
   /** @param newVerVerifyQua
    * @pdOid 27e1b6b7-76f5-4d07-b823-85f7f139427e */
   public void setVerVerifyQua(int newVerVerifyQua) {
      verVerifyQua = newVerVerifyQua;
   }
   
   /** @pdOid bb0b9683-ca6d-42a8-b2fe-f0e8dad2f037 */
   public double getVerVerifyWeight() {
      return verVerifyWeight;
   }
   
   /** @param newVerVerifyWeight
    * @pdOid e7d016ba-7978-496c-9571-e8949c72a6f6 */
   public void setVerVerifyWeight(double newVerVerifyWeight) {
      verVerifyWeight = newVerVerifyWeight;
   }
   
   /** @pdOid b58f7640-d2ea-460b-b420-9c596a278013 */
   public java.lang.String getVerBarCode() {
      return verBarCode;
   }
   
   /** @param newVerBarCode
    * @pdOid 64e7b9eb-c2a6-42e7-b83c-a5dff7a7baaf */
   public void setVerBarCode(java.lang.String newVerBarCode) {
      verBarCode = newVerBarCode;
   }
   
   /** @pdOid 7849bdc7-bd42-482c-a3aa-c111b0d06d91 */
   public java.util.Date getVerDate() {
      return verDate;
   }
   
   /** @param newVerDate
    * @pdOid ccc65a0a-55d3-4517-affb-61b93e294d78 */
   public void setVerDate(java.util.Date newVerDate) {
      verDate = newVerDate;
   }
   
   /** @pdOid 8f21e34b-5bc8-4a98-b140-09411160e8e6 */
   public java.lang.String getVerOperator() {
      return verOperator;
   }
   
   /** @param newVerOperator
    * @pdOid 50b4b49b-fd36-4d96-ad2e-9fdf6b11a8d8 */
   public void setVerOperator(java.lang.String newVerOperator) {
      verOperator = newVerOperator;
   }
   
   /** @pdOid 2256122b-20d7-473d-b990-81c08ee4a45f */
   public java.lang.String getVemUnit() {
      return vemUnit;
   }
   
   /** @param newVemUnit
    * @pdOid 730da0bc-36a7-4b26-93a9-d1b945b6e1e6 */
   public void setVemUnit(java.lang.String newVemUnit) {
      vemUnit = newVemUnit;
   }
   
   /** @pdOid ca716a46-b23c-4ccc-9dbe-468378dfc200 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid e429aa27-d8b3-470e-b4f7-9bc32dbf2cfe */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 531aaf7a-51a9-4a62-9b7f-0c7eaf562c91 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid a1fee93e-7a81-41f0-b9d8-8caa542963e2 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}