<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All groups</title>
</head>
<body>
<table>
    <tr><th>ID</th><th>Name</th></tr>
    <c:forEach var="group" items="${groups}">
        <tr>
            <td><a href="/group/${group.id}">${group.id}</a></td>
            <td>${group.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
