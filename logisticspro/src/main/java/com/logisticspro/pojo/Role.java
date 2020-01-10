package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 角色
 */
public class Role {
   /**
    * 角色编号
    */
   private String rolNo;
   /**
    * 角色名称
    */
   private String rolName;
   /**
    * 角色创建时间
    */
   private Date rolCreatetime;
   /**
    * 角色排序
    */
   private int rolOrderNumber;
   /**
    * 角色描述
    */
   private String rolDesc;
   /**
    * 状态
    */
   private String rolStatus;
   /**
    * 授权员工
    */
   private String rolAuthoEmployNo;

   public Role() {
   }

   public Role(String rolNo, String rolName, Date rolCreatetime, int rolOrderNumber, String rolDesc, String rolStatus, String rolAuthoEmployNo) {
      this.rolNo = rolNo;
      this.rolName = rolName;
      this.rolCreatetime = rolCreatetime;
      this.rolOrderNumber = rolOrderNumber;
      this.rolDesc = rolDesc;
      this.rolStatus = rolStatus;
      this.rolAuthoEmployNo = rolAuthoEmployNo;
   }

   @Override
   public String toString() {
      return "Role{" +
              "rolNo='" + rolNo + '\'' +
              ", rolName='" + rolName + '\'' +
              ", rolCreatetime=" + rolCreatetime +
              ", rolOrderNumber=" + rolOrderNumber +
              ", rolDesc='" + rolDesc + '\'' +
              ", rolStatus='" + rolStatus + '\'' +
              ", rolAuthoEmployNo='" + rolAuthoEmployNo + '\'' +
              '}';
   }

   public String getRolNo() {
      return rolNo;
   }

   public void setRolNo(String rolNo) {
      this.rolNo = rolNo;
   }

   public String getRolName() {
      return rolName;
   }

   public void setRolName(String rolName) {
      this.rolName = rolName;
   }

   public Date getRolCreatetime() {
      return rolCreatetime;
   }

   public void setRolCreatetime(Date rolCreatetime) {
      this.rolCreatetime = rolCreatetime;
   }

   public int getRolOrderNumber() {
      return rolOrderNumber;
   }

   public void setRolOrderNumber(int rolOrderNumber) {
      this.rolOrderNumber = rolOrderNumber;
   }

   public String getRolDesc() {
      return rolDesc;
   }

   public void setRolDesc(String rolDesc) {
      this.rolDesc = rolDesc;
   }

   public String getRolStatus() {
      return rolStatus;
   }

   public void setRolStatus(String rolStatus) {
      this.rolStatus = rolStatus;
   }

   public String getRolAuthoEmployNo() {
      return rolAuthoEmployNo;
   }

   public void setRolAuthoEmployNo(String rolAuthoEmployNo) {
      this.rolAuthoEmployNo = rolAuthoEmployNo;
   }
}