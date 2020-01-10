/***********************************************************************
 * Module:  SignatureEntry.java
 * Author:  Administrator
 * Purpose: Defines the Class SignatureEntry
 ***********************************************************************/

import java.util.*;

/** @pdOid ec5c9c1e-0f1b-4cdd-b7da-7c77830545d8 */
public class SignatureEntry {
   /** 签收录入单号
    *             
    * 
    * @pdOid 2d87e033-f2d0-4378-b190-1a71d6128e21 */
   private java.lang.String sigNo;
   /** 工作单号
    *             
    * 
    * @pdOid 5d8d2a27-773f-49eb-bc49-45ce8926aac8 */
   private java.lang.String sigWorkNo;
   /** 返单标志
    *             
    * 
    * @pdOid 22ef73ee-1508-451e-aa40-cdfbcc8630e5 */
   private int sigReturnOrders;
   /** 派送员工号
    *             
    * 
    * @pdOid 5131eece-1d0d-4419-beb1-af6b05640512 */
   private java.lang.String sigSendNo;
   /** 派送员姓名
    *             
    *             
    * 
    * @pdOid 79e37dde-c1ec-4e78-bc6a-0d0f8acb2023 */
   private java.lang.String sigSendName;
   /** 派送单位
    *             
    * 
    * @pdOid f6fcc28a-ca9a-4a6a-87ed-a442172aca6a */
   private java.lang.String sigSendUnit;
   /** 签收人
    *             
    * 
    * @pdOid 19d382de-c1b9-46ec-8429-2917cf31b7bf */
   private java.lang.String sigSignPeople;
   /** 签收时间
    *             
    * 
    * @pdOid 6d4eb07e-306a-4c8c-b186-04131d973344 */
   private java.util.Date sigSignDate;
   /** 签收类型
    *             
    * 
    * @pdOid 31a6e1ab-5f00-4dbd-b0b3-d2cad7772f04 */
   private int sigSignType;
   /** 录入方式
    *             
    * 
    * @pdOid 19d366dc-6464-428d-8491-6ce04e881d85 */
   private java.lang.String sigEntry;
   /** 异常备注
    *             
    * 
    * @pdOid f798cd80-99c1-4fcc-8e57-a6afa5740556 */
   private java.lang.String sigAbnormalRemarks;
   /** 标志
    *             
    * 
    * @pdOid cd90ba2d-2034-4b03-8999-9775d0f4fe59 */
   private int sigInvalidSign;
   /** @pdOid d5f82782-b873-41e5-aa37-d697c9fafbd4 */
   private java.lang.String duo1;
   /** @pdOid 952f3901-4330-4547-b746-aae76a84d21f */
   private java.lang.String duo2;
   /** @pdOid e22ab1a8-2005-49a3-8022-ec0195adbbf7 */
   private java.lang.String duo3;
   
   /** @pdOid 65035eee-2472-4f53-93c5-81ea9a231584 */
   public java.lang.String getSigNo() {
      return sigNo;
   }
   
   /** @param newSigNo
    * @pdOid df699e0c-1bb3-4785-8946-61b3abd95c41 */
   public void setSigNo(java.lang.String newSigNo) {
      sigNo = newSigNo;
   }
   
   /** @pdOid ae9c05cc-02a6-495e-b8f4-dfa8249cfbc2 */
   public java.lang.String getSigWorkNo() {
      return sigWorkNo;
   }
   
   /** @param newSigWorkNo
    * @pdOid 281c6d55-10b2-4737-ad3c-bf3cfff046a0 */
   public void setSigWorkNo(java.lang.String newSigWorkNo) {
      sigWorkNo = newSigWorkNo;
   }
   
   /** @pdOid f78d88bf-ec95-47d2-a958-cac33b7e1411 */
   public int getSigReturnOrders() {
      return sigReturnOrders;
   }
   
   /** @param newSigReturnOrders
    * @pdOid 7ff4724e-19a5-47b8-9113-bedd95458999 */
   public void setSigReturnOrders(int newSigReturnOrders) {
      sigReturnOrders = newSigReturnOrders;
   }
   
   /** @pdOid 319885ce-213a-423e-9112-4557be1343f1 */
   public java.lang.String getSigSendNo() {
      return sigSendNo;
   }
   
