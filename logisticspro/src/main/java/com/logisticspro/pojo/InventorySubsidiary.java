package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 盘库明细
 */
public class InventorySubsidiary {
   /**
    * 盘库明细单号
    */
   private String insNo;
   /**
    * 工作单号
    */
   private String insWorkOrderNo;
   /**
    * 合包号
    */
   private String insOrPackageNo;
   /**
    * 件数
    */
   private int insNumberCases;
   /**
    * 重量
    */
   private double insWeight;
   /**
    * 体积
    */
   private double insVolume;
   /**
    * 是否破损
    */
   private int insWhetherDamage;
   /**
    * 入库交接单号
    */
   private String insOutBounNumber;
   /**
    * 类型
    */
   private String insType;
   /**
    * 到达地
    */
   private String insArrivalPoint;
   /**
    * 入库人
    */
   private String insWarePerson;
   /**
    * 入库时间
    */
   private Date insWareTime;
   /**
    * 盘库单号
    */
   private String insInvNo;
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

   public InventorySubsidiary() {
   }

   public InventorySubsidiary(String insNo, String insWorkOrderNo, String insOrPackageNo, int insNumberCases, double insWeight, double insVolume, int insWhetherDamage, String insOutBounNumber, String insType, String insArrivalPoint, String insWarePerson, Date insWareTime, String insInvNo, String duo1, String duo2, String duo3) {
      this.insNo = insNo;
      this.insWorkOrderNo = insWorkOrderNo;
      this.insOrPackageNo = insOrPackageNo;
      this.insNumberCases = insNumberCases;
      this.insWeight = insWeight;
      this.insVolume = insVolume;
      this.insWhetherDamage = insWhetherDamage;
      this.insOutBounNumber = insOutBounNumber;
      this.insType = insType;
      this.insArrivalPoint = insArrivalPoint;
      this.insWarePerson = insWarePerson;
      this.insWareTime = insWareTime;
      this.insInvNo = insInvNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "InventorySubsidiary{" +
              "insNo='" + insNo + '\'' +
              ", insWorkOrderNo='" + insWorkOrderNo + '\'' +
              ", insOrPackageNo='" + insOrPackageNo + '\'' +
              ", insNumberCases=" + insNumberCases +
              ", insWeight=" + insWeight +
              ", insVolume=" + insVolume +
              ", insWhetherDamage=" + insWhetherDamage +
              ", insOutBounNumber='" + insOutBounNumber + '\'' +
              ", insType='" + insType + '\'' +
              ", insArrivalPoint='" + insArrivalPoint + '\'' +
              ", insWarePerson='" + insWarePerson + '\'' +
              ", insWareTime=" + insWareTime +
              ", insInvNo='" + insInvNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getInsNo() {
      return insNo;
   }

   public void setInsNo(String insNo) {
      this.insNo = insNo;
   }

   public String getInsWorkOrderNo() {
      return insWorkOrderNo;
   }

   public void setInsWorkOrderNo(String insWorkOrderNo) {
      this.insWorkOrderNo = insWorkOrderNo;
   }

   public String getInsOrPackageNo() {
      return insOrPackageNo;
   }

   public void setInsOrPackageNo(String insOrPackageNo) {
      this.insOrPackageNo = insOrPackageNo;
   }

   public int getInsNumberCases() {
      return insNumberCases;
   }

   public void setInsNumberCases(int insNumberCases) {
      this.insNumberCases = insNumberCases;
   }

   public double getInsWeight() {
      return insWeight;
   }

   public void setInsWeight(double insWeight) {
      this.insWeight = insWeight;
   }

   public double getInsVolume() {
      return insVolume;
   }

   public void setInsVolume(double insVolume) {
      this.insVolume = insVolume;
   }

   public int getInsWhetherDamage() {
      return insWhetherDamage;
   }

   public void setInsWhetherDamage(int insWhetherDamage) {
      this.insWhetherDamage = insWhetherDamage;
   }

   public String getInsOutBounNumber() {
      return insOutBounNumber;
   }

   public void setInsOutBounNumber(String insOutBounNumber) {
      this.insOutBounNumber = insOutBounNumber;
   }

   public String getInsType() {
      return insType;
   }

   public void setInsType(String insType) {
      this.insType = insType;
   }

   public String getInsArrivalPoint() {
      return insArrivalPoint;
   }

   public void setInsArrivalPoint(String insArrivalPoint) {
      this.insArrivalPoint = insArrivalPoint;
   }

   public String getInsWarePerson() {
      return insWarePerson;
   }

   public void setInsWarePerson(String insWarePerson) {
      this.insWarePerson = insWarePerson;
   }

   public Date getInsWareTime() {
      return insWareTime;
   }

   public void setInsWareTime(Date insWareTime) {
      this.insWareTime = insWareTime;
   }

   public String getInsInvNo() {
      return insInvNo;
   }

   public void setInsInvNo(String insInvNo) {
      this.insInvNo = insInvNo;
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