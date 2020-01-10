/***********************************************************************
 * Module:  Standard.java
 * Author:  Administrator
 * Purpose: Defines the Class Standard
 ***********************************************************************/
package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 收派时间
 */
public class Standard {
   /**
    * 收派时间编号
    * */
   private String staId;
   /**
    * 收派时间名称
    *  */
   private String staName;
   /**
    * 平时上班时间
    * */
   private Date staUpPeacetime;
   /**
    * 平时下班时间
    * */
   private Date staDownPeacetime;
   /**
    * 周六上班时间
    * */
   private Date staUpSaturday;
   /**
    * 周六下班时间
    *  */
   private Date staDownSaturday;
   /**
    * 周日上班时间
    *  */
   private Date staUpSunday;
   /**
    * 周日下班时间
    * */
   private Date staDownSunday;
   /**
    * 状态
    * */
   private int staState;
   /**
    * 所属单位
    *  */
   private String staUnit;
   /**
    * 更新员工号
    * */
   private String staStaff;
   /**
    * 更新人姓名
    *  */
   private String staPeopleName;
   /**
    * 更新单位
    *  */
   private String staNewTimeUnit;
   /**
    * 跟新时间
    *  */
   private Date staNewTime;
   /**
    *
     */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public String getStaId() {
      return staId;
   }

   public void setStaId(String staId) {
      this.staId = staId;
   }

   public String getStaName() {
      return staName;
   }

   public void setStaName(String staName) {
      this.staName = staName;
   }

   public Date getStaUpPeacetime() {
      return staUpPeacetime;
   }

   public void setStaUpPeacetime(Date staUpPeacetime) {
      this.staUpPeacetime = staUpPeacetime;
   }

   public Date getStaDownPeacetime() {
      return staDownPeacetime;
   }

   public void setStaDownPeacetime(Date staDownPeacetime) {
      this.staDownPeacetime = staDownPeacetime;
   }

   public Date getStaUpSaturday() {
      return staUpSaturday;
   }

   public void setStaUpSaturday(Date staUpSaturday) {
      this.staUpSaturday = staUpSaturday;
   }

   public Date getStaDownSaturday() {
      return staDownSaturday;
   }

   public void setStaDownSaturday(Date staDownSaturday) {
      this.staDownSaturday = staDownSaturday;
   }

   public Date getStaUpSunday() {
      return staUpSunday;
   }

   public void setStaUpSunday(Date staUpSunday) {
      this.staUpSunday = staUpSunday;
   }

   public Date getStaDownSunday() {
      return staDownSunday;
   }

   public void setStaDownSunday(Date staDownSunday) {
      this.staDownSunday = staDownSunday;
   }

   public int getStaState() {
      return staState;
   }

   public void setStaState(int staState) {
      this.staState = staState;
   }

   public String getStaUnit() {
      return staUnit;
   }

   public void setStaUnit(String staUnit) {
      this.staUnit = staUnit;
   }

   public String getStaStaff() {
      return staStaff;
   }

   public void setStaStaff(String staStaff) {
      this.staStaff = staStaff;
   }

   public String getStaPeopleName() {
      return staPeopleName;
   }

   public void setStaPeopleName(String staPeopleName) {
      this.staPeopleName = staPeopleName;
   }

   public String getStaNewTimeUnit() {
      return staNewTimeUnit;
   }

   public void setStaNewTimeUnit(String staNewTimeUnit) {
      this.staNewTimeUnit = staNewTimeUnit;
   }

   public Date getStaNewTime() {
      return staNewTime;
   }

   public void setStaNewTime(Date staNewTime) {
      this.staNewTime = staNewTime;
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

   public Standard(String staId, String staName, Date staUpPeacetime, Date staDownPeacetime, Date staUpSaturday, Date staDownSaturday, Date staUpSunday, Date staDownSunday, int staState, String staUnit, String staStaff, String staPeopleName, String staNewTimeUnit, Date staNewTime, String duo1, String duo2) {
      this.staId = staId;
      this.staName = staName;
      this.staUpPeacetime = staUpPeacetime;
      this.staDownPeacetime = staDownPeacetime;
      this.staUpSaturday = staUpSaturday;
      this.staDownSaturday = staDownSaturday;
      this.staUpSunday = staUpSunday;
      this.staDownSunday = staDownSunday;
      this.staState = staState;
      this.staUnit = staUnit;
      this.staStaff = staStaff;
      this.staPeopleName = staPeopleName;
      this.staNewTimeUnit = staNewTimeUnit;
      this.staNewTime = staNewTime;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   public Standard() {
   }

   @Override
   public String toString() {
      return "Standard{" +
              "staId='" + staId + '\'' +
              ", staName='" + staName + '\'' +
              ", staUpPeacetime=" + staUpPeacetime +
              ", staDownPeacetime=" + staDownPeacetime +
              ", staUpSaturday=" + staUpSaturday +
              ", staDownSaturday=" + staDownSaturday +
              ", staUpSunday=" + staUpSunday +
              ", staDownSunday=" + staDownSunday +
              ", staState=" + staState +
              ", staUnit='" + staUnit + '\'' +
              ", staStaff='" + staStaff + '\'' +
              ", staPeopleName='" + staPeopleName + '\'' +
              ", staNewTimeUnit='" + staNewTimeUnit + '\'' +
              ", staNewTime=" + staNewTime +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }
}