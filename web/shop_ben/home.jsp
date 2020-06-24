<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/22
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="bean.e04.valuebean.GoodsSingle" %>
<%!
    static ArrayList goodslist=new ArrayList();
    static {
        String [] names={"苹果","香蕉","梨子","橘子"};
        float [] prices={5.5f,3.5f,4.5f,2.5f};
        for(int i=0;i<4;i++){
            GoodsSingle single=new GoodsSingle();
            single.setName(names[i]);
            single.setPrice(prices[i]);
            single.setNum(1);
            goodslist.add(i,single);
        }
    }
%>
<%
    session.setAttribute("goodslist",goodslist);
    response.sendRedirect("show.jsp");
%>
<html>
<head>
    <title>Shopping</title>
</head>
<body>

</body>
</html>
