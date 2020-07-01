<%--
  Created by IntelliJ IDEA.
  User: fans
  Date: 2020/7/1
  Time: 8:17
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>贪吃蛇</title>
    <script>
        var mapx=30,mapy=30;//设置地图为一个长高均为30格的正方形
        var arrMap=new Array();//地图数字（二维）
        var snakex=[2,2,2],snakey=[2,2,2];//初始状态的sanke 大小和位置
        var foodx,foody;//因为食物出现位置是随机的，所以不设置初始位置
        var keyCode=39;//蛇的移动方向默认向右
    </script>
</head>
<body>
<div id="map"></div>
</body>
</html>