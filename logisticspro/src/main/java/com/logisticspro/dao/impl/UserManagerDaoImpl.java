package com.logisticspro.dao.impl;

import com.logisticspro.dao.inter.UserManagerDaoInter;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-06 08:24
 * @Description:
 */
@Repository("userManagerDaoImpl")
public class UserManagerDaoImpl implements UserManagerDaoInter {
    @Resource(name = "sqlSessionFactoryBean")
    private SqlSessionFactory sqlSessionFactory;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
}
