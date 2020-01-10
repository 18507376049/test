/***********************************************************************
 * Module:  Worksheet.java
 * Author:  Administrator
 * Purpose: Defines the Class Worksheet
 ***********************************************************************/

import java.util.*;

/** @pdOid f0339fb5-6658-45bc-ae99-37870c07b94c */
public class Worksheet {
   /** 工作单号
    *             
    * 
    * @pdOid 0b69ce09-7956-414c-80ca-238b40e9a88f */
   private java.lang.String wosNo;
   /** 客户编号
    *             
    * 
    * @pdOid fbb1af48-d926-4c34-8642-f739f51f0ae2 */
   private java.lang.String wosCustomerNo;
   /** 客户单号修改标志
    *             
    * 
    * @pdOid 1cb53599-b57e-4970-9ec2-55326e899e3f */
   private int wosUpdateSign = 0;
   /** 业务通知单号
    *             
    * 
    * @pdOid 34ce92a0-0500-4a04-b664-e68160352760 */
   private java.lang.String wosBusMemoNo;
   /** 到达地址
    *             
    * 
    * @pdOid 981623a0-efcc-4a32-970e-44cb8a51993b */
   private java.lang.String wosArrivalPlaceNo;
   /** 产品
    *             
    * 
    * @pdOid cb315542-9ccf-4c4e-9379-c450fc3a735b */
   private java.lang.String wosProduct;
   /** 总件数
    *             
    * 
    * @pdOid 5c1e4d63-1f7b-429c-8ed1-6c82165d30d8 */
   private int wosTotalNumber = 1;
   /** 重量
    *             
    * 
    * @pdOid 997ed8a6-2fa5-46fa-9dee-0013db9009d9 */
   private double wosWeight;
   /** 配载要求
    *             
    * 
    * @pdOid 8b6de6c3-68b9-4932-9954-2b58d5edf970 */
   private java.lang.String wosStowage;
   /** 产品时限
    *             
    * 
    * @pdOid e31880a6-63e3-4d99-a12d-e319fe613efb */
   private java.util.Date wosProductLimit;
   /** 件数
    *             
    * 
    * @pdOid 516d656a-c681-43e0-835a-7d88887397ec */
   private int wosCaseNumber = 1;
   /** 受理单位
    *             
    * 
    * @pdOid d96a3354-72eb-48f2-94ff-990021ae69a9 */
   private java.lang.String wosAcceptUnit;
   /** 受理人
    *             
    * 
    * @pdOid d18416ef-2be9-42b7-9129-5f180de30066 */
   private java.lang.String wosAcceptor;
   /** 受理时间
    *             
    * 
    * @pdOid 1b7e2939-c686-499e-8b04-53a7f3049a91 */
   private java.util.Date wosAcceptTime;
   /** 取货人姓名
    *             
    * 
    * @pdOid 13f2dfd0-0489-4646-af11-0ddee69be13a */
   private java.lang.String wosConsigneeName;
   /** 寄件人编号
    *             
    * 
    * @pdOid af9a59b9-b8aa-4b03-8c94-ec3528880e42 */
   private java.lang.String wosSenderNo;
   /** 寄件人
    *             
    * 
    * @pdOid fb30a3c2-8e54-4d09-a4d8-fef6f505555c */
   private java.lang.String wosSender;
   /** 寄件人地址
    *             
    * 
    * @pdOid 94ecfd74-b954-4710-a249-5d651a80138f */
   private java.lang.String wosSenderAddress;
   /** 寄件人单位
    *             
    * 
    * @pdOid 63f7cb52-e4da-47fd-913b-2d678f45ed23 */
   private java.lang.String wosSenderUnit;
   /** 寄件人手机
    *             
    * 
    * @pdOid 912c7dbe-6d1a-47d4-99e6-147eba1e8048 */
   private java.lang.String wosSenderMobile;
   /** 专项报价编号
    *             
    * 
    * @pdOid 31b2f89b-1156-4d59-a86c-d05de10bf932 */
   private java.lang.String wosSpecialOfferNo;
   /** 收件人
    *             
    * 
    * @pdOid 1e407275-a217-4399-a9cf-0a0f863bd83d */
   private java.lang.String wosRecipients;
   /** 收件人地址
    *             
    * 
    * @pdOid a4131f64-2213-4170-b0d0-7a4b77a379ce */
   private java.lang.String wosDirection;
   /** 收件人单位
    *             
    * 
    * @pdOid 315dd553-fcb5-4ea6-bc2f-4bf40e3857f6 */
   private java.lang.String wosRecipientsUnit;
   /** 收件人手机
    *             
    * 
    * @pdOid a18f70fa-9227-4cf4-9b5b-7d2af428330a */
   private java.lang.String wosRecipientsMobile;
   /** 计费数量
    *             
    * 
    * @pdOid dd855915-70ed-4a45-9377-40513c017ec8 */
   private int wosBillingNumber;
   /** 实际重量
    *             
    * 
    * @pdOid f2f56f91-8550-4fbf-ba29-9e11b0bc1153 */
   private double wosAcctualWeight;
   /** 品名
    *             
    * 
    * @pdOid 144691bd-8586-4085-aeb0-090694a047f4 */
   private java.lang.String wosTradeName;
   /** 体积
    *             
    * 
    * @pdOid fd938aca-721d-43b1-9d50-4bdf491aa486 */
   private double wosSize;
   /** 声明价值
    *             
    * 
    * @pdOid 12375672-2cd9-4775-bbfc-edddc9b1c2fe */
   private double wosDeclaredValue;
   /** 实际包装
    *             
    * 
    * @pdOid e0a60453-e659-4656-8bb0-738509259a77 */
   private java.lang.String wosAcctualPackage;
   /** 包装费
    *             
    * 
    * @pdOid 9f40ee0c-d3a9-483b-9e29-0499e4c15e73 */
   private double wosPackackExpense;
   /** 包装要求
    *             
    * 
    * @pdOid d6fc07bc-810c-483e-95a5-c90082559415 */
   private java.lang.String wosPackaceRequire;
   /** 原件数
    *             
    * 
    * @pdOid 6f989709-194a-4207-85f3-8b563cd278d1 */
   private int wosOriginalNumber;
   /** 实际件数
    *             
    * 
    * @pdOid 379b6142-2389-4735-b74d-369bd5c52e7d */
   private int wosAcctualNumber;
   /** 计费重量
    *             
    * 
    * @pdOid 4516a09b-d1b0-40de-a5d5-95939eaf62ba */
   private double wosChargedWeight;
   /** 运费
    *             
    * 
    * @pdOid cc186a6d-ffb2-482b-9d29-ce743470f73b */
   private double wosFreNo;
   /** 结算方式
    *             
    * 
    * @pdOid 779349c6-da73-49e6-9e04-3121b5973eec */
   private java.lang.String wosFreightExpect;
   /** 预收费
    *             
    * 
    * @pdOid ecfc4d0b-1ec5-458a-ac4b-e8c20f01b060 */
   private double wosClearForm;
   /** 代收款
    *             
    * 
    * @pdOid e3ebf1f5-b03c-4a42-bcce-7357a774c53e */
   private double wosPrecharge;
   /** 到付款
    *             
    * 
    * @pdOid 18469a7f-3b7c-418e-bcf3-3aa964a428a1 */
   private double wosAgencyFund;
   /** 反馈签收
    *             
    * 
    * @pdOid 2e049be0-0b0c-464f-875d-8c300041debb */
   private java.lang.String wosPayment;
   /** 邮费编号
    *             
    * 
    * @pdOid 3cb0861b-acd1-416d-942e-9c8b552df4e6 */
   private java.lang.String wosFeedback;
   /** 节假日可以收货
    *             
    * 
    * @pdOid a4384c32-3f22-4c31-b6a1-8437c879cf2f */
   private int wosIsReceive = 0;
   /** 标准时限
    *             
    * 
    * @pdOid a5ef4e0e-07fd-42cf-8df9-a26a0bba55ba */
   private java.util.Date wosStandardTime;
   /** 送达时限
    *             
    * 
    * @pdOid f2033132-2eb3-40de-a464-196e264646ed */
   private java.util.Date wosDeliveryTime;
   /** 重要提示
    *             
    * 
    * @pdOid 964562d1-585b-442a-a456-9134280eb3b1 */
   private java.lang.String wosImportantNote;
   /** 是否打印
    *             
    * 
    * @pdOid cf5fd78a-c229-45e8-b934-c189aec75792 */
   private int wosIsPrint;
   /** 开单操作单位
    *             
    * 
    * @pdOid da6307e9-89ed-44e0-aed1-cc78ff3160ab */
   private java.lang.String wosOrderOperateUnit;
   /** 开单人编号
    *             
    * 
    * @pdOid 77703a18-9782-4d20-a157-a1137f95848b */
   private java.lang.String wosOpenNo;
   /** 开单人姓名
    *             
    * 
    * @pdOid 1c755de5-7743-41ad-9c5b-5c40fc627c34 */
   private java.lang.String wosOpenName;
   /** 开单时间
    *             
    * 
    * @pdOid 8459bebd-ebe8-4add-8f44-07b9ab08d8d1 */
   private java.util.Date wosOpenTime;
   /** 补单人
    *             
    * 
    * @pdOid c9aa5b32-d45a-472b-b685-89eb8dbbab04 */
   private java.lang.String wosSingle;
   /** 补单人编号
    *             
    * 
    * @pdOid c430c170-7523-46f8-841c-1bec75b892b3 */
   private java.lang.String wosSingleNo;
   /** 补单时间
    *             
    * 
    * @pdOid 1e3151de-0168-4912-b265-222e0e9b9a6a */
   private java.util.Date wosSingleTime;
   /** 当前补单单位
    *             
    * 
    * @pdOid cd7e7373-ba34-40b5-9346-6a66f0d9f5d7 */
   private java.lang.String wosCurrentUnit;
   /** 返签单标志
    *             
    * 
    * @pdOid f2441e21-9d38-4e01-9d12-b83b3a68a129 */
   private int wosBackSignBill = 0;
   /** 被返货标志
    *             
    * 
    * @pdOid 3ad7e3ea-b5ba-4b66-af94-5cf05b7dd1f4 */
   private int wosQuiltReturnSign = 0;
   /** 返货标志
    *             
    * 
    * @pdOid e2ab3ef9-8284-41d0-a666-42ded4128af3 */
   private int wosReturnSign = 0;
   /** 作废状态
    *             
    * 
    * @pdOid 5d2b0a5c-3abc-4fcb-9dee-bc68de368bc4 */
   private int wosCancelStatus = 0;
   /** 签收状态
    *             
    * 
    * @pdOid e866745f-7e47-4d5c-98f9-5b4542d334f5 */
   private int wosSignOfStatus = 0;
   /** 工作单类型
    *             
    * 
    * @pdOid dcb7888c-7d44-44fa-98fc-235991afa18b */
   private java.lang.String wosWorkOrderType;
   /** 收件人邮编
    *             
    * 
    * @pdOid 4c49dbc8-54e5-499b-8692-26ea35192f37 */
   private java.lang.String wosRecipientCode;
   /** 发件人邮编
    *             
    * 
    * @pdOid e361f63c-bf02-4981-b022-21bfd9158922 */
   private java.lang.String wosAddresserCode;
   /** 分拣编码
    *             
    * 
    * @pdOid f2edd5bf-b54a-4608-9be9-003d731254a9 */
   private java.lang.String wosSortingNo;
   /** @pdOid a7f47397-f1ca-4d2f-95c9-5d0f89419f57 */
   private java.lang.String duo1;
   /** @pdOid 1b402f59-5ccb-43c5-aaac-56551be821d5 */
   private java.lang.String duo2;
   /** @pdOid 781cad6c-23f2-41df-81b7-74e76bee0541 */
   private java.lang.String duo3;
   
