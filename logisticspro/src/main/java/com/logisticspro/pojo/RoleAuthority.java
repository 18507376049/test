/***********************************************************************
 * Module:  RoleAuthority.java
 * Author:  Administrator
 * Purpose: Defines the Class RoleAuthority
 ***********************************************************************/

import java.util.*;

/** @pdOid 5d725c5b-4022-47fb-95b2-359775b20930 */
public class RoleAuthority {
   /** 角色权限编号
    *             
    * 
    * @pdOid a7c00c4c-3c8a-4138-8d30-2a7edc974c09 */
   private java.lang.String roaRoleAuthNo;
   /** 角色编号
    *             
    * 
    * @pdOid 9edda459-a5d9-4ee0-99a2-97f28f3dfe6d */
   private java.lang.String roaRolNo;
   /** 一级菜单权限编号
    *             
    * 
    * @pdOid b3d00568-46ab-4fcc-a9fc-2589b82a5211 */
   private java.lang.String roaAuthFirstMenuNo;
   /** 二级菜单权限编号
    *             
    * 
    * @pdOid dd7034a7-b920-4b95-b672-d5424669da99 */
   private java.lang.String roaAuthSecondMenuNo;
   /** 功能权限标识
    *             
    * 
    * @pdOid 1f1402ee-3ebf-43ff-b39d-2500fe62479c */
   private java.lang.String roaAuthActionNo;
   /** 角色权限描述
    *             
    * 
    * @pdOid ca73ba10-188b-47ae-a8b1-035881df7bcf */
   private java.lang.String roaRoleAuthDesc;
   
   /** @pdOid 9c56b25b-8d56-4abd-a168-ea2649a150eb */
   public java.lang.String getRoaRoleAuthNo() {
      return roaRoleAuthNo;
   }
   
   /** @param newRoaRoleAuthNo
    * @pdOid a4fec4dc-e173-4aad-852e-6bd85ebe7fc7 */
   public void setRoaRoleAuthNo(java.lang.String newRoaRoleAuthNo) {
      roaRoleAuthNo = newRoaRoleAuthNo;
   }
   
   /** @pdOid 37cc5210-929c-4a6c-b496-95c112e1b2f9 */
   public java.lang.String getRoaRolNo() {
      return roaRolNo;
   }
   
   /** @param newRoaRolNo
    * @pdOid cd95cf0a-3170-4c1a-b54b-7d67867b06dc */
   public void setRoaRolNo(java.lang.String newRoaRolNo) {
      roaRolNo = newRoaRolNo;
   }
   
   /** @pdOid 9087cb9d-1a2f-44e5-9d6a-2e59dbba65cb */
   public java.lang.String getRoaAuthFirstMenuNo() {
      return roaAuthFirstMenuNo;
   }
   
   /** @param newRoaAuthFirstMenuNo
    * @pdOid 43087b3f-0d92-461f-9f74-f4f10a0c2d83 */
   public void setRoaAuthFirstMenuNo(java.lang.String newRoaAuthFirstMenuNo) {
      roaAuthFirstMenuNo = newRoaAuthFirstMenuNo;
   }
   
   /** @pdOid 8472a182-2a65-4625-a883-958230733b55 */
   public java.lang.String getRoaAuthSecondMenuNo() {
      return roaAuthSecondMenuNo;
   }
   
   /** @param newRoaAuthSecondMenuNo
    * @pdOid 196e51bc-9515-4eff-aae2-fe2ba7ee2dcb */
   public void setRoaAuthSecondMenuNo(java.lang.String newRoaAuthSecondMenuNo) {
      roaAuthSecondMenuNo = newRoaAuthSecondMenuNo;
   }
   
   /** @pdOid 87bd41fb-5c8f-4025-be91-eb356ccd3f2c */
   public java.lang.String getRoaAuthActionNo() {
      return roaAuthActionNo;
   }
   
   /** @param newRoaAuthActionNo
    * @pdOid db5fec33-3817-44d3-bbe7-48bca5126fbd */
   public void setRoaAuthActionNo(java.lang.String newRoaAuthActionNo) {
      roaAuthActionNo = newRoaAuthActionNo;
   }
   
   /** @pdOid c2d4ef60-6ac9-4eb4-973e-0307a700e9e1 */
   public java.lang.String getRoaRoleAuthDesc() {
      return roaRoleAuthDesc;
   }
   
   /** @param newRoaRoleAuthDesc
    * @pdOid 625194ce-17a7-412e-8e09-3b1f2f335ba8 */
   public void setRoaRoleAuthDesc(java.lang.String newRoaRoleAuthDesc) {
      roaRoleAuthDesc = newRoaRoleAuthDesc;
   }

}