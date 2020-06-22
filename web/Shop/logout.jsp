<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/21
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>用户注销</title>
</head>
<%
    session.invalidate();
    response.sendRedirect("log1.jsp");
%>
</body>
</html>
