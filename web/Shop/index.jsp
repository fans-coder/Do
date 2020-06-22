<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/21
  Time: 10:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,java.io.*" contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Go Shopping</title>
</head>
<body>
<h1>购物车演示</h1>
<%
    String name=(String) session.getAttribute("username");
    if(name==null){
        out.println("您还没有登录，请<a href='log1.jsp'>登录</a>");
    }else {%>
<p>欢迎<%=name%>>
<p><a href="mall.jsp">查看商城</a>
<p><a href="Mycart.jsp">我的购物车</a>
<p><a href="logout.jsp">退出</a>
<%}%>
</body>
</html>
