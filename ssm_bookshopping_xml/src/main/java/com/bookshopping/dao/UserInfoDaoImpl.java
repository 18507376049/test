package com.bookshopping.dao;

import com.bookshopping.pojo.BookTypeInfo;
import com.bookshopping.pojo.UserInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/10 0010 17:11
 * @Description:
 */
public class UserInfoDaoImpl implements UserInfoDaoInter{
    /**
     * 查询用户信息通过登录信息
     * @param userInfo 登录信息
     * @return 用户信息
     */
    public UserInfo searchUserInfoByLoginInfo(UserInfo userInfo) {
        UserInfo user=null;
        SqlSession sqlSession=null;
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            sqlSession = sqlSessionFactory.openSession();
            user=sqlSession.selectOne("bookinfo.crud.searchBookTypeInfo",userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null !=sqlSession){
                sqlSession.close();
            }
        }
        return user;
    }
}
