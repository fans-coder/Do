<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/7/1
  Time: 9:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Play</title>
</head>
<body>
<h1 style="color: cyan" >欢迎游玩贪吃蛇</h1>
<form name="s" action="Snake.jsp" method="post">
    <label><input name="Speed" type="radio"  value="250" />慢 </label>
    <label><input name="Speed" type="radio" value="150" />快</label>
    <label><input name="Speed" type="radio"  value="100" />很快 </label>
    <input type="submit" onclick="get(document.s.Speed);" value="Play">
</form>
<p>简单游戏介绍</p>
<ul >
    <li>只能通过方向键来控制蛇的移动</li>
    <li>蛇在移动过程中不能原地调转（头尾互换）</li>
    <li>蛇在移动过程中超出地图边界游戏结束</li>
    <li>空格键暂停游戏</li>
</ul>
</body>
</html>
