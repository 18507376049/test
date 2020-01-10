package com.logisticspro.pojo;

import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 取消签收
 */
public class CancelReceiptRequest {
   /**
    * 取消签收编号
    */
   private String carNo;
   /**
    * 申请单号
    */
   private String carApplOdd;
   /**
    * 工作单号
    */
   private String carMoenyidmNo;
   /**
    * 派送单位
    */
   private String carSendTheUnit;
   /**
    *  派送时间
    */
   private java.util.Date carDeliveryData;
   /**
    * 签收状态
    */
   private int carSignStatus = 0;
   /**
    * 审批状态
    */
   private int carApprovalStatus = 0;
   /**
    * 申请原因
    */
   private String carApplyCause;
   /**
    * 申请人
    */
   private String carProposerNo;
   /**
    * 申请单位
     */
   private String carApplicantUnit;
   /**
    * 申请时间
    */
   private Date carApplicationDate;
   /**
    *
    * */
   private String dou1;
   /**
    *
    * */
   private String dou2;

   public CancelReceiptRequest() {
   }

   public CancelReceiptRequest(String carNo, String carApplOdd, String carMoenyidmNo, String carSendTheUnit, Date carDeliveryData, int carSignStatus, int carApprovalStatus, String carApplyCause, String carProposerNo, String carApplicantUnit, Date carApplicationDate, String dou1, String dou2) {
      this.carNo = carNo;
      this.carApplOdd = carApplOdd;
      this.carMoenyidmNo = carMoenyidmNo;
      this.carSendTheUnit = carSendTheUnit;
      this.carDeliveryData = carDeliveryData;
      this.carSignStatus = carSignStatus;
      this.carApprovalStatus = carApprovalStatus;
      this.carApplyCause = carApplyCause;
      this.carProposerNo = carProposerNo;
      this.carApplicantUnit = carApplicantUnit;
      this.carApplicationDate = carApplicationDate;
      this.dou1 = dou1;
      this.dou2 = dou2;
   }

   @Override
   public String toString() {
      return "CancelReceiptRequest{" +
              "carNo='" + carNo + '\'' +
              ", carApplOdd='" + carApplOdd + '\'' +
              ", carMoenyidmNo='" + carMoenyidmNo + '\'' +
              ", carSendTheUnit='" + carSendTheUnit + '\'' +
              ", carDeliveryData=" + carDeliveryData +
              ", carSignStatus=" + carSignStatus +
              ", carApprovalStatus=" + carApprovalStatus +
              ", carApplyCause='" + carApplyCause + '\'' +
              ", carProposerNo='" + carProposerNo + '\'' +
              ", carApplicantUnit='" + carApplicantUnit + '\'' +
              ", carApplicationDate=" + carApplicationDate +
              ", dou1='" + dou1 + '\'' +
              ", dou2='" + dou2 + '\'' +
              '}';
   }

   public String getCarNo() {
      return carNo;
   }

   public void setCarNo(String carNo) {
      this.carNo = carNo;
   }

   public String getCarApplOdd() {
      return carApplOdd;
   }

   public void setCarApplOdd(String carApplOdd) {
      this.carApplOdd = carApplOdd;
   }

   public String getCarMoenyidmNo() {
      return carMoenyidmNo;
   }

   public void setCarMoenyidmNo(String carMoenyidmNo) {
      this.carMoenyidmNo = carMoenyidmNo;
   }

   public String getCarSendTheUnit() {
      return carSendTheUnit;
   }

   public void setCarSendTheUnit(String carSendTheUnit) {
      this.carSendTheUnit = carSendTheUnit;
   }

   public Date getCarDeliveryData() {
      return carDeliveryData;
   }

   public void setCarDeliveryData(Date carDeliveryData) {
      this.carDeliveryData = carDeliveryData;
   }

   public int getCarSignStatus() {
      return carSignStatus;
   }

   public void setCarSignStatus(int carSignStatus) {
      this.carSignStatus = carSignStatus;
   }

   public int getCarApprovalStatus() {
      return carApprovalStatus;
   }

   public void setCarApprovalStatus(int carApprovalStatus) {
      this.carApprovalStatus = carApprovalStatus;
   }

   public String getCarApplyCause() {
      return carApplyCause;
   }

   public void setCarApplyCause(String carApplyCause) {
      this.carApplyCause = carApplyCause;
   }

   public String getCarProposerNo() {
      return carProposerNo;
   }

   public void setCarProposerNo(String carProposerNo) {
      this.carProposerNo = carProposerNo;
   }

   public String getCarApplicantUnit() {
      return carApplicantUnit;
   }

   public void setCarApplicantUnit(String carApplicantUnit) {
      this.carApplicantUnit = carApplicantUnit;
   }

   public Date getCarApplicationDate() {
      return carApplicationDate;
   }

   public void setCarApplicationDate(Date carApplicationDate) {
      this.carApplicationDate = carApplicationDate;
   }

   public String getDou1() {
      return dou1;
   }

   public void setDou1(String dou1) {
      this.dou1 = dou1;
   }

   public String getDou2() {
      return dou2;
   }

   public void setDou2(String dou2) {
      this.dou2 = dou2;
   }
}