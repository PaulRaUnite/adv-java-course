<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>All students</title>
</head>
<body>
<table>
    <tr><th>ID</th><th>Name</th><th>Surname</th><th>Average mark</th><th>Group</th></tr>
    <c:forEach var="student" items="${students}">
        <tr>
            <td><a href="/student/${student.id}">${student.id}</a></td>
            <td>${student.firstName}</td>
            <td>${student.lastName}</td>
            <td>${student.averageMark}</td>
            <td><a href="/group/${student.group.id}">${student.group.name}</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
