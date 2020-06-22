<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/6/21
  Time: 8:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2 align="center">商品列表</h2>
<div align="center">
    <form action="processbuy.jsp" method="post">
        <table border="1" cellspacing="30">
            <tr>
                <th>商品名称</th>
                <th>价格</th>
                <th>购买</th>
            </tr>
            <tr>
                <td>笔记本</td>

                <td>￥5000</td>
                <td> <input type="submit" value="购买"></td>
            </tr>
            <tr>
                <td>汽车</td>

                <td>￥200000</td>
                <td> <input type="submit" value="购买"></td>
            </tr>
            <tr>
                <td>香水</td>

                <td>￥500</td>
                <td> <input type="submit" value="购买"></td>
            </tr>
            <tr>
                <td>书籍</td>
                <td>￥20</td>
                <td> <input type="submit" value="购买"></td>

            </tr>
        </table>


    </form>
</div>
</body>
</html>
