package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 承运商
 */
public class Carrier {
   /**
    * 承运商编号
    */
   private String caeId;
   /**
    * 承运商名称
    */
   private String caeName;
   /**
    * 承运商地址
    */
   private String caeAddress;
   /**
    * 联系电话
    */
   private String caeTel;
   /**
    * 承运商状态
    */
   private int caeState;
   /**
    * 备注
    */
   private String caeRemarks;
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

   public Carrier() {
   }

   public Carrier(String caeId, String caeName, String caeAddress, String caeTel, int caeState, String caeRemarks, String duo1, String duo2, String duo3) {
      this.caeId = caeId;
      this.caeName = caeName;
      this.caeAddress = caeAddress;
      this.caeTel = caeTel;
      this.caeState = caeState;
      this.caeRemarks = caeRemarks;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Carrier{" +
              "caeId='" + caeId + '\'' +
              ", caeName='" + caeName + '\'' +
              ", caeAddress='" + caeAddress + '\'' +
              ", caeTel='" + caeTel + '\'' +
              ", caeState=" + caeState +
              ", caeRemarks='" + caeRemarks + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getCaeId() {
      return caeId;
   }

   public void setCaeId(String caeId) {
      this.caeId = caeId;
   }

   public String getCaeName() {
      return caeName;
   }

   public void setCaeName(String caeName) {
      this.caeName = caeName;
   }

   public String getCaeAddress() {
      return caeAddress;
   }

   public void setCaeAddress(String caeAddress) {
      this.caeAddress = caeAddress;
   }

   public String getCaeTel() {
      return caeTel;
   }

   public void setCaeTel(String caeTel) {
      this.caeTel = caeTel;
   }

   public int getCaeState() {
      return caeState;
   }

   public void setCaeState(int caeState) {
      this.caeState = caeState;
   }

   public String getCaeRemarks() {
      return caeRemarks;
   }

   public void setCaeRemarks(String caeRemarks) {
      this.caeRemarks = caeRemarks;
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