<%--
  Created by IntelliJ IDEA.
  User: yanl
  Date: 1/8/20
  Time: 1:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
<h1>整合成功</h1>
${accounts}<br/>
<table border="1">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>money</th>
    </tr>
    <c:forEach items="${accounts}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.money}</td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
