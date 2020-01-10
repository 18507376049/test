/***********************************************************************
 * Module:  TrackDesc.java
 * Author:  Administrator
 * Purpose: Defines the Class TrackDesc
 ***********************************************************************/

import java.util.*;

/** @pdOid 6c86318c-9d38-413c-91b4-a544233205d4 */
public class TrackDesc {
   /** 跟踪明细编号
    *             
    * 
    * @pdOid 2dde9bad-1cd5-4208-8b40-a4378557ab60 */
   private java.lang.String trdNo;
   /** 物流车
    *             
    * 
    * @pdOid 08b7312d-9db9-43b8-a31a-9227ef9a2335 */
   private java.lang.String trdLogistics;
   /** 节点名称
    *             
    * 
    * @pdOid e504709e-1b29-4e96-a108-3d120bb4957a */
   private java.lang.String trdNode;
   /** 物流调度人
    *             
    * 
    * @pdOid 87ffbf12-9e8d-4324-b664-f3a45cfabb68 */
   private java.lang.String trdEmployeeNo;
   /** 单位编号
    *             
    * 
    * @pdOid 23546a99-b9e4-45cb-bdf2-072fe038e86c */
   private java.lang.String trdUnitNo;
   /** 预计到达时间
    *             
    * 
    * @pdOid 16ed04d3-90d6-4a17-9fbc-e8945f80bad6 */
   private java.util.Date trdATime;
   /** 实际到达时间
    *             
    * 
    * @pdOid 70d2e3a3-ea85-4071-b1d1-aa0657c899dc */
   private java.util.Date trdBTime;
   /** 预计离开时间
    *             
    * 
    * @pdOid 837c0a16-83b9-4b47-9a39-9e91f36fdb6a */
   private java.util.Date trdTimeA;
   /** 实际离开时间
    *             
    * 
    * @pdOid 78191db3-98de-4fb4-a829-e0a24d1b8198 */
   private java.util.Date trdTimeB;
   /** 状态
    *             
    * 
    * @pdOid b3da50e0-01ad-4886-ad7e-adcb0f83b351 */
   private int trdStatus = 0;
   /** 操作人
    *             
    * 
    * @pdOid cff69c8f-fae5-43a4-a4b8-b5e1898b19fe */
   private java.lang.String trdOperator;
   /** 跟踪编号
    *             
    * 
    * @pdOid 5e3dc06c-c92d-4587-8ff5-da3a8fd979fa */
   private java.lang.String trdTraNo;
   /** 下一节点可装载量
    *             
    * 
    * @pdOid d941fc46-30bf-41b7-a320-3a5f0491d418 */
   private java.lang.String fodLowerNode;
   /** 描述
    *             
    * 
    * @pdOid d42d5416-a4c5-4233-9da7-2026fffa5448 */
   private double fodComment;
   /** @pdOid 9be4918a-aecb-4368-9cdd-66764bdbd6d0 */
   private java.lang.String duo1;
   /** @pdOid d73729ae-1f5c-45f5-87a5-d50e96fee5c5 */
   private java.lang.String duo2;
   /** @pdOid 72cb85e2-4aa2-4c57-b764-b4a2f5de3181 */
   private java.lang.String duo3;
   
   /** @pdOid 9288d17e-16a3-4398-a91b-6cc8c3533147 */
   public java.lang.String getTrdNo() {
      return trdNo;
   }
   
   /** @param newTrdNo
    * @pdOid d483ab50-b544-4655-a76d-b1aca874d874 */
   public void setTrdNo(java.lang.String newTrdNo) {
      trdNo = newTrdNo;
   }
   
   /** @pdOid 13a9fd1e-12e4-4860-bae8-7cfaed6906d4 */
   public java.lang.String getTrdLogistics() {
      return trdLogistics;
   }
   
   /** @param newTrdLogistics
    * @pdOid 27f10320-0304-41bb-9b6e-ba2bc5e7de7a */
   public void setTrdLogistics(java.lang.String newTrdLogistics) {
      trdLogistics = newTrdLogistics;
   }
   
   /** @pdOid 2c582c90-1251-4a70-ba64-3a53e66d315d */
   public java.lang.String getTrdNode() {
      return trdNode;
   }
   
   /** @param newTrdNode
    * @pdOid 411195d2-67c7-46ba-8435-be887861864d */
   public void setTrdNode(java.lang.String newTrdNode) {
      trdNode = newTrdNode;
   }
   
   /** @pdOid a39b6cb6-8051-4beb-acf1-5b7a550fefb6 */
   public java.lang.String getTrdEmployeeNo() {
      return trdEmployeeNo;
   }
   
   /** @param newTrdEmployeeNo
    * @pdOid 089dffd3-7570-485d-a646-4e5b87ee46c0 */
   public void setTrdEmployeeNo(java.lang.String newTrdEmployeeNo) {
      trdEmployeeNo = newTrdEmployeeNo;
   }
   
