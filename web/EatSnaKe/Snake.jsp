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
            width: 600px;
            height: 600px;
            border: 1px solid black;
        }
        /*地图的样式*/
        /*设置18px 加上下margin各1px=20px,可以修改map的宽高改变地图大小*/
        .Map{
            width: 18px;
            height: 18px;
            margin: 1px;
            background-color: cyan;
            float: left;
        }
        .Snake{
            width: 18px;
            height: 18px;
            margin:1px;
            background-color: yellow;
            float: left;
        }
        .Food{
            width: 18px;
            height: 18px;
            margin:1px;
            background-color:slateblue;
            float: left;
        }
    </style>
    <script>
        var mapx=30,mapy=30;//设置地图为一个长高均为20格的正方形
        var arrMap=new Array();//地图数字（二维）
        var snakex=[2,3,4],snakey=[2,2,2];//初始状态的sanke 大小和位置
        var foodx,foody;//因为食物出现位置是随机的，所以不设置初始位置
        var keyCode=39;//匹配键盘蛇的移动方向默认向右

        //创建一个地图
        function createMap() {
            var map=document.getElementById("map");//获得地图外框的div
            for(y=0;y<mapy;y++){
                arrMap[y]=new Array();
                for(x=0;x<mapx;x++){
                    var div=document.createElement("div");
                    div.className="Map";//需要初始化样式，地图，snake，food需要不同颜色等
                    arrMap[y][x]=div;//将div小格子放入数组中，购建一个表格地图
                    map.appendChild(div);//绘制出一个页面
                }

            }

        }
//创建蛇体
        function createSnake() {
            //需要把蛇的颜色区别于地图
            for(i=0;i<snakex.length;i++){
                arrMap[snakey[i]][snakex[i]].className="Snake";//写一个蛇的样式
            }
            //TODO
        }
        //创建食物
        function createFood() {
            //需要判断是否需要生产食物
            var result;
            do{
                result=false;
                foodx=parseInt(Math.random()*mapx);
                foody=parseInt(Math.random()*mapy);//生成食物的随机坐标
                //判断蛇是否获得食物
                for(i>0;i>snakex.length;i++){
                    if(snakex[1]==foodx&&snakey[1]==foody){
                        result=true;
                        break
                    }

                }
            }while (result);
            arrMap[foody][foodx].className="Food";//同样需要创建食物样式便于区别
        }
        //接下来需要实现蛇的运动，实现蛇身的移动就是把蛇的头部增加一格，尾部减去一格
        function sankeMove() {
            for(i=0;i<snakex.length-1;i++) {
                snakex[i] = snakex[i + 1];
                snakey[i] = snakey[i + 1];
            }
                switch (keyCode) {
                    case 37://向左移动
                        snakex[snakex.length - 1]--;
                        break;
                    case 38:
                        snakey[snakey.length - 1]--;
                        break;//向上移动
                    case 39:
                        snakex[snakex.length - 1]++;
                        break;//向右移动
                    case 40:
                        snakey[snakey.length - 1]++;
                        break;//向下移动

                }
                //由于移动过程中可能会遇到食物所以:
            if(snakex[snakex.length-1]==foodx&&snakey[snakey.length-1]==foody)//头部和食物在同一格，就是吃到食物
            {
                       snakex[snakex.length]=snakex[snakex.length-1];
                       snakey[snakey.length]=snakey[snakey.length-1];//头部增加一格
                //由于吃到食物，蛇身体发生变化，需要重新显示
                for(i=snakex.length-1;i>0;i--){
                    snakex[i]=snakex[i-1];
                    snakey[i]=snakey[i-1];
                }
            }
            }
            //通过键盘获取case值
     function downKey() {
            var key=event.keyCode//获取键盘事件
         if(key>=37&&key<=40)//说明玩家在键盘上输入了方向键
         {
            keyCode=key; //确定移动方向

         }else //用户键入的不是方向键
             {
                 //alert("请使用方向键操控游戏");//提醒游戏方法
         }

     }
     //使用Window.onload来调用上面的函数，运行
        window.onload=function () {
            createMap();
            createSnake();
            createFood();//创建必要的三个元素
            sankeMove();
            document.onkeydown=downKey();//使用该函数获取方向键
        }

    </script>
</head>
<body>
<div id="map"></div>
<p><a href="Home.jsp">退出游戏并返回主页</a></p>
</body>
</html>