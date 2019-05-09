<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Group</title>
</head>
<body>
<h2>Group</h2>
<ul>
    <li>ID: ${group.id}</li>
    <li>Name: ${group.name}</li>
</ul>
<a href="/group/${group.id}/edit">Edit</a>
</body>
</html>
