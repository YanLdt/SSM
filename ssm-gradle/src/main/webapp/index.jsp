<%--
  Created by IntelliJ IDEA.
  User: yanl
  Date: 1/8/20
  Time: 1:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm</title>
</head>
<body>
<h1>SSM整合</h1>
<h2>测试</h2>
<h3>缩进和赛季阿挥洒</h3>

<a href="account/findAll">测试查询所有账户</a><br/>
<br/>
<form action="account/saveAccount" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money"/><br/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
