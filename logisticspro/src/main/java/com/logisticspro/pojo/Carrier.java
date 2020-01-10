/***********************************************************************
 * Module:  Carrier.java
 * Author:  Administrator
 * Purpose: Defines the Class Carrier
 ***********************************************************************/

import java.util.*;

/** @pdOid 82fd3c4e-6682-40bb-95b4-dfbc8c2ac9bc */
public class Carrier {
   /** 承运商编号
    *             
    * 
    * @pdOid 68459a86-d249-43cb-9494-06c4c0f0faef */
   private java.lang.String caeId;
   /** 承运商名称
    *             
    * 
    * @pdOid 3bb349bc-5b98-41e0-ad9a-8c427c6e46cf */
   private java.lang.String caeName;
   /** 承运商地址
    *             
    * 
    * @pdOid e0f96deb-a812-418d-9e8e-8d1b32493784 */
   private java.lang.String caeAddress;
   /** 联系电话
    *             
    * 
    * @pdOid 98789939-dd3d-460b-9ce7-d0a7df53ce6b */
   private cha(11) caeTel;
   /** 承运商状态
    *             
    * 
    * @pdOid af78e4b2-d8a7-4409-8d08-e6f4dbf2840e */
   private int caeState;
   /** 备注
    *             
    * 
    * @pdOid 3985a81a-1293-4072-b277-87407dedbe9c */
   private java.lang.String caeRemarks;
   /** @pdOid 878a94de-0f98-4155-81ba-875528efaf73 */
   private java.lang.String duo1;
   /** @pdOid b781bd0b-84b8-4c9e-a15d-d16db9a57166 */
   private java.lang.String duo2;
   /** @pdOid dc4d576d-13d5-45aa-a705-d64c99104eb1 */
   private java.lang.String duo3;
   
   /** @pdOid dc90489f-efa0-42c0-bd8c-34fd8d023682 */
   public java.lang.String getCaeId() {
      return caeId;
   }
   
   /** @param newCaeId
    * @pdOid 689b6766-758a-4631-892f-2d7738b5cf2d */
   public void setCaeId(java.lang.String newCaeId) {
      caeId = newCaeId;
   }
   
   /** @pdOid b92d9c28-1135-42c6-82c4-502e15c912d0 */
   public java.lang.String getCaeName() {
      return caeName;
   }
   
   /** @param newCaeName
    * @pdOid ffbc85fe-048e-437a-9146-092cad4e7d50 */
   public void setCaeName(java.lang.String newCaeName) {
      caeName = newCaeName;
   }
   
   /** @pdOid 3aa96e75-cc43-47a1-ad3c-d7c6211aafc2 */
   public java.lang.String getCaeAddress() {
      return caeAddress;
   }
   
   /** @param newCaeAddress
    * @pdOid 1bbc4721-c9e9-43df-af06-54142f10412a */
   public void setCaeAddress(java.lang.String newCaeAddress) {
      caeAddress = newCaeAddress;
   }
   
   /** @pdOid 2bdd8ecd-d014-4378-8bd4-ec2a7bd83f37 */
   public cha(11) getCaeTel() {
      return caeTel;
   }
   
   /** @param newCaeTel
    * @pdOid 899cfd86-a6cd-4166-826a-9e4a5f329c28 */
   public void setCaeTel(cha(11) newCaeTel) {
      caeTel = newCaeTel;
   }
   
   /** @pdOid a7a7c018-0131-4e29-95d6-9112d0acd8ca */
   public int getCaeState() {
      return caeState;
   }
   
   /** @param newCaeState
    * @pdOid d86f71cc-9622-43c0-b82c-81c981428eed */
   public void setCaeState(int newCaeState) {
      caeState = newCaeState;
   }
   
   /** @pdOid 77d1a23a-b9b1-4fe8-997e-2aa7c7197052 */
   public java.lang.String getCaeRemarks() {
      return caeRemarks;
   }
   
   /** @param newCaeRemarks
    * @pdOid f4d945b3-73a6-4022-a436-7f7f3573b9df */
   public void setCaeRemarks(java.lang.String newCaeRemarks) {
      caeRemarks = newCaeRemarks;
   }
   
   /** @pdOid bc38de33-5da3-482f-96f1-d1be6336eea1 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid f395aa02-3d97-44c2-8268-98813889b59b */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 77d9f644-b7fb-4086-b618-d43765699073 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 4e2cc1fb-b57f-4ceb-9556-4a500935601d */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid c9cede9c-3e5a-40ab-a26a-42abaecc0d2c */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 4fae83ac-f361-4b8d-9a36-15cb679bf858 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}