package com.logisticspro.pojo;
import java.util.*;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 工作单
 */
public class Worksheet {
   /**
    * 工作单号
    *  */
   private String wosNo;
   /**
    * 客户编号
    * */
   private String wosCustomerNo;
   /**
    * 客户单号修改标志
    * */
   private int wosUpdateSign = 0;
   /**
    * 业务通知单号
    *  */
   private String wosBusMemoNo;
   /**
    *  到达地址
    *  */
   private String wosArrivalPlaceNo;
   /**
    * 产品
    *  */
   private String wosProduct;
   /**
    * 总件数
    *  */
   private int wosTotalNumber = 1;
   /**
    * 重量
    * */
   private double wosWeight;
   /**
    * 配载要求
    *  */
   private String wosStowage;
   /**
    * 产品时限
    *  */
   private Date wosProductLimit;
   /**
    * 件数
    *  */
   private int wosCaseNumber = 1;
   /**
    * 受理单位
    *  */
   private String wosAcceptUnit;
   /**
    * 受理人
    *  */
   private String wosAcceptor;
   /**
    * 受理时间
    * */
   private Date wosAcceptTime;
   /**
    * 取货人姓名
    *  */
   private String wosConsigneeName;
   /**
    * 寄件人编号
    * */
   private String wosSenderNo;
   /**
    * 寄件人
    * */
   private String wosSender;
   /**
    * 寄件人地址
    *  */
   private String wosSenderAddress;
   /**
    * 寄件人单位
    *  */
   private String wosSenderUnit;
   /**
    * 寄件人手机
    *  */
   private String wosSenderMobile;
   /**
    * 专项报价编号
    * */
   private String wosSpecialOfferNo;
   /**
    * 收件人
    * */
   private String wosRecipients;
   /**
    * 收件人地址
    * */
   private String wosDirection;
   /**
    * 收件人单位
    *  */
   private String wosRecipientsUnit;
   /**
    * 收件人手机
    * */
   private String wosRecipientsMobile;
   /**
    * 计费数量
    *  */
   private int wosBillingNumber;
   /**
    * 实际重量
    * */
   private double wosAcctualWeight;
   /**
    * 品名
    *  */
   private String wosTradeName;
   /**
    * 体积
    *  */
   private double wosSize;
   /**
    * 声明价值
    * */
   private double wosDeclaredValue;
   /**
    * 实际包装
    *  */
   private String wosAcctualPackage;
   /**
    * 包装费
    *  */
   private double wosPackackExpense;
   /**
    * 包装要求
    *  */
   private String wosPackaceRequire;
   /**
    *  原件数
    *  */
   private int wosOriginalNumber;
   /**
    *  实际件数
    *  */
   private int wosAcctualNumber;
   /**
    * 计费重量
    *  */
   private double wosChargedWeight;
   /**
    * 运费
    *  */
   private double wosFreNo;
   /**
    * 结算方式
    *  */
   private String wosFreightExpect;
   /**
    * 预收费
    *  */
   private double wosClearForm;
   /**
    * 代收款
    *  */
   private double wosPrecharge;
   /**
    *  到付款
    *  */
   private double wosAgencyFund;
   /**
    * 反馈签收
    * */
   private String wosPayment;
   /**
    * 邮费编号
    * */
   private String wosFeedback;
   /**
    *  节假日可以收货
    * */
   private int wosIsReceive = 0;
   /**
    *  标准时限
    *  */
   private Date wosStandardTime;
   /**
    * 送达时限
    * */
   private Date wosDeliveryTime;
   /**
    * 重要提示
    * */
   private String wosImportantNote;
   /**
    * 是否打印
    *  */
   private int wosIsPrint;
   /**
    * 开单操作单位
    * */
   private String wosOrderOperateUnit;
   /**
    * 开单人编号
    *  */
   private String wosOpenNo;
   /**
    * 开单人姓名
    *  */
   private String wosOpenName;
   /**
    * 开单时间
    *  */
   private Date wosOpenTime;
   /**
    * 补单人
    * */
   private String wosSingle;
   /**
    *  补单人编号
    *  */
   private String wosSingleNo;
   /**
    * 补单时间
    * */
   private Date wosSingleTime;
   /**
    * 当前补单单位
    * */
   private String wosCurrentUnit;
   /**
    * 返签单标志
    *  */
   private int wosBackSignBill = 0;
   /**
    * 被返货标志
    *  */
   private int wosQuiltReturnSign = 0;
   /**
    * 返货标志
    *  */
   private int wosReturnSign = 0;
   /**
    * 作废状态
    *  */
   private int wosCancelStatus = 0;
   /**
    * 签收状态
    *  */
   private int wosSignOfStatus = 0;
   /**
    * 工作单类型
    *  */
   private String wosWorkOrderType;
   /**
    * 收件人邮编
    * */
   private String wosRecipientCode;
   /**
    * 发件人邮编
    *  */
   private String wosAddresserCode;
   /**
    * 分拣编码
    * */
   private String wosSortingNo;
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