   /** @pdOid 9356dc8e-3f59-42fa-a40e-aef50f531a73 */
   public java.lang.String getWosNo() {
      return wosNo;
   }
   
   /** @param newWosNo
    * @pdOid 771b43b1-4ab2-428b-ae44-3e81300867de */
   public void setWosNo(java.lang.String newWosNo) {
      wosNo = newWosNo;
   }
   
   /** @pdOid c967cc93-ce8c-421f-9fea-9da645f945ac */
   public java.lang.String getWosCustomerNo() {
      return wosCustomerNo;
   }
   
   /** @param newWosCustomerNo
    * @pdOid e0d92a9e-22c6-468e-8ec6-e20bd642cf57 */
   public void setWosCustomerNo(java.lang.String newWosCustomerNo) {
      wosCustomerNo = newWosCustomerNo;
   }
   
   /** @pdOid 66995124-3c63-4151-8a7e-b23ef26cd927 */
   public int getWosUpdateSign() {
      return wosUpdateSign;
   }
   
   /** @param newWosUpdateSign
    * @pdOid 7a2c9da8-d7cb-444d-beca-296dc408bcd1 */
   public void setWosUpdateSign(int newWosUpdateSign) {
      wosUpdateSign = newWosUpdateSign;
   }
   
   /** @pdOid b9441c8b-4591-474c-98d6-e21ad74b594b */
   public java.lang.String getWosBusMemoNo() {
      return wosBusMemoNo;
   }
   
