/***********************************************************************
 * Module:  Warehouse.java
 * Author:  Administrator
 * Purpose: Defines the Class Warehouse
 ***********************************************************************/

import java.util.*;

/** @pdOid a4703807-cdf1-417a-aedd-203be906c066 */
public class Warehouse {
   /** 仓库编号
    *             
    * 
    * @pdOid 9c80c0c5-964a-4cbb-a5fe-d82ddc7e7601 */
   private java.lang.String warID;
   /** 仓库名称
    *             
    * 
    * @pdOid 26aeb692-8331-4f7e-899b-f098ba1e2662 */
   private java.lang.String warName;
   /** 负责人(员工)
    *             
    * 
    * @pdOid bf30f1b1-ee08-46ec-9202-e5c8e1fcf1ca */
   private java.lang.String employeesNo;
   /** 联系电话
    *             
    * 
    * @pdOid 99454e4c-8721-4a5f-8846-d8c936beba8a */
   private java.lang.String warPhone;
   /** 仓库地址
    *             
    * 
    * @pdOid 4b651c56-9ab3-442f-b29e-1848b3ad1eef */
   private java.lang.String warAddress;
   /** 默认仓库
    *             
    * 
    * @pdOid 3586299c-7200-46c4-b025-6b5730bd8153 */
   private int warDefault = 0;
   /** 状态
    *             
    * 
    * @pdOid da835500-e298-41e9-b32e-260aa34fe8f5 */
   private int warForbidNo = 0;
   /** 备注
    *             
    * 
    * @pdOid e9ffbb26-243f-4b5c-80c0-a309417ac30d */
   private java.lang.String warComment;
   /** 库存总数量
    *             
    * 
    * @pdOid 36924344-225e-4256-b79d-b183315e0c26 */
   private int repNumber;
   /** 库存总值
    *             
    * 
    * @pdOid cb11f905-8c2f-48d0-8405-cb44ba18ae79 */
   private double warTotalValue;
   /** 当前库存
    *             
    * 
    * @pdOid c398a741-8502-4385-a4a3-a0209d9c76c4 */
   private int warCurrent;
   /** 最低库存
    *             
    * 
    * @pdOid f3e5e85e-972c-48e6-92fe-701254bbf228 */
   private int warLowest;
   /** @pdOid be70950b-8077-482d-985c-da28e1b3c53c */
   private java.lang.String duo1;
   /** @pdOid a0d90cfd-aa41-44c2-9b22-d4736f3cc443 */
   private java.lang.String duo2;
   /** @pdOid 910762b6-622f-4674-905f-b9a649988999 */
   private java.lang.String duo3;
   
   /** @pdOid 78f31c57-4fb6-42f0-be22-6bf575a4e069 */
   public java.lang.String getWarID() {
      return warID;
   }
   
   /** @param newWarID
    * @pdOid a3918872-4c8a-4e02-aab7-16988b66381f */
   public void setWarID(java.lang.String newWarID) {
      warID = newWarID;
   }
   
   /** @pdOid 36f50a55-273c-4c31-865f-bfa550ce1576 */
   public java.lang.String getWarName() {
      return warName;
   }
   
   /** @param newWarName
    * @pdOid bdfbf1bd-0ce6-40a6-860d-6d4ce0817d4e */
   public void setWarName(java.lang.String newWarName) {
      warName = newWarName;
   }
   
   /** @pdOid 99418223-0b31-44c8-974b-9f3b0a91cc60 */
   public java.lang.String getEmployeesNo() {
      return employeesNo;
   }
   
   /** @param newEmployeesNo
    * @pdOid a487a48d-d1a8-4d48-b19b-8ef4f4a91f59 */
   public void setEmployeesNo(java.lang.String newEmployeesNo) {
      employeesNo = newEmployeesNo;
   }
   
   /** @pdOid a6fa7342-a410-4e38-b8c4-e9c8475e1b10 */
   public java.lang.String getWarPhone() {
      return warPhone;
   }
   
