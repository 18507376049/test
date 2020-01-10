/***********************************************************************
 * Module:  Verification.java
 * Author:  Administrator
 * Purpose: Defines the Class Verification
 ***********************************************************************/

import java.util.*;

/** @pdOid df84c9e3-d214-4535-8cf4-83e619ee4820 */
public class Verification {
   /** 核销单号
    *             
    * 
    * @pdOid c6e7a2db-92ea-4f01-81f7-f4c57d8e33c6 */
   private java.lang.String verNo;
   /** 核销类型
    *             
    * 
    * @pdOid 6f038848-478a-482a-85a1-2642e9566b2f */
   private java.lang.String verType;
   /** 所属单位
    *             
    * 
    * @pdOid 27e8970b-1bd4-4563-b453-be49349cbd1d */
   private java.lang.String verUnit;
   /** 开单人工号
    *             
    * 
    * @pdOid 2fefee05-aecb-4049-9d5d-fc11796db329 */
   private java.lang.String verSingleNumber;
   /** 开单人
    *             
    * 
    * @pdOid 824f9af6-b438-470b-b8fe-c705e15c2de8 */
   private java.lang.String verSingle;
   /** 开单时间
    *             
    * 
    * @pdOid e7c42af4-f1d6-4195-a981-2adfc57ff058 */
   private java.util.Date verTime;
   /** 修改人工号
    *             
    * 
    * @pdOid 53483386-43f3-412f-aeb3-61c6c4c6f612 */
   private java.lang.String verNodificationNumber;
   /** 修改人
    *             
    * 
    * @pdOid 9f414330-7755-4b58-8368-1ec0fd9dc5a5 */
   private java.lang.String verNodification;
   /** 修改时间
    *             
    * 
    * @pdOid 61b988c6-23b0-4316-a1bf-388915184643 */
   private java.util.Date verChangeTime;
   /** 作废人工号
    *             
    * 
    * @pdOid 758c7443-f925-4a3c-8b0b-56ec2b1c7f1f */
   private java.lang.String verCancellationNumber;
   /** 作废人
    *             
    * 
    * @pdOid 46246655-4b69-4c7e-bc53-5ff15bb04b83 */
   private java.lang.String verCancellation;
   /** 作废时间
    *             
    * 
    * @pdOid 73a5bde1-8210-41f9-8b9a-4e15d5ffe9f8 */
   private java.util.Date verCancellationTime;
   /** 状态
    *             
    * 
    * @pdOid 91e78a8b-e3f0-4ead-81d3-07e7dd36798c */
   private int verState;
   /** @pdOid a0e57e24-867e-4eca-81e0-d9c0c533606a */
   private java.lang.String duo1;
   /** @pdOid 38e88b36-da3d-4ee1-8427-1a8f31892346 */
   private java.lang.String duo2;
   
   /** @pdOid 28856dcd-3b83-4896-b185-f983791bd211 */
   public java.lang.String getVerNo() {
      return verNo;
   }
   
   /** @param newVerNo
    * @pdOid ab5a80a5-5795-480f-bc28-45b70429cf28 */
   public void setVerNo(java.lang.String newVerNo) {
      verNo = newVerNo;
   }
   
   /** @pdOid bd68ca99-7ffc-4377-9916-feebf54039f5 */
   public java.lang.String getVerType() {
      return verType;
   }
   
   /** @param newVerType
    * @pdOid 6774ecf5-0791-4118-92c6-34734cb4940b */
   public void setVerType(java.lang.String newVerType) {
      verType = newVerType;
   }
   
   /** @pdOid d597a599-193f-4af9-89c9-9443f9a8983c */
   public java.lang.String getVerUnit() {
      return verUnit;
   }
   
   /** @param newVerUnit
    * @pdOid 9decc1a4-c764-4d66-92a5-f8253f46e53a */
   public void setVerUnit(java.lang.String newVerUnit) {
      verUnit = newVerUnit;
   }
   
   /** @pdOid 49c80bea-4595-464b-8875-ba1c873018c3 */
   public java.lang.String getVerSingleNumber() {
      return verSingleNumber;
   }
   
