<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/24
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList,bean.e04.valuebean.GoodsSingle" %>
<jsp:useBean id="myCar" class="bean.e04.toolbean.ShopCar" scope="session"/>
<%
    ArrayList buylist=myCar.getBuylist();
    float total=0;
%>
<table bgcolor="#00ffff" border="1" width="450" rules="none" cellspacing="0" cellpadding="0">
    <tr>
        <td colspan="5">您的购物列表：</td>
    </tr>
    <tr align="center" height="30" bgcolor="lightgrey">
        <td width="25%">名称</td>
        <td>价格(元/斤)</td>
        <td>数量</td>
        <td>总价(元)</td>
        <td>移除(-1/次)</td>
    </tr>
    <%
        if(buylist==null||buylist.size()==0){%>
    <tr height="100">
        <td colspan="5" align="center">您的购物车为空！</td>
    </tr>
    <% }
    else {
            for(int i=0;i<buylist.size();i++){
                GoodsSingle single=(GoodsSingle)buylist.get(i);
                String name=single.getName() ;
                float price=single.getPrice();
                int num=single.getNum();
                float money=((int) ((price*num+0.05f)*10))/10f;
                total+=money;
                %>
    <tr align="center" height="50">
        <td><%=name%>
        </td>
        <td><%=price%>
        </td>
        <td><%=num%>
        </td>
        <td><%=money%>
        </td>
        <td>
            <a href="reslution.jsp?action=remove&name=<%=single.getName() %>">移除</a>
        </td>
    </tr>
    <%
            }
    }

    %>
    <tr height="50" align="center">
        <td colspan="5">应付金额：<%=total%>
        </td>
    </tr>
    <tr height="50" align="center">
        <td colspan="2"><a href="show.jsp">继续购物</a></td>
        <td colspan="3"><a href="reslution.jsp?action=clear">清空购物车</a></td>
    </tr>
</table>
