package com.logisticspro.pojo;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-10 11:06
 * @Description: 角色权限
 */
public class RoleAuthority {
    /**
     * 角色权限编号
     */
    private String roaRoleAuthNo;
    /**
     * 角色编号
     */
    private String roaRolNo;
    /**
     * 一级菜单权限编号
     */
    private String roaAuthFirstMenuNo;
    /**
     * 二级菜单权限编号
     */
    private String roaAuthSecondMenuNo;
    /**
     * 功能权限标识
     */
    private String roaAuthActionNo;
    /**
     * 角色权限描述
     */
    private String roaRoleAuthDesc;

    public RoleAuthority() {
    }

    public RoleAuthority(String roaRoleAuthNo, String roaRolNo, String roaAuthFirstMenuNo, String roaAuthSecondMenuNo, String roaAuthActionNo, String roaRoleAuthDesc) {
        this.roaRoleAuthNo = roaRoleAuthNo;
        this.roaRolNo = roaRolNo;
        this.roaAuthFirstMenuNo = roaAuthFirstMenuNo;
        this.roaAuthSecondMenuNo = roaAuthSecondMenuNo;
        this.roaAuthActionNo = roaAuthActionNo;
        this.roaRoleAuthDesc = roaRoleAuthDesc;
    }

    @Override
    public String toString() {
        return "RoleAuthority{" +
                "roaRoleAuthNo='" + roaRoleAuthNo + '\'' +
                ", roaRolNo='" + roaRolNo + '\'' +
                ", roaAuthFirstMenuNo='" + roaAuthFirstMenuNo + '\'' +
                ", roaAuthSecondMenuNo='" + roaAuthSecondMenuNo + '\'' +
                ", roaAuthActionNo='" + roaAuthActionNo + '\'' +
                ", roaRoleAuthDesc='" + roaRoleAuthDesc + '\'' +
                '}';
    }

    public String getRoaRoleAuthNo() {
        return roaRoleAuthNo;
    }

    public void setRoaRoleAuthNo(String roaRoleAuthNo) {
        this.roaRoleAuthNo = roaRoleAuthNo;
    }

    public String getRoaRolNo() {
        return roaRolNo;
    }

    public void setRoaRolNo(String roaRolNo) {
        this.roaRolNo = roaRolNo;
    }

    public String getRoaAuthFirstMenuNo() {
        return roaAuthFirstMenuNo;
    }

    public void setRoaAuthFirstMenuNo(String roaAuthFirstMenuNo) {
        this.roaAuthFirstMenuNo = roaAuthFirstMenuNo;
    }

    public String getRoaAuthSecondMenuNo() {
        return roaAuthSecondMenuNo;
    }

    public void setRoaAuthSecondMenuNo(String roaAuthSecondMenuNo) {
        this.roaAuthSecondMenuNo = roaAuthSecondMenuNo;
    }

    public String getRoaAuthActionNo() {
        return roaAuthActionNo;
    }

    public void setRoaAuthActionNo(String roaAuthActionNo) {
        this.roaAuthActionNo = roaAuthActionNo;
    }

    public String getRoaRoleAuthDesc() {
        return roaRoleAuthDesc;
    }

    public void setRoaRoleAuthDesc(String roaRoleAuthDesc) {
        this.roaRoleAuthDesc = roaRoleAuthDesc;
    }
}