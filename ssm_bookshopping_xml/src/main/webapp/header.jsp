<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
    <meta content="all" name="robots"/>
    <meta name="author" content="Fisher"/>
    <meta name="Copyright" content="Copyright 2007-2008, 版权所有 www.reefdesign.cn"/>
    <meta name="description" content="reefdesign"/>
    <meta name="keywords" content="reefdesign"/>
    <title>电子书城</title>
    <link rel="shortcut icon" href="favicon.ico">
    <link rel="stylesheet" rev="stylesheet" href="css/style.css" type="text/css" media="all"/>
</head>
<body class="main">
<div id="divhead">
    <table cellspacing="0" class="headtable">
        <tr>
            <td><a href="index.html"><img src="images/logo.gif" width="95" height="30" border="0"/></a></td>
            <td style="text-align:right"><img src="images/cart.gif" width="26" height="23" style="margin-bottom:-4px"/>&nbsp;<a
                    href="cart.html">购物车</a>　|　<a href="#">帮助中心</a>　|　<a href="login.html">我的帐户</a>　|　<a
                    href="register.html">新用户注册</a></td>
        </tr>
    </table>
</div>

<div id="divmenu">
    <c:if test="${null ne sessionScope.BOOK_TYPE_INFO_LIST}">
        <c:forEach items="${sessionScope.BOOK_TYPE_INFO_LIST}" var="bookTypeInfoObj">
            <a href="product_list.html">${bookTypeInfoObj.bookTypeName}</a>
        </c:forEach>
    </c:if>
    <%--<a href="product_list.html">文学</a>　　<a href="product_list.html">生活</a>　　<a href="product_list.html">计算机</a>　　<a--%>
        <%--href="product_list.html">外语</a>　　<a href="product_list.html">经管</a>　　<a href="product_list.html">励志</a>　　<a--%>
        <%--href="product_list.html">社科</a>　　<a href="product_list.html">学术</a>　　<a href="product_list.html">少儿</a>　　<a--%>
        <%--href="product_list.html">艺术</a>　　<a href="product_list.html">原版</a>　　<a href="product_list.html">科技</a>　　<a--%>
        <%--href="product_list.html">考试</a>　　<a href="product_list.html">生活百科</a>　　　　--%>
    <a href="product_list.html"style="color:#FFFF00">全部商品目录</a>
</div>
</body>
</html>
