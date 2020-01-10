package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: ID
 */
public class StopRoute {
   /**
    * ID
    *  */
   private String strNo;
   /**
    * 线路ID
    *  */
   private String strRouNo;
   /**
    * 站点ID
    *  */
   private String strStoNo;
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

   public String getStrNo() {
      return strNo;
   }

   public void setStrNo(String strNo) {
      this.strNo = strNo;
   }

   public String getStrRouNo() {
      return strRouNo;
   }

   public void setStrRouNo(String strRouNo) {
      this.strRouNo = strRouNo;
   }

   public String getStrStoNo() {
      return strStoNo;
   }

   public void setStrStoNo(String strStoNo) {
      this.strStoNo = strStoNo;
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

   public StopRoute(String strNo, String strRouNo, String strStoNo, String duo1, String duo2, String duo3) {
      this.strNo = strNo;
      this.strRouNo = strRouNo;
      this.strStoNo = strStoNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public StopRoute() {
   }

   @Override
   public String toString() {
      return "StopRoute{" +
              "strNo='" + strNo + '\'' +
              ", strRouNo='" + strRouNo + '\'' +
              ", strStoNo='" + strStoNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}