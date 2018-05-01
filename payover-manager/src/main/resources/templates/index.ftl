<!DOCTYPE html>

<html>

<head>
    <meta charset="utf-8">
    <title>PAYOVER - 运营管理</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="icon" type="image/x-icon" href="../static/images/favicon.ico">
    <link rel="stylesheet" href="plugins/layui/css/layui.css" media="all"/>
    <link rel="stylesheet" href="css/global.css" media="all">
    <link rel="stylesheet" href="plugins/font-awesome/css/font-awesome.min.css">

</head>
<body>
    <ul class="layui-nav">
        <li class="layui-nav-item"><a href="">Payover聚合支付</a></li>
        <li class="layui-nav-item layui-this">
            <a href="javascript:;">产品</a>
            <dl class="layui-nav-child">
                <dd><a href="">选项1</a></dd>
                <dd><a href="">选项2</a></dd>
                <dd><a href="">选项3</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">大数据</a></li>
        <li class="layui-nav-item">
            <a href="javascript:;">解决方案</a>
            <dl class="layui-nav-child">
                <dd><a href="">移动模块</a></dd>
                <dd><a href="">后台模版</a></dd>
                <dd class="layui-this"><a href="">选中项</a></dd>
                <dd><a href="">电商平台</a></dd>
            </dl>
        </li>
        <li class="layui-nav-item"><a href="">社区</a></li>
        <li class="layui-nav-item right"><a href="/login.html">登录后台</a></li>
    </ul>
    <div class="admin-main">
        <blockquote class="layui-elem-quote">
            <p>Payover是一个使用java开发的分布式聚合支付系统，分为spring-cloud和dubbo架构版本，已集成微信、支付宝等主流支付渠道，可以直接用于生产环境。</p>
            官方地址：
            <a href="http://www.payover.shop" target="_blank">http://www.payover.shop</a>
            <p>Payover'官方交流群：191793328</p>
            <p>QQ：191793328</p>
            <p>Email：arimis@163.com</p>
            <br/>
            <p style="color:red;">为了更好的体验运营平台,已放开所有权限,但请不要随意修改数据,感谢对Payover的支持.</p>
        </blockquote>
        <fieldset class="layui-elem-field">
            <legend>更新日志</legend>
            <div class="layui-field-box">
                <fieldset class="layui-elem-field layui-field-title">
                    <legend>版本号:# v1.0.0 2017-08-11</legend>
                    <div class="layui-field-box">
                        <p>1、spring-cloud 架构版本发布</p>
                        <p>2、增加微信支付,包括:公众号支付,扫码支付,APP支付</p>
                        <p>3、增加支付宝支付,包括:wap,PC,扫码,APP支付</p>
                    </div>
                </fieldset>
            </div>
        </fieldset>
    </div>
    <script type="text/javascript" src="plugins/layui/layui.js"></script>
    <script type="text/javascript" src="datas/nav.js"></script>
    <script src="js/index.js"></script>
</body>
</html>