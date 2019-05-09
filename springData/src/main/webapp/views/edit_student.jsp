<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 09.05.19
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Edit student</title>
</head>
<body>
<form:form method="put" action="/student" modelAttribute="student">
    <table>

        <tr>
            <td><form:label path="id">Id</form:label></td>
            <td><form:input path="id"/>${student.id}</td>
        </tr>
        <tr>
            <td><form:label path="firstName">First Name</form:label></td>
            <td><form:input path="firstName"/>${student.firstName}</td>
        </tr>

        <tr>
            <td><form:label path="lastName">Last Name</form:label></td>
            <td><form:input path="lastName"/>${student.lastName}</td>
        </tr>

        <tr>
            <td><form:label path="averageMark">Average Mark</form:label></td>
            <td><form:input path="averageMark"/>${student.averageMark}</td>
        </tr>
        <tr>
            <td><form:label path="group.id">Group</form:label></td>
            <td><form:select path="group.id"><form:options itemValue="id" items="${groups}" itemLabel="name"/></form:select></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
