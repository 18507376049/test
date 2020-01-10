/***********************************************************************
 * Module:  Client.java
 * Author:  Administrator
 * Purpose: Defines the Class Client
 ***********************************************************************/

import java.util.*;

/** @pdOid c61ac39f-884f-4c43-98ac-4c175c7be536 */
public class Client {
   /** 客户编号
    *             
    * 
    * @pdOid ea61eb6d-b925-4baf-96d6-91560df0b0df */
   private java.lang.String cliNo;
   /** 客户姓名
    *             
    * 
    * @pdOid b4502b49-3a10-4a23-9512-5d5e4166ae83 */
   private java.lang.String cliName;
   /** 联系电话
    *             
    * 
    * @pdOid 440191ab-3cf7-4756-b729-382a934aa50e */
   private java.lang.String cliPhone;
   /** 地址编号
    *             
    * 
    * @pdOid 994340fe-848b-4e58-bb08-ed0d69dd3118 */
   private java.lang.String cliAddressNo;
   /** 联系地址
    *             
    * 
    * @pdOid 5a6391af-0e7b-4782-b18d-69a806965857 */
   private java.lang.String cliAddress;
   /** QQ
    * 
    * @pdOid dfcfcdbf-cae5-494c-91f1-399defdaac1f */
   private java.lang.String cliQQ;
   /** 邮箱
    *             
    * 
    * @pdOid c5ed51c1-daf7-424e-9751-4fd57def6c44 */
   private java.lang.String cliEmail;
   /** 状态
    *             
    * 
    * @pdOid 16c5f862-271a-455c-912f-5b8f3d06f202 */
   private int cliStatus;
   /** 身份证号
    *             
    * 
    * @pdOid 713f0b05-59a9-4e68-b370-cf2cd50c1638 */
   private java.lang.String cliCardId;
   /** 性别
    *             
    * 
    * @pdOid b0667e56-137b-4fc5-8d0f-e37be5cb806a */
   private java.lang.String cliSex;
   /** 备注
    *             
    * 
    * @pdOid 1bc2293c-ccf7-42fc-a86a-0c621616e666 */
   private java.lang.String cliRemarks;
   /** 用户名
    *             
    * 
    * @pdOid 4c58b52c-09a4-47dd-8bd0-c4c5f5364ba9 */
   private java.lang.String cliUserName;
   /** 密码
    *             
    * 
    * @pdOid 53c22e69-09e5-471b-a935-5710ef6c73f3 */
   private java.lang.String cliUserPass;
   /** @pdOid 578f5887-e604-48be-95a5-76088dc60a24 */
   private java.lang.String duo1;
   /** @pdOid 098e9ef5-05aa-4e82-b8f5-c629ae14e245 */
   private java.lang.String duo2;
   /** @pdOid 9806bf51-6dc7-481d-a47b-8374de1cef7f */
   private java.lang.String duo3;
   
   /** @pdOid 46ff5737-2ad7-449f-a805-ada64bed0d14 */
   public java.lang.String getCliNo() {
      return cliNo;
   }
   
   /** @param newCliNo
    * @pdOid e3d40240-92a3-466e-aca0-2e9785a713e7 */
   public void setCliNo(java.lang.String newCliNo) {
      cliNo = newCliNo;
   }
   
   /** @pdOid afaaab13-83db-4159-b727-5f680d11a40c */
   public java.lang.String getCliName() {
      return cliName;
   }
   
   /** @param newCliName
    * @pdOid ded60504-bc8e-47f4-969d-6e3cfe7554f6 */
   public void setCliName(java.lang.String newCliName) {
      cliName = newCliName;
   }
   
   /** @pdOid 03f40c41-413e-4ff0-97a8-27dd78096dd1 */
   public java.lang.String getCliPhone() {
      return cliPhone;
   }
   
   /** @param newCliPhone
    * @pdOid 6a4347f5-7f21-4f04-8c89-57bf48cb6f8e */
   public void setCliPhone(java.lang.String newCliPhone) {
      cliPhone = newCliPhone;
   }
   
   /** @pdOid 4ab8914e-1356-434d-ae28-aeae0a201511 */
   public java.lang.String getCliAddressNo() {
      return cliAddressNo;
   }
   