   /** @param newSigSendNo
    * @pdOid 4befb562-b23c-49dd-9fd5-b0b19a41b66a */
   public void setSigSendNo(java.lang.String newSigSendNo) {
      sigSendNo = newSigSendNo;
   }
   
   /** @pdOid ccbd6857-448b-4d28-b3e8-56decd4228ba */
   public java.lang.String getSigSendName() {
      return sigSendName;
   }
   
   /** @param newSigSendName
    * @pdOid 97fef87e-2bf5-403a-b971-9781c0ff778b */
   public void setSigSendName(java.lang.String newSigSendName) {
      sigSendName = newSigSendName;
   }
   
   /** @pdOid 3e941da3-e9a7-49c2-847b-8382e813837e */
   public java.lang.String getSigSendUnit() {
      return sigSendUnit;
   }
   
   /** @param newSigSendUnit
    * @pdOid 306c2028-1cf1-42cc-a4df-034c3875d176 */
   public void setSigSendUnit(java.lang.String newSigSendUnit) {
      sigSendUnit = newSigSendUnit;
   }
   
   /** @pdOid 758a535f-d7f3-4659-8218-8a3d6cca1d50 */
   public java.lang.String getSigSignPeople() {
      return sigSignPeople;
   }
   
   /** @param newSigSignPeople
    * @pdOid d38fa06d-8ea0-4a48-8e6a-fb0086ef8ab8 */
   public void setSigSignPeople(java.lang.String newSigSignPeople) {
      sigSignPeople = newSigSignPeople;
   }
   
   /** @pdOid 341b0a87-8c22-4352-bd48-1d6d474c308e */
   public java.util.Date getSigSignDate() {
      return sigSignDate;
   }
   
   /** @param newSigSignDate
    * @pdOid 517d77ab-29c1-401c-ab96-fe717c5cf778 */
   public void setSigSignDate(java.util.Date newSigSignDate) {
      sigSignDate = newSigSignDate;
   }
   
   /** @pdOid 92ae843e-a661-4ba7-a059-2ab294d618a5 */
   public int getSigSignType() {
      return sigSignType;
   }
   
   /** @param newSigSignType
    * @pdOid bf4ba09c-17c1-4710-9d85-1ed528c91457 */
   public void setSigSignType(int newSigSignType) {
      sigSignType = newSigSignType;
   }
   
   /** @pdOid b0d3fb0e-ac05-4a8d-805c-8a790524bd5b */
   public java.lang.String getSigEntry() {
      return sigEntry;
   }
   
   /** @param newSigEntry
    * @pdOid c908986b-cd1c-4cfe-b30f-80aa0c40bd45 */
   public void setSigEntry(java.lang.String newSigEntry) {
      sigEntry = newSigEntry;
   }
   
   /** @pdOid 774d0384-2fca-451b-9913-a44cda31b856 */
   public java.lang.String getSigAbnormalRemarks() {
      return sigAbnormalRemarks;
   }
   
   /** @param newSigAbnormalRemarks
    * @pdOid b924e1d2-dbe9-4e8d-b7cc-89422e8c1c6c */
   public void setSigAbnormalRemarks(java.lang.String newSigAbnormalRemarks) {
      sigAbnormalRemarks = newSigAbnormalRemarks;
   }
   
   /** @pdOid 2ab14bf2-65e1-4844-b494-6cd4255f4f75 */
   public int getSigInvalidSign() {
      return sigInvalidSign;
   }
   
   /** @param newSigInvalidSign
    * @pdOid 6b07197f-3962-4081-94d8-3865c6310bfb */
   public void setSigInvalidSign(int newSigInvalidSign) {
      sigInvalidSign = newSigInvalidSign;
   }
   
   /** @pdOid 484aea41-a597-4f54-a848-ba9900ddb4e8 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 9d0f88bc-de79-47a5-bf3e-0a195282c192 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 4666f57e-e191-4a8c-ba93-9769cc3de6a8 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 4fe93f48-c3be-4231-ba12-5b572a884c33 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid bc27deff-4eaa-48b2-86ba-17519595a23a */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid ffbd9e0a-ca3c-4a56-a207-22d18cba573c */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}