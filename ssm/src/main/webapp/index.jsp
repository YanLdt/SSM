<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2020/1/10
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ssm-integration</title>
</head>
<body>
<h1>ssm整合</h1>
<a href="account/testSsm">testSSM</a><br/>
<a href="account/testSpringAndMvc">testSpringAndSpringMvc</a><br/>
<a href="account/findAll">findAll</a><br/>

<form action="account/saveAccount" method="post">
    姓名：<input type="text" name="name"/><br/>
    金额：<input type="text" name="money"><br/>
    <input type="submit" value="保存" />
</form>
</body>
</html>