   /** @param newCliAddressNo
    * @pdOid 6d94be8a-1307-4848-bb73-14c05450e27e */
   public void setCliAddressNo(java.lang.String newCliAddressNo) {
      cliAddressNo = newCliAddressNo;
   }
   
   /** @pdOid 6e2e95c1-7c0f-4c52-a5d8-864d22103e06 */
   public java.lang.String getCliAddress() {
      return cliAddress;
   }
   
   /** @param newCliAddress
    * @pdOid c65a58a5-8ae7-4070-a115-acaefc2f0576 */
   public void setCliAddress(java.lang.String newCliAddress) {
      cliAddress = newCliAddress;
   }
   
   /** @pdOid 38cf86fb-a676-49e3-9aff-88c100098603 */
   public java.lang.String getCliQQ() {
      return cliQQ;
   }
   
   /** @param newCliQQ
    * @pdOid e00495eb-b9bf-4a0e-a7a6-ae31bfb708d0 */
   public void setCliQQ(java.lang.String newCliQQ) {
      cliQQ = newCliQQ;
   }
   
   /** @pdOid a09a3b93-51c4-4484-a637-d7dcbccbda82 */
   public java.lang.String getCliEmail() {
      return cliEmail;
   }
   
   /** @param newCliEmail
    * @pdOid a18b2366-3070-4980-bf46-00152831fc15 */
   public void setCliEmail(java.lang.String newCliEmail) {
      cliEmail = newCliEmail;
   }
   
   /** @pdOid 04e80f8f-e5b5-4541-8af7-6ebb877e3473 */
   public int getCliStatus() {
      return cliStatus;
   }
   
   /** @param newCliStatus
    * @pdOid 09c03cb9-aa5c-42d4-9d03-75422670aa42 */
   public void setCliStatus(int newCliStatus) {
      cliStatus = newCliStatus;
   }
   
   /** @pdOid 420e8072-9e53-4dec-8ac8-53e28dd00ea5 */
   public java.lang.String getCliCardId() {
      return cliCardId;
   }
   
   /** @param newCliCardId
    * @pdOid b069bbee-419f-4739-9a65-bbc7f329f409 */
   public void setCliCardId(java.lang.String newCliCardId) {
      cliCardId = newCliCardId;
   }
   
   /** @pdOid 93060b20-68c1-40a7-9846-ee09239b2b38 */
   public java.lang.String getCliSex() {
      return cliSex;
   }
   
   /** @param newCliSex
    * @pdOid b212a1b0-b4d0-442d-9b1f-a18a8c415531 */
   public void setCliSex(java.lang.String newCliSex) {
      cliSex = newCliSex;
   }
   
   /** @pdOid a0aa90b3-abd6-410f-981d-47b375265301 */
   public java.lang.String getCliRemarks() {
      return cliRemarks;
   }
   
   /** @param newCliRemarks
    * @pdOid 89661efd-1da0-4353-a210-9134ea411090 */
   public void setCliRemarks(java.lang.String newCliRemarks) {
      cliRemarks = newCliRemarks;
   }
   
   /** @pdOid 1ccc1561-d6b4-41fc-9a84-f6d72ffccabe */
   public java.lang.String getCliUserName() {
      return cliUserName;
   }
   
   /** @param newCliUserName
    * @pdOid 1a61edcc-f83d-423c-90c9-900d7f9f1142 */
   public void setCliUserName(java.lang.String newCliUserName) {
      cliUserName = newCliUserName;
   }
   
   /** @pdOid 9dc929dc-58cb-42fe-ae7d-fa653508770e */
   public java.lang.String getCliUserPass() {
      return cliUserPass;
   }
   
   /** @param newCliUserPass
    * @pdOid 5dff16d4-9666-4934-be71-42e4d1fdea66 */
   public void setCliUserPass(java.lang.String newCliUserPass) {
      cliUserPass = newCliUserPass;
   }
   
   /** @pdOid 4d42fca9-ab6a-4074-a155-2d5d4f176829 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 5e359cb1-155e-441c-b77a-94239c46e10b */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid aed80842-6dde-46fc-bdc5-5aa90087b4dd */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 0355676d-77a7-4e6f-8198-16019494b6f7 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 53e13a26-cdf8-4dbd-8280-c585a05084ed */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 2a86efdc-d6ed-48db-996e-338424b7397c */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}