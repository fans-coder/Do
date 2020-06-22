<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/21
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h2>结算</h2>
    <%
        Map<String, Integer> map1 = (Map<String, Integer>)session.getAttribute("map1");
    %>

    <table border="0" cellspacing="30">
        <tr>
            <th>商品名称</th>
            <th>数量</th>
            <th>总价</th>
        </tr>
        <tr>
            <td>笔记本</td>
            <td><%=map1.get("笔记本") %></td>
            <td><%=map1.get("笔记本") %>*5000</td>
        </tr>
        <tr>
            <td>汽车</td>
            <td><%=map1.get("汽车")%></td>
            <td><%=map1.get("汽车")%>*200000</td>
        </tr>
        <tr>
            <td>香水</td>
            <td><%=map1.get("香水")%></td>
            <td><%=map1.get("香水")%>*500</td>
        </tr>
        <tr>
            <td>书籍</td>
            <td><%=map1.get("书籍") %></td>
            <td><%=map1.get("书籍") %>*20</td>
        </tr>
    </table>
    <p>总金额：<%=map1.get("笔记本")*5000+map1.get("汽车")*200000+map1.get("香水")*500+map1.get("书籍")*20 %></p>
    <p><a href="buy.jsp">继续购买</a></p>
</div>
</body>
</html>
