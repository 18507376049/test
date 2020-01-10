/***********************************************************************
 * Module:  Unit.java
 * Author:  Administrator
 * Purpose: Defines the Class Unit
 ***********************************************************************/

import java.util.*;

/** @pdOid ea183305-d6a2-4501-8f1f-d5875ba3b2f2 */
public class Unit {
   /** 单位编号
    *             
    * 
    * @pdOid 3e628b16-c316-4d20-9198-c46a774c58f9 */
   private java.lang.String uniId;
   /** 单位名称
    *             
    * 
    * @pdOid 89d40460-83ff-48f1-a396-acb3ea88b623 */
   private java.lang.String uniName;
   /** 父级单位
    *             
    * 
    * @pdOid 1f445cc3-de70-476a-838a-b6eaa0038d40 */
   private java.lang.String uniFatherId;
   /** 单位排序
    *             
    * 
    * @pdOid fe5a8ba7-a75c-41b0-a26a-43e5f820a765 */
   private int uniSort;
   /** 单位描述
    *             
    * 
    * @pdOid 5d1b49b0-854d-4247-8be0-289e455e0459 */
   private java.lang.String uniRemark;
   
   /** @pdOid 59ef52e4-2ca8-4a84-a07b-2495fbe31e58 */
   public java.lang.String getUniId() {
      return uniId;
   }
   
   /** @param newUniId
    * @pdOid fec7d9b2-9274-4222-bd18-06da55d8d604 */
   public void setUniId(java.lang.String newUniId) {
      uniId = newUniId;
   }
   
   /** @pdOid ab14d492-52d5-41d0-ada7-2191ce6c685d */
   public java.lang.String getUniName() {
      return uniName;
   }
   
   /** @param newUniName
    * @pdOid edcbca72-db1d-44f3-b2a3-c5b244d55a52 */
   public void setUniName(java.lang.String newUniName) {
      uniName = newUniName;
   }
   
   /** @pdOid e7d63621-43d6-45c2-9182-1effe45b4b9f */
   public java.lang.String getUniFatherId() {
      return uniFatherId;
   }
   
   /** @param newUniFatherId
    * @pdOid 8b31be89-f94d-4bd6-a88e-45030d791715 */
   public void setUniFatherId(java.lang.String newUniFatherId) {
      uniFatherId = newUniFatherId;
   }
   
   /** @pdOid e787b240-e829-45b2-aa49-b37cd6e76ee4 */
   public int getUniSort() {
      return uniSort;
   }
   
   /** @param newUniSort
    * @pdOid 356a8342-7b76-4130-8efa-c28121fd38be */
   public void setUniSort(int newUniSort) {
      uniSort = newUniSort;
   }
   
   /** @pdOid 60adaab3-5573-4691-8628-3781581ba9f0 */
   public java.lang.String getUniRemark() {
      return uniRemark;
   }
   
   /** @param newUniRemark
    * @pdOid f5825b01-62c1-4d9d-b831-22868d800b1d */
   public void setUniRemark(java.lang.String newUniRemark) {
      uniRemark = newUniRemark;
   }

}