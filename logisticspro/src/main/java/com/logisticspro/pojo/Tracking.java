package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 跟踪
 */
public class Tracking {
   /**
    * 跟踪编号
    * */
   private String traNo;
   /**
    * 线路类型
    *  */
   private String traLineType;
   /**
    * 线路名称
    *  */
   private String traLineName;
   /**
    * 线路ID
    *  */
   private String traRouNo;
   /**
    * 物流状态
    *  */
   private int traStatus = 0;
   /**
    * 物流单号
    * */
   private String traLogNo;
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

   public String getTraNo() {
      return traNo;
   }

   public void setTraNo(String traNo) {
      this.traNo = traNo;
   }

   public String getTraLineType() {
      return traLineType;
   }

   public void setTraLineType(String traLineType) {
      this.traLineType = traLineType;
   }

   public String getTraLineName() {
      return traLineName;
   }

   public void setTraLineName(String traLineName) {
      this.traLineName = traLineName;
   }

   public String getTraRouNo() {
      return traRouNo;
   }

   public void setTraRouNo(String traRouNo) {
      this.traRouNo = traRouNo;
   }

   public int getTraStatus() {
      return traStatus;
   }

   public void setTraStatus(int traStatus) {
      this.traStatus = traStatus;
   }

   public String getTraLogNo() {
      return traLogNo;
   }

   public void setTraLogNo(String traLogNo) {
      this.traLogNo = traLogNo;
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

   public Tracking(String traNo, String traLineType, String traLineName, String traRouNo, int traStatus, String traLogNo, String duo1, String duo2, String duo3) {
      this.traNo = traNo;
      this.traLineType = traLineType;
      this.traLineName = traLineName;
      this.traRouNo = traRouNo;
      this.traStatus = traStatus;
      this.traLogNo = traLogNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public Tracking() {
   }

   @Override
   public String toString() {
      return "Tracking{" +
              "traNo='" + traNo + '\'' +
              ", traLineType='" + traLineType + '\'' +
              ", traLineName='" + traLineName + '\'' +
              ", traRouNo='" + traRouNo + '\'' +
              ", traStatus=" + traStatus +
              ", traLogNo='" + traLogNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}