   public String getWosNo() {
      return wosNo;
   }

   public void setWosNo(String wosNo) {
      this.wosNo = wosNo;
   }

   public String getWosCustomerNo() {
      return wosCustomerNo;
   }

   public void setWosCustomerNo(String wosCustomerNo) {
      this.wosCustomerNo = wosCustomerNo;
   }

   public int getWosUpdateSign() {
      return wosUpdateSign;
   }

   public void setWosUpdateSign(int wosUpdateSign) {
      this.wosUpdateSign = wosUpdateSign;
   }

   public String getWosBusMemoNo() {
      return wosBusMemoNo;
   }

   public void setWosBusMemoNo(String wosBusMemoNo) {
      this.wosBusMemoNo = wosBusMemoNo;
   }

   public String getWosArrivalPlaceNo() {
      return wosArrivalPlaceNo;
   }

   public void setWosArrivalPlaceNo(String wosArrivalPlaceNo) {
      this.wosArrivalPlaceNo = wosArrivalPlaceNo;
   }

   public String getWosProduct() {
      return wosProduct;
   }

   public void setWosProduct(String wosProduct) {
      this.wosProduct = wosProduct;
   }

   public int getWosTotalNumber() {
      return wosTotalNumber;
   }

   public void setWosTotalNumber(int wosTotalNumber) {
      this.wosTotalNumber = wosTotalNumber;
   }

   public double getWosWeight() {
      return wosWeight;
   }

   public void setWosWeight(double wosWeight) {
      this.wosWeight = wosWeight;
   }

   public String getWosStowage() {
      return wosStowage;
   }

   public void setWosStowage(String wosStowage) {
      this.wosStowage = wosStowage;
   }

   public Date getWosProductLimit() {
      return wosProductLimit;
   }

   public void setWosProductLimit(Date wosProductLimit) {
      this.wosProductLimit = wosProductLimit;
   }

   public int getWosCaseNumber() {
      return wosCaseNumber;
   }

   public void setWosCaseNumber(int wosCaseNumber) {
      this.wosCaseNumber = wosCaseNumber;
   }

   public String getWosAcceptUnit() {
      return wosAcceptUnit;
   }

   public void setWosAcceptUnit(String wosAcceptUnit) {
      this.wosAcceptUnit = wosAcceptUnit;
   }

   public String getWosAcceptor() {
      return wosAcceptor;
   }

   public void setWosAcceptor(String wosAcceptor) {
      this.wosAcceptor = wosAcceptor;
   }

   public Date getWosAcceptTime() {
      return wosAcceptTime;
   }

   public void setWosAcceptTime(Date wosAcceptTime) {
      this.wosAcceptTime = wosAcceptTime;
   }

   public String getWosConsigneeName() {
      return wosConsigneeName;
   }

