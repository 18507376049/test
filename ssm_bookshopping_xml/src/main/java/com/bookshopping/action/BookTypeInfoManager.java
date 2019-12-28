package com.bookshopping.action;

import com.bookshopping.pojo.BookTypeInfo;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/8 0008 17:03
 * @Description:
 */
public class BookTypeInfoManager extends ActionSupport{

    public String searchBookTypeInfo() throws Exception {
        System.out.println("searchBookTypeInfo");
        List<BookTypeInfo> bookTypeInfos = new ArrayList<BookTypeInfo>();
        for (int i = 1; i <= 14; i++) {
            BookTypeInfo bookTypeInfo=new BookTypeInfo();
            bookTypeInfo.setBookTypeName("b"+i);
             bookTypeInfos.add(bookTypeInfo);
        }
        ActionContext.getContext().getSession().put("BOOK_TYPE_INFO_LIST",bookTypeInfos);
        return "success";
    }
}