   /** @param newWosBusMemoNo
    * @pdOid f743c487-2923-4403-b8a1-c2899aabcc7c */
   public void setWosBusMemoNo(java.lang.String newWosBusMemoNo) {
      wosBusMemoNo = newWosBusMemoNo;
   }
   
   /** @pdOid 4a9f3a22-e606-4309-af8b-1d7ed8680982 */
   public java.lang.String getWosArrivalPlaceNo() {
      return wosArrivalPlaceNo;
   }
   
   /** @param newWosArrivalPlaceNo
    * @pdOid 33f25a97-97bc-471f-92d1-155242fbaeab */
   public void setWosArrivalPlaceNo(java.lang.String newWosArrivalPlaceNo) {
      wosArrivalPlaceNo = newWosArrivalPlaceNo;
   }
   
   /** @pdOid b8f53d62-e33b-4a21-98af-5e5fa90b0786 */
   public java.lang.String getWosProduct() {
      return wosProduct;
   }
   
   /** @param newWosProduct
    * @pdOid aba7af05-c4d8-4f30-bcb4-28bb1e6d1f26 */
   public void setWosProduct(java.lang.String newWosProduct) {
      wosProduct = newWosProduct;
   }
   
   /** @pdOid 5814be15-79c2-4fdf-b2bd-a807d547db54 */
   public int getWosTotalNumber() {
      return wosTotalNumber;
   }
   
   /** @param newWosTotalNumber
    * @pdOid d3cc48be-b029-4c3b-a448-d1b19738704b */
   public void setWosTotalNumber(int newWosTotalNumber) {
      wosTotalNumber = newWosTotalNumber;
   }
   
   /** @pdOid 0b8453ff-9030-492a-8c23-4fb8b1d3fca7 */
   public double getWosWeight() {
      return wosWeight;
   }
   
   /** @param newWosWeight
    * @pdOid 36c0810c-5568-4964-a6fa-25a8ce2b4367 */
   public void setWosWeight(double newWosWeight) {
      wosWeight = newWosWeight;
   }
   
