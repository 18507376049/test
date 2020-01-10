package com.logisticspro.pojo;
import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 客户订单
 */
public class CustomerOrder {
   /**
    * 客户订单单号
    */
   private String cusOdd;
   /**
    * 电话
    */
   private String cusNumber;
   /**
    * 工作单单号
    */
   private String cusWorkNo;
   /**
    * 客户编号
    */
   private String cusCilNo;
   /**
    * 工单生成时间
    */
   private Date cusWorkOrderTime;
   /**
    * 寄件地址
     */
   private String cusRecAddress;
   /**
    * 取件地址
    */
   private String cusPickupAddress;
   /**
    * 当前状态
    */
   private int cusCurrentStatus = 0;
   /**
    * 销单原因
    */
   private String cusSinglePin;
   /**
    * 操作人工号
    */
   private String cusOperateNo;
   /**
    * 操作人姓名
    */
   private String cusOperateName;
   /**
    * 操作单位
    */
   private String cusOperateUnit;
   /**
    * 操作时间
    */
   private Date cusOperateTime;
   /**
    * 当前操作人
    */
   private String cusCurrentOperate;
   /**
    * 操作人电话
   */
   private String cusOperateNumber;
   /**
    * 当前操作单位
    */
   private String cusCurrOperateUnit;
   /**
    * 追单次数
    */
   private int cusAfterSingleNum;
   /**
    * 状态
    */
   private int cusStatus = 0;
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

   public CustomerOrder() {
   }

   public CustomerOrder(String cusOdd, String cusNumber, String cusWorkNo, String cusCilNo, Date cusWorkOrderTime, String cusRecAddress, String cusPickupAddress, int cusCurrentStatus, String cusSinglePin, String cusOperateNo, String cusOperateName, String cusOperateUnit, Date cusOperateTime, String cusCurrentOperate, String cusOperateNumber, String cusCurrOperateUnit, int cusAfterSingleNum, int cusStatus, String duo1, String duo2, String duo3) {
      this.cusOdd = cusOdd;
      this.cusNumber = cusNumber;
      this.cusWorkNo = cusWorkNo;
      this.cusCilNo = cusCilNo;
      this.cusWorkOrderTime = cusWorkOrderTime;
      this.cusRecAddress = cusRecAddress;
      this.cusPickupAddress = cusPickupAddress;
      this.cusCurrentStatus = cusCurrentStatus;
      this.cusSinglePin = cusSinglePin;
      this.cusOperateNo = cusOperateNo;
      this.cusOperateName = cusOperateName;
      this.cusOperateUnit = cusOperateUnit;
      this.cusOperateTime = cusOperateTime;
      this.cusCurrentOperate = cusCurrentOperate;
      this.cusOperateNumber = cusOperateNumber;
      this.cusCurrOperateUnit = cusCurrOperateUnit;
      this.cusAfterSingleNum = cusAfterSingleNum;
      this.cusStatus = cusStatus;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "CustomerOrder{" +
              "cusOdd='" + cusOdd + '\'' +
              ", cusNumber='" + cusNumber + '\'' +
              ", cusWorkNo='" + cusWorkNo + '\'' +
              ", cusCilNo='" + cusCilNo + '\'' +
              ", cusWorkOrderTime=" + cusWorkOrderTime +
              ", cusRecAddress='" + cusRecAddress + '\'' +
              ", cusPickupAddress='" + cusPickupAddress + '\'' +
              ", cusCurrentStatus=" + cusCurrentStatus +
              ", cusSinglePin='" + cusSinglePin + '\'' +
              ", cusOperateNo='" + cusOperateNo + '\'' +
              ", cusOperateName='" + cusOperateName + '\'' +
              ", cusOperateUnit='" + cusOperateUnit + '\'' +
              ", cusOperateTime=" + cusOperateTime +
              ", cusCurrentOperate='" + cusCurrentOperate + '\'' +
              ", cusOperateNumber='" + cusOperateNumber + '\'' +
              ", cusCurrOperateUnit='" + cusCurrOperateUnit + '\'' +
              ", cusAfterSingleNum=" + cusAfterSingleNum +
              ", cusStatus=" + cusStatus +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getCusOdd() {
      return cusOdd;
   }

   public void setCusOdd(String cusOdd) {
      this.cusOdd = cusOdd;
   }

   public String getCusNumber() {
      return cusNumber;
   }

   public void setCusNumber(String cusNumber) {
      this.cusNumber = cusNumber;
   }

   public String getCusWorkNo() {
      return cusWorkNo;
   }

   public void setCusWorkNo(String cusWorkNo) {
      this.cusWorkNo = cusWorkNo;
   }

   public String getCusCilNo() {
      return cusCilNo;
   }

   public void setCusCilNo(String cusCilNo) {
      this.cusCilNo = cusCilNo;
   }

   public Date getCusWorkOrderTime() {
      return cusWorkOrderTime;
   }

   public void setCusWorkOrderTime(Date cusWorkOrderTime) {
      this.cusWorkOrderTime = cusWorkOrderTime;
   }

   public String getCusRecAddress() {
      return cusRecAddress;
   }

   public void setCusRecAddress(String cusRecAddress) {
      this.cusRecAddress = cusRecAddress;
   }

   public String getCusPickupAddress() {
      return cusPickupAddress;
   }

   public void setCusPickupAddress(String cusPickupAddress) {
      this.cusPickupAddress = cusPickupAddress;
   }

   public int getCusCurrentStatus() {
      return cusCurrentStatus;
   }

   public void setCusCurrentStatus(int cusCurrentStatus) {
      this.cusCurrentStatus = cusCurrentStatus;
   }

   public String getCusSinglePin() {
      return cusSinglePin;
   }

   public void setCusSinglePin(String cusSinglePin) {
      this.cusSinglePin = cusSinglePin;
   }

   public String getCusOperateNo() {
      return cusOperateNo;
   }

   public void setCusOperateNo(String cusOperateNo) {
      this.cusOperateNo = cusOperateNo;
   }

   public String getCusOperateName() {
      return cusOperateName;
   }

   public void setCusOperateName(String cusOperateName) {
      this.cusOperateName = cusOperateName;
   }

   public String getCusOperateUnit() {
      return cusOperateUnit;
   }

   public void setCusOperateUnit(String cusOperateUnit) {
      this.cusOperateUnit = cusOperateUnit;
   }

   public Date getCusOperateTime() {
      return cusOperateTime;
   }

   public void setCusOperateTime(Date cusOperateTime) {
      this.cusOperateTime = cusOperateTime;
   }

   public String getCusCurrentOperate() {
      return cusCurrentOperate;
   }

   public void setCusCurrentOperate(String cusCurrentOperate) {
      this.cusCurrentOperate = cusCurrentOperate;
   }

   public String getCusOperateNumber() {
      return cusOperateNumber;
   }

   public void setCusOperateNumber(String cusOperateNumber) {
      this.cusOperateNumber = cusOperateNumber;
   }

   public String getCusCurrOperateUnit() {
      return cusCurrOperateUnit;
   }

   public void setCusCurrOperateUnit(String cusCurrOperateUnit) {
      this.cusCurrOperateUnit = cusCurrOperateUnit;
   }

   public int getCusAfterSingleNum() {
      return cusAfterSingleNum;
   }

   public void setCusAfterSingleNum(int cusAfterSingleNum) {
      this.cusAfterSingleNum = cusAfterSingleNum;
   }

   public int getCusStatus() {
      return cusStatus;
   }

   public void setCusStatus(int cusStatus) {
      this.cusStatus = cusStatus;
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