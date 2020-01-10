package com.logisticspro.pojo;
import java.util.*;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 供货商
 */
public class Supplier {
   /**
    * 供货商编号
    * */
   private String supID;
   /**
    * 供货商名称
    * */
   private String supName;
   /**
    * 联系人
    *  */
   private String supLinkman;
   /**
    * 联系电话
    * */
   private String supPhone;
   /**
    * 我方应付金额
    *  */
   private double supMoney;
   /**
    * 联系地址编号
    * */
   private String supAddressNo;
   /**
    * 详细地址
    *  */
   private String supAddress;
   /**
    * 所属地区
    *  */
   private String supRegion;
   /**
    * 默认供货商
    * */
   private int supDefault = 0;
   /**
    * 备注
    *  */
   private String supComment;
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

   public String getSupID() {
      return supID;
   }

   public void setSupID(String supID) {
      this.supID = supID;
   }

   public String getSupName() {
      return supName;
   }

   public void setSupName(String supName) {
      this.supName = supName;
   }

   public String getSupLinkman() {
      return supLinkman;
   }

   public void setSupLinkman(String supLinkman) {
      this.supLinkman = supLinkman;
   }

   public String getSupPhone() {
      return supPhone;
   }

   public void setSupPhone(String supPhone) {
      this.supPhone = supPhone;
   }

   public double getSupMoney() {
      return supMoney;
   }

   public void setSupMoney(double supMoney) {
      this.supMoney = supMoney;
   }

   public String getSupAddressNo() {
      return supAddressNo;
   }

   public void setSupAddressNo(String supAddressNo) {
      this.supAddressNo = supAddressNo;
   }

   public String getSupAddress() {
      return supAddress;
   }

   public void setSupAddress(String supAddress) {
      this.supAddress = supAddress;
   }

   public String getSupRegion() {
      return supRegion;
   }

   public void setSupRegion(String supRegion) {
      this.supRegion = supRegion;
   }

   public int getSupDefault() {
      return supDefault;
   }

   public void setSupDefault(int supDefault) {
      this.supDefault = supDefault;
   }

   public String getSupComment() {
      return supComment;
   }

   public void setSupComment(String supComment) {
      this.supComment = supComment;
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

   public Supplier(String supID, String supName, String supLinkman, String supPhone, double supMoney, String supAddressNo, String supAddress, String supRegion, int supDefault, String supComment, String duo1, String duo2, String duo3) {
      this.supID = supID;
      this.supName = supName;
      this.supLinkman = supLinkman;
      this.supPhone = supPhone;
      this.supMoney = supMoney;
      this.supAddressNo = supAddressNo;
      this.supAddress = supAddress;
      this.supRegion = supRegion;
      this.supDefault = supDefault;
      this.supComment = supComment;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public Supplier() {
   }

   @Override
   public String toString() {
      return "Supplier{" +
              "supID='" + supID + '\'' +
              ", supName='" + supName + '\'' +
              ", supLinkman='" + supLinkman + '\'' +
              ", supPhone='" + supPhone + '\'' +
              ", supMoney=" + supMoney +
              ", supAddressNo='" + supAddressNo + '\'' +
              ", supAddress='" + supAddress + '\'' +
              ", supRegion='" + supRegion + '\'' +
              ", supDefault=" + supDefault +
              ", supComment='" + supComment + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}