   /** @pdOid 1331669e-2697-413a-bd4a-6364a6f0ae3b */
   public java.lang.String getWosStowage() {
      return wosStowage;
   }
   
   /** @param newWosStowage
    * @pdOid 01770b05-8684-4b88-81f6-e2158b31286e */
   public void setWosStowage(java.lang.String newWosStowage) {
      wosStowage = newWosStowage;
   }
   
   /** @pdOid f2d0a4d0-7f4e-4371-8ddf-e204d43735c4 */
   public java.util.Date getWosProductLimit() {
      return wosProductLimit;
   }
   
   /** @param newWosProductLimit
    * @pdOid 558ff9cd-d093-4431-b803-6c6c89df0d05 */
   public void setWosProductLimit(java.util.Date newWosProductLimit) {
      wosProductLimit = newWosProductLimit;
   }
   
   /** @pdOid 0370bfbe-aa80-4e35-b56f-a441c2b4cb03 */
   public int getWosCaseNumber() {
      return wosCaseNumber;
   }
   
   /** @param newWosCaseNumber
    * @pdOid ee969175-f7b7-4ce5-93fc-900e20f67e21 */
   public void setWosCaseNumber(int newWosCaseNumber) {
      wosCaseNumber = newWosCaseNumber;
   }
   
   /** @pdOid 76f3e587-2147-45c5-ad13-fc4c67b72b05 */
   public java.lang.String getWosAcceptUnit() {
      return wosAcceptUnit;
   }
   
   /** @param newWosAcceptUnit
    * @pdOid 1f775d7c-dba1-4414-9ac2-a9adccc714fb */
   public void setWosAcceptUnit(java.lang.String newWosAcceptUnit) {
      wosAcceptUnit = newWosAcceptUnit;
   }
   
   /** @pdOid 955c6a0e-5980-4848-b1a2-efb7708fec56 */
   public java.lang.String getWosAcceptor() {
      return wosAcceptor;
   }
   
   /** @param newWosAcceptor
    * @pdOid 2694ee48-3835-49aa-b8ba-ca5ea6f2dc29 */
   public void setWosAcceptor(java.lang.String newWosAcceptor) {
      wosAcceptor = newWosAcceptor;
   }
   
   /** @pdOid 328b4ab0-9c75-473c-b498-c5b7d3dc36ef */
   public java.util.Date getWosAcceptTime() {
      return wosAcceptTime;
   }
   
   /** @param newWosAcceptTime
    * @pdOid c09d1f01-631d-41a7-89b3-e317b2a2cda8 */
   public void setWosAcceptTime(java.util.Date newWosAcceptTime) {
      wosAcceptTime = newWosAcceptTime;
   }
   
   /** @pdOid 00a4436b-8c02-419e-9695-e449f5edf570 */
   public java.lang.String getWosConsigneeName() {
      return wosConsigneeName;
   }
   
   /** @param newWosConsigneeName
    * @pdOid c5193e67-bdc6-418b-b90d-66c6b2058937 */
   public void setWosConsigneeName(java.lang.String newWosConsigneeName) {
      wosConsigneeName = newWosConsigneeName;
   }
   
   /** @pdOid 6277142c-c585-4de1-88f3-0c51485bb6aa */
   public java.lang.String getWosSenderNo() {
      return wosSenderNo;
   }
   
   /** @param newWosSenderNo
    * @pdOid d62f1a91-9b15-4b56-aade-54a25fcfe7a4 */
   public void setWosSenderNo(java.lang.String newWosSenderNo) {
      wosSenderNo = newWosSenderNo;
   }
   
   /** @pdOid fe4fcc53-5cfe-4990-a3b5-9a149bf8683c */
   public java.lang.String getWosSender() {
      return wosSender;
   }
   
   /** @param newWosSender
    * @pdOid 02f10712-9d0e-4a3c-bd56-af780a20348d */
   public void setWosSender(java.lang.String newWosSender) {
      wosSender = newWosSender;
   }
   
   /** @pdOid 438cd237-358e-4cd3-b946-c993e289b0e3 */
   public java.lang.String getWosSenderAddress() {
      return wosSenderAddress;
   }
   
   /** @param newWosSenderAddress
    * @pdOid d9ffa04b-69b6-412f-9397-e88fde735f66 */
   public void setWosSenderAddress(java.lang.String newWosSenderAddress) {
      wosSenderAddress = newWosSenderAddress;
   }
   
   /** @pdOid a20c9ae8-98ee-47d5-b679-39622dd16f8c */
   public java.lang.String getWosSenderUnit() {
      return wosSenderUnit;
   }
   
   /** @param newWosSenderUnit
    * @pdOid 95f2025e-da58-4f9b-82bf-cf103265a7e0 */
   public void setWosSenderUnit(java.lang.String newWosSenderUnit) {
      wosSenderUnit = newWosSenderUnit;
   }
   
   /** @pdOid 638958d4-8d0d-4d10-a95a-43887f924c31 */
   public java.lang.String getWosSenderMobile() {
      return wosSenderMobile;
   }
   
