<%@ page import="java.util.TreeMap" %><%--
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
<div align="center">
    <form action="log1.jsp" method="post">
        账户：<input type="text" name="username" ><br>
        密码：<input type="password" name="password"><br>
        <input type="reset" vale="重置">
        <input type="submit" value="登录"><br>
    </form>
</div>
<%
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if(Do.Tool2.login(username,password)){
        session.setAttribute("username",request.getParameter("username"));
        session.setAttribute("car",new TreeMap<String,Integer>());
        response.sendRedirect("index.jsp");
    }

    //session.setAttribute("password", password);
    //request.getRequestDispatcher("mall.jsp").forward(request, response);
    %>

</body>
</html>