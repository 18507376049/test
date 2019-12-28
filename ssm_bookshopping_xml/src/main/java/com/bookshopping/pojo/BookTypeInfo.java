package com.bookshopping.pojo;

import java.io.Serializable;

/**
 * @Auther: 刘涵
 * @Date: 2019/11/8 0008 17:19
 * @Description:
 */
public class BookTypeInfo implements Serializable {
    private String bookTypeNo;
    private String bookTypeName;
    private String bookTypeLinkUrl;
    private String bookTypeParentNo;
    private int bookTypeOrderNo;
    private String bookTypeDescipt;

    public String getBookTypeNo() {
        return bookTypeNo;
    }

    public void setBookTypeNo(String bookTypeNo) {
        this.bookTypeNo = bookTypeNo;
    }

    public String getBookTypeName() {
        return bookTypeName;
    }

    public void setBookTypeName(String bookTypeName) {
        this.bookTypeName = bookTypeName;
    }

    public String getBookTypeLinkUrl() {
        return bookTypeLinkUrl;
    }

    public void setBookTypeLinkUrl(String bookTypeLinkUrl) {
        this.bookTypeLinkUrl = bookTypeLinkUrl;
    }

    public String getBookTypeParentNo() {
        return bookTypeParentNo;
    }

    public void setBookTypeParentNo(String bookTypeParentNo) {
        this.bookTypeParentNo = bookTypeParentNo;
    }

    public int getBookTypeOrderNo() {
        return bookTypeOrderNo;
    }

    public void setBookTypeOrderNo(int bookTypeOrderNo) {
        this.bookTypeOrderNo = bookTypeOrderNo;
    }

    public String getBookTypeDescipt() {
        return bookTypeDescipt;
    }

    public void setBookTypeDescipt(String bookTypeDescipt) {
        this.bookTypeDescipt = bookTypeDescipt;
    }

    public BookTypeInfo(String bookTypeNo, String bookTypeName, String bookTypeLinkUrl, String bookTypeParentNo, int bookTypeOrderNo, String bookTypeDescipt) {
        this.bookTypeNo = bookTypeNo;
        this.bookTypeName = bookTypeName;
        this.bookTypeLinkUrl = bookTypeLinkUrl;
        this.bookTypeParentNo = bookTypeParentNo;
        this.bookTypeOrderNo = bookTypeOrderNo;
        this.bookTypeDescipt = bookTypeDescipt;
    }

    public BookTypeInfo() {
    }

    @Override
    public String toString() {
        return "BookTypeInfo{" +
                "bookTypeNo='" + bookTypeNo + '\'' +
                ", bookTypeName='" + bookTypeName + '\'' +
                ", bookTypeLinkUrl='" + bookTypeLinkUrl + '\'' +
                ", bookTypeParentNo='" + bookTypeParentNo + '\'' +
                ", bookTypeOrderNo=" + bookTypeOrderNo +
                ", bookTypeDescipt='" + bookTypeDescipt + '\'' +
                '}';
    }
}
