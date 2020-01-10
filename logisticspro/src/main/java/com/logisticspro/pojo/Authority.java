package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 权限
 */
public class Authority {
   /**
    * 权限编号
    */
   private String autNo;
   /**
    * 权限名称
    */
   private String autName;
   /**
    * 父权限编号
    */
   private String  autParentNo;
   /**
    * 权限描述
    */
   private String autDesc;
   /**
    * 权限功能按钮
    */
   private String autButton;
   /**
    * 权限图片
    */
   private String autImg;
   /**
    * 权限页面地址
    */
   private String autUrl;
   /**
    * 权限排序
    */
   private int autOrderNumber;
   /**
    * 权限的过滤器
    */
   private String autFilter;
   /**
    * 状态
    */
   private int autStatus = 0;

   public Authority() {
   }

   public Authority(String autNo, String autName, String autParentNo, String autDesc, String autButton, String autImg, String autUrl, int autOrderNumber, String autFilter, int autStatus) {
      this.autNo = autNo;
      this.autName = autName;
      this.autParentNo = autParentNo;
      this.autDesc = autDesc;
      this.autButton = autButton;
      this.autImg = autImg;
      this.autUrl = autUrl;
      this.autOrderNumber = autOrderNumber;
      this.autFilter = autFilter;
      this.autStatus = autStatus;
   }

   @Override
   public String toString() {
      return "Authority{" +
              "autNo='" + autNo + '\'' +
              ", autName='" + autName + '\'' +
              ", autParentNo='" + autParentNo + '\'' +
              ", autDesc='" + autDesc + '\'' +
              ", autButton='" + autButton + '\'' +
              ", autImg='" + autImg + '\'' +
              ", autUrl='" + autUrl + '\'' +
              ", autOrderNumber=" + autOrderNumber +
              ", autFilter='" + autFilter + '\'' +
              ", autStatus=" + autStatus +
              '}';
   }

   public String getAutNo() {
      return autNo;
   }

   public void setAutNo(String autNo) {
      this.autNo = autNo;
   }

   public String getAutName() {
      return autName;
   }

   public void setAutName(String autName) {
      this.autName = autName;
   }

   public String getAutParentNo() {
      return autParentNo;
   }

   public void setAutParentNo(String autParentNo) {
      this.autParentNo = autParentNo;
   }

   public String getAutDesc() {
      return autDesc;
   }

   public void setAutDesc(String autDesc) {
      this.autDesc = autDesc;
   }

   public String getAutButton() {
      return autButton;
   }

   public void setAutButton(String autButton) {
      this.autButton = autButton;
   }

   public String getAutImg() {
      return autImg;
   }

   public void setAutImg(String autImg) {
      this.autImg = autImg;
   }

   public String getAutUrl() {
      return autUrl;
   }

   public void setAutUrl(String autUrl) {
      this.autUrl = autUrl;
   }

   public int getAutOrderNumber() {
      return autOrderNumber;
   }

   public void setAutOrderNumber(int autOrderNumber) {
      this.autOrderNumber = autOrderNumber;
   }

   public String getAutFilter() {
      return autFilter;
   }

   public void setAutFilter(String autFilter) {
      this.autFilter = autFilter;
   }

   public int getAutStatus() {
      return autStatus;
   }

   public void setAutStatus(int autStatus) {
      this.autStatus = autStatus;
   }
}