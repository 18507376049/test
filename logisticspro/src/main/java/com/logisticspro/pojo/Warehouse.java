package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 仓库
 */
public class Warehouse {
   /**
    * 仓库编号
    * */
   private String warID;
   /**
    * 仓库名称
    * */
   private String warName;
   /**
    * 负责人(员工)
    *  */
   private String employeesNo;
   /**
    * 联系电话
    *  */
   private String warPhone;
   /**
    * 仓库地址
    *  */
   private String warAddress;
   /**
    * 默认仓库
    *  */
   private int warDefault = 0;
   /**
    *  状态
    * */
   private int warForbidNo = 0;
   /**
    * 备注
    * */
   private String warComment;
   /**
    * 库存总数量
    *  */
   private int repNumber;
   /**
    * 库存总值
    *  */
   private double warTotalValue;
   /**
    * 当前库存
    *  */
   private int warCurrent;
   /**
    * 最低库存
    * */
   private int warLowest;
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

   public String getWarID() {
      return warID;
   }

   public void setWarID(String warID) {
      this.warID = warID;
   }

   public String getWarName() {
      return warName;
   }

   public void setWarName(String warName) {
      this.warName = warName;
   }

   public String getEmployeesNo() {
      return employeesNo;
   }

   public void setEmployeesNo(String employeesNo) {
      this.employeesNo = employeesNo;
   }

   public String getWarPhone() {
      return warPhone;
   }

   public void setWarPhone(String warPhone) {
      this.warPhone = warPhone;
   }

   public String getWarAddress() {
      return warAddress;
   }

   public void setWarAddress(String warAddress) {
      this.warAddress = warAddress;
   }

   public int getWarDefault() {
      return warDefault;
   }

   public void setWarDefault(int warDefault) {
      this.warDefault = warDefault;
   }

   public int getWarForbidNo() {
      return warForbidNo;
   }

   public void setWarForbidNo(int warForbidNo) {
      this.warForbidNo = warForbidNo;
   }

   public String getWarComment() {
      return warComment;
   }

   public void setWarComment(String warComment) {
      this.warComment = warComment;
   }

   public int getRepNumber() {
      return repNumber;
   }

   public void setRepNumber(int repNumber) {
      this.repNumber = repNumber;
   }

   public double getWarTotalValue() {
      return warTotalValue;
   }

   public void setWarTotalValue(double warTotalValue) {
      this.warTotalValue = warTotalValue;
   }

   public int getWarCurrent() {
      return warCurrent;
   }

   public void setWarCurrent(int warCurrent) {
      this.warCurrent = warCurrent;
   }

   public int getWarLowest() {
      return warLowest;
   }

   public void setWarLowest(int warLowest) {
      this.warLowest = warLowest;
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

   public Warehouse(String warID, String warName, String employeesNo, String warPhone, String warAddress, int warDefault, int warForbidNo, String warComment, int repNumber, double warTotalValue, int warCurrent, int warLowest, String duo1, String duo2, String duo3) {
      this.warID = warID;
      this.warName = warName;
      this.employeesNo = employeesNo;
      this.warPhone = warPhone;
      this.warAddress = warAddress;
      this.warDefault = warDefault;
      this.warForbidNo = warForbidNo;
      this.warComment = warComment;
      this.repNumber = repNumber;
      this.warTotalValue = warTotalValue;
      this.warCurrent = warCurrent;
      this.warLowest = warLowest;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public Warehouse() {
   }

   @Override
   public String toString() {
      return "Warehouse{" +
              "warID='" + warID + '\'' +
              ", warName='" + warName + '\'' +
              ", employeesNo='" + employeesNo + '\'' +
              ", warPhone='" + warPhone + '\'' +
              ", warAddress='" + warAddress + '\'' +
              ", warDefault=" + warDefault +
              ", warForbidNo=" + warForbidNo +
              ", warComment='" + warComment + '\'' +
              ", repNumber=" + repNumber +
              ", warTotalValue=" + warTotalValue +
              ", warCurrent=" + warCurrent +
              ", warLowest=" + warLowest +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}