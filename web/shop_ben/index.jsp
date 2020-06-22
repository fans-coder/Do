<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/22
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.ArrayList" contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="" %>
<%!
    static ArrayList goodslist=new ArrayList();
    static {
        String [] names={"Apple","Banana","Tomato","Orange"};
        float [] prices={5.5f,3.5f,4.5f,2.5f};
        for(int i=0;i<4;i++){
            GoodsSingle single=new GoodsSingle();
        }
    }
%>
<html>
<head>
    <title>Shopping</title>
</head>
<body>

</body>
</html>
