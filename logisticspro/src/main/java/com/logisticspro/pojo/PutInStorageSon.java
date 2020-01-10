package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 入库分拣
 */
public class PutInStorageSon {
   /**
    * 入库分拣单号
    */
   private String pusOdd;
   /**
    * 合包号
    */
   private String pusOrPackageNo;
   /**
    * 状态
    */
   private int pusStatus = 0;
   /**
    * 分拣入库编号
    */
   private String pusPisNo;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public PutInStorageSon() {
   }

   public PutInStorageSon(String pusOdd, String pusOrPackageNo, int pusStatus, String pusPisNo, String duo1, String duo2) {
      this.pusOdd = pusOdd;
      this.pusOrPackageNo = pusOrPackageNo;
      this.pusStatus = pusStatus;
      this.pusPisNo = pusPisNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   @Override
   public String toString() {
      return "PutInStorageSon{" +
              "pusOdd='" + pusOdd + '\'' +
              ", pusOrPackageNo='" + pusOrPackageNo + '\'' +
              ", pusStatus=" + pusStatus +
              ", pusPisNo='" + pusPisNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }

   public String getPusOdd() {
      return pusOdd;
   }

   public void setPusOdd(String pusOdd) {
      this.pusOdd = pusOdd;
   }

   public String getPusOrPackageNo() {
      return pusOrPackageNo;
   }

   public void setPusOrPackageNo(String pusOrPackageNo) {
      this.pusOrPackageNo = pusOrPackageNo;
   }

   public int getPusStatus() {
      return pusStatus;
   }

   public void setPusStatus(int pusStatus) {
      this.pusStatus = pusStatus;
   }

   public String getPusPisNo() {
      return pusPisNo;
   }

   public void setPusPisNo(String pusPisNo) {
      this.pusPisNo = pusPisNo;
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
}