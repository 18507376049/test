/***********************************************************************
 * Module:  RecDesc.java
 * Author:  Administrator
 * Purpose: Defines the Class RecDesc
 ***********************************************************************/

import java.util.*;

/** @pdOid 6675ad27-f376-4f64-8820-180ff926fb34 */
public class RecDesc {
   /** 基础档案明细编号
    *             
    * 
    * @pdOid 037af6bf-6816-4118-9d39-e6a995b2408d */
   private java.lang.String redNo;
   /** 基础档案明细名称
    *             
    * 
    * @pdOid 65fe6841-15c1-4d89-a67f-7dea1901a098 */
   private java.lang.String redName;
   /** 上级编码
    *             
    * 
    * @pdOid d6fa8f96-a242-407e-a786-204a181dbb97 */
   private java.lang.String redRecNo;
   /** 助记码
    *             封存标志
    *             
    * 
    * @pdOid ac9ee049-7549-4f3d-bf04-10cb2736de4d */
   private java.lang.String redMnemonic;
   /** 封存标志
    *             
    * 
    * @pdOid 0c7543f9-6e60-4262-8549-2e3831feb848 */
   private int redSign = 0;
   /** 备注
    *             
    * 
    * @pdOid 497f815a-f7a5-41a1-ac9c-f6df8a5f0be7 */
   private java.lang.String redComment;
   /** 操作人员
    *             
    * 
    * @pdOid 979315f7-4faa-4b9c-87fd-2cf8aca49f44 */
   private java.lang.String redEmployeeNo;
   /** 操作单位
    *             
    * 
    * @pdOid f727f983-0632-469e-9c34-b6010c3352ed */
   private java.lang.String redUnitNo;
   /** 操作时间
    *             
    * 
    * @pdOid 8e569102-284b-4273-986b-ee4582a0e40f */
   private java.util.Date redTime;
   /** @pdOid 8c2aa631-666a-411b-a8aa-596512a65697 */
   private java.lang.String duo1;
   /** @pdOid 833b6de8-c9b4-4352-b132-99f5927f2847 */
   private java.lang.String duo2;
   /** @pdOid 4c532957-88e0-4b74-bf1d-4d0a20659269 */
   private java.lang.String duo3;
   
   /** @pdOid 2ccd809e-d7c2-4cce-af83-83125d7ba0d9 */
   public java.lang.String getRedNo() {
      return redNo;
   }
   
   /** @param newRedNo
    * @pdOid 7b64f87b-086a-4847-bcf4-5de32ec8a84b */
   public void setRedNo(java.lang.String newRedNo) {
      redNo = newRedNo;
   }
   
   /** @pdOid 658dcb1d-c6e7-46a8-9c39-78b2132fe497 */
   public java.lang.String getRedName() {
      return redName;
   }
   
   /** @param newRedName
    * @pdOid 38768a6f-39d1-489c-9105-e3f24990f696 */
   public void setRedName(java.lang.String newRedName) {
      redName = newRedName;
   }
   
   /** @pdOid 7d290781-77eb-4634-8361-cc650678cfac */
   public java.lang.String getRedRecNo() {
      return redRecNo;
   }
   
   /** @param newRedRecNo
    * @pdOid fc293ab0-7457-479c-9f47-03532fb5b27d */
   public void setRedRecNo(java.lang.String newRedRecNo) {
      redRecNo = newRedRecNo;
   }
   
   /** @pdOid 6ed91c03-6b5b-49c4-94ac-f154fcbc315b */
   public java.lang.String getRedMnemonic() {
      return redMnemonic;
   }
   
   /** @param newRedMnemonic
    * @pdOid 947fb388-3911-458a-ba7e-3c31d14a76c2 */
   public void setRedMnemonic(java.lang.String newRedMnemonic) {
      redMnemonic = newRedMnemonic;
   }
   
   /** @pdOid 80d603d1-689e-41fd-8cc7-31c26402576b */
   public int getRedSign() {
      return redSign;
   }
   
   /** @param newRedSign
    * @pdOid 430c85d9-4a7a-4857-b39d-91a3a204f7cd */
   public void setRedSign(int newRedSign) {
      redSign = newRedSign;
   }
   
   /** @pdOid 2934150f-e8cd-42ce-98a2-e2f5505eeea7 */
   public java.lang.String getRedComment() {
      return redComment;
   }
   
   /** @param newRedComment
    * @pdOid 590a6aee-e916-4f43-8fb2-25b8927b35db */
   public void setRedComment(java.lang.String newRedComment) {
      redComment = newRedComment;
   }
   
   /** @pdOid 25ae22f9-49b6-48d6-821a-b46dc9b730d5 */
   public java.lang.String getRedEmployeeNo() {
      return redEmployeeNo;
   }
   
   /** @param newRedEmployeeNo
    * @pdOid 690fb00c-fbec-414c-ba1f-b94a766ff540 */
   public void setRedEmployeeNo(java.lang.String newRedEmployeeNo) {
      redEmployeeNo = newRedEmployeeNo;
   }
   
   /** @pdOid 2090a6a7-e768-487f-9389-f533ab3f3dec */
   public java.lang.String getRedUnitNo() {
      return redUnitNo;
   }
   
   /** @param newRedUnitNo
    * @pdOid 5347702f-2a42-4c3b-9677-ac359f28d47f */
   public void setRedUnitNo(java.lang.String newRedUnitNo) {
      redUnitNo = newRedUnitNo;
   }
   
   /** @pdOid ad33fd68-7c99-4e1e-9230-dc6d9973ccbe */
   public java.util.Date getRedTime() {
      return redTime;
   }
   
   /** @param newRedTime
    * @pdOid 8e9afab0-6a24-4b87-b0e2-3b4655020b7d */
   public void setRedTime(java.util.Date newRedTime) {
      redTime = newRedTime;
   }
   
   /** @pdOid 9ec7d37d-d31a-40ad-a428-e07bd27645c3 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 1b4281c5-beba-47ea-8f55-a998ccf1c2d9 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 220a32bc-6982-47b1-9c5f-579bd34155b4 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 1988378d-30c2-467e-adf0-95e2b05bc949 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 4ea92d3b-57f2-4a79-af24-5ff705e8127d */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid defff7a9-9a24-4b7d-953d-c6efec580328 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}