   /** @param newWosSenderMobile
    * @pdOid 04eee511-99f6-4056-8bdf-be98172c50d2 */
   public void setWosSenderMobile(java.lang.String newWosSenderMobile) {
      wosSenderMobile = newWosSenderMobile;
   }
   
   /** @pdOid 02f8d36e-8f17-429e-bbb9-a5292d9f6383 */
   public java.lang.String getWosSpecialOfferNo() {
      return wosSpecialOfferNo;
   }
   
   /** @param newWosSpecialOfferNo
    * @pdOid 906cb829-6558-4efb-be20-b18cbd868584 */
   public void setWosSpecialOfferNo(java.lang.String newWosSpecialOfferNo) {
      wosSpecialOfferNo = newWosSpecialOfferNo;
   }
   
   /** @pdOid 6348739b-1211-41e7-910e-577413c7b9b9 */
   public java.lang.String getWosRecipients() {
      return wosRecipients;
   }
   
   /** @param newWosRecipients
    * @pdOid ac2590aa-fbef-4dfa-89ec-2c021361bd5b */
   public void setWosRecipients(java.lang.String newWosRecipients) {
      wosRecipients = newWosRecipients;
   }
   
   /** @pdOid 360b8ef5-ef6c-463f-91bd-ef39015e7e9e */
   public java.lang.String getWosDirection() {
      return wosDirection;
   }
   
   /** @param newWosDirection
    * @pdOid 75194037-9e18-42e5-adb6-29a8927889ee */
   public void setWosDirection(java.lang.String newWosDirection) {
      wosDirection = newWosDirection;
   }
   
   /** @pdOid e33ad7cc-a208-4048-bc20-f1dcecd8e052 */
   public java.lang.String getWosRecipientsUnit() {
      return wosRecipientsUnit;
   }
   
   /** @param newWosRecipientsUnit
    * @pdOid 2f4fd6f6-e565-4004-aa27-323c68056fd4 */
   public void setWosRecipientsUnit(java.lang.String newWosRecipientsUnit) {
      wosRecipientsUnit = newWosRecipientsUnit;
   }
   
   /** @pdOid 384129a2-9561-4e92-b717-2d499cc57e4f */
   public java.lang.String getWosRecipientsMobile() {
      return wosRecipientsMobile;
   }
   
   /** @param newWosRecipientsMobile
    * @pdOid 2513e532-ccb1-4271-81d2-9010f5e7bc30 */
   public void setWosRecipientsMobile(java.lang.String newWosRecipientsMobile) {
      wosRecipientsMobile = newWosRecipientsMobile;
   }
   
   /** @pdOid 67e2a321-ca2f-4e0b-b843-a34ebd6c7130 */
   public int getWosBillingNumber() {
      return wosBillingNumber;
   }
   
   /** @param newWosBillingNumber
    * @pdOid 6f45ab51-29f7-424e-aac0-36192a336496 */
   public void setWosBillingNumber(int newWosBillingNumber) {
      wosBillingNumber = newWosBillingNumber;
   }
   
   /** @pdOid 0a1babff-f7f3-43ba-b7c0-f6092080b108 */
   public double getWosAcctualWeight() {
      return wosAcctualWeight;
   }
   
   /** @param newWosAcctualWeight
    * @pdOid 9b4086df-c6a9-47eb-83f0-9b4baec5dfbf */
   public void setWosAcctualWeight(double newWosAcctualWeight) {
      wosAcctualWeight = newWosAcctualWeight;
   }
   
   /** @pdOid f8551877-2e0d-422f-9f37-1c6dee7be7d9 */
   public java.lang.String getWosTradeName() {
      return wosTradeName;
   }
   
   /** @param newWosTradeName
    * @pdOid 96ec2971-016e-4bab-b094-fe61bda82b5b */
   public void setWosTradeName(java.lang.String newWosTradeName) {
      wosTradeName = newWosTradeName;
   }
   
   /** @pdOid 410e5e34-7bdf-4bd8-b449-d63481af95ad */
   public double getWosSize() {
      return wosSize;
   }
   
   /** @param newWosSize
    * @pdOid 63a455ea-6ded-4401-a233-cc3740d97613 */
   public void setWosSize(double newWosSize) {
      wosSize = newWosSize;
   }
   
   /** @pdOid 7e178872-ef8c-4c30-add0-28c936a47512 */
   public double getWosDeclaredValue() {
      return wosDeclaredValue;
   }
   
   /** @param newWosDeclaredValue
    * @pdOid c139f290-93db-40b0-9674-ac026a7f38f2 */
   public void setWosDeclaredValue(double newWosDeclaredValue) {
      wosDeclaredValue = newWosDeclaredValue;
   }
   
   /** @pdOid 63fca12a-93b5-49c7-b5fa-896eb5b002df */
   public java.lang.String getWosAcctualPackage() {
      return wosAcctualPackage;
   }
   
   /** @param newWosAcctualPackage
    * @pdOid 86225e0c-fa3b-4867-ae67-de018a0d71e4 */
   public void setWosAcctualPackage(java.lang.String newWosAcctualPackage) {
      wosAcctualPackage = newWosAcctualPackage;
   }
   
