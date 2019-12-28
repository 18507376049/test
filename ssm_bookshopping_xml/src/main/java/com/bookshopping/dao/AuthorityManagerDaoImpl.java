package com.bookshopping.dao;

import com.bookshopping.pojo.Authority;
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
 * @Date: 2019/11/10 0010 17:14
 * @Description:
 */
public class AuthorityManagerDaoImpl implements AuthorityManagerDaoInter {
    /**
     *  根据查询一级菜单
     * @param userInfo 用户信息
     * @return List<Authority>
     */
    public List<Authority> searchFristMenu(UserInfo userInfo){
        List<Authority> authorityList=new ArrayList<Authority>();
        SqlSession sqlSession=null;
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            sqlSession = sqlSessionFactory.openSession();
            authorityList=sqlSession.selectList("bookinfo.crud.searchBookTypeInfo",userInfo);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null !=sqlSession){
                sqlSession.close();
            }
        }
        return authorityList;
    }
    /**
     * 查询二级菜单
     * @param parentNo 一级菜单的编号
     * @return List<Authority>
     */
    public List<Authority> searchSecondMenu(int parentNo) {
        return null;
    }
    /**
     * 查询功能按钮
     * @param parentNo 二级菜单的编号
     * @return List<Authority>
     */
    public List<Authority> searchButton(int parentNo) {
        return null;
    }
}
