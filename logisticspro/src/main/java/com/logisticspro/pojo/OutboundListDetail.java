package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 出库明细
 */
public class OutboundListDetail {
    /**
     * 出库明细单号
     */
    private String oldOIwnEntry;
    /**
     * 货物编码
     */
    private String oldNumber;
    /**
     * 货物名称
     */
    private String oldName;
    /**
     * 起始号段
     */
    private String oldOrigin;
    /**
     * 截止号段
     */
    private String oldEnd;
    /**
     * 出库数量
     */
    private int oldQuantity;
    /**
     * 实际数量
     */
    private int oldRealityQuantity;
    /**
     * 价格
     */
    private double oldPrice;
    /**
     * 规格
     */
    private String oldStandard;
    /**
     * 类型
     */
    private String oldType;
    /**
     * 计量单位
     */
    private String oldUnit;
    /**
     * 状态
     */
    private int oldStatus;
    /**
     * 出库单号
     */
    private String oldOlmownEntry;
    /**
     *
     * */
    private String duo1;
    /**
     *
     * */
    private String duo2;

    public OutboundListDetail() {
    }

    public OutboundListDetail(String oldOIwnEntry, String oldNumber, String oldName, String oldOrigin, String oldEnd, int oldQuantity, int oldRealityQuantity, double oldPrice, String oldStandard, String oldType, String oldUnit, int oldStatus, String oldOlmownEntry, String duo1, String duo2) {
        this.oldOIwnEntry = oldOIwnEntry;
        this.oldNumber = oldNumber;
        this.oldName = oldName;
        this.oldOrigin = oldOrigin;
        this.oldEnd = oldEnd;
        this.oldQuantity = oldQuantity;
        this.oldRealityQuantity = oldRealityQuantity;
        this.oldPrice = oldPrice;
        this.oldStandard = oldStandard;
        this.oldType = oldType;
        this.oldUnit = oldUnit;
        this.oldStatus = oldStatus;
        this.oldOlmownEntry = oldOlmownEntry;
        this.duo1 = duo1;
        this.duo2 = duo2;
    }

    @Override
    public String toString() {
        return "OutboundListDetail{" +
                "oldOIwnEntry='" + oldOIwnEntry + '\'' +
                ", oldNumber='" + oldNumber + '\'' +
                ", oldName='" + oldName + '\'' +
                ", oldOrigin='" + oldOrigin + '\'' +
                ", oldEnd='" + oldEnd + '\'' +
                ", oldQuantity=" + oldQuantity +
                ", oldRealityQuantity=" + oldRealityQuantity +
                ", oldPrice=" + oldPrice +
                ", oldStandard='" + oldStandard + '\'' +
                ", oldType='" + oldType + '\'' +
                ", oldUnit='" + oldUnit + '\'' +
                ", oldStatus=" + oldStatus +
                ", oldOlmownEntry='" + oldOlmownEntry + '\'' +
                ", duo1='" + duo1 + '\'' +
                ", duo2='" + duo2 + '\'' +
                '}';
    }

    public String getOldOIwnEntry() {
        return oldOIwnEntry;
    }

    public void setOldOIwnEntry(String oldOIwnEntry) {
        this.oldOIwnEntry = oldOIwnEntry;
    }

    public String getOldNumber() {
        return oldNumber;
    }

    public void setOldNumber(String oldNumber) {
        this.oldNumber = oldNumber;
    }

    public String getOldName() {
        return oldName;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getOldOrigin() {
        return oldOrigin;
    }

    public void setOldOrigin(String oldOrigin) {
        this.oldOrigin = oldOrigin;
    }

    public String getOldEnd() {
        return oldEnd;
    }

    public void setOldEnd(String oldEnd) {
        this.oldEnd = oldEnd;
    }

    public int getOldQuantity() {
        return oldQuantity;
    }

    public void setOldQuantity(int oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public int getOldRealityQuantity() {
        return oldRealityQuantity;
    }

    public void setOldRealityQuantity(int oldRealityQuantity) {
        this.oldRealityQuantity = oldRealityQuantity;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getOldStandard() {
        return oldStandard;
    }

    public void setOldStandard(String oldStandard) {
        this.oldStandard = oldStandard;
    }

    public String getOldType() {
        return oldType;
    }

    public void setOldType(String oldType) {
        this.oldType = oldType;
    }

    public String getOldUnit() {
        return oldUnit;
    }

    public void setOldUnit(String oldUnit) {
        this.oldUnit = oldUnit;
    }

    public int getOldStatus() {
        return oldStatus;
    }

    public void setOldStatus(int oldStatus) {
        this.oldStatus = oldStatus;
    }

    public String getOldOlmownEntry() {
        return oldOlmownEntry;
    }

    public void setOldOlmownEntry(String oldOlmownEntry) {
        this.oldOlmownEntry = oldOlmownEntry;
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
}