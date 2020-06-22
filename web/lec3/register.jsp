<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/5/23
  Time: 10:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="Do.Tool2"%>
<html>
<head>
    <title>get it</title>
</head>
<body>
username=<%=request.getParameter("username")%>
password1=<%=request.getParameter("password1")%>
password2=<%=request.getParameter("password2")%>


<%
    String username=request.getParameter("username");
    String password1=request.getParameter("password1");
    String password2=request.getParameter("password2");

        if(Do.Tools.register(username,password1,password2)){
            out.println("welcome  "+username+" 注册成功");
            out.print("<a href='log.html'>请登录</a>");
        }else {
            out.println("<a href=\"register.html\">注册失败,请重新注册</a>");

            //response.sendRedirect("register.html");&&
        }



%>
</body>
</html>