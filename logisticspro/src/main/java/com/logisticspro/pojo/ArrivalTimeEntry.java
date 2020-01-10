package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 到达时间录入
 */
public class ArrivalTimeEntry {
   /**
    * 到达时间编号
    */
   private String ateNo;
   /**
    * 交接单号
    */
   private String ateReceiptNo;
   /**
    * 到达地
    */
   private Date ateDestinationPort;
   /**
    * 预计离开本地时间
    */
   private Date ateEstimTimeLea;
   /**
    * 预计到达下一站时间
    */
   private Date ateEstimTimeArri;
   /**
    * 实际到达本地时间
    */
   private Date ateActTime;
   /**
    * 录入人
    */
   private String ateDataEntryClerk;
   /**
    * 录入时间
    */
   private Date ateInputTime;
   /**
    * 录入单位
    */
   private String ateDanNo;
   /**
    * 状态
    */
   private int ateStatus = 0;
   /**
    *
    */
   private String duo1;
   /**
    *
    */
   private String duo2;
   /**
    *
    */
   private String duo3;

   public ArrivalTimeEntry() {
   }

   public ArrivalTimeEntry(String ateNo, String ateReceiptNo, Date ateDestinationPort, Date ateEstimTimeLea, Date ateEstimTimeArri, Date ateActTime, String ateDataEntryClerk, Date ateInputTime, String ateDanNo, int ateStatus, String duo1, String duo2, String duo3) {
      this.ateNo = ateNo;
      this.ateReceiptNo = ateReceiptNo;
      this.ateDestinationPort = ateDestinationPort;
      this.ateEstimTimeLea = ateEstimTimeLea;
      this.ateEstimTimeArri = ateEstimTimeArri;
      this.ateActTime = ateActTime;
      this.ateDataEntryClerk = ateDataEntryClerk;
      this.ateInputTime = ateInputTime;
      this.ateDanNo = ateDanNo;
      this.ateStatus = ateStatus;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "ArrivalTimeEntry{" +
              "ateNo='" + ateNo + '\'' +
              ", ateReceiptNo='" + ateReceiptNo + '\'' +
              ", ateDestinationPort=" + ateDestinationPort +
              ", ateEstimTimeLea=" + ateEstimTimeLea +
              ", ateEstimTimeArri=" + ateEstimTimeArri +
              ", ateActTime=" + ateActTime +
              ", ateDataEntryClerk='" + ateDataEntryClerk + '\'' +
              ", ateInputTime=" + ateInputTime +
              ", ateDanNo='" + ateDanNo + '\'' +
              ", ateStatus=" + ateStatus +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getAteNo() {
      return ateNo;
   }

   public void setAteNo(String ateNo) {
      this.ateNo = ateNo;
   }

   public String getAteReceiptNo() {
      return ateReceiptNo;
   }

   public void setAteReceiptNo(String ateReceiptNo) {
      this.ateReceiptNo = ateReceiptNo;
   }

   public Date getAteDestinationPort() {
      return ateDestinationPort;
   }

   public void setAteDestinationPort(Date ateDestinationPort) {
      this.ateDestinationPort = ateDestinationPort;
   }

   public Date getAteEstimTimeLea() {
      return ateEstimTimeLea;
   }

   public void setAteEstimTimeLea(Date ateEstimTimeLea) {
      this.ateEstimTimeLea = ateEstimTimeLea;
   }

   public Date getAteEstimTimeArri() {
      return ateEstimTimeArri;
   }

   public void setAteEstimTimeArri(Date ateEstimTimeArri) {
      this.ateEstimTimeArri = ateEstimTimeArri;
   }

   public Date getAteActTime() {
      return ateActTime;
   }

   public void setAteActTime(Date ateActTime) {
      this.ateActTime = ateActTime;
   }

   public String getAteDataEntryClerk() {
      return ateDataEntryClerk;
   }

   public void setAteDataEntryClerk(String ateDataEntryClerk) {
      this.ateDataEntryClerk = ateDataEntryClerk;
   }

   public Date getAteInputTime() {
      return ateInputTime;
   }

   public void setAteInputTime(Date ateInputTime) {
      this.ateInputTime = ateInputTime;
   }

   public String getAteDanNo() {
      return ateDanNo;
   }

   public void setAteDanNo(String ateDanNo) {
      this.ateDanNo = ateDanNo;
   }

   public int getAteStatus() {
      return ateStatus;
   }

   public void setAteStatus(int ateStatus) {
      this.ateStatus = ateStatus;
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