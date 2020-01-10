/***********************************************************************
 * Module:  OutSorageSon.java
 * Author:  Administrator
 * Purpose: Defines the Class OutSorageSon
 ***********************************************************************/

import java.util.*;

/** @pdOid 6fd1efe3-ffaf-4d4f-a279-234abf9053cd */
public class OutSorageSon {
   /** 分拣出库明细单号
    *             
    * 
    * @pdOid b49fc028-3747-42fa-b378-5366cf66b211 */
   private java.lang.String ostOdd;
   /** 合包号
    *             
    * 
    * @pdOid c62da3c5-01b3-40f3-885d-ea651e8c106a */
   private java.lang.String ostOrPackageNo;
   /** 重量
    *             
    * 
    * @pdOid 23a84a71-d57f-4869-8886-7c86e3ad6b39 */
   private double ostWeight;
   /** 体积
    *             
    * 
    * @pdOid 9098b83a-15af-47f3-9c2a-76ad528619db */
   private double ostVolume;
   /** 扫描时间
    *             
    * 
    * @pdOid c3e01dbf-5a9a-489d-8acc-07f3ddf7ac8e */
   private java.util.Date ostScanningTime;
   /** 是否扫描
    *             
    * 
    * @pdOid 7738e51a-e04c-4b40-9ee6-968deb0e2173 */
   private int ostScanning = 0;
   /** 是否下环节入库
    *             
    * 
    * @pdOid 93a3879e-9e76-427e-9a5c-5caa9af473d4 */
   private int ostWhetherStorage = 0;
   /** 是否二次入库
    *             
    * 
    * @pdOid 817f4e5f-f9e8-4d5d-b9ad-6497b912893b */
   private int ostWhethSecoStora = 0;
   /** 分拣出库单号
    *             
    * 
    * @pdOid 18c5bd43-1af2-4e48-a8f9-12a054284b41 */
   private java.lang.String ostOusOdd;
   
   /** @pdOid 0976c821-703a-4ec1-b2c6-e4e9fc5d0b4b */
   public java.lang.String getOstOdd() {
      return ostOdd;
   }
   
   /** @param newOstOdd
    * @pdOid 293c3438-7105-4f93-8f7a-d8b78aeeea0d */
   public void setOstOdd(java.lang.String newOstOdd) {
      ostOdd = newOstOdd;
   }
   
   /** @pdOid e87cfbfa-ce3e-43cf-ae85-a5bf5c2904d5 */
   public java.lang.String getOstOrPackageNo() {
      return ostOrPackageNo;
   }
   
   /** @param newOstOrPackageNo
    * @pdOid 60fdc020-c873-48bd-a0e3-fed0d2c1002c */
   public void setOstOrPackageNo(java.lang.String newOstOrPackageNo) {
      ostOrPackageNo = newOstOrPackageNo;
   }
   
   /** @pdOid cc31175a-39ae-47ab-9e5d-228986bf0497 */
   public double getOstWeight() {
      return ostWeight;
   }
   
   /** @param newOstWeight
    * @pdOid b2ef36e0-ca4c-4226-872f-6c4d830ad447 */
   public void setOstWeight(double newOstWeight) {
      ostWeight = newOstWeight;
   }
   
   /** @pdOid 9d7f5b4b-9141-4b0c-af5c-3d7165f63919 */
   public double getOstVolume() {
      return ostVolume;
   }
   
   /** @param newOstVolume
    * @pdOid d9f268d3-75f5-4562-a85a-0db19ef39401 */
   public void setOstVolume(double newOstVolume) {
      ostVolume = newOstVolume;
   }
   
   /** @pdOid 92f5063a-6f55-4ddf-bcad-59ddb4a5b90d */
   public java.util.Date getOstScanningTime() {
      return ostScanningTime;
   }
   
   /** @param newOstScanningTime
    * @pdOid 31b37f69-42d1-4463-b40c-e77fd7bc0764 */
   public void setOstScanningTime(java.util.Date newOstScanningTime) {
      ostScanningTime = newOstScanningTime;
   }
   
   /** @pdOid 60d376fd-b27c-4167-b9e9-e070b49e4ed8 */
   public int getOstScanning() {
      return ostScanning;
   }
   
   /** @param newOstScanning
    * @pdOid d45019a9-75fc-4620-8125-13333153460f */
   public void setOstScanning(int newOstScanning) {
      ostScanning = newOstScanning;
   }
   
   /** @pdOid 97ebce75-8858-4520-a034-19ca22983ab2 */
   public int getOstWhetherStorage() {
      return ostWhetherStorage;
   }
   
   /** @param newOstWhetherStorage
    * @pdOid e49c4c07-8d9c-42cc-82a0-a883ab19a386 */
   public void setOstWhetherStorage(int newOstWhetherStorage) {
      ostWhetherStorage = newOstWhetherStorage;
   }
   
   /** @pdOid c0fb67af-c081-4632-850a-a254f31aff6b */
   public int getOstWhethSecoStora() {
      return ostWhethSecoStora;
   }
   
   /** @param newOstWhethSecoStora
    * @pdOid 5fe97746-13f8-457b-9dac-0c2460876a21 */
   public void setOstWhethSecoStora(int newOstWhethSecoStora) {
      ostWhethSecoStora = newOstWhethSecoStora;
   }
   
   /** @pdOid 8f4acc41-3c6b-4dff-920b-f95044b06340 */
   public java.lang.String getOstOusOdd() {
      return ostOusOdd;
   }
   
   /** @param newOstOusOdd
    * @pdOid 22b5de38-d359-4aca-b981-a53c7004e572 */
   public void setOstOusOdd(java.lang.String newOstOusOdd) {
      ostOusOdd = newOstOusOdd;
   }

}