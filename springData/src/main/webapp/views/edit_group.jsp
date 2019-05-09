<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Edit group</title>
</head>
<body>

<form:form method="post" action="/group" modelAttribute="group">
    <table>

        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/>${group.id}</td>
        </tr>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name"/>${group.name}</td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
