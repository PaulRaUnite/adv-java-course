<%--
  Created by IntelliJ IDEA.
  User: paulra
  Date: 06.05.19
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
<head>
    <title>Math operations</title>
</head>
<body>
<form>
    <fieldset>
        <label id="x" for="x">
            <input type="number" name="x">
        </label>
        <label id="y" for="y">
            <input type="number" name="y">
        </label>
        <c:forEach var="value" items="${operations}">
            <input type="submit" formmethod="get" formaction="./${value}.do" value="${value}">
        </c:forEach>
    </fieldset>
</form>
</body>
</html>