   public void setWosConsigneeName(String wosConsigneeName) {
      this.wosConsigneeName = wosConsigneeName;
   }

   public String getWosSenderNo() {
      return wosSenderNo;
   }

   public void setWosSenderNo(String wosSenderNo) {
      this.wosSenderNo = wosSenderNo;
   }

   public String getWosSender() {
      return wosSender;
   }

   public void setWosSender(String wosSender) {
      this.wosSender = wosSender;
   }

   public String getWosSenderAddress() {
      return wosSenderAddress;
   }

   public void setWosSenderAddress(String wosSenderAddress) {
      this.wosSenderAddress = wosSenderAddress;
   }

   public String getWosSenderUnit() {
      return wosSenderUnit;
   }

   public void setWosSenderUnit(String wosSenderUnit) {
      this.wosSenderUnit = wosSenderUnit;
   }

   public String getWosSenderMobile() {
      return wosSenderMobile;
   }

   public void setWosSenderMobile(String wosSenderMobile) {
      this.wosSenderMobile = wosSenderMobile;
   }

   public String getWosSpecialOfferNo() {
      return wosSpecialOfferNo;
   }

   public void setWosSpecialOfferNo(String wosSpecialOfferNo) {
      this.wosSpecialOfferNo = wosSpecialOfferNo;
   }

   public String getWosRecipients() {
      return wosRecipients;
   }

   public void setWosRecipients(String wosRecipients) {
      this.wosRecipients = wosRecipients;
   }

   public String getWosDirection() {
      return wosDirection;
   }

   public void setWosDirection(String wosDirection) {
      this.wosDirection = wosDirection;
   }

   public String getWosRecipientsUnit() {
      return wosRecipientsUnit;
   }

   public void setWosRecipientsUnit(String wosRecipientsUnit) {
      this.wosRecipientsUnit = wosRecipientsUnit;
   }

   public String getWosRecipientsMobile() {
      return wosRecipientsMobile;
   }

   public void setWosRecipientsMobile(String wosRecipientsMobile) {
      this.wosRecipientsMobile = wosRecipientsMobile;
   }

   public int getWosBillingNumber() {
      return wosBillingNumber;
   }

   public void setWosBillingNumber(int wosBillingNumber) {
      this.wosBillingNumber = wosBillingNumber;
   }

   public double getWosAcctualWeight() {
      return wosAcctualWeight;
   }

   public void setWosAcctualWeight(double wosAcctualWeight) {
      this.wosAcctualWeight = wosAcctualWeight;
   }

   public String getWosTradeName() {
      return wosTradeName;
   }

   public void setWosTradeName(String wosTradeName) {
      this.wosTradeName = wosTradeName;
   }

   public double getWosSize() {
      return wosSize;
   }

   public void setWosSize(double wosSize) {
      this.wosSize = wosSize;
   }

   public double getWosDeclaredValue() {
      return wosDeclaredValue;
   }

   public void setWosDeclaredValue(double wosDeclaredValue) {
      this.wosDeclaredValue = wosDeclaredValue;
   }

   public String getWosAcctualPackage() {
      return wosAcctualPackage;
   }

   public void setWosAcctualPackage(String wosAcctualPackage) {
      this.wosAcctualPackage = wosAcctualPackage;
   }

   public double getWosPackackExpense() {
      return wosPackackExpense;
   }

   public void setWosPackackExpense(double wosPackackExpense) {
      this.wosPackackExpense = wosPackackExpense;
   }

   public String getWosPackaceRequire() {
      return wosPackaceRequire;
   }

   public void setWosPackaceRequire(String wosPackaceRequire) {
      this.wosPackaceRequire = wosPackaceRequire;
   }

   public int getWosOriginalNumber() {
      return wosOriginalNumber;
   }

   public void setWosOriginalNumber(int wosOriginalNumber) {
      this.wosOriginalNumber = wosOriginalNumber;
   }