   /** @pdOid 1773e5c4-df1e-415d-8c4f-f3b3812167ec */
   public java.lang.String getTrdUnitNo() {
      return trdUnitNo;
   }
   
   /** @param newTrdUnitNo
    * @pdOid 11faea2f-711b-4030-aa95-80c2b70fdc2d */
   public void setTrdUnitNo(java.lang.String newTrdUnitNo) {
      trdUnitNo = newTrdUnitNo;
   }
   
   /** @pdOid fceb3403-1b2d-4e1d-94e9-e99e2e055fda */
   public java.util.Date getTrdATime() {
      return trdATime;
   }
   
   /** @param newTrdATime
    * @pdOid 7057a94a-a5f8-4526-82b2-167f1be3ffab */
   public void setTrdATime(java.util.Date newTrdATime) {
      trdATime = newTrdATime;
   }
   
   /** @pdOid d52ae9ef-5957-4bcd-9c59-225260073d2f */
   public java.util.Date getTrdBTime() {
      return trdBTime;
   }
   
   /** @param newTrdBTime
    * @pdOid 1274b6c0-0c8a-4ccf-9c8d-dcd071840e91 */
   public void setTrdBTime(java.util.Date newTrdBTime) {
      trdBTime = newTrdBTime;
   }
   
   /** @pdOid ce4df429-3182-4ff3-a2c7-0d287e0c86f5 */
   public java.util.Date getTrdTimeA() {
      return trdTimeA;
   }
   
   /** @param newTrdTimeA
    * @pdOid dc7ee199-15df-46d4-b40a-329e3b4326ec */
   public void setTrdTimeA(java.util.Date newTrdTimeA) {
      trdTimeA = newTrdTimeA;
   }
   
   /** @pdOid 34eecd01-a1f7-4529-813c-5c769c9fa960 */
   public java.util.Date getTrdTimeB() {
      return trdTimeB;
   }
   
   /** @param newTrdTimeB
    * @pdOid 41c43029-92df-4f0c-8ecc-0fec5bf4bfc3 */
   public void setTrdTimeB(java.util.Date newTrdTimeB) {
      trdTimeB = newTrdTimeB;
   }
   
   /** @pdOid 639131ed-3b6f-46e4-bddf-498716c1a9c3 */
   public int getTrdStatus() {
      return trdStatus;
   }
   
   /** @param newTrdStatus
    * @pdOid ca24d46a-a1af-48fb-b612-b9553fc44636 */
   public void setTrdStatus(int newTrdStatus) {
      trdStatus = newTrdStatus;
   }
   
   /** @pdOid 9350656a-345e-4ded-9ecd-395e0f7eeb01 */
   public java.lang.String getTrdOperator() {
      return trdOperator;
   }
   
   /** @param newTrdOperator
    * @pdOid 18cec715-6933-4705-8c4a-ee182a9ec65d */
   public void setTrdOperator(java.lang.String newTrdOperator) {
      trdOperator = newTrdOperator;
   }
   
   /** @pdOid f0654b3b-145d-4883-b648-43dbf4fdaa13 */
   public java.lang.String getTrdTraNo() {
      return trdTraNo;
   }
   
   /** @param newTrdTraNo
    * @pdOid 4c7846cc-2018-435f-a38e-f7f2a6c48bc8 */
   public void setTrdTraNo(java.lang.String newTrdTraNo) {
      trdTraNo = newTrdTraNo;
   }
   
   /** @pdOid 6482fac3-4a56-47bb-b6b4-dc4ba78170db */
   public java.lang.String getFodLowerNode() {
      return fodLowerNode;
   }
   
   /** @param newFodLowerNode
    * @pdOid 5e708756-56d3-4229-a645-a4e6632b59b5 */
   public void setFodLowerNode(java.lang.String newFodLowerNode) {
      fodLowerNode = newFodLowerNode;
   }
   
   /** @pdOid a4ed815b-f4e9-4f6f-acf5-a47e4d653755 */
   public double getFodComment() {
      return fodComment;
   }
   
   /** @param newFodComment
    * @pdOid 47a5c43e-adc2-4e34-982e-59c6a8c8bd14 */
   public void setFodComment(double newFodComment) {
      fodComment = newFodComment;
   }
   
   /** @pdOid 81d23501-7df3-4913-b1b0-5d9c4b5732be */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 4255a4e6-bf5c-4686-84df-9e7980d7edc4 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid bdd4fac0-9e12-4c2a-9f98-204cb3fa762a */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 558a69df-2120-488d-bedf-dc27a1035e78 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 873e8954-69ae-4b7a-8432-e2b0705bfa63 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 1b5ca1d7-e8b9-41a9-adcf-5b713b10e6fc */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}