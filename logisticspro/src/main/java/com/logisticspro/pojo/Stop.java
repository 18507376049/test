package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 站点
 */
public class Stop {
   /**
    * 站点ID
    * */
   private String stoNo;
   /**
    * 站点名称
    *  */
   private String stoName;
   /**
    * 站点地址
    *  */
   private String stoAddrees;
   /**
    *  站点省份
    * */
   private String stoProId;
   /**
    * 备注
    *  */
   private String stoComment;
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

   public String getStoNo() {
      return stoNo;
   }

   public void setStoNo(String stoNo) {
      this.stoNo = stoNo;
   }

   public String getStoName() {
      return stoName;
   }

   public void setStoName(String stoName) {
      this.stoName = stoName;
   }

   public String getStoAddrees() {
      return stoAddrees;
   }

   public void setStoAddrees(String stoAddrees) {
      this.stoAddrees = stoAddrees;
   }

   public String getStoProId() {
      return stoProId;
   }

   public void setStoProId(String stoProId) {
      this.stoProId = stoProId;
   }

   public String getStoComment() {
      return stoComment;
   }

   public void setStoComment(String stoComment) {
      this.stoComment = stoComment;
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

   public Stop(String stoNo, String stoName, String stoAddrees, String stoProId, String stoComment, String duo1, String duo2, String duo3) {
      this.stoNo = stoNo;
      this.stoName = stoName;
      this.stoAddrees = stoAddrees;
      this.stoProId = stoProId;
      this.stoComment = stoComment;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public Stop() {
   }

   @Override
   public String toString() {
      return "Stop{" +
              "stoNo='" + stoNo + '\'' +
              ", stoName='" + stoName + '\'' +
              ", stoAddrees='" + stoAddrees + '\'' +
              ", stoProId='" + stoProId + '\'' +
              ", stoComment='" + stoComment + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}