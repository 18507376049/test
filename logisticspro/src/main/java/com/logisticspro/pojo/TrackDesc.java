package com.logisticspro.pojo;
import java.util.*;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 跟踪明细
 */
public class TrackDesc {
   /**
    * 跟踪明细编号
    *  */
   private String trdNo;
   /**
    * 物流车
    * */
   private String trdLogistics;
   /**
    * 节点名称
    * */
   private String trdNode;
   /**
    * 物流调度人
    * */
   private String trdEmployeeNo;
   /**
    * 单位编号
    *  */
   private String trdUnitNo;
   /**
    * 预计到达时间
    * */
   private Date trdATime;
   /**
    * 实际到达时间
    * */
   private Date trdBTime;
   /**
    *  预计离开时间
    *  */
   private Date trdTimeA;
   /**
    * 实际离开时间
    * */
   private Date trdTimeB;
   /**
    *  状态
    *  */
   private int trdStatus = 0;
   /**
    * 操作人
    *  */
   private String trdOperator;
   /**
    * 跟踪编号
    * */
   private String trdTraNo;
   /**
    * 下一节点可装载量
    * */
   private String fodLowerNode;
   /**
    * 描述
    *  */
   private double fodComment;
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

   public String getTrdNo() {
      return trdNo;
   }

   public void setTrdNo(String trdNo) {
      this.trdNo = trdNo;
   }

   public String getTrdLogistics() {
      return trdLogistics;
   }

   public void setTrdLogistics(String trdLogistics) {
      this.trdLogistics = trdLogistics;
   }

   public String getTrdNode() {
      return trdNode;
   }

   public void setTrdNode(String trdNode) {
      this.trdNode = trdNode;
   }

   public String getTrdEmployeeNo() {
      return trdEmployeeNo;
   }

   public void setTrdEmployeeNo(String trdEmployeeNo) {
      this.trdEmployeeNo = trdEmployeeNo;
   }

   public String getTrdUnitNo() {
      return trdUnitNo;
   }

   public void setTrdUnitNo(String trdUnitNo) {
      this.trdUnitNo = trdUnitNo;
   }

   public Date getTrdATime() {
      return trdATime;
   }

   public void setTrdATime(Date trdATime) {
      this.trdATime = trdATime;
   }

   public Date getTrdBTime() {
      return trdBTime;
   }

   public void setTrdBTime(Date trdBTime) {
      this.trdBTime = trdBTime;
   }

   public Date getTrdTimeA() {
      return trdTimeA;
   }

   public void setTrdTimeA(Date trdTimeA) {
      this.trdTimeA = trdTimeA;
   }

   public Date getTrdTimeB() {
      return trdTimeB;
   }

   public void setTrdTimeB(Date trdTimeB) {
      this.trdTimeB = trdTimeB;
   }

   public int getTrdStatus() {
      return trdStatus;
   }

   public void setTrdStatus(int trdStatus) {
      this.trdStatus = trdStatus;
   }

   public String getTrdOperator() {
      return trdOperator;
   }

   public void setTrdOperator(String trdOperator) {
      this.trdOperator = trdOperator;
   }

   public String getTrdTraNo() {
      return trdTraNo;
   }

   public void setTrdTraNo(String trdTraNo) {
      this.trdTraNo = trdTraNo;
   }

   public String getFodLowerNode() {
      return fodLowerNode;
   }

   public void setFodLowerNode(String fodLowerNode) {
      this.fodLowerNode = fodLowerNode;
   }

   public double getFodComment() {
      return fodComment;
   }

   public void setFodComment(double fodComment) {
      this.fodComment = fodComment;
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

   public TrackDesc(String trdNo, String trdLogistics, String trdNode, String trdEmployeeNo, String trdUnitNo, Date trdATime, Date trdBTime, Date trdTimeA, Date trdTimeB, int trdStatus, String trdOperator, String trdTraNo, String fodLowerNode, double fodComment, String duo1, String duo2, String duo3) {
      this.trdNo = trdNo;
      this.trdLogistics = trdLogistics;
      this.trdNode = trdNode;
      this.trdEmployeeNo = trdEmployeeNo;
      this.trdUnitNo = trdUnitNo;
      this.trdATime = trdATime;
      this.trdBTime = trdBTime;
      this.trdTimeA = trdTimeA;
      this.trdTimeB = trdTimeB;
      this.trdStatus = trdStatus;
      this.trdOperator = trdOperator;
      this.trdTraNo = trdTraNo;
      this.fodLowerNode = fodLowerNode;
      this.fodComment = fodComment;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public TrackDesc() {
   }

   @Override
   public String toString() {
      return "TrackDesc{" +
              "trdNo='" + trdNo + '\'' +
              ", trdLogistics='" + trdLogistics + '\'' +
              ", trdNode='" + trdNode + '\'' +
              ", trdEmployeeNo='" + trdEmployeeNo + '\'' +
              ", trdUnitNo='" + trdUnitNo + '\'' +
              ", trdATime=" + trdATime +
              ", trdBTime=" + trdBTime +
              ", trdTimeA=" + trdTimeA +
              ", trdTimeB=" + trdTimeB +
              ", trdStatus=" + trdStatus +
              ", trdOperator='" + trdOperator + '\'' +
              ", trdTraNo='" + trdTraNo + '\'' +
              ", fodLowerNode='" + fodLowerNode + '\'' +
              ", fodComment=" + fodComment +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}