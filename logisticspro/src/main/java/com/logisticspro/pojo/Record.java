package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 基本档案
 */
public class Record {
   /**
    * 基本档案编号
    */
   private String recNo;
   /**
    * 基本档案名称
    */
   private String recName;
   /**
    * 档案是否分级
    */
   private int recScale = 0;
   /**
    * 备注
    */
   private String recComment;
   /**
    * 操作人员
    */
   private String recEmployeeNo;
   /**
    * 操作单位
    */
   private String recUnitNo;
   /**
    * 操作时间
    */
   private Date recTime;
   /**
    * 状态
    */
   private int recStatus = 0;
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

   public Record() {
   }

   public Record(String recNo, String recName, int recScale, String recComment, String recEmployeeNo, String recUnitNo, Date recTime, int recStatus, String duo1, String duo2, String duo3) {
      this.recNo = recNo;
      this.recName = recName;
      this.recScale = recScale;
      this.recComment = recComment;
      this.recEmployeeNo = recEmployeeNo;
      this.recUnitNo = recUnitNo;
      this.recTime = recTime;
      this.recStatus = recStatus;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Record{" +
              "recNo='" + recNo + '\'' +
              ", recName='" + recName + '\'' +
              ", recScale=" + recScale +
              ", recComment='" + recComment + '\'' +
              ", recEmployeeNo='" + recEmployeeNo + '\'' +
              ", recUnitNo='" + recUnitNo + '\'' +
              ", recTime=" + recTime +
              ", recStatus=" + recStatus +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getRecNo() {
      return recNo;
   }

   public void setRecNo(String recNo) {
      this.recNo = recNo;
   }

   public String getRecName() {
      return recName;
   }

   public void setRecName(String recName) {
      this.recName = recName;
   }

   public int getRecScale() {
      return recScale;
   }

   public void setRecScale(int recScale) {
      this.recScale = recScale;
   }

   public String getRecComment() {
      return recComment;
   }

   public void setRecComment(String recComment) {
      this.recComment = recComment;
   }

   public String getRecEmployeeNo() {
      return recEmployeeNo;
   }

   public void setRecEmployeeNo(String recEmployeeNo) {
      this.recEmployeeNo = recEmployeeNo;
   }

   public String getRecUnitNo() {
      return recUnitNo;
   }

   public void setRecUnitNo(String recUnitNo) {
      this.recUnitNo = recUnitNo;
   }

   public Date getRecTime() {
      return recTime;
   }

   public void setRecTime(Date recTime) {
      this.recTime = recTime;
   }

   public int getRecStatus() {
      return recStatus;
   }

   public void setRecStatus(int recStatus) {
      this.recStatus = recStatus;
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