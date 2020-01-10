package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 员工角色
 */
public class Freight {
   /**
    * 邮费编号
    */
   private java.lang.String freNo;
   /**
    * 里程范围
    */
   private java.lang.String freSmallMi;
   /**
    * 重量范围
    */
   private java.lang.String freWeight;
   /**
    * 体积范围
    */
   private java.lang.String freVolume;
   /**
    * 邮费
    */
   private double freMoney;
   /**
    * 排序
    */
   private int freSort;
   /**
    *
    * */
   private java.lang.String duo1;
   /**
    *
    * */
   private java.lang.String duo2;
   /**
    *
    * */
   private java.lang.String duo3;

   public Freight() {
   }

   public Freight(String freNo, String freSmallMi, String freWeight, String freVolume, double freMoney, int freSort, String duo1, String duo2, String duo3) {
      this.freNo = freNo;
      this.freSmallMi = freSmallMi;
      this.freWeight = freWeight;
      this.freVolume = freVolume;
      this.freMoney = freMoney;
      this.freSort = freSort;
      this.duo1 = duo1;
      this.duo2 = duo2;
      this.duo3 = duo3;
   }

   @Override
   public String toString() {
      return "Freight{" +
              "freNo='" + freNo + '\'' +
              ", freSmallMi='" + freSmallMi + '\'' +
              ", freWeight='" + freWeight + '\'' +
              ", freVolume='" + freVolume + '\'' +
              ", freMoney=" + freMoney +
              ", freSort=" + freSort +
              ", duo1='" + duo1 + '\'' +
              ", duo2='" + duo2 + '\'' +
              ", duo3='" + duo3 + '\'' +
              '}';
   }

   public String getFreNo() {
      return freNo;
   }

   public void setFreNo(String freNo) {
      this.freNo = freNo;
   }

   public String getFreSmallMi() {
      return freSmallMi;
   }

   public void setFreSmallMi(String freSmallMi) {
      this.freSmallMi = freSmallMi;
   }

   public String getFreWeight() {
      return freWeight;
   }

   public void setFreWeight(String freWeight) {
      this.freWeight = freWeight;
   }

   public String getFreVolume() {
      return freVolume;
   }

   public void setFreVolume(String freVolume) {
      this.freVolume = freVolume;
   }

   public double getFreMoney() {
      return freMoney;
   }

   public void setFreMoney(double freMoney) {
      this.freMoney = freMoney;
   }

   public int getFreSort() {
      return freSort;
   }

   public void setFreSort(int freSort) {
      this.freSort = freSort;
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