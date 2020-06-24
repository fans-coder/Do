<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/24
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.ArrayList,bean.e04.valuebean.GoodsSingle" %>
<%
    ArrayList goodslist=(ArrayList)session.getAttribute("goodslist");
%>
<table border="1" width="450"rules="none" cellpadding="0" cellspacing="0">
    <tr height="50" bgcolor="#7fffd4">
        <td colspan="3" align="center">商品列表</td>
    </tr>
    <tr align="center" height="30" bgcolor="#faebd7">
        <td>名称</td>
        <td>价格</td>
        <td>购买</td>
    </tr >
    <%
        if (goodslist==null||goodslist.size()==0){
    %>
    <tr height="100" bgcolor="#faebd7">
        <td colspan="3"align="center">尚未上架商品</td>
    </tr>
    <% }
    else {
            for(int i=0;i<goodslist.size();i++){
               GoodsSingle single=(GoodsSingle)goodslist.get(i);
    %>
    <tr height="50"align="center" bgcolor="aqua">
        <td>
            <%=single.getName()%>
        </td>
        <td>
        <%=single.getPrice()%>
        </td>
        <td>
            <a href="reslution.jsp?action=buy&id=<%=i%>">购买</a>
        </td>
    </tr>
    <%
            }
        }
    %>

    <tr height="50" bgcolor="#ffe4c4">
        <td align="center" colspan="3"><a href="MyCart.jsp">查看购物车</a></td>
    </tr>

</table>
