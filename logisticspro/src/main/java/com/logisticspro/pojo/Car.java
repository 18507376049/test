/***********************************************************************
 * Module:  Car.java
 * Author:  Administrator
 * Purpose: Defines the Class Car
 ***********************************************************************/

import java.util.*;

/** @pdOid b6cecb87-ad41-4a7d-b013-7be16c0bbe6f */
public class Car {
   /** 车辆编号
    *             
    * 
    * @pdOid 83b8cd94-4ddc-4c02-8377-96879dd42bd3 */
   private java.lang.String carId;
   /** 车辆类型编号
    *             
    * 
    * @pdOid bc617302-fb2d-48f2-b3a6-1747f9a87692 */
   private java.lang.String carCarTypeId;
   /** 车牌号
    *             
    * 
    * @pdOid 51712f1f-34c4-4ff7-a24a-5d515ed1aca2 */
   private java.lang.String carNumber;
   /** 所属单位
    *             
    * 
    * @pdOid f86b84d0-4d7a-478f-9142-1baf5911ebaa */
   private java.lang.String carSubordUnit;
   /** 更新时间
    *             
    * 
    * @pdOid 8651954e-6094-4d1a-8f43-068de55ba372 */
   private java.util.Date carNewTime;
   /** 跟新单位
    *             
    * 
    * @pdOid ef1dec46-1521-42d2-9380-f251e9810366 */
   private java.lang.String carNewUnit;
   /** 使用人
    *             
    * 
    * @pdOid 76c6b71e-459f-4ecf-9318-9c9f74223882 */
   private java.lang.String carUser;
   /** 收排标准编号
    *             
    * 
    * @pdOid 477be099-84c6-4c23-a83f-a87f461d2fef */
   private java.lang.String carStandardNo;
   /** 收派标准
    *             
    * 
    * @pdOid 5ae8cb48-0ac8-46b5-9f01-67603afc200a */
   private java.lang.String carStandardC;
   /** 收派标准（公斤）
    *             
    * 
    * @pdOid c01ec16e-27cb-423d-9881-b0f81b6b3732 */
   private java.lang.String carStandardKg;
   /** 车辆状态
    *             
    * 
    * @pdOid 590a8332-e406-4a6a-9aa9-9513d56bee20 */
   private int carState;
   /** 承运商编号
    *             
    * 
    * @pdOid 860d7565-5404-4fcb-b312-cad3f15523a3 */
   private java.lang.String carCaeId;
   /** 备注
    *             
    * 
    * @pdOid e40d0407-cc07-4ae0-b5a8-a2a845dd796f */
   private java.lang.String carRemarks;
   /** @pdOid bf9fee04-0367-49fb-b81b-d95ba6a5461a */
   private java.lang.String duo1;
   /** @pdOid de407b32-4778-4d02-8121-0d4d423757ea */
   private java.lang.String duo2;
   
   /** @pdOid 1ab1fb1b-bcbf-4794-bca5-66d49dd7f2bd */
   public java.lang.String getCarId() {
      return carId;
   }
   
   /** @param newCarId
    * @pdOid 97373fab-1b1d-40ff-a60e-057971142bb8 */
   public void setCarId(java.lang.String newCarId) {
      carId = newCarId;
   }
   
   /** @pdOid 27efb752-bef7-4116-b2c0-8a5747647812 */
   public java.lang.String getCarCarTypeId() {
      return carCarTypeId;
   }
   
   /** @param newCarCarTypeId
    * @pdOid 67fe3174-e864-4437-a43a-52dea073b03b */
   public void setCarCarTypeId(java.lang.String newCarCarTypeId) {
      carCarTypeId = newCarCarTypeId;
   }
   
   /** @pdOid 18e0745b-09d4-4927-9533-d54f307cf1df */
   public java.lang.String getCarNumber() {
      return carNumber;
   }
   
   /** @param newCarNumber
    * @pdOid ed583971-0f19-4d4a-b965-06df3b9e59ab */
   public void setCarNumber(java.lang.String newCarNumber) {
      carNumber = newCarNumber;
   }
   
   /** @pdOid 0bc43e15-440a-4071-87b9-e9f30418e8b4 */
   public java.lang.String getCarSubordUnit() {
      return carSubordUnit;
   }
   
   /** @param newCarSubordUnit
    * @pdOid c6d84a95-34f2-4bfd-b60d-589b9af73317 */
   public void setCarSubordUnit(java.lang.String newCarSubordUnit) {
      carSubordUnit = newCarSubordUnit;
   }
   