   public int getWosAcctualNumber() {
      return wosAcctualNumber;
   }

   public void setWosAcctualNumber(int wosAcctualNumber) {
      this.wosAcctualNumber = wosAcctualNumber;
   }

   public double getWosChargedWeight() {
      return wosChargedWeight;
   }

   public void setWosChargedWeight(double wosChargedWeight) {
      this.wosChargedWeight = wosChargedWeight;
   }

   public double getWosFreNo() {
      return wosFreNo;
   }

   public void setWosFreNo(double wosFreNo) {
      this.wosFreNo = wosFreNo;
   }

   public String getWosFreightExpect() {
      return wosFreightExpect;
   }

   public void setWosFreightExpect(String wosFreightExpect) {
      this.wosFreightExpect = wosFreightExpect;
   }

   public double getWosClearForm() {
      return wosClearForm;
   }

   public void setWosClearForm(double wosClearForm) {
      this.wosClearForm = wosClearForm;
   }

   public double getWosPrecharge() {
      return wosPrecharge;
   }

   public void setWosPrecharge(double wosPrecharge) {
      this.wosPrecharge = wosPrecharge;
   }

   public double getWosAgencyFund() {
      return wosAgencyFund;
   }

   public void setWosAgencyFund(double wosAgencyFund) {
      this.wosAgencyFund = wosAgencyFund;
   }

   public String getWosPayment() {
      return wosPayment;
   }

   public void setWosPayment(String wosPayment) {
      this.wosPayment = wosPayment;
   }

   public String getWosFeedback() {
      return wosFeedback;
   }

   public void setWosFeedback(String wosFeedback) {
      this.wosFeedback = wosFeedback;
   }

   public int getWosIsReceive() {
      return wosIsReceive;
   }

   public void setWosIsReceive(int wosIsReceive) {
      this.wosIsReceive = wosIsReceive;
   }

   public Date getWosStandardTime() {
      return wosStandardTime;
   }

   public void setWosStandardTime(Date wosStandardTime) {
      this.wosStandardTime = wosStandardTime;
   }

   public Date getWosDeliveryTime() {
      return wosDeliveryTime;
   }

   public void setWosDeliveryTime(Date wosDeliveryTime) {
      this.wosDeliveryTime = wosDeliveryTime;
   }

   public String getWosImportantNote() {
      return wosImportantNote;
   }

   public void setWosImportantNote(String wosImportantNote) {
      this.wosImportantNote = wosImportantNote;
   }

   public int getWosIsPrint() {
      return wosIsPrint;
   }

   public void setWosIsPrint(int wosIsPrint) {
      this.wosIsPrint = wosIsPrint;
   }

   public String getWosOrderOperateUnit() {
      return wosOrderOperateUnit;
   }

   public void setWosOrderOperateUnit(String wosOrderOperateUnit) {
      this.wosOrderOperateUnit = wosOrderOperateUnit;
   }

   public String getWosOpenNo() {
      return wosOpenNo;
   }

   public void setWosOpenNo(String wosOpenNo) {
      this.wosOpenNo = wosOpenNo;
   }

   public String getWosOpenName() {
      return wosOpenName;
   }

   public void setWosOpenName(String wosOpenName) {
      this.wosOpenName = wosOpenName;
   }

   public Date getWosOpenTime() {
      return wosOpenTime;
   }

   public void setWosOpenTime(Date wosOpenTime) {
      this.wosOpenTime = wosOpenTime;
   }

   public String getWosSingle() {
      return wosSingle;
   }

   public void setWosSingle(String wosSingle) {
      this.wosSingle = wosSingle;
   }

   public String getWosSingleNo() {
      return wosSingleNo;
   }

   public void setWosSingleNo(String wosSingleNo) {
      this.wosSingleNo = wosSingleNo;
   }

   public Date getWosSingleTime() {
      return wosSingleTime;
   }

