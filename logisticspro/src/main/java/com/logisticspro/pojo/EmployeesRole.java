package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 员工角色
 */
public class EmployeesRole {
   /**
    * 员工角色编号
    */
   private java.lang.String emrEmpRolNo;
   /**
    * 员工标识
    */
   private java.lang.String emrEmpNo;
   /**
    * 角色标识
    */
   private java.lang.String emrRolNo;
   /**
    * 备注
    */
   private java.lang.String emrEmpRolRemark;

   public EmployeesRole() {
   }

   public EmployeesRole(String emrEmpRolNo, String emrEmpNo, String emrRolNo, String emrEmpRolRemark) {
      this.emrEmpRolNo = emrEmpRolNo;
      this.emrEmpNo = emrEmpNo;
      this.emrRolNo = emrRolNo;
      this.emrEmpRolRemark = emrEmpRolRemark;
   }

   @Override
   public String toString() {
      return "EmployeesRole{" +
              "emrEmpRolNo='" + emrEmpRolNo + '\'' +
              ", emrEmpNo='" + emrEmpNo + '\'' +
              ", emrRolNo='" + emrRolNo + '\'' +
              ", emrEmpRolRemark='" + emrEmpRolRemark + '\'' +
              '}';
   }

   public String getEmrEmpRolNo() {
      return emrEmpRolNo;
   }

   public void setEmrEmpRolNo(String emrEmpRolNo) {
      this.emrEmpRolNo = emrEmpRolNo;
   }

   public String getEmrEmpNo() {
      return emrEmpNo;
   }

   public void setEmrEmpNo(String emrEmpNo) {
      this.emrEmpNo = emrEmpNo;
   }

   public String getEmrRolNo() {
      return emrRolNo;
   }

   public void setEmrRolNo(String emrRolNo) {
      this.emrRolNo = emrRolNo;
   }

   public String getEmrEmpRolRemark() {
      return emrEmpRolRemark;
   }

   public void setEmrEmpRolRemark(String emrEmpRolRemark) {
      this.emrEmpRolRemark = emrEmpRolRemark;
   }
}