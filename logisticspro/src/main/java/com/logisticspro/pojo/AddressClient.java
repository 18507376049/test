/***********************************************************************
 * Module:  AddressClient.java
 * Author:  Administrator
 * Purpose: Defines the Class AddressClient
 ***********************************************************************/

import java.util.*;

/** @pdOid c233e9d4-bb14-45c0-b502-e28086027be6 */
public class AddressClient {
   /** 客户地址中间表编号
    *             
    * 
    * @pdOid f8f53b65-f7ff-4ff2-8348-e5c1f0fa139a */
   private java.lang.String adcNo;
   /** 客户编号
    *             
    * 
    * @pdOid 97e5fb2b-7761-44fa-840b-8dea908091ae */
   private java.lang.String adcCilentNo;
   /** 地址编号
    *             
    * 
    * @pdOid d0bc222f-5f27-4b06-8a1d-61ebc6646fbd */
   private java.lang.String adcAddressNo;
   /** 是否为寄件地址
    *             
    * 
    * @pdOid 3d7e4f3a-4484-4edd-ab83-c285cb4bda9e */
   private int adcTrueOrFalse;
   
   /** @pdOid c0ca3b10-a0f1-47a9-8380-a41cfc36fe13 */
   public java.lang.String getAdcNo() {
      return adcNo;
   }
   
   /** @param newAdcNo
    * @pdOid af6bd3f5-f214-49a6-b59c-b179fbf418c6 */
   public void setAdcNo(java.lang.String newAdcNo) {
      adcNo = newAdcNo;
   }
   
   /** @pdOid 3a442f58-c3f2-402c-ade6-9982b73b63c5 */
   public java.lang.String getAdcCilentNo() {
      return adcCilentNo;
   }
   
   /** @param newAdcCilentNo
    * @pdOid 3b83f8b0-4c43-410f-bd71-e46a9a8bed5b */
   public void setAdcCilentNo(java.lang.String newAdcCilentNo) {
      adcCilentNo = newAdcCilentNo;
   }
   
   /** @pdOid 58a4522c-e3ce-4e63-ab1e-2bc3b8f4884a */
   public java.lang.String getAdcAddressNo() {
      return adcAddressNo;
   }
   
   /** @param newAdcAddressNo
    * @pdOid 50b25795-42af-42e0-98ff-30a9ba4f6485 */
   public void setAdcAddressNo(java.lang.String newAdcAddressNo) {
      adcAddressNo = newAdcAddressNo;
   }
   
   /** @pdOid 53cc7bf7-19e5-44fa-a726-4526e4682913 */
   public int getAdcTrueOrFalse() {
      return adcTrueOrFalse;
   }
   
   /** @param newAdcTrueOrFalse
    * @pdOid 1d4ad4e1-c322-4e4d-8399-10d8caa9450b */
   public void setAdcTrueOrFalse(int newAdcTrueOrFalse) {
      adcTrueOrFalse = newAdcTrueOrFalse;
   }

}