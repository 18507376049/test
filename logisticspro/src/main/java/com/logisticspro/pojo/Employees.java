/***********************************************************************
 * Module:  Employees.java
 * Author:  Administrator
 * Purpose: Defines the Class Employees
 ***********************************************************************/

import java.util.*;

/** @pdOid 4ec6f7a3-f2dc-4f92-8588-ab14b0680ddc */
public class Employees {
   /** 员工编号
    *             
    * 
    * @pdOid e1e9eae7-1e01-4d15-92bf-096dff35d04f */
   private java.lang.String empNo;
   /** 员工姓名
    *             
    * 
    * @pdOid e5a08da9-e5d4-417b-9643-7e3935e1f2b4 */
   private java.lang.String empName;
   /** 身份证号
    *             
    * 
    * @pdOid ad5bffe5-3525-4a27-9b1d-9eaac8bf2e58 */
   private java.lang.String empCardId;
   /** 性别
    *             
    * 
    * @pdOid 805cc499-cb70-43ba-a128-b9f9137f8558 */
   private java.lang.String empSex;
   /** 手机号
    *             
    * 
    * @pdOid ece7181e-10fa-4c00-88ce-e9eacb652f3e */
   private java.lang.String empTel;
   /** 邮箱
    *             
    * 
    * @pdOid a0f1a4fe-7e13-423b-a739-ccbdca6d2ef7 */
   private java.lang.String empEmail;
   /** 提成比例
    *             
    * 
    * @pdOid c0073f5b-f8e7-4292-8029-5344976c5c77 */
   private double empRatio;
   /** 单位
    *             
    * 
    * @pdOid fbeea880-b279-4b34-b9b8-80a40118505d */
   private java.lang.String empUnitNo;
   /** 薪水
    *             
    * 
    * @pdOid 1efa178c-9428-45f7-a44b-4a9915913fb9 */
   private double empSalary;
   /** 地址编号
    *             
    * 
    * @pdOid e6579f92-c77f-49ab-9311-cc9907ad8b13 */
   private java.lang.String empAddressNo;
   /** 政治面貌
    *             
    * 
    * @pdOid fd6dab20-e0cb-41fa-b47d-41e315adcb46 */
   private java.lang.String empPoliticsStatus;
   /** 文化程度
    *             
    * 
    * @pdOid d3732725-b663-422f-af6f-1b96a269a7ce */
   private java.lang.String empEducation;
   /** 籍贯
    *             
    * 
    * @pdOid ed8f8f36-a6f8-4465-884e-2948ff8155cb */
   private java.lang.String empNativePlace;
   /** 民族
    *             
    * 
    * @pdOid d7c6623f-de6d-4a80-8409-b16e60cf0aea */
   private java.lang.String empNation;
   /** 出生日期
    *             
    * 
    * @pdOid 739820fb-8015-4fc8-91bf-f99e24b93a7c */
   private java.util.Date empBirthday;
   /** 入职日期
    *             
    * 
    * @pdOid f7bdeb40-4b8f-4941-88a7-3850e9612090 */
   private java.util.Date empHiredate;
   /** 婚姻状况
    *             
    * 
    * @pdOid 804e04bd-7ab4-42ed-a1ff-69ff81d2ea46 */
   private java.lang.String empMaritalStatus;
   /** 上级领导编号
    *             
    * 
    * @pdOid 7d51882a-cf23-4c3f-af4f-57563fda8590 */
   private java.lang.String empManagerNo;
   /** 状态
    *             
    * 
    * @pdOid c56a2d04-94c5-4254-a8c4-6896ad4f1abc */
   private int empState = 0;
   /** 备注
    *             
    * 
    * @pdOid 1d8e05a9-2b1e-4a31-b1af-6159c841319f */
   private java.lang.String empRemark;
   /** 用户名
    *             
    * 
    * @pdOid b8577cfa-c178-4e27-a685-7302f18716fa */
   private java.lang.String empUserName;
   /** 密码
    *             
    * 
    * @pdOid 2a5057e6-d81c-44e6-9b8c-af8eccb2d7bd */
   private java.lang.String empUserPass;
   /** @pdOid c87b67af-6b7c-471c-aa10-3605fb28b352 */
   private java.lang.String duo1;
   /** @pdOid 2aa51aff-912e-4db6-b193-ecbab39e6c17 */
   private java.lang.String duo2;
   /** @pdOid 64c7003c-f22a-4f86-be46-14875f6cb971 */
   private java.lang.String duo3;
   
   /** @pdOid 609522bf-355a-48fa-acc5-f08300fde759 */
   public java.lang.String getEmpNo() {
      return empNo;
   }
   
   /** @param newEmpNo
    * @pdOid 1eb76e9f-3247-40ee-bd40-4941d319dea1 */
   public void setEmpNo(java.lang.String newEmpNo) {
      empNo = newEmpNo;
   }
   
