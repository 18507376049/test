package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 单位
 */
public class Unit {
   /**
    * 单位编号
    *  */
   private String uniId;
   /**
    * 单位名称
    *  */
   private String uniName;
   /**
    * 父级单位
    *  */
   private String uniFatherId;
   /**
    * 单位排序
    *  */
   private int uniSort;
   /**
    * 单位描述
    *  */
   private String uniRemark;

   public String getUniId() {
      return uniId;
   }

   public void setUniId(String uniId) {
      this.uniId = uniId;
   }

   public String getUniName() {
      return uniName;
   }

   public void setUniName(String uniName) {
      this.uniName = uniName;
   }

   public String getUniFatherId() {
      return uniFatherId;
   }

   public void setUniFatherId(String uniFatherId) {
      this.uniFatherId = uniFatherId;
   }

   public int getUniSort() {
      return uniSort;
   }

   public void setUniSort(int uniSort) {
      this.uniSort = uniSort;
   }

   public String getUniRemark() {
      return uniRemark;
   }

   public void setUniRemark(String uniRemark) {
      this.uniRemark = uniRemark;
   }

   public Unit(String uniId, String uniName, String uniFatherId, int uniSort, String uniRemark) {
      this.uniId = uniId;
      this.uniName = uniName;
      this.uniFatherId = uniFatherId;
      this.uniSort = uniSort;
      this.uniRemark = uniRemark;
   }

   @Override
   public String toString() {
      return "Unit{" +
              "uniId='" + uniId + '\'' +
              ", uniName='" + uniName + '\'' +
              ", uniFatherId='" + uniFatherId + '\'' +
              ", uniSort=" + uniSort +
              ", uniRemark='" + uniRemark + '\'' +
              '}';
   }
}