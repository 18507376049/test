package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 发货数据项(货票号信息)
 */
public class NoteNumberInformation {
   /**
    * 货票号
    */
   private String goodsWere;
   /**
    * 出库交接单号
    */
   private String outboundNumber;
   /**
    * 件数
    */
   private int numberOfCases;
   /**
    * 补缴金额
    */
   private double paymentOfAmount;
   /**
    * 重要提示
    */
   private String importantNote;
   /**
    * 录入日期
    */
   private Date dateOfEntry;
   /**
    * 录入人
    */
   private String dataEntryClerk;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;
   /**
    *
    * */
   private String duo3;

   public NoteNumberInformation() {
   }

   public NoteNumberInformation(String goodsWere, String outboundNumber, int numberOfCases, double paymentOfAmount, String importantNote, Date dateOfEntry, String dataEntryClerk, String duo1, String duo2, String duo3) {
      this.goodsWere = goodsWere;
      this.outboundNumber = outboundNumber;
      this.numberOfCases = numberOfCases;
      this.paymentOfAmount = paymentOfAmount;
      this.importantNote = importantNote;
      this.dateOfEntry = dateOfEntry;
      this.dataEntryClerk = dataEntryClerk;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "NoteNumberInformation{" +
              "goodsWere='" + goodsWere + '\'' +
              ", outboundNumber='" + outboundNumber + '\'' +
              ", numberOfCases=" + numberOfCases +
              ", paymentOfAmount=" + paymentOfAmount +
              ", importantNote='" + importantNote + '\'' +
              ", dateOfEntry=" + dateOfEntry +
              ", dataEntryClerk='" + dataEntryClerk + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getGoodsWere() {
      return goodsWere;
   }

   public void setGoodsWere(String goodsWere) {
      this.goodsWere = goodsWere;
   }

   public String getOutboundNumber() {
      return outboundNumber;
   }

   public void setOutboundNumber(String outboundNumber) {
      this.outboundNumber = outboundNumber;
   }

   public int getNumberOfCases() {
      return numberOfCases;
   }

   public void setNumberOfCases(int numberOfCases) {
      this.numberOfCases = numberOfCases;
   }

   public double getPaymentOfAmount() {
      return paymentOfAmount;
   }

   public void setPaymentOfAmount(double paymentOfAmount) {
      this.paymentOfAmount = paymentOfAmount;
   }

   public String getImportantNote() {
      return importantNote;
   }

   public void setImportantNote(String importantNote) {
      this.importantNote = importantNote;
   }

   public Date getDateOfEntry() {
      return dateOfEntry;
   }

   public void setDateOfEntry(Date dateOfEntry) {
      this.dateOfEntry = dateOfEntry;
   }

   public String getDataEntryClerk() {
      return dataEntryClerk;
   }

   public void setDataEntryClerk(String dataEntryClerk) {
      this.dataEntryClerk = dataEntryClerk;
   }

   public String getDuo1() {
      return duo1;
   }

   public void setDuo1(String duo1) {
      this.duo1 = duo1;
   }

   public String getDuo2() {
      return duo2;
   }

   public void setDuo2(String duo2) {
      this.duo2 = duo2;
   }

   public String getDuo3() {
      return duo3;
   }

   public void setDuo3(String duo3) {
      this.duo3 = duo3;
   }
}