   /** @pdOid 5b04a6fa-01cf-44ea-beb8-04012210f5c6 */
   public java.lang.String getEmpName() {
      return empName;
   }
   
   /** @param newEmpName
    * @pdOid d126a3de-4865-4afb-a824-a256c4812a3b */
   public void setEmpName(java.lang.String newEmpName) {
      empName = newEmpName;
   }
   
   /** @pdOid 86d1ce72-fee0-4a5b-b3fd-76025f8b83a1 */
   public java.lang.String getEmpCardId() {
      return empCardId;
   }
   
   /** @param newEmpCardId
    * @pdOid ecf0e638-1fad-40dd-8946-528278df748b */
   public void setEmpCardId(java.lang.String newEmpCardId) {
      empCardId = newEmpCardId;
   }
   
   /** @pdOid e263c106-fcc6-4c7f-ac19-5491926ddd43 */
   public java.lang.String getEmpSex() {
      return empSex;
   }
   
   /** @param newEmpSex
    * @pdOid b1b8f23f-0de0-4ff6-b89d-314aa4c14a4d */
   public void setEmpSex(java.lang.String newEmpSex) {
      empSex = newEmpSex;
   }
   
   /** @pdOid 9f256faf-2001-4486-9117-c522d9bf2115 */
   public java.lang.String getEmpTel() {
      return empTel;
   }
   
   /** @param newEmpTel
    * @pdOid c88ccee9-9069-4059-848a-496c174df7f1 */
   public void setEmpTel(java.lang.String newEmpTel) {
      empTel = newEmpTel;
   }
   
   /** @pdOid bd761e92-2e53-4f89-883e-e1ffbe67a2fc */
   public java.lang.String getEmpEmail() {
      return empEmail;
   }
   
   /** @param newEmpEmail
    * @pdOid c4e79732-9641-4ea6-9076-0bbece9119a4 */
   public void setEmpEmail(java.lang.String newEmpEmail) {
      empEmail = newEmpEmail;
   }
   
   /** @pdOid 4e1903a5-f3de-4969-873b-d5f75a17c9a1 */
   public double getEmpRatio() {
      return empRatio;
   }
   
   /** @param newEmpRatio
    * @pdOid 18ca86db-5b54-424e-9086-fe3d28998915 */
   public void setEmpRatio(double newEmpRatio) {
      empRatio = newEmpRatio;
   }
   
   /** @pdOid f3bb0bbc-ac68-4153-8ca1-5fbc6db82c80 */
   public java.lang.String getEmpUnitNo() {
      return empUnitNo;
   }
   
   /** @param newEmpUnitNo
    * @pdOid 55a82c6e-31fb-47f6-b422-ed9ae7c0353c */
   public void setEmpUnitNo(java.lang.String newEmpUnitNo) {
      empUnitNo = newEmpUnitNo;
   }
   
   /** @pdOid 1fb44d93-c53a-402d-844d-d74b19b7cf34 */
   public double getEmpSalary() {
      return empSalary;
   }
   
   /** @param newEmpSalary
    * @pdOid 60d32828-cd54-4502-bb7c-5a2437c52a45 */
   public void setEmpSalary(double newEmpSalary) {
      empSalary = newEmpSalary;
   }
   
   /** @pdOid 152ddd38-f5b1-43e1-abad-104d9d3ff944 */
   public java.lang.String getEmpAddressNo() {
      return empAddressNo;
   }
   
   /** @param newEmpAddressNo
    * @pdOid f5608bf7-a834-4d68-8564-763c9f61390f */
   public void setEmpAddressNo(java.lang.String newEmpAddressNo) {
      empAddressNo = newEmpAddressNo;
   }
   
   /** @pdOid 2ec03172-5fd0-4e7b-a26e-add0f1e7981d */
   public java.lang.String getEmpPoliticsStatus() {
      return empPoliticsStatus;
   }
   
   /** @param newEmpPoliticsStatus
    * @pdOid 83ddf0d6-0730-4689-8314-79824e34b1d4 */
   public void setEmpPoliticsStatus(java.lang.String newEmpPoliticsStatus) {
      empPoliticsStatus = newEmpPoliticsStatus;
   }
   
   /** @pdOid 7581ec5a-c02d-4d58-8eb1-62f3811379e0 */
   public java.lang.String getEmpEducation() {
      return empEducation;
   }
   
   /** @param newEmpEducation
    * @pdOid 1942ca7f-61f7-4782-8892-7cdc2262888f */
   public void setEmpEducation(java.lang.String newEmpEducation) {
      empEducation = newEmpEducation;
   }
   
   /** @pdOid 442aece8-4173-4433-8eb1-6eddb4a73862 */
   public java.lang.String getEmpNativePlace() {
      return empNativePlace;
   }
   
