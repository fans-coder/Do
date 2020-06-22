<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/5/23
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>登录</title>
</head>
<body>
username=<%=request.getParameter("username")%>
password=<%=request.getParameter("password")%>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if(Do.Tool2.login(username,password)){
        //out.println("welcome  "+username);
        response.sendRedirect("mall.jsp");
    }else {
        out.println("登录失败");

    }
%>
</body>
</html>