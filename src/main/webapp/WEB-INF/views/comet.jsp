<%--
  Created by IntelliJ IDEA.
  User: ChenTeacher
  Date: 2017/11/12
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8" />
    <title>彗星体育-3人</title>
    <link rel="stylesheet" href="../statics/css/style.css" />
    <link rel="stylesheet" href="../statics/script/libs/bootstrap-3.3.7-dist/css/bootstrap.min.css" />
</head>

<body style="padding-top: 50px;">
<!--导航栏-->
<nav id="nav" class="navbar navbar-inverse navbar-fixed-top">
    <div class="container-fluid">
        <div class="navbar-header">
            <!--<a class="navbar-brand">Brand-->
            <img src="../statics/images/shangping/det/sp03.png"></a>
        </div>
        <a class="navbar-brand">彗星体育</a>
        <div class="collapse navbar-collapse" style="margin-right: 200px;">
            <ul class="nav navbar-nav navbar-right">
                <li id="nav_main">
                    <a href="../statics/template/main.html" target="iFrame " id="main" hidefocus="true">首页</a>
                </li>
                <li id="nav-curriculum">
                    <a href="../statics/template/curriculum.html" target="iFrame " id="curriculum">课程介绍</a>
                </li>
                <li id="nav_about">
                    <a href="../statics/template/about.html " target="iFrame " id="about">关于我们</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div id="iframe" style="overflow:hidden;height:720px;">
    <iframe name="iFrame " height="100%" width="100%" src="../statics/template/main.html " frameborder="no"> </iframe>
</div>
<script src="../statics/script/libs/jquery/jquery-3.2.1.min.js"></script>
<script src="../statics/script/libs/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script>
    $(function() {
        setIframe();
    })

    function setIframe() {

        var nav =document.getElementById('nav');
        var iframe = document.getElementById('iframe');
        var navHeigt = nav.offsetHeight;
        var navWidth = nav.offsetWidth;
        iframe.style.height =(window.innerHeight - navHeigt)+'px';
        iframe.style.width =(window.innerWidth)+'px';
    }
</script>

</body>

</html>