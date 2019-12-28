package com.bookshopping.dao;

import com.bookshopping.pojo.BookTypeInfo;

import java.util.List;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/9 0009 11:16
 * @Description:
 */
public interface BookTypeInfoInter {
    /**
     * 查询图书类型信息
     * @return List<BookTypeInfo> 集合
     */
    List<BookTypeInfo> searchBookTypeInfo();
}