   public void setWosSingleTime(Date wosSingleTime) {
      this.wosSingleTime = wosSingleTime;
   }

   public String getWosCurrentUnit() {
      return wosCurrentUnit;
   }

   public void setWosCurrentUnit(String wosCurrentUnit) {
      this.wosCurrentUnit = wosCurrentUnit;
   }

   public int getWosBackSignBill() {
      return wosBackSignBill;
   }

   public void setWosBackSignBill(int wosBackSignBill) {
      this.wosBackSignBill = wosBackSignBill;
   }

   public int getWosQuiltReturnSign() {
      return wosQuiltReturnSign;
   }

   public void setWosQuiltReturnSign(int wosQuiltReturnSign) {
      this.wosQuiltReturnSign = wosQuiltReturnSign;
   }

   public int getWosReturnSign() {
      return wosReturnSign;
   }

   public void setWosReturnSign(int wosReturnSign) {
      this.wosReturnSign = wosReturnSign;
   }

   public int getWosCancelStatus() {
      return wosCancelStatus;
   }

   public void setWosCancelStatus(int wosCancelStatus) {
      this.wosCancelStatus = wosCancelStatus;
   }

   public int getWosSignOfStatus() {
      return wosSignOfStatus;
   }

   public void setWosSignOfStatus(int wosSignOfStatus) {
      this.wosSignOfStatus = wosSignOfStatus;
   }

   public String getWosWorkOrderType() {
      return wosWorkOrderType;
   }

   public void setWosWorkOrderType(String wosWorkOrderType) {
      this.wosWorkOrderType = wosWorkOrderType;
   }

   public String getWosRecipientCode() {
      return wosRecipientCode;
   }

   public void setWosRecipientCode(String wosRecipientCode) {
      this.wosRecipientCode = wosRecipientCode;
   }

   public String getWosAddresserCode() {
      return wosAddresserCode;
   }

   public void setWosAddresserCode(String wosAddresserCode) {
      this.wosAddresserCode = wosAddresserCode;
   }

   public String getWosSortingNo() {
      return wosSortingNo;
   }

