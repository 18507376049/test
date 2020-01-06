//package com.logisticspro.service;
//
//import org.apache.shiro.authc.Account;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Isolation;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.Resource;
//
//@Service("bookManagerServiceImpl")
//public class BookManagerServiceImpl implements BookManagerServiceInter {
//    @Resource(name = "bookManagerDaoImpl")
//    private BookManagerDaoInter bookManagerDaoImpl;
//
//    public void setBookManagerDaoImpl(BookManagerDaoInter bookManagerDaoImpl) {
//        this.bookManagerDaoImpl = bookManagerDaoImpl;
//    }
//
//    /**
//     * 用户在线购书
//     */
//    /*
//    * 1)pointcut
//    * 2)advice
//    * 3)tx:method name="" propagation="" isolation=""
//    *   查询:【propagation】 readOnly = true
//    *   更新: 【propagation】 【isolation】
//    * */
//    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED)
//    public void userShoppingBook() {
//        //1、根据图书图书查询图书单价
//        int isbn = 1001;
//        int bookPriceByIsbn = bookManagerDaoImpl.findBookPriceByIsbn(isbn);
//        //2、根据图书编号减图书库存
//        bookManagerDaoImpl.updateBookStockByIsbn(isbn);
//        //3、根据帐户名称及图书单价减余额
//        Account account=new Account("Jerry",bookPriceByIsbn);
//        bookManagerDaoImpl.updateUserBalance(account);
//    }
//
//}
