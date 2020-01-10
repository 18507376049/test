package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 员工
 */
public class Employees {
   /**
    * 员工编号
    */
   private String empNo;
   /**
    * 员工姓名
    */
   private String empName;
   /**
    * 身份证号
    */
   private String empCardId;
   /**
    * 性别
    */
   private String empSex;
   /**
    * 手机号
    */
   private String empTel;
   /**
    * 邮箱
    */
   private String empEmail;
   /**
    * 提成比例
    */
   private double empRatio;
   /**
    * 单位
    */
   private String empUnitNo;
   /**
    * 薪水
    */
   private double empSalary;
   /**
    * 地址编号
    */
   private String empAddressNo;
   /**
    * 政治面貌
    */
   private String empPoliticsStatus;
   /**
    * 文化程度
    */
   private String empEducation;
   /**
    *  籍贯
    */
   private String empNativePlace;
   /**
    * 民族
    */
   private String empNation;
   /**
    * 出生日期
    */
   private Date empBirthday;
   /**
    * 入职日期
    */
   private Date empHiredate;
   /**
    * 婚姻状况
    */
   private String empMaritalStatus;
   /**
    * 上级领导编号
    */
   private String empManagerNo;
   /**
    * 状态
    */
   private int empState = 0;
   /**
    * 备注
    */
   private String empRemark;
   /**
    * 用户名
    */
   private String empUserName;
   /**
    * 密码
    */
   private String empUserPass;
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

   public Employees() {
   }

   public Employees(String empNo, String empName, String empCardId, String empSex, String empTel, String empEmail, double empRatio, String empUnitNo, double empSalary, String empAddressNo, String empPoliticsStatus, String empEducation, String empNativePlace, String empNation, Date empBirthday, Date empHiredate, String empMaritalStatus, String empManagerNo, int empState, String empRemark, String empUserName, String empUserPass, String duo1, String duo2, String duo3) {
      this.empNo = empNo;
      this.empName = empName;
      this.empCardId = empCardId;
      this.empSex = empSex;
      this.empTel = empTel;
      this.empEmail = empEmail;
      this.empRatio = empRatio;
      this.empUnitNo = empUnitNo;
      this.empSalary = empSalary;
      this.empAddressNo = empAddressNo;
      this.empPoliticsStatus = empPoliticsStatus;
      this.empEducation = empEducation;
      this.empNativePlace = empNativePlace;
      this.empNation = empNation;
      this.empBirthday = empBirthday;
      this.empHiredate = empHiredate;
      this.empMaritalStatus = empMaritalStatus;
      this.empManagerNo = empManagerNo;
      this.empState = empState;
      this.empRemark = empRemark;
      this.empUserName = empUserName;
      this.empUserPass = empUserPass;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Employees{" +
              "empNo='" + empNo + '\'' +
              ", empName='" + empName + '\'' +
              ", empCardId='" + empCardId + '\'' +
              ", empSex='" + empSex + '\'' +
              ", empTel='" + empTel + '\'' +
              ", empEmail='" + empEmail + '\'' +
              ", empRatio=" + empRatio +
              ", empUnitNo='" + empUnitNo + '\'' +
              ", empSalary=" + empSalary +
              ", empAddressNo='" + empAddressNo + '\'' +
              ", empPoliticsStatus='" + empPoliticsStatus + '\'' +
              ", empEducation='" + empEducation + '\'' +
              ", empNativePlace='" + empNativePlace + '\'' +
              ", empNation='" + empNation + '\'' +
              ", empBirthday=" + empBirthday +
              ", empHiredate=" + empHiredate +
              ", empMaritalStatus='" + empMaritalStatus + '\'' +
              ", empManagerNo='" + empManagerNo + '\'' +
              ", empState=" + empState +
              ", empRemark='" + empRemark + '\'' +
              ", empUserName='" + empUserName + '\'' +
              ", empUserPass='" + empUserPass + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getEmpNo() {
      return empNo;
   }

   public void setEmpNo(String empNo) {
      this.empNo = empNo;
   }

   public String getEmpName() {
      return empName;
   }

   public void setEmpName(String empName) {
      this.empName = empName;
   }

   public String getEmpCardId() {
      return empCardId;
   }

   public void setEmpCardId(String empCardId) {
      this.empCardId = empCardId;
   }

   public String getEmpSex() {
      return empSex;
   }

   public void setEmpSex(String empSex) {
      this.empSex = empSex;
   }

   public String getEmpTel() {
      return empTel;
   }

   public void setEmpTel(String empTel) {
      this.empTel = empTel;
   }

   public String getEmpEmail() {
      return empEmail;
   }

   public void setEmpEmail(String empEmail) {
      this.empEmail = empEmail;
   }

   public double getEmpRatio() {
      return empRatio;
   }

   public void setEmpRatio(double empRatio) {
      this.empRatio = empRatio;
   }

   public String getEmpUnitNo() {
      return empUnitNo;
   }

   public void setEmpUnitNo(String empUnitNo) {
      this.empUnitNo = empUnitNo;
   }

   public double getEmpSalary() {
      return empSalary;
   }

   public void setEmpSalary(double empSalary) {
      this.empSalary = empSalary;
   }

   public String getEmpAddressNo() {
      return empAddressNo;
   }

   public void setEmpAddressNo(String empAddressNo) {
      this.empAddressNo = empAddressNo;
   }

   public String getEmpPoliticsStatus() {
      return empPoliticsStatus;
   }

   public void setEmpPoliticsStatus(String empPoliticsStatus) {
      this.empPoliticsStatus = empPoliticsStatus;
   }

   public String getEmpEducation() {
      return empEducation;
   }

   public void setEmpEducation(String empEducation) {
      this.empEducation = empEducation;
   }

   public String getEmpNativePlace() {
      return empNativePlace;
   }

   public void setEmpNativePlace(String empNativePlace) {
      this.empNativePlace = empNativePlace;
   }

   public String getEmpNation() {
      return empNation;
   }

   public void setEmpNation(String empNation) {
      this.empNation = empNation;
   }

   public Date getEmpBirthday() {
      return empBirthday;
   }

   public void setEmpBirthday(Date empBirthday) {
      this.empBirthday = empBirthday;
   }

   public Date getEmpHiredate() {
      return empHiredate;
   }

   public void setEmpHiredate(Date empHiredate) {
      this.empHiredate = empHiredate;
   }

   public String getEmpMaritalStatus() {
      return empMaritalStatus;
   }

   public void setEmpMaritalStatus(String empMaritalStatus) {
      this.empMaritalStatus = empMaritalStatus;
   }

   public String getEmpManagerNo() {
      return empManagerNo;
   }

   public void setEmpManagerNo(String empManagerNo) {
      this.empManagerNo = empManagerNo;
   }

   public int getEmpState() {
      return empState;
   }

   public void setEmpState(int empState) {
      this.empState = empState;
   }

   public String getEmpRemark() {
      return empRemark;
   }

   public void setEmpRemark(String empRemark) {
      this.empRemark = empRemark;
   }

   public String getEmpUserName() {
      return empUserName;
   }

   public void setEmpUserName(String empUserName) {
      this.empUserName = empUserName;
   }

   public String getEmpUserPass() {
      return empUserPass;
   }

   public void setEmpUserPass(String empUserPass) {
      this.empUserPass = empUserPass;
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