   /** @pdOid c0bb58cb-7a2d-4033-ac22-f9a061942f78 */
   public double getWosPackackExpense() {
      return wosPackackExpense;
   }
   
   /** @param newWosPackackExpense
    * @pdOid ac471784-59d2-42d0-bf64-173650767f54 */
   public void setWosPackackExpense(double newWosPackackExpense) {
      wosPackackExpense = newWosPackackExpense;
   }
   
   /** @pdOid c0636599-f257-4cd8-98b7-f1019b9a1d4f */
   public java.lang.String getWosPackaceRequire() {
      return wosPackaceRequire;
   }
   
   /** @param newWosPackaceRequire
    * @pdOid 52f74013-9e3b-4a19-a467-d1d53f8faba4 */
   public void setWosPackaceRequire(java.lang.String newWosPackaceRequire) {
      wosPackaceRequire = newWosPackaceRequire;
   }
   
   /** @pdOid 86733a2d-d72c-4d6a-927e-36e9744edb7e */
   public int getWosOriginalNumber() {
      return wosOriginalNumber;
   }
   
   /** @param newWosOriginalNumber
    * @pdOid ecb07422-50a1-4968-83f2-40876a448391 */
   public void setWosOriginalNumber(int newWosOriginalNumber) {
      wosOriginalNumber = newWosOriginalNumber;
   }
   
   /** @pdOid d70b188e-9bd0-4ab1-9bdc-c8a326e1cbcb */
   public int getWosAcctualNumber() {
      return wosAcctualNumber;
   }
   
   /** @param newWosAcctualNumber
    * @pdOid adb973ba-388c-4e53-8951-f3b1a622435c */
   public void setWosAcctualNumber(int newWosAcctualNumber) {
      wosAcctualNumber = newWosAcctualNumber;
   }
   
   /** @pdOid 917f52f2-3ffb-402d-8772-7235c3bd29bf */
   public double getWosChargedWeight() {
      return wosChargedWeight;
   }
   
   /** @param newWosChargedWeight
    * @pdOid 71993156-8e68-431a-a40a-443874ea3b49 */
   public void setWosChargedWeight(double newWosChargedWeight) {
      wosChargedWeight = newWosChargedWeight;
   }
   
   /** @pdOid 8f52b50c-a6ae-4701-9d41-d7eb0aa3cab5 */
   public double getWosFreNo() {
      return wosFreNo;
   }
   
   /** @param newWosFreNo
    * @pdOid 78727f2f-9e56-49a9-b802-f4788e132262 */
   public void setWosFreNo(double newWosFreNo) {
      wosFreNo = newWosFreNo;
   }
   
   /** @pdOid 583c17dc-a278-4d15-8102-3f22b88f3712 */
   public java.lang.String getWosFreightExpect() {
      return wosFreightExpect;
   }
   
   /** @param newWosFreightExpect
    * @pdOid 55eab2fd-301d-4e90-9042-756c8cde5fcf */
   public void setWosFreightExpect(java.lang.String newWosFreightExpect) {
      wosFreightExpect = newWosFreightExpect;
   }
   
   /** @pdOid 8a8908de-cdcc-46ff-a9b5-3475a311d090 */
   public double getWosClearForm() {
      return wosClearForm;
   }
   
   /** @param newWosClearForm
    * @pdOid 3125500c-88ab-48fa-9b99-e5f8c79744f9 */
   public void setWosClearForm(double newWosClearForm) {
      wosClearForm = newWosClearForm;
   }
   
   /** @pdOid 0574290f-b25f-4ddf-83b4-ed7108da8c12 */
   public double getWosPrecharge() {
      return wosPrecharge;
   }
   
   /** @param newWosPrecharge
    * @pdOid 0ec83e62-d176-42fe-bcfb-639730a33e10 */
   public void setWosPrecharge(double newWosPrecharge) {
      wosPrecharge = newWosPrecharge;
   }
   
   /** @pdOid 57125ab2-da3b-4782-b361-54eacacc2b56 */
   public double getWosAgencyFund() {
      return wosAgencyFund;
   }
   
   /** @param newWosAgencyFund
    * @pdOid 48c5cb5c-07b6-4076-bd44-05af43a754eb */
   public void setWosAgencyFund(double newWosAgencyFund) {
      wosAgencyFund = newWosAgencyFund;
   }
   
   /** @pdOid e760efb2-f3c5-412d-9800-ee05f9152fd3 */
   public java.lang.String getWosPayment() {
      return wosPayment;
   }
   
   /** @param newWosPayment
    * @pdOid 2699b191-1b68-4be6-a7ad-f9101e330571 */
   public void setWosPayment(java.lang.String newWosPayment) {
      wosPayment = newWosPayment;
   }
   
   /** @pdOid 434a664e-83a5-47c8-a601-57bba519176a */
   public java.lang.String getWosFeedback() {
      return wosFeedback;
   }
   
   /** @param newWosFeedback
    * @pdOid 7653c95d-ee51-49ee-a7d1-2f225f8bde95 */
   public void setWosFeedback(java.lang.String newWosFeedback) {
      wosFeedback = newWosFeedback;
   }
   
