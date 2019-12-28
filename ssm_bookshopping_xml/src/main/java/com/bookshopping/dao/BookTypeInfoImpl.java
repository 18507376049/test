package com.bookshopping.dao;

import com.bookshopping.pojo.BookTypeInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/9 0009 11:17
 * @Description:
 */
public class BookTypeInfoImpl implements BookTypeInfoInter {
    /**
     * 查询图书类型信息
     * @return List<BookTypeInfo> 集合
     */
    public  List<BookTypeInfo> searchBookTypeInfo() {
        List<BookTypeInfo> bookTypeInfoList=new ArrayList<BookTypeInfo>();
        SqlSession sqlSession=null;
        try {
            SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
            sqlSession = sqlSessionFactory.openSession();
            bookTypeInfoList=sqlSession.selectList("bookinfo.crud.searchBookTypeInfo");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null !=sqlSession){
                sqlSession.close();
            }
        }
        return bookTypeInfoList;
    }

    //测试
    public static void main(String[] args) {
        List<BookTypeInfo> bookTypeInfoList = new BookTypeInfoImpl().searchBookTypeInfo();
        System.out.println("===" +bookTypeInfoList.size());

    }
}
