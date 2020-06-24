<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/24
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList,bean.e04.toolbean.Mytools,bean.e04.valuebean.GoodsSingle" %>
<jsp:useBean id="myCar" class="bean.e04.toolbean.ShopCar" scope="session"/>
<%
    String action=request.getParameter("action");
    if(action==null)
        action="";
    if(action.equals("buy")){
        ArrayList goodslist=(ArrayList)session.getAttribute("goodslist");
        int id=Mytools.strToint(request.getParameter("id"));
        GoodsSingle single=(GoodsSingle)goodslist.get(id);
        myCar.addItems(single);
        response.sendRedirect("show.jsp");
    } else if (action.equals("remove")) {
        String name=request.getParameter("name");
        myCar.removeItems(name);
        response.sendRedirect("MyCart.jsp");
    }else if(action.equals("clear")){
        myCar.clearCar();
    }else {
        response.sendRedirect("show.jsp");
    }

%>