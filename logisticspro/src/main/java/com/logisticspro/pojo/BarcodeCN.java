package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 条码打印
 */
public class BarcodeCN {
   /**
    * 条码打印单号
    */
   private String barNo;
   /**
    * 工作单号
    */
   private String barGongNo;
   /**
    * 件数
    */
   private int barQuantity;
   /**
    * 分拣编码
    */
   private String barSortingId;
   /**
    * 发站
    */
   private String barSend;
   /**
    * 发货方式
    */
   private String barSendWay;
   /**
    * 到站
    */
   private String barArrive;
   /**
    * 返货标志
    */
   private String barReturnMark;
   /**
    * 时间
    */
   private Date barDate;
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

   public BarcodeCN() {
   }

   public BarcodeCN(String barNo, String barGongNo, int barQuantity, String barSortingId, String barSend, String barSendWay, String barArrive, String barReturnMark, Date barDate, String duo1, String duo2, String duo3) {
      this.barNo = barNo;
      this.barGongNo = barGongNo;
      this.barQuantity = barQuantity;
      this.barSortingId = barSortingId;
      this.barSend = barSend;
      this.barSendWay = barSendWay;
      this.barArrive = barArrive;
      this.barReturnMark = barReturnMark;
      this.barDate = barDate;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "BarcodeCN{" +
              "barNo='" + barNo + '\'' +
              ", barGongNo='" + barGongNo + '\'' +
              ", barQuantity=" + barQuantity +
              ", barSortingId='" + barSortingId + '\'' +
              ", barSend='" + barSend + '\'' +
              ", barSendWay='" + barSendWay + '\'' +
              ", barArrive='" + barArrive + '\'' +
              ", barReturnMark='" + barReturnMark + '\'' +
              ", barDate=" + barDate +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getBarNo() {
      return barNo;
   }

   public void setBarNo(String barNo) {
      this.barNo = barNo;
   }

   public String getBarGongNo() {
      return barGongNo;
   }

   public void setBarGongNo(String barGongNo) {
      this.barGongNo = barGongNo;
   }

   public int getBarQuantity() {
      return barQuantity;
   }

   public void setBarQuantity(int barQuantity) {
      this.barQuantity = barQuantity;
   }

   public String getBarSortingId() {
      return barSortingId;
   }

   public void setBarSortingId(String barSortingId) {
      this.barSortingId = barSortingId;
   }

   public String getBarSend() {
      return barSend;
   }

   public void setBarSend(String barSend) {
      this.barSend = barSend;
   }

   public String getBarSendWay() {
      return barSendWay;
   }

   public void setBarSendWay(String barSendWay) {
      this.barSendWay = barSendWay;
   }

   public String getBarArrive() {
      return barArrive;
   }

   public void setBarArrive(String barArrive) {
      this.barArrive = barArrive;
   }

   public String getBarReturnMark() {
      return barReturnMark;
   }

   public void setBarReturnMark(String barReturnMark) {
      this.barReturnMark = barReturnMark;
   }

   public Date getBarDate() {
      return barDate;
   }

   public void setBarDate(Date barDate) {
      this.barDate = barDate;
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