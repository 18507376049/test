package com.bookshopping.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/10 0010 17:00
 * @Description:
 */
public class Role implements Serializable {
    private String roleNo;
    private String roleName;
    private Date roleCreateTime;
    private String roleDesc;

    @Override
    public String toString() {
        return "Role{" +
                "roleNo='" + roleNo + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleCreateTime=" + roleCreateTime +
                ", roleDesc='" + roleDesc + '\'' +
                '}';
    }

    public Role() {
    }

    public Role(String roleNo, String roleName, Date roleCreateTime, String roleDesc) {

        this.roleNo = roleNo;
        this.roleName = roleName;
        this.roleCreateTime = roleCreateTime;
        this.roleDesc = roleDesc;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getRoleCreateTime() {
        return roleCreateTime;
    }

    public void setRoleCreateTime(Date roleCreateTime) {
        this.roleCreateTime = roleCreateTime;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }
}
