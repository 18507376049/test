package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 客户地址中间
 */
public class AddressClient {
   /**
    * 客户地址中间表编号
    */
   private String adcNo;
   /**
    * 客户编号
    */
   private String adcCilentNo;
   /**
    * 地址编号
    */
   private String adcAddressNo;
   /**
    * 是否为寄件地址
    */
   private int adcTrueOrFalse;

   public AddressClient() {

   }

   public AddressClient(String adcNo, String adcCilentNo, String adcAddressNo, int adcTrueOrFalse) {
      this.adcNo = adcNo;
      this.adcCilentNo = adcCilentNo;
      this.adcAddressNo = adcAddressNo;
      this.adcTrueOrFalse = adcTrueOrFalse;
   }

   @Override
   public String toString() {
      return "AddressClient{" +
              "adcNo='" + adcNo + '\'' +
              ", adcCilentNo='" + adcCilentNo + '\'' +
              ", adcAddressNo='" + adcAddressNo + '\'' +
              ", adcTrueOrFalse=" + adcTrueOrFalse +
              '}';
   }

   public String getAdcNo() {
      return adcNo;
   }

   public void setAdcNo(String adcNo) {
      this.adcNo = adcNo;
   }

   public String getAdcCilentNo() {
      return adcCilentNo;
   }

   public void setAdcCilentNo(String adcCilentNo) {
      this.adcCilentNo = adcCilentNo;
   }

   public String getAdcAddressNo() {
      return adcAddressNo;
   }

   public void setAdcAddressNo(String adcAddressNo) {
      this.adcAddressNo = adcAddressNo;
   }

   public int getAdcTrueOrFalse() {
      return adcTrueOrFalse;
   }

   public void setAdcTrueOrFalse(int adcTrueOrFalse) {
      this.adcTrueOrFalse = adcTrueOrFalse;
   }
}