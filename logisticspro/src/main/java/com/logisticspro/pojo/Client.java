package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 客户
 */
public class Client {
   /**
    * 客户编号
    */
   private String cliNo;
   /**
    * 客户姓名
    */
   private String cliName;
   /**
    * 联系电话
    */
   private String cliPhone;
   /**
    * 地址编号
    */
   private String cliAddressNo;
   /**
    * 联系地址
    */
   private String cliAddress;
   /**
    *  QQ
    */
   private String cliQQ;
   /** 邮箱
    */
   private String cliEmail;
   /** 状态
    */
   private int cliStatus;
   /** 身份证号
    */
   private String cliCardId;
   /** 性别
    */
   private String cliSex;
   /** 备注
    */
   private String cliRemarks;
   /** 用户名
    */
   private String cliUserName;
   /** 密码
    */
   private String cliUserPass;
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

   public Client() {
   }

   public Client(String cliNo, String cliName, String cliPhone, String cliAddressNo, String cliAddress, String cliQQ, String cliEmail, int cliStatus, String cliCardId, String cliSex, String cliRemarks, String cliUserName, String cliUserPass, String duo1, String duo2, String duo3) {
      this.cliNo = cliNo;
      this.cliName = cliName;
      this.cliPhone = cliPhone;
      this.cliAddressNo = cliAddressNo;
      this.cliAddress = cliAddress;
      this.cliQQ = cliQQ;
      this.cliEmail = cliEmail;
      this.cliStatus = cliStatus;
      this.cliCardId = cliCardId;
      this.cliSex = cliSex;
      this.cliRemarks = cliRemarks;
      this.cliUserName = cliUserName;
      this.cliUserPass = cliUserPass;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Client{" +
              "cliNo='" + cliNo + '\'' +
              ", cliName='" + cliName + '\'' +
              ", cliPhone='" + cliPhone + '\'' +
              ", cliAddressNo='" + cliAddressNo + '\'' +
              ", cliAddress='" + cliAddress + '\'' +
              ", cliQQ='" + cliQQ + '\'' +
              ", cliEmail='" + cliEmail + '\'' +
              ", cliStatus=" + cliStatus +
              ", cliCardId='" + cliCardId + '\'' +
              ", cliSex='" + cliSex + '\'' +
              ", cliRemarks='" + cliRemarks + '\'' +
              ", cliUserName='" + cliUserName + '\'' +
              ", cliUserPass='" + cliUserPass + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getCliNo() {
      return cliNo;
   }

   public void setCliNo(String cliNo) {
      this.cliNo = cliNo;
   }

   public String getCliName() {
      return cliName;
   }

   public void setCliName(String cliName) {
      this.cliName = cliName;
   }

   public String getCliPhone() {
      return cliPhone;
   }

   public void setCliPhone(String cliPhone) {
      this.cliPhone = cliPhone;
   }

   public String getCliAddressNo() {
      return cliAddressNo;
   }

   public void setCliAddressNo(String cliAddressNo) {
      this.cliAddressNo = cliAddressNo;
   }

   public String getCliAddress() {
      return cliAddress;
   }

   public void setCliAddress(String cliAddress) {
      this.cliAddress = cliAddress;
   }

   public String getCliQQ() {
      return cliQQ;
   }

   public void setCliQQ(String cliQQ) {
      this.cliQQ = cliQQ;
   }

   public String getCliEmail() {
      return cliEmail;
   }

   public void setCliEmail(String cliEmail) {
      this.cliEmail = cliEmail;
   }

   public int getCliStatus() {
      return cliStatus;
   }

   public void setCliStatus(int cliStatus) {
      this.cliStatus = cliStatus;
   }

   public String getCliCardId() {
      return cliCardId;
   }

   public void setCliCardId(String cliCardId) {
      this.cliCardId = cliCardId;
   }

   public String getCliSex() {
      return cliSex;
   }

   public void setCliSex(String cliSex) {
      this.cliSex = cliSex;
   }

   public String getCliRemarks() {
      return cliRemarks;
   }

   public void setCliRemarks(String cliRemarks) {
      this.cliRemarks = cliRemarks;
   }

   public String getCliUserName() {
      return cliUserName;
   }

   public void setCliUserName(String cliUserName) {
      this.cliUserName = cliUserName;
   }

   public String getCliUserPass() {
      return cliUserPass;
   }

   public void setCliUserPass(String cliUserPass) {
      this.cliUserPass = cliUserPass;
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