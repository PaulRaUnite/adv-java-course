<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student page</title>
</head>
<body>
<h2>Student</h2>
<ul>
    <li>Name: ${student.firstName}</li>
    <li>Last name: ${student.lastName}</li>
    <li>Average mark: ${student.averageMark}</li>
    <li>Group: <a href="/group/${student.group.id}">${student.group.name}</a></li>
</ul>
<h3>Operations</h3>
<ul>
    <li><a href="/student/${student.id}/edit">Edit</a></li>
</ul>
</body>
</html>
