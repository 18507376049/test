package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 最大编号
 */
public class MaxNo {
   /**
    * 编号
    */
   private String manID;
   /**
    * 表名
    */
   private String manTableName;
   /**
    * 最大编号
    */
   private String manMaxNo;
   /**
    * 区分标识
    */
   private int manQu;
   /**
    *  备注
    */
   private String manRemark;
   /**
    * 前缀
    */
   private String manPre;
   /**
    * 后缀
    */
   private String manSt;

    public MaxNo() {
   }

   public MaxNo(String manTableName) {
      this.manTableName = manTableName;
   }

   public MaxNo(String manID, String manTableName, String manMaxNo, int manQu, String manRemark, String manPre, String manSt) {
      this.manID = manID;
      this.manTableName = manTableName;
      this.manMaxNo = manMaxNo;
      this.manQu = manQu;
      this.manRemark = manRemark;
      this.manPre = manPre;
      this.manSt = manSt;
   }

   @Override
   public String toString() {
      return "MaxNo{" +
              "manID='" + manID + '\'' +
              ", manTableName='" + manTableName + '\'' +
              ", manMaxNo='" + manMaxNo + '\'' +
              ", manQu=" + manQu +
              ", manRemark='" + manRemark + '\'' +
              ", manPre='" + manPre + '\'' +
              ", manSt='" + manSt + '\'' +
              '}';
   }

   public String getManID() {
      return manID;
   }

   public void setManID(String manID) {
      this.manID = manID;
   }

   public String getManTableName() {
      return manTableName;
   }

   public void setManTableName(String manTableName) {
      this.manTableName = manTableName;
   }

   public String getManMaxNo() {
      return manMaxNo;
   }

   public void setManMaxNo(String manMaxNo) {
      this.manMaxNo = manMaxNo;
   }

   public int getManQu() {
      return manQu;
   }

   public void setManQu(int manQu) {
      this.manQu = manQu;
   }

   public String getManRemark() {
      return manRemark;
   }

   public void setManRemark(String manRemark) {
      this.manRemark = manRemark;
   }

   public String getManPre() {
      return manPre;
   }

   public void setManPre(String manPre) {
      this.manPre = manPre;
   }

   public String getManSt() {
      return manSt;
   }

   public void setManSt(String manSt) {
      this.manSt = manSt;
   }
}