   /** @param newEmpNativePlace
    * @pdOid e92fca4c-9caf-48c9-b4df-ff7c9d7d22a7 */
   public void setEmpNativePlace(java.lang.String newEmpNativePlace) {
      empNativePlace = newEmpNativePlace;
   }
   
   /** @pdOid 2a79aedd-8e33-44ef-96fa-04a1e71af83a */
   public java.lang.String getEmpNation() {
      return empNation;
   }
   
   /** @param newEmpNation
    * @pdOid b5056c53-5d86-4c72-be9b-676ce3105465 */
   public void setEmpNation(java.lang.String newEmpNation) {
      empNation = newEmpNation;
   }
   
   /** @pdOid 72d84116-cb6a-48f2-ba47-ca05ef066988 */
   public java.util.Date getEmpBirthday() {
      return empBirthday;
   }
   
   /** @param newEmpBirthday
    * @pdOid 89b02213-629e-4869-bcdc-80a7cf53a7a5 */
   public void setEmpBirthday(java.util.Date newEmpBirthday) {
      empBirthday = newEmpBirthday;
   }
   
   /** @pdOid 24385c60-24ce-4441-af8e-f149b1457cd8 */
   public java.util.Date getEmpHiredate() {
      return empHiredate;
   }
   
   /** @param newEmpHiredate
    * @pdOid 247c01ca-24a0-4270-b07f-69c6e0452f9b */
   public void setEmpHiredate(java.util.Date newEmpHiredate) {
      empHiredate = newEmpHiredate;
   }
   
   /** @pdOid b0a78794-72b3-4019-a3de-2a83fd5d780f */
   public java.lang.String getEmpMaritalStatus() {
      return empMaritalStatus;
   }
   
   /** @param newEmpMaritalStatus
    * @pdOid df2166e4-a0c7-4440-9f48-7199240bad3e */
   public void setEmpMaritalStatus(java.lang.String newEmpMaritalStatus) {
      empMaritalStatus = newEmpMaritalStatus;
   }
   
   /** @pdOid abe54915-0413-4ac7-a944-f1342863951e */
   public java.lang.String getEmpManagerNo() {
      return empManagerNo;
   }
   
   /** @param newEmpManagerNo
    * @pdOid 47956012-a2aa-4b92-a3e4-196f8f657341 */
   public void setEmpManagerNo(java.lang.String newEmpManagerNo) {
      empManagerNo = newEmpManagerNo;
   }
   
   /** @pdOid 98518f37-640e-433a-952d-24d171d10a62 */
   public int getEmpState() {
      return empState;
   }
   
   /** @param newEmpState
    * @pdOid 5f34ad36-e5f2-48c7-8b04-ccb978616ba6 */
   public void setEmpState(int newEmpState) {
      empState = newEmpState;
   }
   
   /** @pdOid 6c4bbc37-0987-4d7d-94f2-6c43cfe1383e */
   public java.lang.String getEmpRemark() {
      return empRemark;
   }
   
   /** @param newEmpRemark
    * @pdOid 8e0d004d-043d-4e25-969d-fda59ae35f63 */
   public void setEmpRemark(java.lang.String newEmpRemark) {
      empRemark = newEmpRemark;
   }
   
   /** @pdOid 6c7cc639-4e42-493c-b36e-cb3e914d48e9 */
   public java.lang.String getEmpUserName() {
      return empUserName;
   }
   
   /** @param newEmpUserName
    * @pdOid 0e24304d-e815-4998-b7fb-101c1d929db4 */
   public void setEmpUserName(java.lang.String newEmpUserName) {
      empUserName = newEmpUserName;
   }
   
   /** @pdOid 1e7531ab-7454-49cb-8a48-df5410c91687 */
   public java.lang.String getEmpUserPass() {
      return empUserPass;
   }
   
   /** @param newEmpUserPass
    * @pdOid 12cb53b6-f580-4f81-9fd5-d9151f179096 */
   public void setEmpUserPass(java.lang.String newEmpUserPass) {
      empUserPass = newEmpUserPass;
   }
   
   /** @pdOid 87fb847f-783e-48ec-8205-ed67f47a171d */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid d22205c0-9bcc-4fb9-abd9-aa0a7b8b1877 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid d39841e8-3fe0-4e55-931b-907b94bb56b4 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 9b0d6cf6-2501-4ced-bf4c-6764304b6807 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }
   
   /** @pdOid c610099d-413b-466e-a676-b661eba4428f */
   public java.lang.String getDuo3() {
      return duo3;
   }
   
   /** @param newDuo3
    * @pdOid 4f6c6e9d-6779-484a-9013-f1de6f7b6842 */
   public void setDuo3(java.lang.String newDuo3) {
      duo3 = newDuo3;
   }

}