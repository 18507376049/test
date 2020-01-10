package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 分拣出库明细
 */
public class OutSorageSon {
   /**
    * 分拣出库明细单号
    */
   private String ostOdd;
   /**
    * 合包号
    */
   private String ostOrPackageNo;
   /**
    * 重量
    */
   private double ostWeight;
   /**
    * 体积
    */
   private double ostVolume;
   /**
    * 扫描时间
    */
   private Date ostScanningTime;
   /**
    * 是否扫描
    */
   private int ostScanning = 0;
   /**
    * 是否下环节入库
    */
   private int ostWhetherStorage = 0;
   /**
    * 是否二次入库
    */
   private int ostWhethSecoStora = 0;
   /**
    * 分拣出库单号
    */
   private String ostOusOdd;

   public OutSorageSon() {
   }

   public OutSorageSon(String ostOdd, String ostOrPackageNo, double ostWeight, double ostVolume, Date ostScanningTime, int ostScanning, int ostWhetherStorage, int ostWhethSecoStora, String ostOusOdd) {
      this.ostOdd = ostOdd;
      this.ostOrPackageNo = ostOrPackageNo;
      this.ostWeight = ostWeight;
      this.ostVolume = ostVolume;
      this.ostScanningTime = ostScanningTime;
      this.ostScanning = ostScanning;
      this.ostWhetherStorage = ostWhetherStorage;
      this.ostWhethSecoStora = ostWhethSecoStora;
      this.ostOusOdd = ostOusOdd;
   }

   @Override
   public String toString() {
      return "OutSorageSon{" +
              "ostOdd='" + ostOdd + '\'' +
              ", ostOrPackageNo='" + ostOrPackageNo + '\'' +
              ", ostWeight=" + ostWeight +
              ", ostVolume=" + ostVolume +
              ", ostScanningTime=" + ostScanningTime +
              ", ostScanning=" + ostScanning +
              ", ostWhetherStorage=" + ostWhetherStorage +
              ", ostWhethSecoStora=" + ostWhethSecoStora +
              ", ostOusOdd='" + ostOusOdd + '\'' +
              '}';
   }

   public String getOstOdd() {
      return ostOdd;
   }

   public void setOstOdd(String ostOdd) {
      this.ostOdd = ostOdd;
   }

   public String getOstOrPackageNo() {
      return ostOrPackageNo;
   }

   public void setOstOrPackageNo(String ostOrPackageNo) {
      this.ostOrPackageNo = ostOrPackageNo;
   }

   public double getOstWeight() {
      return ostWeight;
   }

   public void setOstWeight(double ostWeight) {
      this.ostWeight = ostWeight;
   }

   public double getOstVolume() {
      return ostVolume;
   }

   public void setOstVolume(double ostVolume) {
      this.ostVolume = ostVolume;
   }

   public Date getOstScanningTime() {
      return ostScanningTime;
   }

   public void setOstScanningTime(Date ostScanningTime) {
      this.ostScanningTime = ostScanningTime;
   }

   public int getOstScanning() {
      return ostScanning;
   }

   public void setOstScanning(int ostScanning) {
      this.ostScanning = ostScanning;
   }

   public int getOstWhetherStorage() {
      return ostWhetherStorage;
   }

   public void setOstWhetherStorage(int ostWhetherStorage) {
      this.ostWhetherStorage = ostWhetherStorage;
   }

   public int getOstWhethSecoStora() {
      return ostWhethSecoStora;
   }

   public void setOstWhethSecoStora(int ostWhethSecoStora) {
      this.ostWhethSecoStora = ostWhethSecoStora;
   }

   public String getOstOusOdd() {
      return ostOusOdd;
   }

   public void setOstOusOdd(String ostOusOdd) {
      this.ostOusOdd = ostOusOdd;
   }
}