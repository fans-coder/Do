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
    <style>
        #map{
            width: 400px;
            height: 400px;
            border: 1px solid black;
        }
        /*地图的样式*/
        .divMap{
            width: 18px;
            height: 18px;
            margin: 1px;
            background-color: cyan;
            float: left;
        }


    </style>
    <script>
        var mapx=30,mapy=30;//设置地图为一个长高均为30格的正方形
        var arrMap=new Array();//地图数字（二维）
        var snakex=[2,2,2],snakey=[2,2,2];//初始状态的sanke 大小和位置
        var foodx,foody;//因为食物出现位置是随机的，所以不设置初始位置
        var keyCode=39;//蛇的移动方向默认向右

        //创建一个地图
        function createMap() {
            var map=document.getElementById("map");//获得地图外框的div
            for(y=0;y<mapy;y++){
                arrMap[y]=new Array();
                for(a=0;x<mapx;x++){}
                var div=document.createElement("div");
                div.className="divMap";//需要初始化样式，地图，snake，food需要不同颜色等
                arrMap[y][x]=div;//将div小格子放入数组中，购建一个表格地图
                map.appendChild(div);//绘制出一个页面
            }

        }
        function createSnake() {
            //TODO
        }
    </script>
</head>
<body>
<div id="map"></div>
</body>
</html>