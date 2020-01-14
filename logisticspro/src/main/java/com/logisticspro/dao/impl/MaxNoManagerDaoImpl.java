package com.logisticspro.dao.impl;

import com.logisticspro.dao.inter.MaxNoManagerDaoInter;
import com.logisticspro.pojo.Employees;
import com.logisticspro.pojo.MaxNo;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * @Auther: 刘涵
 * @Date: 2020-01-13 10:49
 * @Description: 最大编号管理数据访问层实现类
 */
@Repository("maxNoManagerDaoImpl")
public class MaxNoManagerDaoImpl implements MaxNoManagerDaoInter {
    @Resource(name = "sqlSessionFactoryBean")
    private SqlSessionFactory sqlSessionFactory=null;

    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }
    /**
     * 查询最大编号表中的最大编号
     * @param maxNo 参数
     * @return MaxNo
     */
    @Override
    public MaxNo searchMaxNo(MaxNo maxNo) {
        SqlSession sqlSession=null;
        MaxNo maxNo1=null;
        try{
            sqlSession = sqlSessionFactory.openSession();
            //查询数据
            maxNo1=sqlSession.selectOne("maxNoManager.crud.searchMaxNo",maxNo);
        }catch (NullPointerException ex){
            ex.getMessage();
        }finally {
            //判断sqlSession不为null
            if ( null != sqlSession) {
                sqlSession.close();
            }
        }
        return maxNo1;
    }

    /**
     * 修改最大编号表的最大编号
     * @param maxNo 参数
     * @return int
     */
    @Override
    public int excuteUpdateMaxNo(MaxNo maxNo) {
        SqlSession sqlSession=null;
        int rows=0;
        try{
            sqlSession = sqlSessionFactory.openSession();
            //查询数据
            rows=sqlSession.update("maxNoManager.crud.excuteUpdateMaxNo",maxNo);
        }catch (NullPointerException ex){
            ex.getMessage();
        }finally {
            //判断sqlSession不为null
            if ( null != sqlSession) {
                sqlSession.close();
            }
        }
        return rows;
    }

}