   public void setWosSortingNo(String wosSortingNo) {
      this.wosSortingNo = wosSortingNo;
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

   public Worksheet(String wosNo, String wosCustomerNo, int wosUpdateSign, String wosBusMemoNo, String wosArrivalPlaceNo, String wosProduct, int wosTotalNumber, double wosWeight, String wosStowage, Date wosProductLimit, int wosCaseNumber, String wosAcceptUnit, String wosAcceptor, Date wosAcceptTime, String wosConsigneeName, String wosSenderNo, String wosSender, String wosSenderAddress, String wosSenderUnit, String wosSenderMobile, String wosSpecialOfferNo, String wosRecipients, String wosDirection, String wosRecipientsUnit, String wosRecipientsMobile, int wosBillingNumber, double wosAcctualWeight, String wosTradeName, double wosSize, double wosDeclaredValue, String wosAcctualPackage, double wosPackackExpense, String wosPackaceRequire, int wosOriginalNumber, int wosAcctualNumber, double wosChargedWeight, double wosFreNo, String wosFreightExpect, double wosClearForm, double wosPrecharge, double wosAgencyFund, String wosPayment, String wosFeedback, int wosIsReceive, Date wosStandardTime, Date wosDeliveryTime, String wosImportantNote, int wosIsPrint, String wosOrderOperateUnit, String wosOpenNo, String wosOpenName, Date wosOpenTime, String wosSingle, String wosSingleNo, Date wosSingleTime, String wosCurrentUnit, int wosBackSignBill, int wosQuiltReturnSign, int wosReturnSign, int wosCancelStatus, int wosSignOfStatus, String wosWorkOrderType, String wosRecipientCode, String wosAddresserCode, String wosSortingNo, String duo1, String duo2, String duo3) {
      this.wosNo = wosNo;
      this.wosCustomerNo = wosCustomerNo;
      this.wosUpdateSign = wosUpdateSign;
      this.wosBusMemoNo = wosBusMemoNo;
      this.wosArrivalPlaceNo = wosArrivalPlaceNo;
      this.wosProduct = wosProduct;
      this.wosTotalNumber = wosTotalNumber;
      this.wosWeight = wosWeight;
      this.wosStowage = wosStowage;
      this.wosProductLimit = wosProductLimit;
      this.wosCaseNumber = wosCaseNumber;
      this.wosAcceptUnit = wosAcceptUnit;
      this.wosAcceptor = wosAcceptor;
      this.wosAcceptTime = wosAcceptTime;
      this.wosConsigneeName = wosConsigneeName;
      this.wosSenderNo = wosSenderNo;
      this.wosSender = wosSender;
      this.wosSenderAddress = wosSenderAddress;
      this.wosSenderUnit = wosSenderUnit;
      this.wosSenderMobile = wosSenderMobile;
      this.wosSpecialOfferNo = wosSpecialOfferNo;
      this.wosRecipients = wosRecipients;
      this.wosDirection = wosDirection;
      this.wosRecipientsUnit = wosRecipientsUnit;
      this.wosRecipientsMobile = wosRecipientsMobile;
      this.wosBillingNumber = wosBillingNumber;
      this.wosAcctualWeight = wosAcctualWeight;
      this.wosTradeName = wosTradeName;
      this.wosSize = wosSize;
      this.wosDeclaredValue = wosDeclaredValue;
      this.wosAcctualPackage = wosAcctualPackage;
      this.wosPackackExpense = wosPackackExpense;
      this.wosPackaceRequire = wosPackaceRequire;
      this.wosOriginalNumber = wosOriginalNumber;
      this.wosAcctualNumber = wosAcctualNumber;
      this.wosChargedWeight = wosChargedWeight;
      this.wosFreNo = wosFreNo;
      this.wosFreightExpect = wosFreightExpect;
      this.wosClearForm = wosClearForm;
      this.wosPrecharge = wosPrecharge;
      this.wosAgencyFund = wosAgencyFund;
      this.wosPayment = wosPayment;
      this.wosFeedback = wosFeedback;
      this.wosIsReceive = wosIsReceive;
      this.wosStandardTime = wosStandardTime;
      this.wosDeliveryTime = wosDeliveryTime;
      this.wosImportantNote = wosImportantNote;
      this.wosIsPrint = wosIsPrint;
      this.wosOrderOperateUnit = wosOrderOperateUnit;
      this.wosOpenNo = wosOpenNo;
      this.wosOpenName = wosOpenName;
      this.wosOpenTime = wosOpenTime;
      this.wosSingle = wosSingle;
      this.wosSingleNo = wosSingleNo;
      this.wosSingleTime = wosSingleTime;
      this.wosCurrentUnit = wosCurrentUnit;
      this.wosBackSignBill = wosBackSignBill;
      this.wosQuiltReturnSign = wosQuiltReturnSign;
      this.wosReturnSign = wosReturnSign;
      this.wosCancelStatus = wosCancelStatus;
      this.wosSignOfStatus = wosSignOfStatus;
      this.wosWorkOrderType = wosWorkOrderType;
      this.wosRecipientCode = wosRecipientCode;
      this.wosAddresserCode = wosAddresserCode;
      this.wosSortingNo = wosSortingNo;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   public Worksheet() {
   }

   @Override
   public String toString() {
      return "Worksheet{" +
              "wosNo='" + wosNo + '\'' +
              ", wosCustomerNo='" + wosCustomerNo + '\'' +
              ", wosUpdateSign=" + wosUpdateSign +
              ", wosBusMemoNo='" + wosBusMemoNo + '\'' +
              ", wosArrivalPlaceNo='" + wosArrivalPlaceNo + '\'' +
              ", wosProduct='" + wosProduct + '\'' +
              ", wosTotalNumber=" + wosTotalNumber +
              ", wosWeight=" + wosWeight +
              ", wosStowage='" + wosStowage + '\'' +
              ", wosProductLimit=" + wosProductLimit +
              ", wosCaseNumber=" + wosCaseNumber +
              ", wosAcceptUnit='" + wosAcceptUnit + '\'' +
              ", wosAcceptor='" + wosAcceptor + '\'' +
              ", wosAcceptTime=" + wosAcceptTime +
              ", wosConsigneeName='" + wosConsigneeName + '\'' +
              ", wosSenderNo='" + wosSenderNo + '\'' +
              ", wosSender='" + wosSender + '\'' +
              ", wosSenderAddress='" + wosSenderAddress + '\'' +
              ", wosSenderUnit='" + wosSenderUnit + '\'' +
              ", wosSenderMobile='" + wosSenderMobile + '\'' +
              ", wosSpecialOfferNo='" + wosSpecialOfferNo + '\'' +
              ", wosRecipients='" + wosRecipients + '\'' +
              ", wosDirection='" + wosDirection + '\'' +
              ", wosRecipientsUnit='" + wosRecipientsUnit + '\'' +
              ", wosRecipientsMobile='" + wosRecipientsMobile + '\'' +
              ", wosBillingNumber=" + wosBillingNumber +
              ", wosAcctualWeight=" + wosAcctualWeight +
              ", wosTradeName='" + wosTradeName + '\'' +
              ", wosSize=" + wosSize +
              ", wosDeclaredValue=" + wosDeclaredValue +
              ", wosAcctualPackage='" + wosAcctualPackage + '\'' +
              ", wosPackackExpense=" + wosPackackExpense +
              ", wosPackaceRequire='" + wosPackaceRequire + '\'' +
              ", wosOriginalNumber=" + wosOriginalNumber +
              ", wosAcctualNumber=" + wosAcctualNumber +
              ", wosChargedWeight=" + wosChargedWeight +
              ", wosFreNo=" + wosFreNo +
              ", wosFreightExpect='" + wosFreightExpect + '\'' +
              ", wosClearForm=" + wosClearForm +
              ", wosPrecharge=" + wosPrecharge +
              ", wosAgencyFund=" + wosAgencyFund +
              ", wosPayment='" + wosPayment + '\'' +
              ", wosFeedback='" + wosFeedback + '\'' +
              ", wosIsReceive=" + wosIsReceive +
              ", wosStandardTime=" + wosStandardTime +
              ", wosDeliveryTime=" + wosDeliveryTime +
              ", wosImportantNote='" + wosImportantNote + '\'' +
              ", wosIsPrint=" + wosIsPrint +
              ", wosOrderOperateUnit='" + wosOrderOperateUnit + '\'' +
              ", wosOpenNo='" + wosOpenNo + '\'' +
              ", wosOpenName='" + wosOpenName + '\'' +
              ", wosOpenTime=" + wosOpenTime +
              ", wosSingle='" + wosSingle + '\'' +
              ", wosSingleNo='" + wosSingleNo + '\'' +
              ", wosSingleTime=" + wosSingleTime +
              ", wosCurrentUnit='" + wosCurrentUnit + '\'' +
              ", wosBackSignBill=" + wosBackSignBill +
              ", wosQuiltReturnSign=" + wosQuiltReturnSign +
              ", wosReturnSign=" + wosReturnSign +
              ", wosCancelStatus=" + wosCancelStatus +
              ", wosSignOfStatus=" + wosSignOfStatus +
              ", wosWorkOrderType='" + wosWorkOrderType + '\'' +
              ", wosRecipientCode='" + wosRecipientCode + '\'' +
              ", wosAddresserCode='" + wosAddresserCode + '\'' +
              ", wosSortingNo='" + wosSortingNo + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }
}