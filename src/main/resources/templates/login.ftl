<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>链家管理系统</title>
    <meta name="author" content="DeathGhost" />
    <link rel="stylesheet" type="text/css" href="../css/style.css" tppabs="../css/style.css" />
    <style>
        /*body{height:100%;background:#16a085;overflow:hidden;}*/

        body{height:100%;background:#16a085;overflow:hidden;}
        canvas{z-index:-1;position:absolute;}
    </style>
    <script src="../js/jquery.js"></script>
    <script src="../js/verificationNumbers.js" tppabs="../js/verificationNumbers.js"></script>
    <script src="../js/Particleground.js" tppabs="../js/Particleground.js"></script>
    <script>
        $(document).ready(function() {
            //粒子背景特效
            $('body').particleground({
                dotColor: '#5cbdaa',
                lineColor: '#5cbdaa'
            });
            //验证码
            createCode();
//  //测试提交，对接程序删除即可
//  $(".submit_btn").click(function(){
//	  location.href="##"/*tpa=http://***index.html*/;
//	  });

        });

    </script>
</head>
<body>
<dl class="admin_login">
    <dt>
        <strong>链家管理系统</strong>
        <em>Your future home on chain.</em>
    </dt>
    <form name="login" action="/admin/login" method="post">

        <dd class="user_icon">
            <input type="text"  name="username" placeholder="账号" class="login_txtbx"/>
        </dd>
        <dd class="pwd_icon">

            <input type="password"  name="password" placeholder="密码" class="login_txtbx"/>
        </dd>
        <dd class="val_icon">
            <div class="checkcode">
                <input type="text" id="J_codetext" placeholder="验证码" maxlength="4" class="login_txtbx">
                <canvas class="J_codeimg" id="myCanvas" onclick="createCode()">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
            </div>
            <input type="button" value="验证码核验" class="ver_btn" onClick="validate();">
        </dd>
        <dd>
            <input type="submit" value="立即登陆" class="submit_btn"/>
            <!--  <input type="submit" value="立即登陆" class="submit_btn"/>
       -->
        </dd>
    </form>
    <dd>
        <p>适用浏览器：360、FireFox、Chrome、Safari、Opera、傲游、搜狗、世界之窗. 不支持IE8及以下浏览器。</p>
    </dd>
</dl>
</body>
</html>
