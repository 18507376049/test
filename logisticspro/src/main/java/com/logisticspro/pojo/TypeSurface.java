package com.logisticspro.pojo;
/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 包装材料
 */
public class TypeSurface {
   /**
    * 包装材料编号
    * */
   private String typeId;
   /**
    * 包装材料名称
    *  */
   private String typeName;
   /**
    * 备注
    *  */
   private String typeDesc;
   /**
    *
    * */
   private String duo1;
   /**
    *
    * */
   private String duo2;

   public String getTypeId() {
      return typeId;
   }

   public void setTypeId(String typeId) {
      this.typeId = typeId;
   }

   public String getTypeName() {
      return typeName;
   }

   public void setTypeName(String typeName) {
      this.typeName = typeName;
   }

   public String getTypeDesc() {
      return typeDesc;
   }

   public void setTypeDesc(String typeDesc) {
      this.typeDesc = typeDesc;
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

   public TypeSurface(String typeId, String typeName, String typeDesc, String duo1, String duo2) {
      this.typeId = typeId;
      this.typeName = typeName;
      this.typeDesc = typeDesc;
      this.duo1 = duo1;
      this.duo2 = duo2;
   }

   public TypeSurface() {
   }

   @Override
   public String toString() {
      return "TypeSurface{" +
              "typeId='" + typeId + '\'' +
              ", typeName='" + typeName + '\'' +
              ", typeDesc='" + typeDesc + '\'' +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              '}';
   }
}