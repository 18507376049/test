package com.bookshopping.dao;

import com.bookshopping.pojo.UserInfo;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/10 0010 17:10
 * @Description:用户的数据访问层（接口）
 */
public interface UserInfoDaoInter {
    /**
     * 查询用户信息通过登录信息
     * @param userInfo 登录信息
     * @return 用户信息
     */
    UserInfo searchUserInfoByLoginInfo(UserInfo userInfo);
}