   /** @param newWarPhone
    * @pdOid 5bd3dc9d-576e-49e6-92f2-a06221e88601 */
   public void setWarPhone(java.lang.String newWarPhone) {
      warPhone = newWarPhone;
   }
   
   /** @pdOid f05e117f-609a-48e8-abbf-b88c27126cd0 */
   public java.lang.String getWarAddress() {
      return warAddress;
   }
   
   /** @param newWarAddress
    * @pdOid 2a228c90-0ebc-4119-92e3-fb19c1306505 */
   public void setWarAddress(java.lang.String newWarAddress) {
      warAddress = newWarAddress;
   }
   
   /** @pdOid 1eb3718a-d078-4bac-934c-51b07c04aece */
   public int getWarDefault() {
      return warDefault;
   }
   
   /** @param newWarDefault
    * @pdOid 2ada12ff-82a3-451c-be56-5c6a2a27eb45 */
   public void setWarDefault(int newWarDefault) {
      warDefault = newWarDefault;
   }
   
   /** @pdOid dd2610ea-d197-4638-a049-d40676e16db1 */
   public int getWarForbidNo() {
      return warForbidNo;
   }
   
   /** @param newWarForbidNo
    * @pdOid 2d9c147c-c1bb-40d6-afef-394cca3dd85e */
   public void setWarForbidNo(int newWarForbidNo) {
      warForbidNo = newWarForbidNo;
   }
   
   /** @pdOid 2bd600d4-85ef-4efe-b80b-3c7b560cbf9c */
   public java.lang.String getWarComment() {
      return warComment;
   }
   
   /** @param newWarComment
    * @pdOid be7b8898-8906-437f-8fca-5512177a9f8e */
   public void setWarComment(java.lang.String newWarComment) {
      warComment = newWarComment;
   }
   
   /** @pdOid abd7caaf-d47a-431d-88b8-122dd905653c */
   public int getRepNumber() {
      return repNumber;
   }
   
   /** @param newRepNumber
    * @pdOid 9ed93ba6-3f06-4d42-a351-65e61ebd3c5d */
   public void setRepNumber(int newRepNumber) {
      repNumber = newRepNumber;
   }
   
   /** @pdOid 737f7add-b395-408f-85d4-f2ee6b2c0f23 */
   public double getWarTotalValue() {
      return warTotalValue;
   }
   
   /** @param newWarTotalValue
    * @pdOid d6ff7726-a078-43e6-bbdf-9e03baff1ab9 */
   public void setWarTotalValue(double newWarTotalValue) {
      warTotalValue = newWarTotalValue;
   }
   
   /** @pdOid 0d6985e4-a7fa-4abd-90b4-55744987a4eb */
   public int getWarCurrent() {
      return warCurrent;
   }
   
   /** @param newWarCurrent
    * @pdOid e197bc4d-6b93-447f-9e52-c19a1c49807a */
   public void setWarCurrent(int newWarCurrent) {
      warCurrent = newWarCurrent;
   }
   
   /** @pdOid 06c54d9f-eb62-40bf-8d37-69b756a7bcf6 */
   public int getWarLowest() {
      return warLowest;
   }
   
   /** @param newWarLowest
    * @pdOid 0ac70d67-502b-4f75-8170-bfdb3250740f */
   public void setWarLowest(int newWarLowest) {
      warLowest = newWarLowest;
   }
   
   /** @pdOid 58418eda-193a-459f-9c21-818ccd80d8b0 */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid acf1baf5-8382-4cb9-91d7-a866ab87b7df */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid c5f1ecb0-2044-4ef4-9b99-a9e102e1485d */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid bb38b200-4ac7-4f06-a03c-c4f392ec4c53 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid 9e18b2e1-9295-490a-b1a4-f80f8f59c9a4 */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 9e4e5c20-ce28-48f2-9776-919d71678968 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}