   /** @param newVerSingleNumber
    * @pdOid 19c5f500-c25d-4ff8-9452-d02685006d3d */
   public void setVerSingleNumber(java.lang.String newVerSingleNumber) {
      verSingleNumber = newVerSingleNumber;
   }
   
   /** @pdOid 2846e53e-c049-4492-8f31-b14d5f1ed4c9 */
   public java.lang.String getVerSingle() {
      return verSingle;
   }
   
   /** @param newVerSingle
    * @pdOid f7ca9ff3-2e7b-4f82-b385-a9a7e76291b8 */
   public void setVerSingle(java.lang.String newVerSingle) {
      verSingle = newVerSingle;
   }
   
   /** @pdOid 2f91dc0b-e52d-4246-9928-32c637ecbe76 */
   public java.util.Date getVerTime() {
      return verTime;
   }
   
   /** @param newVerTime
    * @pdOid 4f040bc7-6e1f-4a7a-bcda-80bf86f19348 */
   public void setVerTime(java.util.Date newVerTime) {
      verTime = newVerTime;
   }
   
   /** @pdOid 58e663af-89b7-4bc1-9a84-6313ed029d68 */
   public java.lang.String getVerNodificationNumber() {
      return verNodificationNumber;
   }
   
   /** @param newVerNodificationNumber
    * @pdOid 06518045-3e5c-4072-959a-863e26f65ec0 */
   public void setVerNodificationNumber(java.lang.String newVerNodificationNumber) {
      verNodificationNumber = newVerNodificationNumber;
   }
   
   /** @pdOid 1058e788-b14c-4048-af33-9706f194cb60 */
   public java.lang.String getVerNodification() {
      return verNodification;
   }
   
   /** @param newVerNodification
    * @pdOid 20790127-233a-424d-86f8-49ad294d4268 */
   public void setVerNodification(java.lang.String newVerNodification) {
      verNodification = newVerNodification;
   }
   
   /** @pdOid d34103d6-3033-4508-815f-8883c0c88c75 */
   public java.util.Date getVerChangeTime() {
      return verChangeTime;
   }
   
   /** @param newVerChangeTime
    * @pdOid 5f235aea-44f5-4090-8c9e-11fb570a8a44 */
   public void setVerChangeTime(java.util.Date newVerChangeTime) {
      verChangeTime = newVerChangeTime;
   }
   
   /** @pdOid b8685d57-99f8-41cf-8bcf-2befd2508ea6 */
   public java.lang.String getVerCancellationNumber() {
      return verCancellationNumber;
   }
   
   /** @param newVerCancellationNumber
    * @pdOid 2a4e67f8-67ca-4b36-b265-acbb4a91cdaf */
   public void setVerCancellationNumber(java.lang.String newVerCancellationNumber) {
      verCancellationNumber = newVerCancellationNumber;
   }
   
   /** @pdOid 3b983dd7-2ed9-4ed4-9961-d789a832166b */
   public java.lang.String getVerCancellation() {
      return verCancellation;
   }
   
   /** @param newVerCancellation
    * @pdOid 492c21e2-49f7-41ee-8867-0b8261ea5b7e */
   public void setVerCancellation(java.lang.String newVerCancellation) {
      verCancellation = newVerCancellation;
   }
   
   /** @pdOid 31f87e3e-ecca-4cee-aa2a-69f24b19f324 */
   public java.util.Date getVerCancellationTime() {
      return verCancellationTime;
   }
   
   /** @param newVerCancellationTime
    * @pdOid 99521814-8bf8-4160-a58c-72a22dfb5f17 */
   public void setVerCancellationTime(java.util.Date newVerCancellationTime) {
      verCancellationTime = newVerCancellationTime;
   }
   
   /** @pdOid 5adf1b2e-a2b2-4edb-b84d-30dd0696e076 */
   public int getVerState() {
      return verState;
   }
   
   /** @param newVerState
    * @pdOid 2931326a-e187-4f08-84aa-b3b914647a35 */
   public void setVerState(int newVerState) {
      verState = newVerState;
   }
   
   /** @pdOid e85d19f5-f570-4b60-9e6a-925e6e08dbf7 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 177461ae-32a9-44c5-aae2-706d7673d5fe */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 3d9facdf-85fe-4213-ac27-5a5688bae75c */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 41924b84-ec74-4798-ae9a-292d8b84a48e */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}