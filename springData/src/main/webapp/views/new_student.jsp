<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>New student</title>
</head>
<body>
<form:form method="POST" action="/student" modelAttribute="student">
    <table>
        <tr>
            <td><form:label path="firstName">First Name</form:label></td>
            <td><form:input path="firstName"/></td>
        </tr>

        <tr>
            <td><form:label path="lastName">Last Name</form:label></td>
            <td><form:input path="lastName"/></td>
        </tr>

        <tr>
            <td><form:label path="averageMark">Average Mark</form:label></td>
            <td><form:input path="averageMark"/></td>
        </tr>
        <tr>
            <td><form:label path="group">Group</form:label></td>
            <td><form:select path="group" itemValue="id" items="${groups}" itemLabel="name"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