   /** @pdOid 18c71265-981d-4b1c-b59f-3ff9b0d14cc8 */
   public int getWosIsReceive() {
      return wosIsReceive;
   }
   
   /** @param newWosIsReceive
    * @pdOid 0865ecaf-de8f-4c02-8c92-c749c978de97 */
   public void setWosIsReceive(int newWosIsReceive) {
      wosIsReceive = newWosIsReceive;
   }
   
   /** @pdOid d294e750-091f-4b13-aa43-7015dd55d875 */
   public java.util.Date getWosStandardTime() {
      return wosStandardTime;
   }
   
   /** @param newWosStandardTime
    * @pdOid 4279a26b-16f1-4d98-9608-1b495bdd16ad */
   public void setWosStandardTime(java.util.Date newWosStandardTime) {
      wosStandardTime = newWosStandardTime;
   }
   
   /** @pdOid 6ecca1ab-497a-490f-bf07-0cbc216d4c36 */
   public java.util.Date getWosDeliveryTime() {
      return wosDeliveryTime;
   }
   
   /** @param newWosDeliveryTime
    * @pdOid 726e8e06-3861-429c-aaac-1613d8e6d1d8 */
   public void setWosDeliveryTime(java.util.Date newWosDeliveryTime) {
      wosDeliveryTime = newWosDeliveryTime;
   }
   
   /** @pdOid 06ed035d-3886-4e9a-a6c3-7e3b08e34253 */
   public java.lang.String getWosImportantNote() {
      return wosImportantNote;
   }
   
   /** @param newWosImportantNote
    * @pdOid c34c0002-54d7-44e8-bc4b-61fe108e502b */
   public void setWosImportantNote(java.lang.String newWosImportantNote) {
      wosImportantNote = newWosImportantNote;
   }
   
   /** @pdOid a5a61ce5-4aeb-461d-9d8b-63258de5018d */
   public int getWosIsPrint() {
      return wosIsPrint;
   }
   
   /** @param newWosIsPrint
    * @pdOid 50533983-2263-47b8-bbec-0acb785571e8 */
   public void setWosIsPrint(int newWosIsPrint) {
      wosIsPrint = newWosIsPrint;
   }
   
   /** @pdOid 44f32628-61ee-4b56-b700-950d625f32eb */
   public java.lang.String getWosOrderOperateUnit() {
      return wosOrderOperateUnit;
   }
   
   /** @param newWosOrderOperateUnit
    * @pdOid e9d06d6a-1f01-490a-9b79-4331d3f0c77e */
   public void setWosOrderOperateUnit(java.lang.String newWosOrderOperateUnit) {
      wosOrderOperateUnit = newWosOrderOperateUnit;
   }
   
   /** @pdOid f710f221-280d-4f4e-af80-5f1dc796e6aa */
   public java.lang.String getWosOpenNo() {
      return wosOpenNo;
   }
   
   /** @param newWosOpenNo
    * @pdOid bb076dd4-2f8c-405d-b816-5f3b7bdd0e81 */
   public void setWosOpenNo(java.lang.String newWosOpenNo) {
      wosOpenNo = newWosOpenNo;
   }
   
   /** @pdOid d14d7f39-7a0f-4275-96dd-30be42fca0bd */
   public java.lang.String getWosOpenName() {
      return wosOpenName;
   }
   
   /** @param newWosOpenName
    * @pdOid c4a472eb-17a5-4bd8-9c8f-922ddc1645fe */
   public void setWosOpenName(java.lang.String newWosOpenName) {
      wosOpenName = newWosOpenName;
   }
   
   /** @pdOid 6c55f416-8562-412c-9057-797cffbdd47d */
   public java.util.Date getWosOpenTime() {
      return wosOpenTime;
   }
   
   /** @param newWosOpenTime
    * @pdOid 725ed24d-2c63-4cc6-8ba6-da52a881149d */
   public void setWosOpenTime(java.util.Date newWosOpenTime) {
      wosOpenTime = newWosOpenTime;
   }
   
   /** @pdOid 214feaff-faf7-4d58-8bc6-2659bdcfa20e */
   public java.lang.String getWosSingle() {
      return wosSingle;
   }
   
   /** @param newWosSingle
    * @pdOid 2f7bcb97-b080-44cd-8996-33a38963493d */
   public void setWosSingle(java.lang.String newWosSingle) {
      wosSingle = newWosSingle;
   }
   
   /** @pdOid e9cc0b9a-3c78-4e21-aba4-ce984807f514 */
   public java.lang.String getWosSingleNo() {
      return wosSingleNo;
   }
   
   /** @param newWosSingleNo
    * @pdOid 3ccd944e-33ea-426a-ba01-164bb6b2018b */
   public void setWosSingleNo(java.lang.String newWosSingleNo) {
      wosSingleNo = newWosSingleNo;
   }
   
   /** @pdOid 8b3797f7-c70a-4835-bceb-9f82ccd28809 */
   public java.util.Date getWosSingleTime() {
      return wosSingleTime;
   }
   
