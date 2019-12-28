package com.bookshopping.dao;

import com.bookshopping.pojo.Authority;
import com.bookshopping.pojo.UserInfo;

import java.util.List;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/10 0010 17:14
 * @Description:权限管理菜单
 */
public interface AuthorityManagerDaoInter {
    /**
     *  根据查询一级菜单
     * @param userInfo 用户信息
     * @return List<Authority>
     */
    List<Authority> searchFristMenu(UserInfo userInfo);

    /**
     * 查询二级菜单
     * @param parentNo 一级菜单的编号
     * @return List<Authority>
     */
    List<Authority> searchSecondMenu(int parentNo);

    /**
     * 查询功能按钮
     * @param parentNo 二级菜单的编号
     * @return List<Authority>
     */
    List<Authority> searchButton(int parentNo);
}
