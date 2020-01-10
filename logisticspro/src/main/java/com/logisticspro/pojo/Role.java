/***********************************************************************
 * Module:  Role.java
 * Author:  Administrator
 * Purpose: Defines the Class Role
 ***********************************************************************/

import java.util.*;

/** @pdOid c466673c-57e3-49d6-b618-96c789e22adb */
public class Role {
   /** 角色编号
    *             
    * 
    * @pdOid 97ed4a14-4ff1-4d59-ad52-6acebe96f1c5 */
   private java.lang.String rolNo;
   /** 角色名称
    *             
    * 
    * @pdOid 7cf41fa4-3a23-4b7f-82da-7021b15e4d40 */
   private java.lang.String rolName;
   /** 角色创建时间
    *             
    * 
    * @pdOid aeb8496b-9d95-4b96-933b-56ecf080a888 */
   private java.util.Date rolCreatetime;
   /** 角色排序
    *             
    * 
    * @pdOid f37a84a3-b726-400c-a2a4-66890fcbb14a */
   private int rolOrderNumber;
   /** 角色描述
    *             
    * 
    * @pdOid 3545c799-bca8-49ce-bae3-801930f60985 */
   private java.lang.String rolDesc;
   /** 状态
    *             
    * 
    * @pdOid 882305e7-e87d-4bd2-b597-b9098d5caac5 */
   private java.lang.String rolStatus;
   /** 授权员工
    *             
    * 
    * @pdOid adb1a4b2-39c4-4050-ac8b-99c76056c4ee */
   private java.lang.String rolAuthoEmployNo;
   
   /** @pdOid 1c373018-cd7f-413b-8a38-9456738c8fea */
   public java.lang.String getRolNo() {
      return rolNo;
   }
   
   /** @param newRolNo
    * @pdOid 1323c4b0-b919-44f1-b76f-a40d25440785 */
   public void setRolNo(java.lang.String newRolNo) {
      rolNo = newRolNo;
   }
   
   /** @pdOid 63d9caae-3e45-4a9a-b8da-642b86cf3595 */
   public java.lang.String getRolName() {
      return rolName;
   }
   
   /** @param newRolName
    * @pdOid 4882af53-1014-441e-b8e9-ebdfe708de34 */
   public void setRolName(java.lang.String newRolName) {
      rolName = newRolName;
   }
   
   /** @pdOid 7c556574-29fd-4960-a69e-0e598224172d */
   public java.util.Date getRolCreatetime() {
      return rolCreatetime;
   }
   
   /** @param newRolCreatetime
    * @pdOid 02765fe5-e673-4a45-a4a5-abd885b40a59 */
   public void setRolCreatetime(java.util.Date newRolCreatetime) {
      rolCreatetime = newRolCreatetime;
   }
   
   /** @pdOid 4f73d2d2-05dc-4dba-a842-502823a966fb */
   public int getRolOrderNumber() {
      return rolOrderNumber;
   }
   
   /** @param newRolOrderNumber
    * @pdOid 3badf961-75d0-41cc-9152-2a561dabfcc1 */
   public void setRolOrderNumber(int newRolOrderNumber) {
      rolOrderNumber = newRolOrderNumber;
   }
   
   /** @pdOid 0e016591-6a6d-4c83-a6d6-d7aef51489d3 */
   public java.lang.String getRolDesc() {
      return rolDesc;
   }
   
   /** @param newRolDesc
    * @pdOid bd95b695-85df-43ec-a8b6-e12b998e9314 */
   public void setRolDesc(java.lang.String newRolDesc) {
      rolDesc = newRolDesc;
   }
   
   /** @pdOid 217baf69-168a-4430-adf7-aecd4d3fd9c9 */
   public java.lang.String getRolStatus() {
      return rolStatus;
   }
   
   /** @param newRolStatus
    * @pdOid 71614844-31fd-42d2-94e3-bd3d122373be */
   public void setRolStatus(java.lang.String newRolStatus) {
      rolStatus = newRolStatus;
   }
   
   /** @pdOid 09edcfea-cfc6-4309-b112-1b0a0080f4be */
   public java.lang.String getRolAuthoEmployNo() {
      return rolAuthoEmployNo;
   }
   
   /** @param newRolAuthoEmployNo
    * @pdOid 80a785b2-1ce7-4caa-a3bc-55e86e6b6e77 */
   public void setRolAuthoEmployNo(java.lang.String newRolAuthoEmployNo) {
      rolAuthoEmployNo = newRolAuthoEmployNo;
   }

}