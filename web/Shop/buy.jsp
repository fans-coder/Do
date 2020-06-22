<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/21
  Time: 10:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*,java.io.*" contentType="text/html;charset=UTF-8" language="java" %>
<%
    String name=request.getParameter("name");
    Map<String,Integer> car=new TreeMap<>();
    if(session.getAttribute("car")!=null){
        car=(Map<String,Integer>)session.getAttribute("car");
    }
    if(car.get(name)!=null){
        int old=car.get(name);
        car.put(name,old+1);
    }else {
        car.put(name,1);
    }

    response.sendRedirect("mall.jsp");
%>