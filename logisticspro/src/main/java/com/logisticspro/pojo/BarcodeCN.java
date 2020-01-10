/***********************************************************************
 * Module:  BarcodeCN.java
 * Author:  Administrator
 * Purpose: Defines the Class BarcodeCN
 ***********************************************************************/

import java.util.*;

/** @pdOid 92dd4305-e2c0-4767-81bd-985c68d0dfd6 */
public class BarcodeCN {
   /** 条码打印单号
    *             
    * 
    * @pdOid fbc5ac38-818c-4ae1-a020-030c4c0abc25 */
   private java.lang.String barNo;
   /** 工作单号
    *             
    * 
    * @pdOid a72d63ef-0919-40b8-952a-358ee7fb2ad0 */
   private java.lang.String barGongNo;
   /** 件数
    *             
    * 
    * @pdOid 1c045968-03bc-4c08-a0bb-50979613c00d */
   private int barQuantity;
   /** 分拣编码
    *             
    * 
    * @pdOid f5957e3d-709f-4245-bd5a-78cc9439e7d0 */
   private java.lang.String barSortingId;
   /** 发站
    *             
    * 
    * @pdOid 86e1dedc-6d4e-421f-9fe8-f8cefa9b9e9b */
   private java.lang.String barSend;
   /** 发货方式
    *             
    * 
    * @pdOid 841bfd81-5458-4294-bda1-cdf1ff119bce */
   private java.lang.String barSendWay;
   /** 到站
    *             
    * 
    * @pdOid e2c04a1f-bd72-436b-a508-2b072e2ddfdf */
   private java.lang.String barArrive;
   /** 返货标志
    *             
    * 
    * @pdOid d645e85f-9406-489d-8ac7-469eab3c8d90 */
   private java.lang.String barReturnMark;
   /** 时间
    *             
    * 
    * @pdOid b53b21bd-4656-4584-b30b-5d8efa76d769 */
   private java.util.Date barDate;
   /** @pdOid ff17250a-ba06-4a22-9524-e72db640b273 */
   private java.lang.String duo1;
   /** @pdOid eef3817d-f289-48c1-9024-32dc63f68c05 */
   private java.lang.String duo2;
   /** @pdOid 93ce4db1-6d09-4ec3-93cc-32c76798a6d7 */
   private java.lang.String duo3;
   
   /** @pdOid 2e92b0e7-4c90-4657-8c19-8a1289544a0c */
   public java.lang.String getBarNo() {
      return barNo;
   }
   
   /** @param newBarNo
    * @pdOid 370ea4d9-b06a-4a5c-aee0-3095baf9075f */
   public void setBarNo(java.lang.String newBarNo) {
      barNo = newBarNo;
   }
   
   /** @pdOid 4b0aba27-e89e-4fea-92e0-bc53a8836b4e */
   public java.lang.String getBarGongNo() {
      return barGongNo;
   }
   
   /** @param newBarGongNo
    * @pdOid 5b2c7030-bf91-4245-a4c6-38a494b2298c */
   public void setBarGongNo(java.lang.String newBarGongNo) {
      barGongNo = newBarGongNo;
   }
   
   /** @pdOid f8f30580-0f75-433e-ab43-cd0446faf33b */
   public int getBarQuantity() {
      return barQuantity;
   }
   
   /** @param newBarQuantity
    * @pdOid 4a48567b-2730-4391-89c5-8ac3bde190f6 */
   public void setBarQuantity(int newBarQuantity) {
      barQuantity = newBarQuantity;
   }
   
   /** @pdOid 1d8a3363-a5d7-420b-af2d-b709aa7163ef */
   public java.lang.String getBarSortingId() {
      return barSortingId;
   }
   
   /** @param newBarSortingId
    * @pdOid 9f646dd4-67b0-4ff8-a41a-27668de64d3c */
   public void setBarSortingId(java.lang.String newBarSortingId) {
      barSortingId = newBarSortingId;
   }
   
   /** @pdOid 0001126b-cb53-4d4e-84a0-2b33f91c1822 */
   public java.lang.String getBarSend() {
      return barSend;
   }
   
   /** @param newBarSend
    * @pdOid 1c17d6bb-e8c0-4ddb-b318-3cbe02454c3a */
   public void setBarSend(java.lang.String newBarSend) {
      barSend = newBarSend;
   }
   
   /** @pdOid 448bbc78-a8e5-4e42-95ad-c43715d02965 */
   public java.lang.String getBarSendWay() {
      return barSendWay;
   }
   
   /** @param newBarSendWay
    * @pdOid 3949828d-b940-4600-9267-d9cf2a3cb63d */
   public void setBarSendWay(java.lang.String newBarSendWay) {
      barSendWay = newBarSendWay;
   }
   
   /** @pdOid 94a302de-679f-4956-a2e5-4cfb77052ddd */
   public java.lang.String getBarArrive() {
      return barArrive;
   }
   
   /** @param newBarArrive
    * @pdOid e9d2564b-f9dc-4bbd-ba17-5486d91624cb */
   public void setBarArrive(java.lang.String newBarArrive) {
      barArrive = newBarArrive;
   }
   
   /** @pdOid 7301cf34-74eb-4dd6-b410-1e6ff9b1fb34 */
   public java.lang.String getBarReturnMark() {
      return barReturnMark;
   }
   
   /** @param newBarReturnMark
    * @pdOid e75a5217-0dc7-48db-a75d-b3c588dac309 */
   public void setBarReturnMark(java.lang.String newBarReturnMark) {
      barReturnMark = newBarReturnMark;
   }
   
   /** @pdOid ecf2650f-0b02-4027-9e0d-3edeaddc9d3d */
   public java.util.Date getBarDate() {
      return barDate;
   }
   
   /** @param newBarDate
    * @pdOid cb285ddb-6315-43e4-b479-6dcb04392e78 */
   public void setBarDate(java.util.Date newBarDate) {
      barDate = newBarDate;
   }
   
   /** @pdOid 59a2e258-45ff-4c1b-b4f6-2fb6ee336b7b */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 6e13eece-fdf7-4cd5-806d-f69de76354fc */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid c392d35c-0cfb-4b08-88cd-14ed45af7b52 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 318e96b2-ca41-45e4-aba5-4c82e704da54 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid fda995ac-1ab6-40e0-b612-07b9d9ee3407 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid e1c7f5b4-b3dd-4daf-afb5-9a22fe2bfd36 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}