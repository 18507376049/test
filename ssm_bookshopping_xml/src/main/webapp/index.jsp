<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
    <meta content="all" name="robots"/>
    <meta name="author" content="Fisher" />
    <meta name="Copyright" content="Copyright 2007-2008, 版权所有 www.reefdesign.cn" />
    <meta name="description" content="reefdesign" />
    <meta name="keywords" content="reefdesign" />
    <title>电子书城</title>
    <link rel="shortcut icon" href="favicon.ico" >
    <link rel="stylesheet" rev="stylesheet" href="css/style.css" type="text/css" media="all" />
</head>
<body>
<%@ include file="header.jsp" %>
<div id="divsearch">
    <table width="100%" border="0" cellspacing="0">
        <tr>
            <td style="text-align:right; padding-right:220px">Search
                <input type="text" name="textfield" class="inputtable"/>
                <!--<input name="searchbutton" type="image" src="images/serchbutton.gif" style=" margin-bottom:-4px"/>-->
                <a href="search.html"><img src="images/serchbutton.gif" border="0" style="margin-bottom:-4px"/></a></td>
        </tr>
    </table>

</div>
<div id="divad">
    <img src="ad/index_ad.jpg"/>
</div>

<div id="divcontent">
    <table width="900px" border="0" cellspacing="0">
        <tr>
            <td width="497"><img src="images/billboard.gif" width="497" height="38"/>
                <table cellspacing="0" class="ctl">
                    <tr>
                        <td>&middot;<a href="news.html" style="color:#000000">图书3折起，支持在线浏览 先看再买不后悔,任何商品免费送货</a></td>
                    </tr>
                    <tr>
                        <td>&middot;<a href="news.html" style="color:#000000">Lonely Planet
                            已出版600多种旅行指南，几乎覆盖了全世界的每个角落。</a></td>
                    </tr>
                    <tr>
                        <td>&middot;<a href="news.html" style="color:#000000">2007年中旅游图书畅销榜速递 中国游,世界游,旅游图书全部7折封顶</a>
                        </td>
                    </tr>
                    <tr>
                        <td>&middot;<a href="news.html" style="color:#000000">50万种图书3折,百货团购价热卖 畅销榜新书速递,促销天天有</a></td>
                    </tr>
                    <tr>
                        <td>&middot;<a href="news.html" style="color:#000000">50万种图书3折,百货团购价热卖 畅销榜新书速递,促销天天有</a></td>
                    </tr>
                </table>
            </td>
            <td style="padding:5px 15px 10px 40px">
                <table width="100%" border="0" cellspacing="0">
                    <tr>
                        <td><img src="images/hottitle.gif" width="126" height="29"/></td>
                    </tr>
                </table>
                <table width="100%" border="0" cellspacing="0">
                    <tr>
                        <td style="width:50px; text-align:center"><a href="info.html"><img src="bookcover/travelbook.jpg"
                                                                                         width="102" height="130"
                                                                                         border="0"/></a><br/>
                            <a href="info.html">TravelBook<br/>
                                作者:Lonley Plant</a></td>
                        <td style="width:50px; text-align:center"><a href="info.html"><img src="bookcover/java2.jpg"
                                                                                         width="102" height="130"
                                                                                         border="0"/></a><br/>
                            <a href="info.html">Java2入门经典(JDK5) <br/>
                                作者:(美)霍顿</a></td>
                    </tr>
                </table>
            </td>
        </tr>
    </table>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>
