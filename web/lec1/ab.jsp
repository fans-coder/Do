<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/5/23
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
a=<%=request.getParameter("a")%>
b=<%=request.getParameter("b")%>
c=<%
    int a=Integer.parseInt(request.getParameter("a"));
    int b=Integer.parseInt(request.getParameter("b"));
    out.print(a+b);
%>
<a href="ab.html">返回接着算</a>