/***********************************************************************
 * Module:  NoteNumberInformation.java
 * Author:  Administrator
 * Purpose: Defines the Class NoteNumberInformation
 ***********************************************************************/

import java.util.*;

/** @pdOid 25b8c7b5-b595-45cd-a853-c1805a149d83 */
public class NoteNumberInformation {
   /** 货票号
    *             
    * 
    * @pdOid 8b930f1a-5da0-413e-b679-b7de57a6870f */
   private java.lang.String goodsWere;
   /** 出库交接单号
    *             
    * 
    * @pdOid a1acb239-5c1b-4060-aed2-d93a2625747c */
   private java.lang.String outboundNumber;
   /** 件数
    *             
    * 
    * @pdOid b5e027fc-5ad4-46bb-9e88-e7d485f29153 */
   private int numberOfCases;
   /** 补缴金额
    *             
    * 
    * @pdOid 23fed552-134b-404f-815e-d09c26f11ae6 */
   private double paymentOfAmount;
   /** 重要提示
    *             
    * 
    * @pdOid 17a49e5e-752f-4586-a5d7-ff6d1c908077 */
   private java.lang.String importantNote;
   /** 录入日期
    *             
    * 
    * @pdOid 51d8b788-5a43-46a4-920b-aaaa024a6e82 */
   private java.util.Date dateOfEntry;
   /** 录入人
    *             
    * 
    * @pdOid e6a32894-d765-4a9c-a314-98a25884f6bc */
   private java.lang.String dataEntryClerk;
   /** @pdOid 9c851d1f-e1c0-42fa-a269-4bb5762a4612 */
   private java.lang.String duo1;
   /** @pdOid 935be457-b5ca-4dea-b251-828c106cd930 */
   private java.lang.String duo2;
   /** @pdOid dd1062ae-f7d2-44ea-b933-06cc80fe713c */
   private java.lang.String duo3;
   
   /** @pdOid 11659b95-869e-431f-a781-b2d89c5d018b */
   public java.lang.String getGoodsWere() {
      return goodsWere;
   }
   
   /** @param newGoodsWere
    * @pdOid 5c88dbd1-0fae-408d-9448-910f0dfe8a41 */
   public void setGoodsWere(java.lang.String newGoodsWere) {
      goodsWere = newGoodsWere;
   }
   
   /** @pdOid f8b4e0b1-c574-4534-afbe-e82beb6ee185 */
   public java.lang.String getOutboundNumber() {
      return outboundNumber;
   }
   
   /** @param newOutboundNumber
    * @pdOid 16e661b8-0fd0-45d6-9207-0bd50b84f946 */
   public void setOutboundNumber(java.lang.String newOutboundNumber) {
      outboundNumber = newOutboundNumber;
   }
   
   /** @pdOid dca8ac55-afca-49ca-abf4-514ecc67a8ea */
   public int getNumberOfCases() {
      return numberOfCases;
   }
   
   /** @param newNumberOfCases
    * @pdOid 4f743eac-993c-4d7d-ba54-4aab5316afc9 */
   public void setNumberOfCases(int newNumberOfCases) {
      numberOfCases = newNumberOfCases;
   }
   
   /** @pdOid b93a58c5-8b15-4fe2-8611-175261e7bf78 */
   public double getPaymentOfAmount() {
      return paymentOfAmount;
   }
   
   /** @param newPaymentOfAmount
    * @pdOid 7610a57a-65f3-4816-95d2-b188515f2baa */
   public void setPaymentOfAmount(double newPaymentOfAmount) {
      paymentOfAmount = newPaymentOfAmount;
   }
   
   /** @pdOid 79a44c6d-3e87-425e-b2a5-81d69825b53a */
   public java.lang.String getImportantNote() {
      return importantNote;
   }
   
   /** @param newImportantNote
    * @pdOid 8de04878-b1cd-4139-be59-613a562e9083 */
   public void setImportantNote(java.lang.String newImportantNote) {
      importantNote = newImportantNote;
   }
   
   /** @pdOid 06b9e716-4eac-4734-8b8b-6399f603ce55 */
   public java.util.Date getDateOfEntry() {
      return dateOfEntry;
   }
   
   /** @param newDateOfEntry
    * @pdOid cd3056be-96f8-47ab-a211-65569cadc968 */
   public void setDateOfEntry(java.util.Date newDateOfEntry) {
      dateOfEntry = newDateOfEntry;
   }
   
   /** @pdOid 8d479cf2-1617-4fd5-b87f-aa165636e317 */
   public java.lang.String getDataEntryClerk() {
      return dataEntryClerk;
   }
   
   /** @param newDataEntryClerk
    * @pdOid e12c91d1-2b9d-4fde-b3fe-fd68d02dbbc2 */
   public void setDataEntryClerk(java.lang.String newDataEntryClerk) {
      dataEntryClerk = newDataEntryClerk;
   }
   
   /** @pdOid 6a738988-332a-4420-9593-5749491d1b1d */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 5d306d8a-128d-4b34-a410-57539752881a */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 22dadba7-6c72-4188-91df-301390e1728e */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 56956750-b6f7-4093-ab38-c9639f0e7f40 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 22b85414-4c8f-4e35-8fde-f4900a004124 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 83899ccc-1897-4e94-894e-5ea68c44c3c7 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}