   /** @pdOid 8bcca2ae-374a-49ed-8373-0009e61371a7 */
   public java.util.Date getCarNewTime() {
      return carNewTime;
   }
   
   /** @param newCarNewTime
    * @pdOid a01905c1-76ff-4700-96a0-7aaa61718383 */
   public void setCarNewTime(java.util.Date newCarNewTime) {
      carNewTime = newCarNewTime;
   }
   
   /** @pdOid 0e9886e0-077e-4269-bc1e-8b69f45edf92 */
   public java.lang.String getCarNewUnit() {
      return carNewUnit;
   }
   
   /** @param newCarNewUnit
    * @pdOid 76a17f00-4323-40cc-8995-d8b8657ab129 */
   public void setCarNewUnit(java.lang.String newCarNewUnit) {
      carNewUnit = newCarNewUnit;
   }
   
   /** @pdOid 2857e707-3dad-4641-875b-d1fc3500a75e */
   public java.lang.String getCarUser() {
      return carUser;
   }
   
   /** @param newCarUser
    * @pdOid ae2d9f67-4774-4785-bdbb-4c02fd312235 */
   public void setCarUser(java.lang.String newCarUser) {
      carUser = newCarUser;
   }
   
   /** @pdOid c7c5e86c-b6c0-4ad5-9e04-c1b16f653396 */
   public java.lang.String getCarStandardNo() {
      return carStandardNo;
   }
   
   /** @param newCarStandardNo
    * @pdOid f1a6716b-6fa7-41b8-b62f-d807422f7226 */
   public void setCarStandardNo(java.lang.String newCarStandardNo) {
      carStandardNo = newCarStandardNo;
   }
   
   /** @pdOid bd5e9715-dcff-4298-9b7e-0d20adbc2aae */
   public java.lang.String getCarStandardC() {
      return carStandardC;
   }
   
   /** @param newCarStandardC
    * @pdOid e3c873ae-0505-4c86-9734-25920c8cb6ef */
   public void setCarStandardC(java.lang.String newCarStandardC) {
      carStandardC = newCarStandardC;
   }
   
   /** @pdOid 281cf77e-61ad-4a08-9f9f-5f8a80f29cc7 */
   public java.lang.String getCarStandardKg() {
      return carStandardKg;
   }
   
   /** @param newCarStandardKg
    * @pdOid d356efa9-8301-48de-9493-1fbdd5677645 */
   public void setCarStandardKg(java.lang.String newCarStandardKg) {
      carStandardKg = newCarStandardKg;
   }
   
   /** @pdOid d5300759-0902-48ef-baf8-1af958201879 */
   public int getCarState() {
      return carState;
   }
   
   /** @param newCarState
    * @pdOid 8de80d51-ef13-4f21-9e8e-25f0ef62ba99 */
   public void setCarState(int newCarState) {
      carState = newCarState;
   }
   
   /** @pdOid 48fc06e1-4846-4a65-b68a-555efdc01167 */
   public java.lang.String getCarCaeId() {
      return carCaeId;
   }
   
   /** @param newCarCaeId
    * @pdOid 3a77a876-8a3c-4728-afab-b85194102622 */
   public void setCarCaeId(java.lang.String newCarCaeId) {
      carCaeId = newCarCaeId;
   }
   
   /** @pdOid bfb29433-1c7c-48f1-baa5-ad89d3d2298e */
   public java.lang.String getCarRemarks() {
      return carRemarks;
   }
   
   /** @param newCarRemarks
    * @pdOid f8343b83-78e2-4c80-bb4d-3199dbc35584 */
   public void setCarRemarks(java.lang.String newCarRemarks) {
      carRemarks = newCarRemarks;
   }
   
   /** @pdOid d4bf0200-3644-4017-898f-defe422f9cad */
   public java.lang.String getDuo1() {
      return duo1;
   }
   
   /** @param newDuo1
    * @pdOid 090008b5-e31f-43a0-badc-8bdf8be831e5 */
   public void setDuo1(java.lang.String newDuo1) {
      duo1 = newDuo1;
   }
   
   /** @pdOid 92c8e64d-6352-4477-b5c6-3e78c97d7ca7 */
   public java.lang.String getDuo2() {
      return duo2;
   }
   
   /** @param newDuo2
    * @pdOid 1aa5d147-cca6-4f54-8195-32fc79956610 */
   public void setDuo2(java.lang.String newDuo2) {
      duo2 = newDuo2;
   }

}