   /** @param newWosSingleTime
    * @pdOid 13ec49a5-62d7-4e3a-8fff-e990ef83d8b5 */
   public void setWosSingleTime(java.util.Date newWosSingleTime) {
      wosSingleTime = newWosSingleTime;
   }
   
   /** @pdOid 8ea182df-91c9-4c48-b79b-ea5beba9653f */
   public java.lang.String getWosCurrentUnit() {
      return wosCurrentUnit;
   }
   
   /** @param newWosCurrentUnit
    * @pdOid 3404fe16-7209-438b-a067-66027cf05ae1 */
   public void setWosCurrentUnit(java.lang.String newWosCurrentUnit) {
      wosCurrentUnit = newWosCurrentUnit;
   }
   
   /** @pdOid 0a59cfb4-425a-45c3-a02e-a385eaf2d5e7 */
   public int getWosBackSignBill() {
      return wosBackSignBill;
   }
   
   /** @param newWosBackSignBill
    * @pdOid c056fe30-9457-445b-b3e5-23576af8be38 */
   public void setWosBackSignBill(int newWosBackSignBill) {
      wosBackSignBill = newWosBackSignBill;
   }
   
   /** @pdOid 8c98445a-8b35-4344-ab3c-fdd3527e1f58 */
   public int getWosQuiltReturnSign() {
      return wosQuiltReturnSign;
   }
   
   /** @param newWosQuiltReturnSign
    * @pdOid 7aec8208-9c30-42e4-89ad-4d3ee465cfaa */
   public void setWosQuiltReturnSign(int newWosQuiltReturnSign) {
      wosQuiltReturnSign = newWosQuiltReturnSign;
   }
   
   /** @pdOid 61fe1752-300c-4a49-bce2-bc072c3153da */
   public int getWosReturnSign() {
      return wosReturnSign;
   }
   
   /** @param newWosReturnSign
    * @pdOid eb241b4b-26f9-44d3-a56f-4e29c242f9a8 */
   public void setWosReturnSign(int newWosReturnSign) {
      wosReturnSign = newWosReturnSign;
   }
   
   /** @pdOid 81fd9977-df7b-4f09-83f3-920c4218a968 */
   public int getWosCancelStatus() {
      return wosCancelStatus;
   }
   
   /** @param newWosCancelStatus
    * @pdOid b49b2162-6ac4-4fb4-8ff2-eeb46c081ab7 */
   public void setWosCancelStatus(int newWosCancelStatus) {
      wosCancelStatus = newWosCancelStatus;
   }
   
   /** @pdOid 5ea43dde-1221-47b9-b775-7b38bb9f49f7 */
   public int getWosSignOfStatus() {
      return wosSignOfStatus;
   }
   
   /** @param newWosSignOfStatus
    * @pdOid 4b011919-6a75-46f4-bcab-16811a274d34 */
   public void setWosSignOfStatus(int newWosSignOfStatus) {
      wosSignOfStatus = newWosSignOfStatus;
   }
   
   /** @pdOid 08c59c43-30ea-4511-8d67-2ce70170e77b */
   public java.lang.String getWosWorkOrderType() {
      return wosWorkOrderType;
   }
   
   /** @param newWosWorkOrderType
    * @pdOid d08efc0f-edc6-4c74-a91c-4c440abd5252 */
   public void setWosWorkOrderType(java.lang.String newWosWorkOrderType) {
      wosWorkOrderType = newWosWorkOrderType;
   }
   
   /** @pdOid 7e7883e7-ee7c-4b84-8ff7-4cd15623661c */
   public java.lang.String getWosRecipientCode() {
      return wosRecipientCode;
   }
   
   /** @param newWosRecipientCode
    * @pdOid 3d8f8dd0-3d18-469b-b475-a4e6004e9c39 */
   public void setWosRecipientCode(java.lang.String newWosRecipientCode) {
      wosRecipientCode = newWosRecipientCode;
   }
   
   /** @pdOid 88ca3528-adc1-4b39-9168-ee058140c676 */
   public java.lang.String getWosAddresserCode() {
      return wosAddresserCode;
   }
   
   /** @param newWosAddresserCode
    * @pdOid fe702946-3e8b-44d6-854f-74b21e1c38c5 */
   public void setWosAddresserCode(java.lang.String newWosAddresserCode) {
      wosAddresserCode = newWosAddresserCode;
   }
   
   /** @pdOid b007830e-abb9-4959-8ff6-9a7ea2e9984a */
   public java.lang.String getWosSortingNo() {
      return wosSortingNo;
   }
   
   /** @param newWosSortingNo
    * @pdOid f52030b2-92aa-4094-999e-cfd11279e8d8 */
   public void setWosSortingNo(java.lang.String newWosSortingNo) {
      wosSortingNo = newWosSortingNo;
   }
   
   /** @pdOid 4dbec842-b566-4236-9da2-93fc9658df72 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 2846e808-7323-493a-8bba-df2088fe2ce4 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 3f91734c-8e00-48a2-9d70-beca289c1a1b */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 852acabb-b187-4c84-a3f4-af8ebb463a33 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 974a6dce-3420-4d0c-98eb-502d98ef4799 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid cf7eb75d-a8d2-4159-ac26-fbb0e65b9ef3 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}